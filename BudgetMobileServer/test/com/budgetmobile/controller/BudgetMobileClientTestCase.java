package com.budgetmobile.controller;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.fluent.Request;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetmobile.client.BudgetMobileClient;
import com.budgetmobile.model.entity.ErrorMessage;
import com.budgetmobile.model.entity.Order;
import com.budgetmobile.model.entity.User;

import org.apache.http.client.fluent.Response;
import org.apache.http.HttpEntity;

public class BudgetMobileClientTestCase {

	private static String DEV_URL = "http://dev.305spin.com/budgetmobile/com/services/rest/index.cfm";
	private static String PROD_URL = "https://www.budgetmobile.com/com/services/rest/index.cfm";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetUser() throws Exception {
		System.out.println(Request.Get("https://www.budgetmobile.com/com/services/rest/index.cfm/user/1790000")
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String("BMApp:CjUjNS6YM4C3FUjD".getBytes("UTF-8")))
		.execute().returnContent().asString());
	}

	@Test 
	public void testMapGetUserJSON() throws Exception {
		User user = (User) BudgetMobileClient.getObject(getUserJSON, User.class);
	    for (Order order : user.getOrders())
	    	System.out.println(order.getOrderId());
	    
	}
	
	@Test
	public void testGetUserById() throws Exception {
		User user = BudgetMobileClient.getUserById("1224957");
		System.out.println(user.getUserId());
		System.out.println(user.getEmail());
	    for (Order order : user.getOrders())
	    	System.out.println(order.getOrderId());
	}
	
	@Test
	public void testGetUserByUsernamePassword() throws Exception {
		System.out.println(Request.Post(DEV_URL + "/user/-1/?Username=kevin@305spin.com-526&Password=2211")
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String("BMApp:CjUjNS6YM4C3FUjD".getBytes("UTF-8")))
		.execute().returnContent().asString());
	}
	
	@Test 
	public void testGetUserByUserPasswordGET() throws Exception {
	    Response response = Request.Get(DEV_URL + "/user/-1/?Username=floresitadelimon@hotmail.com-7&Password=3462")
	    .setHeader("Authorization", "Basic " + Base64.encodeBase64String("BMApp:CjUjNS6YM4C3FUjD".getBytes("UTF-8")))
		.execute();  
	    HttpEntity entity = response.returnResponse().getEntity();
	    System.out.println(IOUtils.toString(entity.getContent()));
	}
	
	@Test 
	public void testGetUserByUserPasswordPOST() throws Exception {
	    Response response = Request.Post(DEV_URL + "/user/-1/?Username=floresitadelimon@hotmail.com-7&Password=3462")
	    .setHeader("Authorization", "Basic " + Base64.encodeBase64String("BMApp:CjUjNS6YM4C3FUjD".getBytes("UTF-8")))
		.execute();  
	    HttpEntity entity = response.returnResponse().getEntity();
	    System.out.println(IOUtils.toString(entity.getContent()));
	}
	
	@Test
	public void testGetUserByUserPassword() throws Exception {
		User user = BudgetMobileClient.getUserByUsernamePassword("floresitadelimon@hotmail.com-7", "3462");
		System.out.println("UserId: " + user.getUserId());
		System.out.println("Eamil:  " + user.getEmail());
	    for (Order order : user.getOrders()) {
	    	System.out.println("OrderId: " + order.getOrderId());
	    	System.out.println("BMId:    " + order.getBudgetMobileId());
	    }
	}
	
	@Test 
	public void testGetUserByUserPassword2() throws Exception {
		String json = IOUtils.toString(Request.Post(DEV_URL + "/user/-1/?Username=kevin@305spin.com-526&Password=2211")
	    .setHeader("Authorization", "Basic " + Base64.encodeBase64String("BMApp:CjUjNS6YM4C3FUjD".getBytes("UTF-8")))
		.execute().returnResponse().getEntity().getContent()); 
		
		User user = (User) BudgetMobileClient.getObject(json, User.class);
		System.out.println(user.getUserId());
	    for (Order order : user.getOrders())
	    	System.out.println(order.getOrderId());
	}
	
	@Test
	public void testForgotCredentials() throws Exception {
	    ErrorMessage error = BudgetMobileClient.forgotCredentials("480046", "kevin@305spin.com333");
		System.out.println(error.getErrorMessage());
		
	}
	private String getUserJSON = "{\"ORDERS\":[{\"PHONENUMBER\":\"Unknown\",\"BUDGETMOBILEID\":\"187697\",\"LIFELINE\":true,\"ORDERID\":\"4\"}],\"ERRORCODE\":\"\",\"FNAME\":\"Kevin\",\"ISERROR\":false,\"EMAIL\":\"kevin@305spin.com\",\"LNAME\":\"Kevin\",\"ERRORMESSAGE\":\"\",\"USERID\":\"1\"}";
}

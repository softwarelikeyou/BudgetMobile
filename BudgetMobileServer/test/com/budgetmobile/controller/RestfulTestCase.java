package com.budgetmobile.controller;

import java.net.URI;
import java.util.Random;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.glassfish.jersey.client.ClientConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetmobile.client.ZenDeskClient;
import com.budgetmobile.model.entity.Checkout;
import com.budgetmobile.model.entity.ErrorMessage;
import com.budgetmobile.model.entity.Order;
import com.budgetmobile.model.entity.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestfulTestCase {
	private static String PROD = "sql008:81";
	private static String DEV = "localhost:5443";
		
    private ClientConfig config;
    private Client client;
	private WebTarget service;
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://" + DEV + "/BudgetMobileServer").build(); 
    }
	
	@Before
	public void setUp() throws Exception {		
		config = new ClientConfig();
		client = ClientBuilder.newClient(config);
		service = client.target(getBaseURI());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRandon() throws Exception {
		Random r = new Random();
		int Low = 0;
		int High = 10000000;
		int R = r.nextInt(High-Low) + Low;
		System.out.println(R);
	}
	
	@Test
	public void testGUID() throws Exception {
		UUID idOne = UUID.randomUUID();
	    UUID idTwo = UUID.randomUUID();
	    System.out.println(idOne.toString().substring(0, 5));
	    System.out.println(idTwo.toString().substring(0, 5));
	    
	    
	}
	
	@Test
	public void testGetUser() throws Exception {
	    String json = service.path("restful")
	    		           .path("users/U1ksGgAFEEFUJw0JHxRaWwMACgIUVFwvRgYZFBgCeVtRQEs=")
	    		           .request()
	    		           .header("Authorization", "Basic " + Base64.encodeBase64String("admin:admin".getBytes("UTF-8")))
	    		           .accept(MediaType.APPLICATION_JSON).get(String.class);
	    System.out.println(json);
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
	    User user = objectMapper.readValue(json, User.class);
	    for (Order order: user.getOrders()) {
	    	System.out.println(order.getBudgetMobileId());
	    	System.out.println(order.getLifeLine());
	    	System.out.println(order.getOrderId());
	    }
	    System.out.println(user.getEmail());
	}
	
	@Test
	public void testGetMDN() throws Exception {
	    String json = service.path("restful")
	    		           .path("users/mdn/3185290371")
	    		           .request()
	    		           .header("Authorization", "Basic " + Base64.encodeBase64String("admin:admin".getBytes("UTF-8")))
	    		           .accept(MediaType.APPLICATION_JSON).get(String.class);
	    System.out.println(json);
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
	    User user = objectMapper.readValue(json, User.class);
	    for (Order order: user.getOrders()) {
	    	System.out.println(order.getBudgetMobileId());
	    }
	    System.out.println(user.getEmail());
	}
	
	@Test
	public void testforgetCredentials() throws Exception {
	    String json = service.path("restful")
	    		           .path("users/forgotcredentials/12345-stevethomas01@yahoo.com")
	    		           .request()
	    		           .header("Authorization", "Basic " + Base64.encodeBase64String("admin:admin".getBytes("UTF-8")))
	    		           .accept(MediaType.APPLICATION_JSON).get(String.class);
	    System.out.println(json);
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
	    ErrorMessage errorMessage = objectMapper.readValue(json, ErrorMessage.class);
	    System.out.println(errorMessage.getIsError().toString());
	    System.out.println(errorMessage.getErrorCode());
	    System.out.println(errorMessage.getErrorMessage());
	}
	
	@Test 
	public void testPOJO2JSON() throws Exception {
	    ObjectMapper objectMapper = new ObjectMapper();
	    Checkout checkout = new Checkout();
	    checkout.setBmid(123456);
	    checkout.addToptup(1);
	    checkout.addToptup(2);
		System.out.println(objectMapper.writeValueAsString(checkout));
	}
	
	@Test
	public void testPost() throws Exception {

		/*
        URL url = new URL("http://localhost/BudgetMobileServer/restful/account/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        StringBuffer chaine = new StringBuffer("");
        String userpass = "admin" + ":" + "admin";
        byte[] data = userpass.getBytes("UTF-8");
        String basicAuth = "Basic " + Base64.encodeBase64String(data);
        connection.setRequestProperty("Authorization", basicAuth);
        connection.setRequestProperty("User-Agent", "");
        connection.setRequestMethod("GET");
        connection.setDoInput(true);
        connection.connect();

        InputStream inputStream = connection.getInputStream();

        BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while ((line = rd.readLine()) != null) {
            chaine.append(line);
        }

        System.out.println(chaine.toString());
		*/
		
		/*
	    Response response = Request.Post("http://localhost/BudgetMobile/restful/account")
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String("admin:admin".getBytes("UTF-8")))
		.execute();   
 
	    //System.out.println(response.returnResponse().getStatusLine().getStatusCode());
	    HttpEntity entity = response.returnResponse().getEntity();
	    System.out.println(IOUtils.toString(entity.getContent()));
		*/
	}
	
	@Test
	public void testPurchase() throws Exception {
		String JSON = "{\"ORDERID\":\"ANDRd2c6692e2c\",\"REFERENCEID\":90601,\"TOTAL\":\"1.00\",\"DESCRIPTION\":\"100 MB\",\"CREDIT_CARD\":\"4847188387540638\",\"EXPIRATION\":\"202307\",\"CCC\":\"721\",\"NAME\":\"Steve Thomas\",\"STREET_ADDRESS1\":\"900 Peques St.\",\"CITY\":\"San Marcos\",\"STATE\":\"TX\",\"ZIP\":\"78666\",\"PHONE\":\"3183492819\",\"EMAIL\":\"kevin@305spin.com\"}";
	    Response response = Request.Post("http://localhost:5443/BudgetMobileServer/restful/users/purchase")
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String("admin:admin".getBytes("UTF-8")))
		.bodyString(JSON, ContentType.APPLICATION_JSON)
		.execute();   
 
	    //System.out.println(response.returnResponse().getStatusLine().getStatusCode());
	    HttpEntity entity = response.returnResponse().getEntity();
	    System.out.println(IOUtils.toString(entity.getContent()));
		
	}
	
	@Test
	public void testZendesk() throws Exception {
		//curl https://{subdomain}.zendesk.com/api/v2/tickets.json \
		//	-d '{"ticket": {"requester": {"name": "The Customer", "email": "thecustomer@domain.com"}, "subject": "My printer is on fire!", "comment": { "body": "The smoke is very colorful." }}}' \
		//	-H "Content-Type: application/json" -v -u {email_address}:{password} -X POST
		String JSON = "{\"ticket\": {\"requester\": {\"name\": \"The Customer\", \"email\": \"thecustomer@domain.com\"}, \"subject\": \"My printer is on fire!\", \"comment\": { \"body\": \"The smoke is very colorful.\" }}}";
	    Response response = Request.Post("https://softwarelikeyou.zendesk.com/api/v2/tickets.json")
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String("steve.thomas@softwarelikeyou.com:Dinky*01".getBytes("UTF-8")))
		.bodyString(JSON, ContentType.APPLICATION_JSON)
		.execute();   
 
	    //System.out.println(response.returnResponse().getStatusLine().getStatusCode());
	    HttpEntity entity = response.returnResponse().getEntity();
	    System.out.println(IOUtils.toString(entity.getContent()));
	}
	
	@Test
	public void testZenDeskClient() throws Exception {
		System.out.println(ZenDeskClient.submitTicket("Steve Thomas", "stevethomas01@yahoo.com", "Test of REST", "Testing the ZenDesk REST API"));
	}
}

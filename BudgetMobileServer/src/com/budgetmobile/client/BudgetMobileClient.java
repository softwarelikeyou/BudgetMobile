package com.budgetmobile.client;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.fluent.Request;

import com.budgetmobile.controller.ServerProperties;
import com.budgetmobile.model.entity.ErrorMessage;
import com.budgetmobile.model.entity.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BudgetMobileClient {

	private static String DEV_URL = "http://dev.305spin.com/budgetmobile/com/services/rest/index.cfm";
	private static String PROD_URL = "https://www.budgetmobile.com/com/services/rest/index.cfm";
	private static String BASE_URL = PROD_URL;
	private static String USER_URL = "user";
	private static String FORGOT_CREDENTIALS_URL = "forgotcredentials";
	private static String USERNAME = "BMApp";
	private static String PASSWORD = "CjUjNS6YM4C3FUjD";
	
	static {
		if (ServerProperties.MODE.equals("DEV"))
			BASE_URL = PROD_URL;
	}
	
	public static Object getObject(final String json, final Class<?> clazz) throws Exception {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, Boolean.FALSE);
	    return objectMapper.readValue(json, clazz);
	}
	
	public static String getRequest(final String url) throws Exception {
		return Request.Get(BASE_URL + "/" + url)
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String(new String(USERNAME + ":" + PASSWORD).getBytes("UTF-8")))
		.execute().returnContent().asString();
	}
	
	public static String postRequest(final String url) throws Exception {
		return IOUtils.toString(Request.Post(BASE_URL + "/" + url)
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String(new String(USERNAME + ":" + PASSWORD).getBytes("UTF-8")))
		.execute().returnResponse().getEntity().getContent()); 
	}
	
	public static User getUserById(final String id) throws Exception {
		return (User) getObject(getRequest(USER_URL + "/" + id), User.class);
	}
	
	public static User getUserByUsernamePassword(final String username, final String password) throws Exception {
		return (User) getObject(postRequest(USER_URL + "/-1/?Username=" + username + "&Password=" + password), User.class);
	}
	
	public static ErrorMessage forgotCredentials(final String id, final String emailAddress) throws Exception {
		return (ErrorMessage) getObject(postRequest(FORGOT_CREDENTIALS_URL + "/" + id + "?EmailAddress=" + emailAddress), ErrorMessage.class);
	}
}

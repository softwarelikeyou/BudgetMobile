package com.budgetmobile.client;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.fluent.Request;

import com.budgetmobile.controller.ServerProperties;
import com.budgetmobile.model.entity.PromoResult;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SpinlifeservClient {

	private static String DEV_URL = "https://lifelinedev.azurewebsites.net/webapi/user/ValidateUsernameForAppAssociation";
	private static String PROD_URL = "https://spinlifeserv.com/webapi/user/ValidateUsernameForAppAssociation";
	private static String BASE_URL = PROD_URL;
	private static String USERNAME = "305TopUpUser";
	private static String PASSWORD = "3L3PhAnTt00lBox";
	
	static {
		if (ServerProperties.MODE.equals("DEV"))
			BASE_URL = DEV_URL;
	}
	
	private static String getRequest(final String url) throws Exception {
		return Request.Get(url)
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String(new String(USERNAME + ":" + PASSWORD).getBytes("UTF-8")))
		.execute().returnContent().asString();
	}
	
	public static PromoResult confirmPromoCode(final String username) throws Exception {
		return (PromoResult) getObject(getRequest(BASE_URL + "?username=" + username), PromoResult.class);
	}

	private static Object getObject(final String json, final Class<?> clazz) throws Exception {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, Boolean.FALSE);
	    return objectMapper.readValue(json, clazz);
	}
}

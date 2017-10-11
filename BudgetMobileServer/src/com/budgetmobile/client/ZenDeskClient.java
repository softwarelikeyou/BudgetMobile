package com.budgetmobile.client;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;

import com.budgetmobile.controller.ServerProperties;

public class ZenDeskClient {
	public static Integer submitTicket(final String name, 
			                           final String email,
			                           final String subject,
			                           final String body) throws Exception {
		String JSON = "{\"ticket\": {\"requester\": {\"name\": \"" + name + 
				      "\", \"email\": \"" + email + 
				      "\"}, \"subject\": \"" + subject + 
				      "\", \"comment\": { \"body\": \"" + body + "\" }}}";
	    Response response = Request.Post(ServerProperties.getProperty(ServerProperties.ZENDESK_ENDPOINT))
		.setHeader("Authorization", "Basic " + Base64.encodeBase64String(
				  new String(ServerProperties.getProperty(ServerProperties.ZENDESK_ACCOUNT) 
						     + ":" + 
						     ServerProperties.getProperty(ServerProperties.ZENDESK_PASSWORD)).getBytes("UTF-8")))
		.bodyString(JSON, ContentType.APPLICATION_JSON)
		.execute();   
 
	    return response.returnResponse().getStatusLine().getStatusCode();
	}
}

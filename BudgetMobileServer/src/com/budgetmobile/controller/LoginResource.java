package com.budgetmobile.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
public class LoginResource {

	  @GET
	  @Produces({ MediaType.APPLICATION_JSON })
	  public Response get() {
		  String response = "{ \"status\": \"success\" }";
		  return Response.status(200).entity(response).build();
	  }
}

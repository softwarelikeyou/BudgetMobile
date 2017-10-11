package com.budgetprepay.webservice.client.bequick.pojo;

public class RestoreResponse extends BeQuickType {
	
	private RestoreResponseType response;
	
	private SessionType session;
	
	public void setResponse(final RestoreResponseType response) {
		this.response = response;
	}
	
	public RestoreResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

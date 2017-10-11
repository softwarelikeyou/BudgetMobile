package com.budgetprepay.webservice.client.bequick.pojo;

public class ActivateResponse extends BeQuickType {
	
	private ActivateResponseType response;
	
	private SessionType session;
	
	public void setResponse(final ActivateResponseType response) {
		this.response = response;
	}
	
	public ActivateResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

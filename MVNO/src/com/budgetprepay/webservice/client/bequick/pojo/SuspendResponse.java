package com.budgetprepay.webservice.client.bequick.pojo;

public class SuspendResponse extends BeQuickType {
	
	private SuspendResponseType response;
	
	private SessionType session;
	
	public void setResponse(final SuspendResponseType response) {
		this.response = response;
	}
	
	public SuspendResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

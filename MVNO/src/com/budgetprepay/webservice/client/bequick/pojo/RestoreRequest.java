package com.budgetprepay.webservice.client.bequick.pojo;

public class RestoreRequest extends BeQuickType {
	
	private RestoreRequestType request;
	
	private SessionType session;
	
	public void setRequest(final RestoreRequestType request) {
		this.request = request;
	}
	
	public RestoreRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

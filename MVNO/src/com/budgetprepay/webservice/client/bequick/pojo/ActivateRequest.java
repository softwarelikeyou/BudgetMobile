package com.budgetprepay.webservice.client.bequick.pojo;

public class ActivateRequest extends BeQuickType {
	
	private ActivateRequestType request;
	
	private SessionType session;
	
	public void setRequest(final ActivateRequestType request) {
		this.request = request;
	}
	
	public ActivateRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

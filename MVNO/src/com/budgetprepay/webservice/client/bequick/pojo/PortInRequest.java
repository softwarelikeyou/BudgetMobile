package com.budgetprepay.webservice.client.bequick.pojo;

public class PortInRequest extends BeQuickType {
	
	private PortInRequestType request;
	
	private SessionType session;
	
	public void setRequest(final PortInRequestType request) {
		this.request = request;
	}
	
	public PortInRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

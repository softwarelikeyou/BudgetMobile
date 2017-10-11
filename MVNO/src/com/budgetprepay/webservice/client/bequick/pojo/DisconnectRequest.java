package com.budgetprepay.webservice.client.bequick.pojo;

public class DisconnectRequest extends BeQuickType {
	
	private DisconnectRequestType request;
	
	private SessionType session;
	
	public void setRequest(final DisconnectRequestType request) {
		this.request = request;
	}
	
	public DisconnectRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

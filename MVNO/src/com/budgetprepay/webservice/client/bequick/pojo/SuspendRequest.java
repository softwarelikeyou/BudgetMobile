package com.budgetprepay.webservice.client.bequick.pojo;

public class SuspendRequest extends BeQuickType {
	
	private SuspendRequestType request;
	
	private SessionType session;
	
	public void setRequest(final SuspendRequestType request) {
		this.request = request;
	}
	
	public SuspendRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

package com.budgetprepay.webservice.client.bequick.pojo;

public class SwapESNRequest extends BeQuickType {
	
	private SwapESNRequestType request;
	
	private SessionType session;
	
	public void setRequest(final SwapESNRequestType request) {
		this.request = request;
	}
	
	public SwapESNRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

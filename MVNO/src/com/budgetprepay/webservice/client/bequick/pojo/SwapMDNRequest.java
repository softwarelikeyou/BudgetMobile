package com.budgetprepay.webservice.client.bequick.pojo;

public class SwapMDNRequest extends BeQuickType {
	
	private SwapMDNRequestType request;
	
	private SessionType session;
	
	public void setRequest(final SwapMDNRequestType request) {
		this.request = request;
	}
	
	public SwapMDNRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

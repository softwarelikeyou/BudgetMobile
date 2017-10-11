package com.budgetprepay.webservice.client.bequick.pojo;

public class PurchaseRequest extends BeQuickType {
	
	private PurchaseRequestType request;
	
	private SessionType session;
	
	public void setRequest(final PurchaseRequestType request) {
		this.request = request;
	}
	
	public PurchaseRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

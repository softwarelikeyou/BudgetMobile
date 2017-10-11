package com.budgetprepay.webservice.client.bequick.pojo;

public class PurchaseResponse extends BeQuickType {
	
	private PurchaseResponseType response;
	
	private SessionType session;
	
	public void setResponse(final PurchaseResponseType response) {
		this.response = response;
	}
	
	public PurchaseResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

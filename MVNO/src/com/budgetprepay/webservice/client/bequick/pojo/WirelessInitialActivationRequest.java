package com.budgetprepay.webservice.client.bequick.pojo;

public class WirelessInitialActivationRequest extends BeQuickType {
	
	private WirelessInitialActivationRequestType request;
	
	private SessionType session;
	
	public void setRequest(final WirelessInitialActivationRequestType request) {
		this.request = request;
	}
	
	public WirelessInitialActivationRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}
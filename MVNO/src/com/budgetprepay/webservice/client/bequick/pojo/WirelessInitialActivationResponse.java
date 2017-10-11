package com.budgetprepay.webservice.client.bequick.pojo;

public class WirelessInitialActivationResponse extends BeQuickType {
	
	private WirelessInitialActivationResponseType response;
	
	private SessionType session;
	
	public void setResponse(final WirelessInitialActivationResponseType response) {
		this.response = response;
	}
	
	public WirelessInitialActivationResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

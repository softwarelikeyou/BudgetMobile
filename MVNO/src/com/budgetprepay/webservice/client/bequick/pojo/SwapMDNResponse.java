package com.budgetprepay.webservice.client.bequick.pojo;

public class SwapMDNResponse extends BeQuickType {
	
	private SwapMDNResponseType response;
	
	private SessionType session;
	
	public void setResponse(final SwapMDNResponseType response) {
		this.response = response;
	}
	
	public SwapMDNResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

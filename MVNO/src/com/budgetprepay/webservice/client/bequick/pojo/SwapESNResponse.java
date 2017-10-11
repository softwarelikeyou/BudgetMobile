package com.budgetprepay.webservice.client.bequick.pojo;

public class SwapESNResponse extends BeQuickType {
	
	private SwapESNResponseType response;
	
	private SessionType session;
	
	public void setResponse(final SwapESNResponseType response) {
		this.response = response;
	}
	
	public SwapESNResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

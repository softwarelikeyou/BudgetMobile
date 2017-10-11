package com.budgetprepay.webservice.client.bequick.pojo;

public class DisconnectResponse extends BeQuickType {
	
	private DisconnectResponseType response;
	
	private SessionType session;
	
	public void setResponse(final DisconnectResponseType response) {
		this.response = response;
	}
	
	public DisconnectResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

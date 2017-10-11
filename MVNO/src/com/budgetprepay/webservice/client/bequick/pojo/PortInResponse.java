package com.budgetprepay.webservice.client.bequick.pojo;

public class PortInResponse extends BeQuickType {
	
	private PortInResponseType response;
	
	private SessionType session;
	
	public void setResponse(final PortInResponseType response) {
		this.response = response;
	}
	
	public PortInResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

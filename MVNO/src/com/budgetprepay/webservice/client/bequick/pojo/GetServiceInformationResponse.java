package com.budgetprepay.webservice.client.bequick.pojo;

public class GetServiceInformationResponse extends BeQuickType {
	
	private GetServiceInformationResponseType response;
	
	private SessionType session;
	
	public void setResponse(final GetServiceInformationResponseType response) {
		this.response = response;
	}
	
	public GetServiceInformationResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

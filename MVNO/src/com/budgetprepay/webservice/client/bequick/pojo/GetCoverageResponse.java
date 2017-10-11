package com.budgetprepay.webservice.client.bequick.pojo;

public class GetCoverageResponse extends BeQuickType {
	
	private GetCoverageResponseType response;
	
	private SessionType session;
	
	public void setResponse(final GetCoverageResponseType response) {
		this.response = response;
	}
	
	public GetCoverageResponseType getResponse() {
		return response;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

package com.budgetprepay.webservice.client.bequick.pojo;

public class GetCoverageRequest extends BeQuickType {
	
	private GetCoverageRequestType request;
	
	private SessionType session;
	
	public void setRequest(final GetCoverageRequestType request) {
		this.request = request;
	}
	
	public GetCoverageRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

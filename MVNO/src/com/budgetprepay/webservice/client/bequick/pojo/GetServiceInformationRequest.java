package com.budgetprepay.webservice.client.bequick.pojo;

public class GetServiceInformationRequest extends BeQuickType {
	
	private GetServiceInformationRequestType request;
	
	private SessionType session;
	
	public void setRequest(final GetServiceInformationRequestType request) {
		this.request = request;
	}
	
	public GetServiceInformationRequestType getRequest() {
		return request;
	}
	
	public void setSession(final SessionType session) {
		this.session = session;
	}
	
	public SessionType getSession() {
		return session;
	}
}

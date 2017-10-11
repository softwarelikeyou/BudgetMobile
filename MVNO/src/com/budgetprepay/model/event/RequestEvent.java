package com.budgetprepay.model.event;

import com.budgetprepay.model.entity.Request;

public class RequestEvent extends Event {
	static final long serialVersionUID = 1L;

	public RequestEvent(String name, Request request) {
		super(name, request);
	}

	public Request getRequest() {
		return (Request) getData();
	}	
}

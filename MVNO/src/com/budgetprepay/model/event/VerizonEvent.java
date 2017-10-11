package com.budgetprepay.model.event;

public class VerizonEvent extends Event {
	static final long serialVersionUID = 1L;

	public VerizonEvent(String name, String data) {
		super(name, data);
	}
	
	public String getString() {
		return (String) getData();
	}	
}

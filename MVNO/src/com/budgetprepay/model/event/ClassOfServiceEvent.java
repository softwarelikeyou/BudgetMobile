package com.budgetprepay.model.event;

import com.budgetprepay.model.entity.ClassOfService;

public class ClassOfServiceEvent extends Event {
	static final long serialVersionUID = 1L;

	public ClassOfServiceEvent(String name, ClassOfService classOfService) {
		super(name, classOfService);
	}

	public ClassOfService getClassOfService() {
		return (ClassOfService) getData();
	}	
}

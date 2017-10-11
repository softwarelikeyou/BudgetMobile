package com.budgetprepay.model.event;

import com.budgetprepay.model.entity.Group;

public class GroupEvent extends Event {
	static final long serialVersionUID = 1L;

	public GroupEvent(String name, Group group) {
		super(name, group);
	}

	public Group getGroup() {
		return (Group) getData();
	}	
}

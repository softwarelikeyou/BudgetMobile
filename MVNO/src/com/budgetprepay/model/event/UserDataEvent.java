package com.budgetprepay.model.event;

import com.budgetprepay.model.entity.UserData;

public class UserDataEvent extends Event {
	private static final long serialVersionUID = 1L;

	public UserDataEvent(String name, UserData user) {
		super(name, user);
	}

	public UserData getUserData() {
		return (UserData) getData();
	}
}

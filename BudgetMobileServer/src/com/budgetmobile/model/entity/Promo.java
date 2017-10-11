package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promo {

	@JsonProperty
	private String username;
	
	@JsonProperty
	private String bmi;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBmi() {
		return bmi;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
}

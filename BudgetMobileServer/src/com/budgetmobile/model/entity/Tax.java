package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax {
	
	@JsonProperty("DESCRIPTION")
    private String description;
	
	@JsonProperty("AMOUNT")
    private Double amount;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

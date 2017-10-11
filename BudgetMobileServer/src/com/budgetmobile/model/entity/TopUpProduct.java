package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopUpProduct {
	
	public TopUpProduct() {}
	
	public TopUpProduct(Integer topUpProductID, 
			            Integer type,
			            String description,
			            Double faceValue,
			            Integer creditsRequired) {
		this.topUpProductID = topUpProductID;
		this.type = type;
		this.description = description;
		this.faceValue = faceValue;
		this.creditsRequired = creditsRequired;
	}
	
	@JsonProperty("topUpProductID")
    private Integer topUpProductID;

	@JsonProperty("type")
    private Integer type;

	@JsonProperty("description")
    private String description;

	@JsonProperty("faceValue")
    private Double faceValue;

	@JsonProperty("creditsRequired")
    private Integer creditsRequired;
	
	public Integer getTopUpProductID() {
		return topUpProductID;
	}

	public void setTopUpProductID(Integer topUpProductID) {
		this.topUpProductID = topUpProductID;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(Double faceValue) {
		this.faceValue = faceValue;
	}
	
	public Integer getCreditsRequired() {
		return creditsRequired;
	}
	
	public void setCreditsRequired(Integer value) {
		this.creditsRequired = value;
	}
	
}

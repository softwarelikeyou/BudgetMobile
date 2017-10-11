package com.budgetmobile.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("USERID")
	private String userId;
	
	@JsonProperty("FNAME")
	private String fName;
	
	@JsonProperty("LNAME")
	private String lName;
	
	@JsonProperty("EMAIL")
	private String email;
	
	@JsonProperty("ORDERS")
	private Set<Order> orders = new HashSet<Order>();
	
	@JsonProperty("ISERROR")
	private Boolean isError;

	@JsonProperty("ERRORCODE")
	private String errorCode;
	
	@JsonProperty("ERRORMESSAGE")
	private String errorMessage;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}

	public Boolean getIsError() {
		return isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

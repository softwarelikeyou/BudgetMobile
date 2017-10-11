package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Purchase {
	
	@JsonProperty("ORDERID")
    private String orderID;
	
	@JsonProperty("REFERENCEID")
	private Integer referenceID;
	
	@JsonProperty("TOTAL")
	private String total;
	
	@JsonProperty("DESCRIPTION")
    private String description;
	
	@JsonProperty("CREDIT_CARD")
    private String creditCard;
	
	@JsonProperty("EXPIRATION")
    private String expiration;
	
	@JsonProperty("CCC")
    private String ccc;
	
	@JsonProperty("NAME")
    private String name;
	
	@JsonProperty("STREET_ADDRESS1")
    private String streetAddress1;
	
	@JsonProperty("STREET_ADDRESS2")
    private String streetAddress2;
	
	@JsonProperty("CITY")
    private String city;
	
	@JsonProperty("STATE")
    private String state;
	
	@JsonProperty("ZIP")
    private String zip;

	@JsonProperty("PHONE")
    private String phone;
	
	@JsonProperty("EMAIL")
    private String email;
	
	@JsonProperty("CREDIT")
    private String credit;
	
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Integer getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(Integer referenceID) {
		this.referenceID = referenceID;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}
}

package com.budgetmobile.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	
	public Address() {}
	
	public Address(final String address1,
			       final String address2,
			       final String city,
			       final String state,
			       final String zip) {
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	@JsonProperty("address1")
    private String address1;
	
	@JsonProperty("address2")
    private String address2;
	
	@JsonProperty("city")
    private String city;
	
	@JsonProperty("state")
    private String state;
	
	@JsonProperty("zip")
    private String zip;
    
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
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
}

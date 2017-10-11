package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class BillingAddressType {
	
	@XmlElement(name="city")
	private String city;
	
	@XmlElement(name="state")
	private String state;
	
	@XmlElement(name="zip")
	private String zip;

	@XmlElement(name="streetNumber")
	private String streetNumber;
	
	@XmlElement(name="streetName")
	private String streetName;
	
	@XmlElement(name="streetDirection")
	private String streetDirection;
	
	@XmlElement(name="line2")
	private String line2;

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

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetDirection() {
		return streetDirection;
	}

	public void setStreetDirection(String streetDirection) {
		this.streetDirection = streetDirection;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}
}

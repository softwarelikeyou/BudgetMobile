package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="billing")
public class BillingType {

	@XmlElement(name="firstName")
	private String firstName;
	
	@XmlElement(name="lastName")
	private String lastName;
	
	private BillingAddressType address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public BillingAddressType getAddress() {
		return address;
	}

	public void setAddress(final BillingAddressType address) {
		this.address = address;
	}
}

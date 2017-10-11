package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class ActivateRequestType extends RequestType {

	public ActivateRequestType() {
		type = "Activate";
	}
	
	@XmlElement(name = "esn")
	private String esn;
	
	@XmlElement(name = "planId")
	private String planId;
	
	private PhysicalAddressType physicalAddress;
	
	private ShippingAddressType shippingAddress;

	public String getEsn() {
		return esn;
	}

	public void setEsn(String esn) {
		this.esn = esn;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public PhysicalAddressType getPhysicalAddress() {
		return physicalAddress;
	}

	public void setPhysicalAddress(PhysicalAddressType physicalAddress) {
		this.physicalAddress = physicalAddress;
	}

	public ShippingAddressType getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddressType shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}

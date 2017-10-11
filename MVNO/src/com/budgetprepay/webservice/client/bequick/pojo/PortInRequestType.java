package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class PortInRequestType extends RequestType {

	public PortInRequestType() {
		type = "Activate";
	}

	@XmlElement(name="activityType")
	private String activityType = new String();
	
	@XmlElement(name="esn")
	private String ens = new String();
	
	@XmlElement(name="planId")
	private String planId = new String();
	
	private PhysicalAddressType physicalAddress = new PhysicalAddressType();				
	
	private ShippingAddressType shippingAddress = new ShippingAddressType();				
	
	private PortInfoType portInfo = new PortInfoType();

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getEns() {
		return ens;
	}

	public void setEns(String ens) {
		this.ens = ens;
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

	public PortInfoType getPortInfo() {
		return portInfo;
	}

	public void setPortInfo(PortInfoType portInfo) {
		this.portInfo = portInfo;
	}
}
	     


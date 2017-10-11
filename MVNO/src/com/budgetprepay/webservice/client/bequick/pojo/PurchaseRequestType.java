package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseRequestType extends RequestType {

	public PurchaseRequestType() {
		type = "Purchase";
	}
	
	@XmlElement(name = "mdn")
	private String mdn;

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
}

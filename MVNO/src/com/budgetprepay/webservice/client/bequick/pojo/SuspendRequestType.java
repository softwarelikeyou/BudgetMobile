package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class SuspendRequestType extends RequestType {

	public SuspendRequestType() {
		type = "Suspend";
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

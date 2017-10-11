package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class DisconnectRequestType extends RequestType {

	public DisconnectRequestType() {
		type = "Disconnect";
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

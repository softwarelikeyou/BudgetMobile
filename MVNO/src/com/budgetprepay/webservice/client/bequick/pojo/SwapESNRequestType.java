package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class SwapESNRequestType extends RequestType {

	public SwapESNRequestType() {
		type = "SwapESN";
	}
	
	@XmlElement(name = "mdn")
	private String mdn;

	@XmlElement(name = "esn")
	private String esn;
	
	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
	
	public String getEsn() {
		return esn;
	}

	public void setEsn(String esn) {
		this.esn = esn;
	}
}

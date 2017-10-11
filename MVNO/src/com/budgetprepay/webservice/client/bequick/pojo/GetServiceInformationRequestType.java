package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class GetServiceInformationRequestType extends RequestType {

	public GetServiceInformationRequestType() {
		type = "GetServiceInfo";
	}
	
	@XmlElement(name="mdn")
	private String mdn;
	
	@XmlElement(name="esn")
	private String esn;
	
	public void setMdn(final String mdn) {
		this.mdn = mdn;
	}
	
	public String getMdn() {
		return mdn;
	}
	
	public void setEsn(final String esn) {
		this.esn = esn;
	}
	
	public String getEsn() {
		return esn;
	}
}

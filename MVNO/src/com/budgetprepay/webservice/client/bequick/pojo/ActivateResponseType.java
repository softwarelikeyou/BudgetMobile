package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class ActivateResponseType extends ResponseType {

	@XmlElement(name="mdn")
	private String mdn;
	
	@XmlElement(name="msid")
	private String msid;
	
	@XmlElement(name="esn")
	private String esn;
	
	@XmlElement(name="msl")
	private String msl;

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getMsid() {
		return msid;
	}

	public void setMsid(String msid) {
		this.msid = msid;
	}

	public String getEsn() {
		return esn;
	}

	public void setEsn(String esn) {
		this.esn = esn;
	}

	public String getMsl() {
		return msl;
	}

	public void setMsl(String msl) {
		this.msl = msl;
	}
}

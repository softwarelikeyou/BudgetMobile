package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class GetCoverageRequestType extends RequestType {

	public GetCoverageRequestType() {
		type = "GetCoverage";
	}
	
	@XmlElement(name = "carrier")
	private String carrier;
	
	@XmlElement(name = "zip")
	private String zip;
	
	public void setCarrier(final String carrier) {
		this.carrier = carrier;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	public void setZip(final String zip) {
		this.zip = zip;
	}
	
	public String getZip() {
		return zip;
	}
}

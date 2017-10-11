package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class GetCoverageResponseType extends ResponseType {

	@XmlElement(name="nxx")
	private String npa;
	
	@XmlElement(name="nxx")
	private String nxx;
	
	@XmlElement(name="zip")
	private String zip;
	
	@XmlElement(name="coverageQualityCdma")
	private String coverageQualityCdma;
	
	@XmlElement(name="coverageQualityIden")
	private String coverageQualityIden;
	
	@XmlElement(name="is3g")
	private String is3g;
	
	@XmlElement(name="csa")
	private String csa;

	public String getNpa() {
		return npa;
	}

	public void setNpa(String npa) {
		this.npa = npa;
	}

	public String getNxx() {
		return nxx;
	}

	public void setNxx(String nxx) {
		this.nxx = nxx;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCoverageQualityCdma() {
		return coverageQualityCdma;
	}

	public void setCoverageQualityCdma(String coverageQualityCdma) {
		this.coverageQualityCdma = coverageQualityCdma;
	}

	public String getCoverageQualityIden() {
		return coverageQualityIden;
	}

	public void setCoverageQualityIden(String coverageQualityIden) {
		this.coverageQualityIden = coverageQualityIden;
	}

	public String getIs3g() {
		return is3g;
	}

	public void setIs3g(String is3g) {
		this.is3g = is3g;
	}

	public String getCsa() {
		return csa;
	}

	public void setCsa(String csa) {
		this.csa = csa;
	}
}

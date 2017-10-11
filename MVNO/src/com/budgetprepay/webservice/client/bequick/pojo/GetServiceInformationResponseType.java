package com.budgetprepay.webservice.client.bequick.pojo;

import javax.xml.bind.annotation.XmlElement;

public class GetServiceInformationResponseType extends ResponseType {
	
	@XmlElement(name="mdn")
	private String mdn;
	
	@XmlElement(name="customerAccount")
	private String customerAccount;
	
	@XmlElement(name="activationDate")
	private String activationDate;
	
	@XmlElement(name="expirationDate")
	private String expirationDate;
	
	@XmlElement(name="msid")
	private String msid;
	
	@XmlElement(name="esn")
	private String esn;
	
	@XmlElement(name="status")
	private String serviceStatus;
	
	@XmlElement(name="activeData")
	private String activeData;
	
	@XmlElement(name="pendingData")
	private String pendingData;
	
	@XmlElement(name="totalData")
	private String totalData;
	
	@XmlElement(name="activeTexts")
	private String activeTexts;
	
	@XmlElement(name="pendingTexts")
	private String pendingTexts;
	
	@XmlElement(name="totalTexts")
	private String totalTexts;
	
	@XmlElement(name="activeMinutes")
	private String activeMinutes;
	
	@XmlElement(name="pendingMinutes")
	private String pendingMinutes;
	
	@XmlElement(name="totalMinutes")
	private String totalMinutes;
	
	@XmlElement(name="planName")
	private String planName;
	
	@XmlElement(name="planId")
	private String planId;
	
	@XmlElement(name="msl")
	private String msl;

	public String getMdn() {
		return mdn;
	}

	public void setMdn(final String mdn) {
		this.mdn = mdn;
	}

	public String getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(final String customerAccount) {
		this.customerAccount = customerAccount;
	}

	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(final String activationDate) {
		this.activationDate = activationDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(final String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getMsid() {
		return msid;
	}

	public void setMsid(final String msid) {
		this.msid = msid;
	}

	public String getEsn() {
		return esn;
	}

	public void setEsn(final String esn) {
		this.esn = esn;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(final String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getActiveData() {
		return activeData;
	}

	public void setActiveData(final String activeData) {
		this.activeData = activeData;
	}

	public String getPendingData() {
		return pendingData;
	}

	public void setPendingData(final String pendingData) {
		this.pendingData = pendingData;
	}

	public String getTotalData() {
		return totalData;
	}

	public void setTotalData(final String totalData) {
		this.totalData = totalData;
	}

	public String getActiveTexts() {
		return activeTexts;
	}

	public void setActiveTexts(final String activeTexts) {
		this.activeTexts = activeTexts;
	}

	public String getPendingTexts() {
		return pendingTexts;
	}

	public void setPendingTexts(final String pendingTexts) {
		this.pendingTexts = pendingTexts;
	}

	public String getTotalTexts() {
		return totalTexts;
	}

	public void setTotalTexts(final String totalTexts) {
		this.totalTexts = totalTexts;
	}

	public String getActiveMinutes() {
		return activeMinutes;
	}

	public void setActiveMinutes(final String activeMinutes) {
		this.activeMinutes = activeMinutes;
	}

	public String getPendingMinutes() {
		return pendingMinutes;
	}

	public void setPendingMinutes(final String pendingMinutes) {
		this.pendingMinutes = pendingMinutes;
	}

	public String getTotalMinutes() {
		return totalMinutes;
	}

	public void setTotalMinutes(final String totalMinutes) {
		this.totalMinutes = totalMinutes;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(final String planName) {
		this.planName = planName;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(final String planId) {
		this.planId = planId;
	}

	public String getMsl() {
		return msl;
	}

	public void setMsl(final String msl) {
		this.msl = msl;
	}
}

package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class LERGDAllocateMSISDNRequest {

	private String transactionId;
	private String imsi;
	private String mdn;
    private String icc;
    private String type;
    private String zipCode;
    private String channelId;
    private String plan;
    private String packageName;	
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getIcc() {
		return icc;
	}

	public void setIcc(String icc) {
		this.icc = icc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
	    buffer.append("<LERGD_ALLOCATE_MSISDN>");
	    buffer.append(" <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>");
	    buffer.append(" <PRIMARY_MSISDN>" + mdn + "</PRIMARY_MSISDN>");
	    buffer.append(" <ICC_ID>" + icc + "</ICC_ID>");
	    buffer.append(" <ALLOCATION_TYPE>" + type + "</ALLOCATION_TYPE>");
	    buffer.append(" <ZIP_CODE>" + zipCode + "</ZIP_CODE>");
	    buffer.append(" <CHANNEL_ID>" + channelId + "</CHANNEL_ID>");
	    buffer.append(" <PLAN>" + plan + "</PLAN>");
	    buffer.append(" <PACKAGE>" + packageName + "</PACKAGE>");
	    buffer.append("</LERGD_ALLOCATE_MSISDN>");
		return buffer.toString();
	}
}

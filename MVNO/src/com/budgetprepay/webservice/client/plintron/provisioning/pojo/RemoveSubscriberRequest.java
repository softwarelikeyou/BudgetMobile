package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class RemoveSubscriberRequest {

	private String transactionId;
	private String imsi;
	private String mdn;
	private String reason = "Ported-Out";

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
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>");
		buffer.append("<HEADER>");
		buffer.append("<TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>");
		buffer.append("<REQUEST_TYPE>REMOVE_SUBSCRIBER</REQUEST_TYPE>");
		buffer.append("</HEADER>");
		buffer.append("<BODY>");
		buffer.append("<PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>");
		buffer.append("<PRIMARY_MSISDN>" + mdn + "</PRIMARY_MSISDN>");
		buffer.append("<REASON>" + reason + "</REASON>");
		buffer.append("</BODY>");
		buffer.append("</REQUEST>");
		return buffer.toString();
	}	
}

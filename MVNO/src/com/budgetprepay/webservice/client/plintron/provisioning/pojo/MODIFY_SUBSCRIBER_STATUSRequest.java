package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class MODIFY_SUBSCRIBER_STATUSRequest {

	private String transactionId;
	private String imsi;
	private String msisdn;
	private String status;
	
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

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>" + "\n");
	    buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>MODIFY_SUBSCRIBER_STATUS</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");
		buffer.append("  <STATUS>" + status + "</STATUS>" + "\n");
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
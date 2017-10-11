package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class CHANGE_IMSIRequest {

	private String transactionId;
	private String oldImsi;
	private String newImsi;
	private String msisdn;
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOldImsi() {
		return oldImsi;
	}

	public void setOldImsi(String oldImsi) {
		this.oldImsi = oldImsi;
	}

	public String getNewImsi() {
		return newImsi;
	}

	public void setNewImsi(String newImsi) {
		this.newImsi = newImsi;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>" + "\n");
	    buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>CHANGE_IMSI</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <OLD_IMSI>" + oldImsi + "</OLD_IMSI>" + "\n");
		buffer.append("  <NEW_IMSI>" + newImsi + "</NEW_IMSI>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");	    
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
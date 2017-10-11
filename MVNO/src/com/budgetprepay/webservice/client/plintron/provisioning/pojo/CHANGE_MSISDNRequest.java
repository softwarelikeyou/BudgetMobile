package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class CHANGE_MSISDNRequest {

	private String transactionId;
	private String imsi;
	private String newMsisdn;
	private String portInFlag;
	private String iccId;
	private String msisdn;
	
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

	public String getNewMsisdn() {
		return newMsisdn;
	}

	public void setNewMsisdn(String newMsisdn) {
		this.newMsisdn = newMsisdn;
	}

	public String getPortInFlag() {
		return portInFlag;
	}

	public void setPortInFlag(String portInFlag) {
		this.portInFlag = portInFlag;
	}

	public String getIccId() {
		return iccId;
	}

	public void setIccId(String iccId) {
		this.iccId = iccId;
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
		buffer.append("  <REQUEST_TYPE>CHANGE_MSISDN</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <NEW_MSISDN>" + newMsisdn + "</NEW_MSISDN>" + "\n");
		buffer.append("  <PORTED_IN_FLAG>" + portInFlag + "</PORTED_IN_FLAG>" + "\n");
		buffer.append("  <ICC_ID>" + iccId + "</ICC_ID>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");	    
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
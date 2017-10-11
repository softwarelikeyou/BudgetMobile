package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

public class GET_SUBSCRIBER_INFORequest {

	private String transactionId;
	private String imsi;
	private String msisdn;
	private String type;
	private String queryType;
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>" + "\n");
	    buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>GET_SUBSCRIBER_INFO</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <TYPE>" + type + "</TYPE>" + "\n");
		buffer.append("  <QUERY_TYPE>" + queryType + "</QUERY_TYPE>" + "\n");
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
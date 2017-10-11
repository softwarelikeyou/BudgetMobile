package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.util.ArrayList;
import java.util.List;

public class REMOVE_SOCRequest {

	private String transactionId;
	private String imsi;
	private String msisdn;
	private List<String> socs = new ArrayList<String>();
	
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

	public List<String> getSocs() {
		return socs;
	}

	public void setSocs(List<String> socs) {
		this.socs = socs;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>" + "\n");
	    buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>REMOVE_SOC</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");
		for (String soc : socs) {
	        buffer.append("  <SOCS>" + "\n");
		    buffer.append("   <soc>" + soc + "</soc>" + "\n");
		    buffer.append("  </SOCS>" + "\n");
		}
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
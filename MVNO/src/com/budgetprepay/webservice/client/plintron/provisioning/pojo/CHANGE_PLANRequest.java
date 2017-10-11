package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.util.ArrayList;
import java.util.List;

public class CHANGE_PLANRequest {

	private String transactionId;
	private String imsi;
	private String msisdn;
	private String iccid;
	private String plan;
	private String packageName;
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

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
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
		buffer.append("  <REQUEST_TYPE>CHANGE_PLAN</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");
		buffer.append("  <ICC_ID>" + iccid + "</ICC_ID>" + "\n");
		buffer.append("  <PLAN>" + plan + "</PLAN>" + "\n");
		buffer.append("  <PACKAGE>" + packageName + "</PACKAGE>" + "\n");
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
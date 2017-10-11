package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.util.ArrayList;
import java.util.List;

public class MODIFY_SUBSCRIBER_BUCKETRequest {

	private String transactionId;
	private String imsi;
	private String msisdn;
	private String iccid;
	private List<com.budgetprepay.webservice.pojos.plintron.SocType> socs = new ArrayList<com.budgetprepay.webservice.pojos.plintron.SocType>();
	
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

	public List<com.budgetprepay.webservice.pojos.plintron.SocType> getSocs() {
		return socs;
	}

	public void setSocs(List<com.budgetprepay.webservice.pojos.plintron.SocType> socs) {
		this.socs = socs;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>" + "\n");
	    buffer.append(" <HEADER>" + "\n");
		buffer.append("  <TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>" + "\n");
		buffer.append("  <REQUEST_TYPE>ADD_SOC</REQUEST_TYPE>" + "\n");
		buffer.append(" </HEADER>" + "\n");
		buffer.append(" <BODY>" + "\n");
		buffer.append("  <PRIMARY_IMSI>" + imsi + "</PRIMARY_IMSI>" + "\n");
		buffer.append("  <PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>" + "\n");	    
		for (com.budgetprepay.webservice.pojos.plintron.SocType soc : socs) {
	        buffer.append("  <SOCS>" + "\n");
		    buffer.append("   <soc>" + soc.getName() + "</soc>" + "\n");
		    buffer.append("   <billCycleDay>" + soc.getBillCycleDay() + "</billCycleDay>" + "\n");
		    buffer.append("   <expirationDate>" + soc.getEffectiveDate() + "</expirationDate>" + "\n");
		    buffer.append("  </SOCS>" + "\n");
		}
		buffer.append(" </BODY>" + "\n");
		buffer.append("</REQUEST>" + "\n");
		return buffer.toString();
	}
}
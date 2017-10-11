package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class SwapMSISDNRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;

	private String imsi;
	
	private String iccid;
	
	private String dna;
	
	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getDialogID() {
		return dialogID;
	}

	public void setDialogID(String dialogID) {
		this.dialogID = dialogID;
	} 

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getDna() {
		return dna;
	}

	public void setDna(String dna) {
		this.dna = dna;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<SWAPMSISDN>");
    	buffer.append("<REQUESTTYPE>SwapMsisdn</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<IMSI>" + imsi + "</IMSI>");
    	buffer.append("<ICCID>" + iccid + "</ICCID>");
    	buffer.append("<DNA>" + dna + "</DNA>");
    	buffer.append("</SWAPMSISDN>");		
		return buffer.toString();
	}
}

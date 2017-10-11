package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class ModifyingSubscriberLanguageTypeRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;
	
	private String langType;
	
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

	public String getLangType() {
		return langType;
	}

	public void setLangType(String langType) {
		this.langType = langType;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<MISSINGCLAIM>");
    	buffer.append("<REQUESTTYPE>changelanguagetype</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<LANGTYPE>" + langType + "</LANGTYPE>");
    	buffer.append("</MISSINGCLAIM>");		
		return buffer.toString();
	}
}

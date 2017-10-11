package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class BlockUnblockSIMRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;
	
	private String setFlag;
	
	private String operationCode;

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
	
	public String getSetFlag() {
		return setFlag;
	}

	public void setSetFlag(String setFlag) {
		this.setFlag = setFlag;
	}

	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<MISSINGCLAIM>");
    	buffer.append("<REQUESTTYPE>MissingClaim</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<SETFLAG>" + setFlag + "</SETFLAG>");
    	buffer.append("<OPERATIONCODE>" + operationCode + "</OPERATIONCODE>");
    	buffer.append("</MISSINGCLAIM>");		
		return buffer.toString();
	}
}

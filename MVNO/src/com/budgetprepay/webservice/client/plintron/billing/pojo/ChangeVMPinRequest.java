package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class ChangeVMPinRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;
	
	private String oldPin;
	
	private String newPin;

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

	public String getOldPin() {
		return oldPin;
	}

	public void setOldPin(String oldPin) {
		this.oldPin = oldPin;
	}

	public String getNewPin() {
		return newPin;
	}

	public void setNewPin(String newPin) {
		this.newPin = newPin;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<CHANGEPIN>");
    	buffer.append("<REQUESTTYPE>changevmspin</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<VMS_OLDPIN>" + oldPin + "</VMS_OLDPIN>");
    	buffer.append("<VMS_NEWPIN>" + newPin + "</VMS_NEWPIN>");
    	buffer.append("</CHANGEPIN>");
		return buffer.toString();
	}
}

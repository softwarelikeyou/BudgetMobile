package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class GetSubscriptionStatusRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;

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
	
	@Override
	public String toString() {	
		StringBuffer buffer = new StringBuffer();

    	buffer.append("<SERVICESTATUS>");
    	buffer.append("<REQUESTTYPE>getservicestatus</REQUESTTYPE>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("</SERVICESTATUS>");
		return buffer.toString();
	}
}

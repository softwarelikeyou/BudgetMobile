package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class LogoutRequest {
		
	private String clientType = "15";
	
	private String dialogId;
	
	private String sessionId;

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getDialogId() {
		return dialogId;
	}

	public void setDialogID(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<LOGOUTREQUEST>");
    	buffer.append("<REQUESTTYPE>clienttermination</REQUESTTYPE>");
    	buffer.append("<CLIENTTYPE>" + clientType + "</CLIENTTYPE>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogId + "</DIALOGID>");
    	buffer.append("</LOGOUTREQUEST>");
		return buffer.toString();
	}
}

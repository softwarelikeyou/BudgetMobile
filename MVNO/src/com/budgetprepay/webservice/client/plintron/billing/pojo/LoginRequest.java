package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class LoginRequest {
		
	private String clientType = "15";
	
	private String dialogID;
	
	private String userID;
	
	private String password;

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getDialogID() {
		return dialogID;
	}

	public void setDialogID(String dialogID) {
		this.dialogID = dialogID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<LOGINREQUEST>");
    	buffer.append("<REQUESTTYPE>clientauthentication</REQUESTTYPE>");
    	buffer.append("<CLIENTTYPE>" + clientType + "</CLIENTTYPE>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<USERID>" + userID + "</USERID>");
    	buffer.append("<PASSWORD>" + password + "</PASSWORD>");
    	buffer.append("</LOGINREQUEST>");
		return buffer.toString();
	}
}

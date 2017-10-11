package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class ServiceActivateRequest {

	private String mdn;
	
	private String sessionId;
	  
	private String dialogID;
	
	private String clientType;
	
	private String serviceId;

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

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	@Override
	public String toString() {	
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<SERVICEACTDEACT>");
    	buffer.append("<REQUESTTYPE>serviceactdeact</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<OPERATIONCODE>" + "A" + "</OPERATIONCODE>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<CLIENTTYPE>" + clientType + "</CLIENTTYPE>");
    	buffer.append("<SERVICEID>" + serviceId + "</SERVICEID>");
    	buffer.append("</SERVICEACTDEACT>");
		return buffer.toString();
	}
}

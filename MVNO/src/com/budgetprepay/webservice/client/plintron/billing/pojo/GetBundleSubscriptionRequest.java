package com.budgetprepay.webservice.client.plintron.billing.pojo;

public class GetBundleSubscriptionRequest {
	
	private String mdn;
	private String serviceCode;
	private String networkId;
	private String sessionId;
	private String dialogID;

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
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

	private String getCoorelatedServiceCode(final String serviceCode) {
		switch (serviceCode) {
		case "LLFREE250":
		    return "1001";
		case "LLFREE350":
			return "1002";
		case "LLCAFREE":
			return "1003";
		case "CAUnlimited":
			return "1004";
		default:
			return "";	
		}
	}
	
	@Override
	public String toString() {	
		StringBuffer buffer = new StringBuffer();
    	buffer.append("<QUERYBUNDLESUBSCRIPTIONREQ>");
    	buffer.append("<REQUESTTYPE>querybundlesubscription</REQUESTTYPE>");
    	buffer.append("<MSISDN>" + mdn + "</MSISDN>");
    	buffer.append("<SERVICECODE>" + getCoorelatedServiceCode(serviceCode) + "</SERVICECODE>");
    	buffer.append("<NETWORKID>" + networkId + "</NETWORKID>");
    	buffer.append("<SESSIONID>" + sessionId + "</SESSIONID>");
    	buffer.append("<DIALOGID>" + dialogID + "</DIALOGID>");
    	buffer.append("<AUTOFLAG>" + "0" + "</AUTOFLAG>");
    	buffer.append("<PM>" + "1" + "</PM>");
    	buffer.append("</QUERYBUNDLESUBSCRIPTIONREQ>");
		return buffer.toString();
	}
}

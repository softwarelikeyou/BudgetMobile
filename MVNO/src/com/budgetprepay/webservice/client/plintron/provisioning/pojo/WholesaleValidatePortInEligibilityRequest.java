package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class WholesaleValidatePortInEligibilityRequest {

	private static String ACTION = "/PORTIN/ELIGIBILITY/GET";
	
	public static String SERVICE_NAME = "ValidatePortInEligibility";
	
	private String msisdn;
	private String transactionId;
	
	public String getMsisdn() {
		return msisdn;
	}
	
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
   
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<REQUEST>");
		buffer.append("<HEADER>");
		buffer.append("<TRANSACTION_ID>" + transactionId + "</TRANSACTION_ID>");
		buffer.append("<REQUEST_TYPE>INITIATE_THIRD_PARTY_API</REQUEST_TYPE>");
		buffer.append("<CONNECTION_TYPE>0</CONNECTION_TYPE>");
		buffer.append("</HEADER>");
		buffer.append("<BODY>");
		buffer.append("<MSG_TYPE>Validate-Port-In</MSG_TYPE>");
		//buffer.append("<PRIMARY_IMSI>" + "</PRIMARY_IMSI>");
		buffer.append("<PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>");
		buffer.append("<MSG_SOAP_ACTION>" + ACTION + "</MSG_SOAP_ACTION>");
        buffer.append("<TP_XML>");
    	buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
   	    buffer.append("<soapenv:Header/>");
   	    buffer.append("<soapenv:Body>");
	    buffer.append("<WholesaleValidatePortInEligibilityRequest>");
	    buffer.append("<WholesaleValidatePortInEligibilityInput>");
	    buffer.append("<WholesaleSubscriber>");
	    buffer.append("<msisdn>" + msisdn + "</msisdn>");
	    buffer.append("<sim/>");
	    buffer.append("</WholesaleSubscriber>");
	    buffer.append("</WholesaleValidatePortInEligibilityInput>");
	    buffer.append("<CrossReference>");
	    buffer.append("<clientId>" + "0" + "</clientId>");
	    buffer.append("<transactionId>" + transactionId + "</transactionId>");
	    buffer.append("<callbackLocation>" + ResourceUtil.get("plintron.provisioning.callback.url") + "</callbackLocation>");
	    buffer.append("</CrossReference>");
	    buffer.append("<ServiceTarget>");
	    buffer.append("<serviceName>" + SERVICE_NAME + "</serviceName>");
	    buffer.append("</ServiceTarget>");
	    buffer.append("<Security>");
	    buffer.append("<userId>" + ResourceUtil.get("plintron.billing.username") + "</userId>");
	    buffer.append("<password>" + ResourceUtil.get("plintron.billing.password") + "</password>");
	    buffer.append("<key/>");
	    buffer.append("</Security>");
	    buffer.append("</WholesaleValidatePortInEligibilityRequest>");		
	    buffer.append("</soapenv:Body>");
	    buffer.append("</soapenv:Envelope>");
		buffer.append("</TP_XML>");
		buffer.append("</BODY>");
		buffer.append("</REQUEST>");
		return buffer.toString();
	}
}



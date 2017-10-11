package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class WholesaleUpdatePortInRequest {

	private static String ACTION = "/PORTIN/ACTIVITY/UPDATE";
	
	public static String SERVICE_NAME = "UpdatePortInRequest";
	
	private String msisdn;
    private String sim;
    private String ospAccountNumber;
    private String ospPin;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;
    private String transactionId;
	
	public String getMsisdn() {
		return msisdn;
	}
	
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	public String getSim() {
		return sim;
	}
	
	public void setSim(String sim) {
		this.sim = sim;
	}
	
	public String getOspAccountNumber() {
		return ospAccountNumber;
	}
	
	public void setOspAccountNumber(String ospAccountNumber) {
		this.ospAccountNumber = ospAccountNumber;
	}
	
	
	public String getOspPin() {
		return ospPin;
	}

	public void setOspPin(String ospPin) {
		this.ospPin = ospPin;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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
		buffer.append("<MSG_TYPE>Update-Port-In</MSG_TYPE>");
		buffer.append("<PRIMARY_IMSI>" + sim + "</PRIMARY_IMSI>");
		buffer.append("<PRIMARY_MSISDN>" + msisdn + "</PRIMARY_MSISDN>");
		buffer.append("<MSG_SOAP_ACTION>" + ACTION + "</MSG_SOAP_ACTION>");
        buffer.append("<TP_XML>");
    	buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
   	    buffer.append("<soapenv:Header/>");
   	    buffer.append("<soapenv:Body>");
	    buffer.append("<WholesaleUpdatePortInRequest>");
	    buffer.append("<WholesaleUpdatePortInInput>");
	    buffer.append("<WholesaleSubscriber>");
	    buffer.append("<msisdn>" + msisdn + "</msisdn>");
	    buffer.append("<sim>" + sim + "</sim>");
	    buffer.append("</WholesaleSubscriber>");
	    buffer.append("<WholesalePortInInfo>");
	    buffer.append("<ospAccountNumber>" + ospAccountNumber + "</ospAccountNumber>");
	    buffer.append("<ospAccountPassword>" + ospPin + "</ospAccountPassword>");
	    buffer.append("<WholesaleBilling>");
	    buffer.append("<name>" + name + "</name>");
	    buffer.append("<addressLine1>" + addressLine1 + "</addressLine1>");
	    buffer.append("<city>" + city + "</city>");
	    buffer.append("<state>" + state + "</state>");
	    buffer.append("<zip>" + zip + "</zip>");
	    buffer.append("</WholesaleBilling>");
	    buffer.append("</WholesalePortInInfo>");
	    buffer.append("<zip>" + zip + "</zip>");
	    buffer.append("<plan>Plintron Service</plan>");
	    buffer.append("<package>USF</package>");	    
	    buffer.append("</WholesaleUpdatePortInInput>");
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
	    buffer.append("</WholesaleUpdatePortInRequest>");		
	    buffer.append("</soapenv:Body>");
	    buffer.append("</soapenv:Envelope>");
		buffer.append("</TP_XML>");
		buffer.append("</BODY>");
		buffer.append("</REQUEST>");
		return buffer.toString();
	}
}

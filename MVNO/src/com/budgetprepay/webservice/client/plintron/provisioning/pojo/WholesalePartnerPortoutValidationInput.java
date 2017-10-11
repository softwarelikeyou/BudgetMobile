package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WholesalePartnerPortoutValidationInput {

	private String msisdn;
	private String ospAccountNumber;
	private String ospAccountPassword;
	private String ssn;
	private String fein;
	private String dob;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	private String clientId;
	private String transactionId;
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getOspAccountNumber() {
		return ospAccountNumber;
	}
	public void setOspAccountNumber(String ospAccountNumber) {
		this.ospAccountNumber = ospAccountNumber;
	}
	public String getOspAccountPassword() {
		return ospAccountPassword;
	}
	public void setOspAccountPassword(String ospAccountPassword) {
		this.ospAccountPassword = ospAccountPassword;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getFein() {
		return fein;
	}
	public void setFein(String fein) {
		this.fein = fein;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
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
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
    
	public static WholesalePartnerPortoutValidationInput parse(final Document doc) throws Exception {
		WholesalePartnerPortoutValidationInput wholesalePartnerPortoutValidationInput = new WholesalePartnerPortoutValidationInput();
		
		NodeList nList = doc.getElementsByTagName("ns0:Subscriber");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:msisdn").item(0) != null)
					wholesalePartnerPortoutValidationInput.setMsisdn(eElement.getElementsByTagName("ns0:msisdn").item(0).getTextContent());
			}
		}	
		
		nList = doc.getElementsByTagName("ns0:PortInfo");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:ospAccountNumber").item(0) != null)
					wholesalePartnerPortoutValidationInput.setOspAccountNumber(eElement.getElementsByTagName("ns0:ospAccountNumber").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:ospAccountPassword").item(0) != null)
					wholesalePartnerPortoutValidationInput.setOspAccountPassword(eElement.getElementsByTagName("ns0:ospAccountPassword").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:ssn").item(0) != null)
					wholesalePartnerPortoutValidationInput.setSsn(eElement.getElementsByTagName("ns0:ssn").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:fein").item(0) != null)
					wholesalePartnerPortoutValidationInput.setFein(eElement.getElementsByTagName("ns0:fein").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:dob").item(0) != null)
					wholesalePartnerPortoutValidationInput.setDob(eElement.getElementsByTagName("ns0:dob").item(0).getTextContent());			
			}
		}
		
		nList = doc.getElementsByTagName("ns0:WholesaleBilling");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:name").item(0) != null)
					wholesalePartnerPortoutValidationInput.setName(eElement.getElementsByTagName("ns0:name").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:addressLine1").item(0) != null)
					wholesalePartnerPortoutValidationInput.setAddressLine1(eElement.getElementsByTagName("ns0:addressLine1").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:addressLine2").item(0) != null)
					wholesalePartnerPortoutValidationInput.setAddressLine2(eElement.getElementsByTagName("ns0:addressLine2").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:city").item(0) != null)
					wholesalePartnerPortoutValidationInput.setCity(eElement.getElementsByTagName("ns0:city").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:state").item(0) != null)
					wholesalePartnerPortoutValidationInput.setState(eElement.getElementsByTagName("ns0:state").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:zip").item(0) != null)
					wholesalePartnerPortoutValidationInput.setZip(eElement.getElementsByTagName("ns0:zip").item(0).getTextContent());
			}
		}
	
		nList = doc.getElementsByTagName("ns0:CrossReference");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:clientId").item(0) != null)
					wholesalePartnerPortoutValidationInput.setClientId(eElement.getElementsByTagName("ns0:clientId").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:transactionId").item(0) != null)
					wholesalePartnerPortoutValidationInput.setTransactionId(eElement.getElementsByTagName("ns0:transactionId").item(0).getTextContent());
			}
		}	
		
		return wholesalePartnerPortoutValidationInput;
	}
	
	public static String response(final String mdn, final String result, final String description, final String messageCode, final String status) throws Exception {
		StringBuffer buffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");
		buffer.append("<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "\n");
	    buffer.append(" <s:Body xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" + "\n");
	    buffer.append("  <WholesaleOutput xmlns=\"http://www.tmobile.com/Applications/WholesaleExt/ApplicationServiceInterfaces/WholesaleAsyncResponse\">" + "\n");
	    buffer.append("   <WholesaleSubscriber>" + "\n");
	    buffer.append("    <msisdn>" + mdn + "</msisdn>" + "\n");
	    buffer.append("   </WholesaleSubscriber>" + "\n");
	    buffer.append("   <Results>" + "\n");
	    buffer.append("    <result>" + result + "</result>" + "\n");
	    buffer.append("    <description>" + description + "</description>" + "\n");
	    buffer.append("    <messageCode>" + messageCode + "</messageCode>" + "\n");
	    buffer.append("    <status>" + status + "</status>" + "\n");
	    buffer.append("   </Results>" + "\n");
	    buffer.append("  </WholesaleOutput>" + "\n");
	    buffer.append(" </s:Body>" + "\n");
	    buffer.append("</s:Envelope>");
		return buffer.toString();
	}
}

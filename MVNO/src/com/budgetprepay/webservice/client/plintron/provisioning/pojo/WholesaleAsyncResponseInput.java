package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import  org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WholesaleAsyncResponseInput {

	private String msisdn;
	private String sim;
	private String imei;
	private String result;
	private String description;
	private String clientId;
	private String transactionId;
	private String callbackLocation;
	private String messageCode;
	private String status;
	
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
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
	public String getCallbackLocation() {
		return callbackLocation;
	}
	public void setCallbackLocation(String callbackLocation) {
		this.callbackLocation = callbackLocation;
	}
	
	public String getMessageCode() {
		return messageCode;
	}
	
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static WholesaleAsyncResponseInput parse(final Document doc) throws Exception {
		WholesaleAsyncResponseInput wholesaleAsyncResponseInput = new WholesaleAsyncResponseInput();
		
		NodeList nList = doc.getElementsByTagName("ns0:WholesaleSubscriber");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:msisdn").item(0) != null)
					wholesaleAsyncResponseInput.setMsisdn(eElement.getElementsByTagName("ns0:msisdn").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:sim").item(0) != null)
					wholesaleAsyncResponseInput.setSim(eElement.getElementsByTagName("ns0:sim").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:imei").item(0) != null)
					wholesaleAsyncResponseInput.setImei(eElement.getElementsByTagName("ns0:imei").item(0).getTextContent());
			}
		}	
		
		nList = doc.getElementsByTagName("ns0:Results");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:result").item(0) != null)
					wholesaleAsyncResponseInput.setResult(eElement.getElementsByTagName("ns0:result").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:description").item(0) != null)
					wholesaleAsyncResponseInput.setDescription(eElement.getElementsByTagName("ns0:description").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:messageCode").item(0) != null)
					wholesaleAsyncResponseInput.setMessageCode(eElement.getElementsByTagName("ns0:messageCode").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:status").item(0) != null)
					wholesaleAsyncResponseInput.setStatus(eElement.getElementsByTagName("ns0:status").item(0).getTextContent());
			}
		}	
		
		nList = doc.getElementsByTagName("ns0:CrossReference");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("ns0:clientId").item(0) != null)
					wholesaleAsyncResponseInput.setClientId(eElement.getElementsByTagName("ns0:clientId").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:transactionId").item(0) != null)
					wholesaleAsyncResponseInput.setTransactionId(eElement.getElementsByTagName("ns0:transactionId").item(0).getTextContent());
				if (eElement.getElementsByTagName("ns0:callbackLocation").item(0) != null)
					wholesaleAsyncResponseInput.setCallbackLocation(eElement.getElementsByTagName("ns0:callbackLocation").item(0).getTextContent());
			}
		}	
		
		return wholesaleAsyncResponseInput;
	}	
	
	public static String response(final String status) {
		StringBuffer buffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");
		buffer.append("<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "\n");
		buffer.append(" <SOAP-ENV:Body>" + "\n");
		buffer.append("  <ns0:WholesaleAsyncResponseOutput xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://www.tmobile.com/Applications/WholesaleExt/ApplicationServiceInterfaces/WholesaleAsyncResponse\">" + "\n");
		buffer.append("   <ns0:status>" + status + "</ns0:status>" + "\n");
		buffer.append("  </ns0:WholesaleAsyncResponseOutput>" + "\n");
		buffer.append(" </SOAP-ENV:Body>" + "\n");
		buffer.append("</SOAP-ENV:Envelope>" + "\n");
		return buffer.toString();
	}
}

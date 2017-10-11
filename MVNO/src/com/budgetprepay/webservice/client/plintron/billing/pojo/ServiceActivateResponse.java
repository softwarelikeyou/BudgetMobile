package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ServiceActivateResponse {
	private String returnCode;
	private String errorDescription;
	private String dialogId;
	private String sessionId;
	private String mdn;
	private String networkId;
	private String serviceCharge;
	private String newBalance;
	
	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getDialogId() {
		return dialogId;
	}

	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	
	public String getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(String newBalance) {
		this.newBalance = newBalance;
	}

	public static ServiceActivateResponse parse(final String xml) throws Exception {
		ServiceActivateResponse response = new ServiceActivateResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		NodeList nList = doc.getElementsByTagName("SERVICEACTDEACTRESP");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;	
				
				if (eElement.getElementsByTagName("RETURNCODE").item(0) != null)
				    response.setReturnCode(eElement.getElementsByTagName("RETURNCODE").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERRDESCRITION").item(0) != null)
				    response.setErrorDescription(eElement.getElementsByTagName("ERRDESCRITION").item(0).getTextContent());
				if (eElement.getElementsByTagName("DIALOGID").item(0) != null)
				    response.setDialogId(eElement.getElementsByTagName("DIALOGID").item(0).getTextContent());
				if (eElement.getElementsByTagName("SESSIONID").item(0) != null)
				    response.setSessionId(eElement.getElementsByTagName("SESSIONID").item(0).getTextContent());
				if (eElement.getElementsByTagName("NETWORKID").item(0) != null)
				    response.setNetworkId(eElement.getElementsByTagName("NETWORKID").item(0).getTextContent());
				if (eElement.getElementsByTagName("SERVICECHARGE").item(0) != null)
				    response.setServiceCharge(eElement.getElementsByTagName("SERVICECHARGE").item(0).getTextContent());
				if (eElement.getElementsByTagName("NEWBALANCE").item(0) != null)
				    response.setNewBalance(eElement.getElementsByTagName("NEWBALANCE").item(0).getTextContent());
				if (eElement.getElementsByTagName("MSISDN").item(0) != null)
				    response.setMdn(eElement.getElementsByTagName("MSISDN").item(0).getTextContent());
			}
		}
		
		return response;
	}
}

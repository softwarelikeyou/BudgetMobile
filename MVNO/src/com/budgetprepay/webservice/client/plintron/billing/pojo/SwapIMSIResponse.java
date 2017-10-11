package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SwapIMSIResponse {
	private String returnCode;
	private String errorDescription;
	private String dialogId;
	private String sessionId;
	private String oldImsi;
	private String priImsi;
	private String secImsi;
	private String multiImsi;
	
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

	public String getOldImsi() {
		return oldImsi;
	}

	public void setOldImsi(String oldImsi) {
		this.oldImsi = oldImsi;
	}

	public String getPriImsi() {
		return priImsi;
	}

	public void setPriImsi(String priImsi) {
		this.priImsi = priImsi;
	}

	public String getSecImsi() {
		return secImsi;
	}

	public void setSecImsi(String secImsi) {
		this.secImsi = secImsi;
	}

	public String getMultiImsi() {
		return multiImsi;
	}

	public void setMultiImsi(String multiImsi) {
		this.multiImsi = multiImsi;
	}

	public static SwapIMSIResponse parse(final String xml) throws Exception {
		SwapIMSIResponse response = new SwapIMSIResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		NodeList nList = doc.getElementsByTagName("SWAPIMSIRESP");
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
				if (eElement.getElementsByTagName("OLDIMSI").item(0) != null)
				    response.setOldImsi(eElement.getElementsByTagName("OLDIMSI").item(0).getTextContent());
				if (eElement.getElementsByTagName("PRIIMSI").item(0) != null)
				    response.setPriImsi(eElement.getElementsByTagName("PRIIMSI").item(0).getTextContent());
				if (eElement.getElementsByTagName("SECIMSI").item(0) != null)
				    response.setSecImsi(eElement.getElementsByTagName("SECIMSI").item(0).getTextContent());
				if (eElement.getElementsByTagName("MULTIIMSI").item(0) != null)
				    response.setMultiImsi(eElement.getElementsByTagName("MULTIIMSI").item(0).getTextContent());
				
			}
		}
		
		return response;
	}
}

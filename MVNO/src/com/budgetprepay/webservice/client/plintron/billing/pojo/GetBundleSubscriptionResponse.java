package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GetBundleSubscriptionResponse {
	
	private String returnCode;
	private String errorDescription;
	private String dialogId;
	private String sessionId;
	private String bundleAmount;
	private String BPA;
	
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

	public String getBundleAmount() {
		return bundleAmount;
	}

	public void setBundleAmount(String bundleAmmount) {
		this.bundleAmount = bundleAmmount;
	}

	public String getBPA() {
		return BPA;
	}

	public void setBPA(String bPA) {
		BPA = bPA;
	}

	public static GetBundleSubscriptionResponse parse(final String xml) throws Exception {
		GetBundleSubscriptionResponse response = new GetBundleSubscriptionResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		NodeList nList = doc.getElementsByTagName("QUERYBUNDLESUBSCRIPTIONRESP");
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
				if (eElement.getElementsByTagName("BAMOUNT").item(0) != null)
				    response.setBundleAmount(eElement.getElementsByTagName("BAMOUNT").item(0).getTextContent());
				if (eElement.getElementsByTagName("BPA").item(0) != null)
				    response.setBPA(eElement.getElementsByTagName("BPA").item(0).getTextContent());			
			}
		}
		
		return response;
	}
}

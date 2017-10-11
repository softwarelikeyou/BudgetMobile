package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ModifyingSubscriberLanguageTypeResponse {
	private String returnCode;
	private String errorDescription;
	private String dialogId;
	private String sessionId;
	private String oldLang;
	private String lang;
	
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

	public String getOldLang() {
		return oldLang;
	}

	public void setOldLang(String oldLang) {
		this.oldLang = oldLang;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public static ModifyingSubscriberLanguageTypeResponse parse(final String xml) throws Exception {
		ModifyingSubscriberLanguageTypeResponse response = new ModifyingSubscriberLanguageTypeResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		NodeList nList = doc.getElementsByTagName("CHANGELANGUAGETYPERESPONSE");
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
				if (eElement.getElementsByTagName("OLDLANGUAGEID").item(0) != null)
				    response.setOldLang(eElement.getElementsByTagName("OLDLANGUAGEID").item(0).getTextContent());
				if (eElement.getElementsByTagName("LANGUAGE").item(0) != null)
				    response.setLang(eElement.getElementsByTagName("LANGUAGE").item(0).getTextContent());
				
			}
		}
		
		return response;
	}
}

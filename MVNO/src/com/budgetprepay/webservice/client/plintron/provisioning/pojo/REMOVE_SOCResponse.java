package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class REMOVE_SOCResponse {

	private String transactionId;
	private String errorCode;
	private String errorDesc;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public static REMOVE_SOCResponse parse(final String xml) throws Exception {
		REMOVE_SOCResponse response = new REMOVE_SOCResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));

		NodeList nList = doc.getElementsByTagName("HEADER");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("TRANSACTION_ID").item(0) != null)
					response.setTransactionId(eElement.getElementsByTagName("TRANSACTION_ID").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_CODE").item(0) != null)
					response.setErrorCode(eElement.getElementsByTagName("ERROR_CODE").item(0).getTextContent());
				if (eElement.getElementsByTagName("ERROR_DESC").item(0) != null)
					response.setErrorDesc(eElement.getElementsByTagName("ERROR_DESC").item(0).getTextContent());
			}
		}
		
		return response;
	}
}

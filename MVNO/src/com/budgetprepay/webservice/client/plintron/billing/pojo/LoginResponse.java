package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class LoginResponse {

	private String RETURNCODE;
	private String ERRDESCRITION;
	private String DIALOGID;
	private String SESSIONID;
	
	public String getRETURNCODE() {
		return RETURNCODE;
	}
	public void setRETURNCODE(String rETURNCODE) {
		RETURNCODE = rETURNCODE;
	}
	public String getERRDESCRITION() {
		return ERRDESCRITION;
	}
	public void setERRDESCRITION(String eRRDESCRITION) {
		ERRDESCRITION = eRRDESCRITION;
	}
	public String getDIALOGID() {
		return DIALOGID;
	}
	public void setDIALOGID(String dIALOGID) {
		DIALOGID = dIALOGID;
	}
	public String getSESSIONID() {
		return SESSIONID;
	}
	public void setSESSIONID(String sESSIONID) {
		SESSIONID = sESSIONID;
	}
	
	public static LoginResponse parse(final String response) throws Exception {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        dbf.setNamespaceAware(true);
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        Document d = db.parse( new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));
	        Node getNumberResponseElt = d.getElementsByTagNameNS("", "AUTHRESPONSE").item(0);
	        JAXBContext jc = JAXBContext.newInstance(LoginResponse.class);
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        JAXBElement<LoginResponse> je = unmarshaller.unmarshal(new DOMSource(getNumberResponseElt), LoginResponse.class);
	        return (LoginResponse) je.getValue();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
}

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

public class LogoutResponse {

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
	
	public static LogoutResponse parse(final String response) throws Exception {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        dbf.setNamespaceAware(true);
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        Document d = db.parse( new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));
	        Node getNumberResponseElt = d.getElementsByTagNameNS("", "CLIENTTERMINATIONRESPONSE").item(0);
	        JAXBContext jc = JAXBContext.newInstance(LogoutResponse.class);
	        Unmarshaller unmarshaller = jc.createUnmarshaller();
	        JAXBElement<LogoutResponse> je = unmarshaller.unmarshal(new DOMSource(getNumberResponseElt), LogoutResponse.class);
	        return (LogoutResponse) je.getValue();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
}

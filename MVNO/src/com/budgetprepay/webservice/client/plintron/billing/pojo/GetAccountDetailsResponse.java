package com.budgetprepay.webservice.client.plintron.billing.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GetAccountDetailsResponse {
	
	private String returnCode;
	private String errorDescription;
	private String dialogId;
	private String sessionId;
	private String mdn;
	private String networkId;
	private String MHAPIN;
	private String ACCOUNTSTATUS;
	private String VALIDITYDATE;
	private String CURRENTBALANCE;
	private String LANGUAGE;
	private String VMS_PIN;
	private String TRANS_PIN;
	private String PLANID;
	private String SUBSTATUS;
	private String SIMSTATUS;
	private String LIFECYCLESTATE;
	private String SUBSTYPE;
	private String MAINBALANCE;
	private String CBS;
	private String PROMOBALANCE;
	private String PROMOVALIDITYDATE;
	private String TOPUPIND;
	private String MNPIND;
	
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

	public String getMHAPIN() {
		return MHAPIN;
	}

	public void setMHAPIN(String mHAPIN) {
		MHAPIN = mHAPIN;
	}

	public String getACCOUNTSTATUS() {
		return ACCOUNTSTATUS;
	}

	public void setACCOUNTSTATUS(String aCCOUNTSTATUS) {
		ACCOUNTSTATUS = aCCOUNTSTATUS;
	}

	public String getVALIDITYDATE() {
		return VALIDITYDATE;
	}

	public void setVALIDITYDATE(String vALIDITYDATE) {
		VALIDITYDATE = vALIDITYDATE;
	}

	public String getCURRENTBALANCE() {
		return CURRENTBALANCE;
	}

	public void setCURRENTBALANCE(String cURRENTBALANCE) {
		CURRENTBALANCE = cURRENTBALANCE;
	}

	public String getLANGUAGE() {
		return LANGUAGE;
	}

	public void setLANGUAGE(String lANGUAGE) {
		LANGUAGE = lANGUAGE;
	}

	public String getVMS_PIN() {
		return VMS_PIN;
	}

	public void setVMS_PIN(String vMS_PIN) {
		VMS_PIN = vMS_PIN;
	}

	public String getTRANS_PIN() {
		return TRANS_PIN;
	}

	public void setTRANS_PIN(String tRANS_PIN) {
		TRANS_PIN = tRANS_PIN;
	}

	public String getPLANID() {
		return PLANID;
	}

	public void setPLANID(String pLANID) {
		PLANID = pLANID;
	}

	public String getSUBSTATUS() {
		return SUBSTATUS;
	}

	public void setSUBSTATUS(String sUBSTATUS) {
		SUBSTATUS = sUBSTATUS;
	}

	public String getSIMSTATUS() {
		return SIMSTATUS;
	}

	public void setSIMSTATUS(String sIMSTATUS) {
		SIMSTATUS = sIMSTATUS;
	}

	public String getLIFECYCLESTATE() {
		return LIFECYCLESTATE;
	}

	public void setLIFECYCLESTATE(String lIFECYCLESTATE) {
		LIFECYCLESTATE = lIFECYCLESTATE;
	}

	public String getSUBSTYPE() {
		return SUBSTYPE;
	}

	public void setSUBSTYPE(String sUBSTYPE) {
		SUBSTYPE = sUBSTYPE;
	}

	public String getMAINBALANCE() {
		return MAINBALANCE;
	}

	public void setMAINBALANCE(String mAINBALANCE) {
		MAINBALANCE = mAINBALANCE;
	}

	public String getCBS() {
		return CBS;
	}

	public void setCBS(String cBS) {
		CBS = cBS;
	}

	public String getPROMOBALANCE() {
		return PROMOBALANCE;
	}

	public void setPROMOBALANCE(String pROMOBALANCE) {
		PROMOBALANCE = pROMOBALANCE;
	}

	public String getPROMOVALIDITYDATE() {
		return PROMOVALIDITYDATE;
	}

	public void setPROMOVALIDITYDATE(String pROMOVALIDITYDATE) {
		PROMOVALIDITYDATE = pROMOVALIDITYDATE;
	}

	public String getTOPUPIND() {
		return TOPUPIND;
	}

	public void setTOPUPIND(String tOPUPIND) {
		TOPUPIND = tOPUPIND;
	}

	public String getMNPIND() {
		return MNPIND;
	}

	public void setMNPIND(String mNPIND) {
		MNPIND = mNPIND;
	}

	public static GetAccountDetailsResponse parse(final String xml) throws Exception {
		GetAccountDetailsResponse response = new GetAccountDetailsResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		Document doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
		
		NodeList nList = doc.getElementsByTagName("GETACCOUNTDETAILSRESPONSE");
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
				if (eElement.getElementsByTagName("MHAPIN").item(0) != null)
				    response.setMHAPIN(eElement.getElementsByTagName("MHAPIN").item(0).getTextContent());
				if (eElement.getElementsByTagName("ACCOUNTSTATUS").item(0) != null)
				    response.setACCOUNTSTATUS(eElement.getElementsByTagName("ACCOUNTSTATUS").item(0).getTextContent());
				if (eElement.getElementsByTagName("VALIDITYDATE").item(0) != null)
				    response.setVALIDITYDATE(eElement.getElementsByTagName("VALIDITYDATE").item(0).getTextContent());
				if (eElement.getElementsByTagName("CURRENTBALANCE").item(0) != null)
				    response.setCURRENTBALANCE(eElement.getElementsByTagName("CURRENTBALANCE").item(0).getTextContent());
				if (eElement.getElementsByTagName("LANGUAGE").item(0) != null)
				    response.setLANGUAGE(eElement.getElementsByTagName("LANGUAGE").item(0).getTextContent());
				if (eElement.getElementsByTagName("VMS_PIN").item(0) != null)
				    response.setVMS_PIN(eElement.getElementsByTagName("VMS_PIN").item(0).getTextContent());		
				if (eElement.getElementsByTagName("TRANS_PIN").item(0) != null)
				    response.setTRANS_PIN(eElement.getElementsByTagName("TRANS_PIN").item(0).getTextContent());
				if (eElement.getElementsByTagName("PLANID").item(0) != null)
				    response.setPLANID(eElement.getElementsByTagName("PLANID").item(0).getTextContent());
				if (eElement.getElementsByTagName("SUBSTATUS").item(0) != null)
				    response.setSUBSTATUS(eElement.getElementsByTagName("SUBSTATUS").item(0).getTextContent());
				if (eElement.getElementsByTagName("SIMSTATUS").item(0) != null)
				    response.setSIMSTATUS(eElement.getElementsByTagName("SIMSTATUS").item(0).getTextContent());
				if (eElement.getElementsByTagName("LIFECYCLESTATE").item(0) != null)
				    response.setLIFECYCLESTATE(eElement.getElementsByTagName("LIFECYCLESTATE").item(0).getTextContent());
				if (eElement.getElementsByTagName("SUBSTYPE").item(0) != null)
				    response.setSUBSTYPE(eElement.getElementsByTagName("SUBSTYPE").item(0).getTextContent());
				if (eElement.getElementsByTagName("MAINBALANCE").item(0) != null)
				    response.setMAINBALANCE(eElement.getElementsByTagName("MAINBALANCE").item(0).getTextContent());
				if (eElement.getElementsByTagName("CBS").item(0) != null)
				    response.setCBS(eElement.getElementsByTagName("CBS").item(0).getTextContent());
				if (eElement.getElementsByTagName("PROMOBALANCE").item(0) != null)
				    response.setPROMOBALANCE(eElement.getElementsByTagName("PROMOBALANCE").item(0).getTextContent());
				if (eElement.getElementsByTagName("PROMOVALIDITYDATE").item(0) != null)
				    response.setPROMOVALIDITYDATE(eElement.getElementsByTagName("PROMOVALIDITYDATE").item(0).getTextContent());
				if (eElement.getElementsByTagName("TOPUPIND").item(0) != null)
				    response.setTOPUPIND(eElement.getElementsByTagName("TOPUPIND").item(0).getTextContent());
				if (eElement.getElementsByTagName("MNPIND").item(0) != null)
				    response.setMNPIND(eElement.getElementsByTagName("MNPIND").item(0).getTextContent());
				if (eElement.getElementsByTagName("MSISDN").item(0) != null)
				    response.setMdn(eElement.getElementsByTagName("MSISDN").item(0).getTextContent());
			}
		}
		
		nList = doc.getElementsByTagName("COMMONRES");
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
			}
		}
		
		return response;
	}
}

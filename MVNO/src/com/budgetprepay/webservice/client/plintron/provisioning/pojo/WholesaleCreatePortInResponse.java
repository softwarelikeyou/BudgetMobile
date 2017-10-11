package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WholesaleCreatePortInResponse {

	private String transactionId;
	
	private String errorCode;
	
	private String errorDesc;
	
	private String result;
	
	private String resultCode;
	
	private String description;
		
	private String status;

	private String mdn;
	
	private String sim;
	
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public static WholesaleCreatePortInResponse parse(final String xml) throws Exception {
		WholesaleCreatePortInResponse response = new WholesaleCreatePortInResponse();
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

		nList = doc.getElementsByTagName("WholesaleSubscriber");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("msisdn").item(0) != null)
				    response.setMdn(eElement.getElementsByTagName("msisdn").item(0).getTextContent());
				if (eElement.getElementsByTagName("sim").item(0) != null) {
				    response.setSim(eElement.getElementsByTagName("sim").item(0).getTextContent());
				}
			}
		}
		
		nList = doc.getElementsByTagName("Results");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("result").item(0) != null)
				    response.setResult(eElement.getElementsByTagName("result").item(0).getTextContent());
				if (eElement.getElementsByTagName("description").item(0) != null) {
				    response.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
				    if (response.getDescription().startsWith("Parse Exception")) {
				    	response.setErrorDesc("Invalid value, please check and resubmit.");
				    	response.setErrorCode("-1");
				    }
				}
				if (eElement.getElementsByTagName("messageCode").item(0) != null) 
				    response.setResultCode(eElement.getElementsByTagName("messageCode").item(0).getTextContent());
				if (eElement.getElementsByTagName("status").item(0) != null)
			        response.setStatus(eElement.getElementsByTagName("status").item(0).getTextContent());
			}
		}
		
		return response;
	}
	
	/*
000001657<RESPONSE>
 <HEADER>
  <TRANSACTION_ID>MNP_12210988896523422343</TRANSACTION_ID>
  <REQUEST_TYPE>INITIATE_THIRD_PARTY_API</REQUEST_TYPE>
  <ERROR_CODE>0</ERROR_CODE>
  <ERROR_DESC>Success</ERROR_DESC>
 </HEADER>
 <BODY>
  <SYSTEM>2</SYSTEM>
  <TP_ICC_ID>8901260842140696064</TP_ICC_ID>
  <TMO_RESP>
   <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Body>
        <WholesaleCreatePortInResponse>
            <WholesaleCreatePortInOutput>
                <WholesaleOutput>
                    <WholesaleSubscriber xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
                        <msisdn>3185075190</msisdn>
                        <sim>8901260842140696064</sim>
                    </WholesaleSubscriber>
                    <Results>
                        <result>FAILURE</result>
                        <description>MSISDN not eligible for PortIn</description>
                        <messageCode>GEN-0043</messageCode>
                    </Results>
                </WholesaleOutput>
            </WholesaleCreatePortInOutput>
            <CrossReference xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
                <clientId>82</clientId>
                <transactionId>ITP_01_MNP_12210988896523422343</transactionId>
                <callbackLocation>https://192.30.216.109:3336/PlintronProvGateway/responseValidator.htm</callbackLocation>
            </CrossReference>
            <ServiceTarget>
                <serviceName>CreatePortInRequest</serviceName>
            </ServiceTarget>
        </WholesaleCreatePortInResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope></TMO_RESP></BODY></RESPONSE> 
	 */
}

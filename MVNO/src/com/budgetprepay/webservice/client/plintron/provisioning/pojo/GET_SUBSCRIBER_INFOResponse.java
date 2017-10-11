package com.budgetprepay.webservice.client.plintron.provisioning.pojo;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GET_SUBSCRIBER_INFOResponse {

	private String msisdn;
	private String sim;
	private String imei;
	private String result;
	private String description;
	private String imsi;
	private String transactionId;
	private String errorCode;
	private String errorDesc;
	private String serviceStartDate;
	private List<SocType> socs = new ArrayList<SocType>();
	private List<ApnType> apns = new ArrayList<ApnType>();
	private List<PackageType> packages = new ArrayList<PackageType>();
	private List<PlanType> plans = new ArrayList<PlanType>();
	private String sIMStatus;
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

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

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

	public String getServiceStartDate() {
		return serviceStartDate;
	}

	public void setServiceStartDate(String serviceStartDate) {
		this.serviceStartDate = serviceStartDate;
	}

	public List<SocType> getSocs() {
		return socs;
	}

	public void setSocs(List<SocType> socs) {
		this.socs = socs;
	}

	public List<ApnType> getApns() {
		return apns;
	}

	public void setApns(List<ApnType> apns) {
		this.apns = apns;
	}

	public List<PackageType> getPackages() {
		return packages;
	}

	public void setPackages(List<PackageType> packages) {
		this.packages = packages;
	}

	public List<PlanType> getPlans() {
		return plans;
	}

	public void setPlans(List<PlanType> plans) {
		this.plans = plans;
	}

	public String getsIMStatus() {
		return sIMStatus;
	}

	public void setsIMStatus(String sIMStatus) {
		this.sIMStatus = sIMStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static GET_SUBSCRIBER_INFOResponse parse(final String xml) throws Exception {
		GET_SUBSCRIBER_INFOResponse response = new GET_SUBSCRIBER_INFOResponse();
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
		
		nList = doc.getElementsByTagName("Results");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("result").item(0) != null)
					response.setResult(eElement.getElementsByTagName("result").item(0).getTextContent());
				if (eElement.getElementsByTagName("description").item(0) != null)
					response.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
				if (eElement.getElementsByTagName("status").item(0) != null)
					response.setStatus(eElement.getElementsByTagName("status").item(0).getTextContent());
			}
		}
		
		nList = doc.getElementsByTagName("WholesaleHLRResponse");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("imsi").item(0) != null)
					response.setImsi(eElement.getElementsByTagName("imsi").item(0).getTextContent());
				if (eElement.getElementsByTagName("SIMStatus").item(0) != null)
					response.setsIMStatus(eElement.getElementsByTagName("SIMStatus").item(0).getTextContent());
				if (eElement.getElementsByTagName("serviceStartDate").item(0) != null)
					response.setServiceStartDate(eElement.getElementsByTagName("serviceStartDate").item(0).getTextContent());
			}
		}
		
		nList = doc.getElementsByTagName("WholesaleSubscriberResponse");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("imsi").item(0) != null)
					response.setImsi(eElement.getElementsByTagName("imsi").item(0).getTextContent());
				if (eElement.getElementsByTagName("SIMStatus").item(0) != null)
					response.setsIMStatus(eElement.getElementsByTagName("SIMStatus").item(0).getTextContent());
				if (eElement.getElementsByTagName("serviceStartDate").item(0) != null)
					response.setServiceStartDate(eElement.getElementsByTagName("serviceStartDate").item(0).getTextContent());
			}
		}
		
		nList = doc.getElementsByTagName("WholesaleSubscriber");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("msisdn").item(0) != null)
				    response.setMsisdn(eElement.getElementsByTagName("msisdn").item(0).getTextContent());
				if (eElement.getElementsByTagName("sim").item(0) != null)
					response.setSim(eElement.getElementsByTagName("sim").item(0).getTextContent());
				if (eElement.getElementsByTagName("imei").item(0) != null)
					response.setImei(eElement.getElementsByTagName("imei").item(0).getTextContent());
			}
		}
		
		nList = doc.getElementsByTagName("package");
		PackageType pkg = null;
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("name").item(0) != null) {
					pkg = new PackageType();
					pkg.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
				}
				if (eElement.getElementsByTagName("effectiveDate").item(0) != null) {
					pkg.setEffectiveDate(eElement.getElementsByTagName("effectiveDate").item(0).getTextContent());
				}
			}
		}
		if (pkg != null)
			response.packages.add(pkg);
		
		nList = doc.getElementsByTagName("plan");
		PlanType plan = null;
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("plan").item(0) != null) {
					plan = new PlanType();
					plan.setName(eElement.getElementsByTagName("plan").item(0).getTextContent());
				}
				if (eElement.getElementsByTagName("effectiveDate").item(0) != null) {
					plan.setEffectiveDate(eElement.getElementsByTagName("effectiveDate").item(0).getTextContent());
				}
			}
		}
		if (plan != null)
			response.plans.add(plan);
		
		nList = doc.getElementsByTagName("socs");
		SocType soc = null;
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("soc").item(0) != null) {
					soc = new SocType();
					soc.setName(eElement.getElementsByTagName("soc").item(0).getTextContent());
				}
				if (eElement.getElementsByTagName("effectiveDate").item(0) != null) {
					soc.setEffectiveDate(eElement.getElementsByTagName("effectiveDate").item(0).getTextContent());
					response.socs.add(soc);
				}
			}
		}
		
		nList = doc.getElementsByTagName("apn");
		ApnType apn = null;
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				if (eElement.getElementsByTagName("name").item(0) != null) {
					apn = new ApnType();
					apn.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
				}
				if (eElement.getElementsByTagName("value").item(0) != null)
					apn.setValue(eElement.getElementsByTagName("value").item(0).getTextContent());
			}
		}
		if (apn != null)
			response.apns.add(apn);
		
		return response;
	}
}

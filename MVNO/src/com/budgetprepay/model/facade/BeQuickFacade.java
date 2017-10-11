package com.budgetprepay.model.facade;

import java.net.URLEncoder;

import org.apache.log4j.Logger;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.ReturnMessage;
import com.budgetprepay.webservice.client.bequick.pojo.ActivateRequest;
import com.budgetprepay.webservice.client.bequick.pojo.ActivateRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.ActivateResponse;
import com.budgetprepay.webservice.client.bequick.pojo.BillingAddressType;
import com.budgetprepay.webservice.client.bequick.pojo.BillingType;
import com.budgetprepay.webservice.client.bequick.pojo.DisconnectRequest;
import com.budgetprepay.webservice.client.bequick.pojo.DisconnectRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.DisconnectResponse;
import com.budgetprepay.webservice.client.bequick.pojo.GetCoverageRequest;
import com.budgetprepay.webservice.client.bequick.pojo.GetCoverageRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.GetCoverageResponse;
import com.budgetprepay.webservice.client.bequick.pojo.GetServiceInformationRequest;
import com.budgetprepay.webservice.client.bequick.pojo.GetServiceInformationRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.GetServiceInformationResponse;
import com.budgetprepay.webservice.client.bequick.pojo.OldProviderType;
import com.budgetprepay.webservice.client.bequick.pojo.PhysicalAddressType;
import com.budgetprepay.webservice.client.bequick.pojo.PortInRequest;
import com.budgetprepay.webservice.client.bequick.pojo.PortInRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.PortInResponse;
import com.budgetprepay.webservice.client.bequick.pojo.PortInfoType;
import com.budgetprepay.webservice.client.bequick.pojo.PurchaseRequest;
import com.budgetprepay.webservice.client.bequick.pojo.PurchaseRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.PurchaseResponse;
import com.budgetprepay.webservice.client.bequick.pojo.RestoreRequest;
import com.budgetprepay.webservice.client.bequick.pojo.RestoreRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.RestoreResponse;
import com.budgetprepay.webservice.client.bequick.pojo.SessionType;
import com.budgetprepay.webservice.client.bequick.pojo.ShippingAddressType;
import com.budgetprepay.webservice.client.bequick.pojo.SuspendRequest;
import com.budgetprepay.webservice.client.bequick.pojo.SuspendRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.SuspendResponse;
import com.budgetprepay.webservice.client.bequick.pojo.SwapESNRequest;
import com.budgetprepay.webservice.client.bequick.pojo.SwapESNRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.SwapMDNRequest;
import com.budgetprepay.webservice.client.bequick.pojo.SwapMDNRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.SwapMDNResponse;
import com.budgetprepay.webservice.client.bequick.pojo.WirelessInitialActivationRequest;
import com.budgetprepay.webservice.client.bequick.pojo.WirelessInitialActivationRequestType;
import com.budgetprepay.webservice.client.bequick.pojo.WirelessInitialActivationResponse;
import com.budgetprepay.webservice.pojos.bequick.ObjectFactory;
import com.budgetprepay.webservice.pojos.bequick.TrueFalseType;
import com.budgetprepay.webservice.util.CommonUtil;
import com.budgetprepay.webservice.util.TopupUtil;

public class BeQuickFacade {

	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(BeQuickFacade.class);
	
	private static String username;
	@SuppressWarnings("unused")
	private static String agent;
	private static String token;
	private static String clec;
	private static String endpoint;
	private static String clecParameter;
	private static String requestParameter = "&request=";
			
	static {			
	    username = ResourceUtil.get("bequick.username");
	    agent = ResourceUtil.get("bequick.agent");
	    token = ResourceUtil.get("bequick.token");
	    clec = ResourceUtil.get("bequick.clec");
	    endpoint = ResourceUtil.get("bequick.endpoint");
	    clecParameter = "clecID=" + clec;
	}

	public static com.budgetprepay.webservice.pojos.bequick.GetCoverageResponse getCoverageInfomration(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.GetCoverageRequest req = (com.budgetprepay.webservice.pojos.bequick.GetCoverageRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		GetCoverageRequest getCoverageRequest = new GetCoverageRequest();
		
		GetCoverageRequestType getCoverageRequestType = new GetCoverageRequestType();
		
		if (req.getCarrier() == null)
			throw new Exception("Invalid carrier");
		
		getCoverageRequestType.setCarrier(req.getCarrier());
		
		if (req.getZip() == null)
			throw new Exception("Invalid zip");
		
		getCoverageRequestType.setZip(req.getZip());
				
		getCoverageRequest.setRequest(getCoverageRequestType);
		getCoverageRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(getCoverageRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("GetCoverageRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		GetCoverageResponse response = (GetCoverageResponse) CommonUtil.XML2JAXB(GetCoverageResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.GetCoverageResponse results = objectFactory.createGetCoverageResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());

		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());
		
		if (response.getResponse().getCoverageQualityCdma() != null)
		    results.setCoverageQualityCdma(response.getResponse().getCoverageQualityCdma());
		if (response.getResponse().getCoverageQualityIden() != null)
			results.setCoverageQualityIden(response.getResponse().getCoverageQualityIden());
		if (response.getResponse().getCsa() != null)
			results.setCsa(response.getResponse().getCsa());
		if (response.getResponse().getCsa() != null)
			results.setIs3G(TrueFalseType.FALSE);
		if (response.getResponse().getNpa() != null && response.getResponse().getNxx() != null)
			results.setNpaNxx(response.getResponse().getNpa() + response.getResponse().getNxx());

		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.GetServiceInformationResponse getServiceInformation(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.GetServiceInformationRequest req = (com.budgetprepay.webservice.pojos.bequick.GetServiceInformationRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		GetServiceInformationRequest getServiceInformationRequest = new GetServiceInformationRequest();
		
		GetServiceInformationRequestType getServiceInformationRequestType = new GetServiceInformationRequestType();
		
		if (req.getMdn() == null && req.getEsn() == null)
			throw new Exception("Must specify a MDN or ESN");
		
		if (req.getMdn() != null)
		    getServiceInformationRequestType.setMdn(req.getMdn());
		
		if (req.getEsn() != null)
			getServiceInformationRequestType.setEsn(req.getEsn());

				
		getServiceInformationRequest.setRequest(getServiceInformationRequestType);
		getServiceInformationRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(getServiceInformationRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("GetServiceInformationRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		GetServiceInformationResponse response = (GetServiceInformationResponse) CommonUtil.XML2JAXB(GetServiceInformationResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.GetServiceInformationResponse results = objectFactory.createGetServiceInformationResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus() != null) {
		//if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());
		
		if (response.getResponse().getActivationDate() != null)
			results.setActivationDate(response.getResponse().getActivationDate());
		if (response.getResponse().getActiveData() != null)
			results.setActiveData(response.getResponse().getActiveData());
		if (response.getResponse().getActiveMinutes() != null)
			results.setActiveMinutes(response.getResponse().getActiveMinutes());
		if (response.getResponse().getActiveTexts() != null)
			results.setActiveTexts(response.getResponse().getActiveTexts());
		if (response.getResponse().getCustomerAccount() != null)
			results.setCustomerAccount(response.getResponse().getCustomerAccount());
		if (response.getResponse().getEsn() != null)
			results.setEsn(response.getResponse().getEsn());
		if (response.getResponse().getExpirationDate() != null)
			results.setExpirationDate(response.getResponse().getExpirationDate());
		if (response.getResponse().getMdn() != null)
			results.setMdn(response.getResponse().getMdn());
		if (response.getResponse().getMsid() != null)
			results.setMsid(response.getResponse().getMsid());
		if (response.getResponse().getMsl() != null)
			results.setMsl(response.getResponse().getMsl());
		if (response.getResponse().getPendingData() != null)
			results.setPendingData(response.getResponse().getPendingData());
		if (response.getResponse().getPendingMinutes() != null)
			results.setPendingMinutes(response.getResponse().getPendingMinutes());
		if (response.getResponse().getPendingTexts() != null)
			results.setPendingTexts(response.getResponse().getPendingTexts());
		if (response.getResponse().getPlanId() != null) 
			results.setPlanId(response.getResponse().getPlanId());
		if (response.getResponse().getPlanName() != null)
			results.setPlanName(response.getResponse().getPlanName());
		if (response.getResponse().getTotalData() != null)
			results.setTotalData(response.getResponse().getTotalData());
		if (response.getResponse().getTotalMinutes() != null)
			results.setTotalMinutes(response.getResponse().getTotalMinutes());
		if (response.getResponse().getTotalTexts() != null)
			results.setTotalTexts(response.getResponse().getTotalTexts());
		if (response.getResponse().getServiceStatus() != null)
			results.setStatus(response.getResponse().getServiceStatus());
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.ActivateResponse activate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.ActivateRequest req = (com.budgetprepay.webservice.pojos.bequick.ActivateRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ActivateRequest activateRequest = new ActivateRequest();
		
		ActivateRequestType activateRequestType = new ActivateRequestType();
		
		if (req.getEsn() != null)
		    activateRequestType.setEsn(req.getEsn());
		
		if (req.getPlanId() == null)
			throw new Exception("Invalid Plan Id");
		activateRequestType.setPlanId(req.getPlanId());
		
		if (req.getPhysicalAddress() != null) {
			activateRequestType.setPhysicalAddress(new PhysicalAddressType());
			if (req.getPhysicalAddress().getFirstName() != null)
				activateRequestType.getPhysicalAddress().setFirstName(req.getPhysicalAddress().getFirstName());
			if (req.getPhysicalAddress().getLastName() != null)
				activateRequestType.getPhysicalAddress().setLastName(req.getPhysicalAddress().getLastName());
			if (req.getPhysicalAddress().getAddress1() != null)
				activateRequestType.getPhysicalAddress().setAddress1(req.getPhysicalAddress().getAddress1());
			if (req.getPhysicalAddress().getAddress2() != null)
				activateRequestType.getPhysicalAddress().setAddress2(req.getPhysicalAddress().getAddress2());
			if (req.getPhysicalAddress().getCity() != null)
				activateRequestType.getPhysicalAddress().setCity(req.getPhysicalAddress().getCity());
			if (req.getPhysicalAddress().getState() != null)
				activateRequestType.getPhysicalAddress().setState(req.getPhysicalAddress().getState());
			if (req.getPhysicalAddress().getZip() != null)
				activateRequestType.getPhysicalAddress().setZip(req.getPhysicalAddress().getZip());
		}
		
		if (req.getShippingAddress() != null) {
			activateRequestType.setShippingAddress(new ShippingAddressType());
			if (req.getShippingAddress().getFirstName() != null)
				activateRequestType.getShippingAddress().setFirstName(req.getShippingAddress().getFirstName());
			if (req.getShippingAddress().getLastName() != null)
				activateRequestType.getShippingAddress().setLastName(req.getShippingAddress().getLastName());
			if (req.getShippingAddress().getAddress1() != null)
				activateRequestType.getShippingAddress().setAddress1(req.getShippingAddress().getAddress1());
			if (req.getShippingAddress().getAddress2() != null)
				activateRequestType.getShippingAddress().setAddress2(req.getShippingAddress().getAddress2());
			if (req.getShippingAddress().getCity() != null)
				activateRequestType.getShippingAddress().setCity(req.getShippingAddress().getCity());
			if (req.getShippingAddress().getState() != null)
				activateRequestType.getShippingAddress().setState(req.getShippingAddress().getState());
			if (req.getShippingAddress().getZip() != null)
				activateRequestType.getShippingAddress().setZip(req.getShippingAddress().getZip());
		}		
		
		activateRequest.setRequest(activateRequestType);
		activateRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(activateRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("ActivateRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		ActivateResponse response = (ActivateResponse) CommonUtil.XML2JAXB(ActivateResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.ActivateResponse results = objectFactory.createActivateResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());
		
		if (response.getResponse().getMdn() != null)
			results.setMdn(response.getResponse().getMdn());
		if (response.getResponse().getMsid() != null)
			results.setMsid(response.getResponse().getMsid());
		if (response.getResponse().getEsn() != null)
			results.setEsn(response.getResponse().getEsn());
		if (response.getResponse().getMsl() != null)
			results.setMsl(response.getResponse().getMsl());
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.SwapMDNResponse swapMDN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.SwapMDNRequest req = (com.budgetprepay.webservice.pojos.bequick.SwapMDNRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		SwapMDNRequest swapMDNRequest = new SwapMDNRequest();
		
		SwapMDNRequestType swapMDNRequestType = new SwapMDNRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			swapMDNRequestType.setMdn(req.getMdn());	
		
		swapMDNRequest.setRequest(swapMDNRequestType);
		swapMDNRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(swapMDNRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("SwapMDNRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		SwapMDNResponse response = (SwapMDNResponse) CommonUtil.XML2JAXB(SwapMDNResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.SwapMDNResponse results = objectFactory.createSwapMDNResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.SwapESNResponse swapESN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.SwapESNRequest req = (com.budgetprepay.webservice.pojos.bequick.SwapESNRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		SwapESNRequest swapESNRequest = new SwapESNRequest();
		
		SwapESNRequestType swapESNRequestType = new SwapESNRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			swapESNRequestType.setMdn(req.getMdn());	
		
		swapESNRequest.setRequest(swapESNRequestType);
		swapESNRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(swapESNRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("SwapESNRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		SwapMDNResponse response = (SwapMDNResponse) CommonUtil.XML2JAXB(SwapMDNResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.SwapESNResponse results = objectFactory.createSwapESNResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.SuspendResponse suspend(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.SuspendRequest req = (com.budgetprepay.webservice.pojos.bequick.SuspendRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		SuspendRequest suspendRequest = new SuspendRequest();
		
		SuspendRequestType suspendRequestType = new SuspendRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			suspendRequestType.setMdn(req.getMdn());	
		
		suspendRequest.setRequest(suspendRequestType);
		suspendRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(suspendRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("SuspendRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		SuspendResponse response = (SuspendResponse) CommonUtil.XML2JAXB(SuspendResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.SuspendResponse results = objectFactory.createSuspendResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.RestoreResponse restore(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.RestoreRequest req = (com.budgetprepay.webservice.pojos.bequick.RestoreRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		RestoreRequest restoreRequest = new RestoreRequest();
		
		RestoreRequestType restoreRequestType = new RestoreRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			restoreRequestType.setMdn(req.getMdn());	
		
		restoreRequest.setRequest(restoreRequestType);
		restoreRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(restoreRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("RestoreRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		RestoreResponse response = (RestoreResponse) CommonUtil.XML2JAXB(RestoreResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.RestoreResponse results = objectFactory.createRestoreResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.DisconnectResponse disconnect(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.DisconnectRequest req = (com.budgetprepay.webservice.pojos.bequick.DisconnectRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		DisconnectRequest disconnectRequest = new DisconnectRequest();
		
		DisconnectRequestType disconnectRequestType = new DisconnectRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			disconnectRequestType.setMdn(req.getMdn());	
		
		disconnectRequest.setRequest(disconnectRequestType);
		disconnectRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(disconnectRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("DisconnectRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		DisconnectResponse response = (DisconnectResponse) CommonUtil.XML2JAXB(DisconnectResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.DisconnectResponse results = objectFactory.createDisconnectResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.PurchaseResponse purchase(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		com.budgetprepay.webservice.pojos.bequick.PurchaseRequest req = (com.budgetprepay.webservice.pojos.bequick.PurchaseRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PurchaseRequest purchaseRequest = new PurchaseRequest();
		
		PurchaseRequestType purchaseRequestType = new PurchaseRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
			purchaseRequestType.setMdn(req.getMdn());	
		
		purchaseRequest.setRequest(purchaseRequestType);
		purchaseRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(purchaseRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("PurchaseRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		PurchaseResponse response = (PurchaseResponse) CommonUtil.XML2JAXB(PurchaseResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.PurchaseResponse results = objectFactory.createPurchaseResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;		
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.PortInResponse portIn(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		com.budgetprepay.webservice.pojos.bequick.PortInRequest req = (com.budgetprepay.webservice.pojos.bequick.PortInRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInRequest portInRequest = new PortInRequest();
		
		PortInRequestType portInRequestType = new PortInRequestType();
		
		portInRequestType.setActivityType("CONVERSION");
		
		if (req.getEsn() == null)
			throw new Exception("Invalid ESN");
		portInRequestType.setEns(req.getEsn());
		
		if (req.getPlanId() == null)
			throw new Exception("Invalid Plan Id");
		portInRequestType.setPlanId(req.getPlanId());
		
		if (req.getPhysicalAddress() != null) {
			portInRequestType.setPhysicalAddress(new PhysicalAddressType());
			if (req.getPhysicalAddress().getAddress1() != null)
				portInRequestType.getPhysicalAddress().setAddress1(req.getPhysicalAddress().getAddress1());
			
			if (req.getPhysicalAddress().getAddress2() != null)
				portInRequestType.getPhysicalAddress().setAddress2(req.getPhysicalAddress().getAddress2());
			
			if (req.getPhysicalAddress().getCity() != null)
				portInRequestType.getPhysicalAddress().setCity(req.getPhysicalAddress().getCity());
			
			if (req.getPhysicalAddress().getFirstName() != null)
				portInRequestType.getPhysicalAddress().setFirstName(req.getPhysicalAddress().getFirstName());
			
			if (req.getPhysicalAddress().getLastName() != null)
				portInRequestType.getPhysicalAddress().setLastName(req.getPhysicalAddress().getLastName());
			
			if (req.getPhysicalAddress().getZip() == null)
				throw new Exception("Invalid Physical Address Zip");
			portInRequestType.getPhysicalAddress().setZip(req.getPhysicalAddress().getZip());
			
			if (req.getPhysicalAddress().getState() == null)
				throw new Exception("Invaid Physical Address State");
			portInRequestType.getPhysicalAddress().setState(req.getPhysicalAddress().getState());
		}
		
		if (req.getShippingAddress() != null) {
			portInRequestType.setShippingAddress(new ShippingAddressType());
			if (req.getShippingAddress().getAddress1() != null)
				portInRequestType.getShippingAddress().setAddress1(req.getShippingAddress().getAddress1());
			
			if (req.getShippingAddress().getAddress2() != null)
				portInRequestType.getShippingAddress().setAddress2(req.getShippingAddress().getAddress2());
			
			if (req.getShippingAddress().getCity() != null)
				portInRequestType.getShippingAddress().setCity(req.getShippingAddress().getCity());
			
			if (req.getShippingAddress().getFirstName() != null)
				portInRequestType.getShippingAddress().setFirstName(req.getShippingAddress().getFirstName());
			
			if (req.getShippingAddress().getLastName() != null)
				portInRequestType.getShippingAddress().setLastName(req.getShippingAddress().getLastName());
			
			if (req.getShippingAddress().getZip() == null)
				throw new Exception("Invalid Shipping Address Zip");
			portInRequestType.getShippingAddress().setZip(req.getShippingAddress().getZip());
			
			if (req.getShippingAddress().getState() == null)
				throw new Exception("Invaid Shipping Address State");
			portInRequestType.getShippingAddress().setState(req.getShippingAddress().getState());
		}
		
		if (req.getPortInfo() == null)
			throw new Exception("Invalid Port Info");
		if (req.getPortInfo().getAuthorizedBy() == null)
			throw new Exception("Invalid Port Info Authorized By");
		if (req.getPortInfo().getBilling() == null)
			throw new Exception("Invalid Port Info Billing");
		if (req.getPortInfo().getMdn() == null)
			throw new Exception("Invalid Port Info MDN");
		if (req.getPortInfo().getOldProvider() == null)
			throw new Exception("Invalid Port Info Old Provider");
		
		if (req.getPortInfo().getBilling().getAddress() == null)
			throw new Exception("Invalid Port Info Billing Address");
		if (req.getPortInfo().getBilling().getAddress().getCity() == null)
			throw new Exception("Invalid Port Info Billing Address City");
		if (req.getPortInfo().getBilling().getAddress().getLine2() == null)
			throw new Exception("Invalid Port Info Billing Address Line");
		if (req.getPortInfo().getBilling().getAddress().getState() == null)
			throw new Exception("Invalid Port Info Billing Address State");
		if (req.getPortInfo().getBilling().getAddress().getStreetDirection() == null)
			throw new Exception("Invalid Port Info Billing Address Street Direction");
		if (req.getPortInfo().getBilling().getAddress().getStreetNumber() == null)
			throw new Exception("Invalid Port Info Billing Address Street Number");
	    if (req.getPortInfo().getBilling().getAddress().getZip() == null)
	    	throw new Exception("Invalid Port Info Billing Address Zip");
	    
		if (req.getPortInfo().getBilling().getFirstName() == null)
			throw new Exception("Invalid Port Info Billing First Name");
		if (req.getPortInfo().getBilling().getLastName() == null)
			throw new Exception("Invalid Port Info Billing Last Name");
		
		if (req.getPortInfo().getOldProvider().getAccount() == null)
			throw new Exception("Invalid Port Info Old Provider Account");
		if (req.getPortInfo().getOldProvider().getEsn() == null)
			throw new Exception("Invalid Port Info Old Provider ESN");
		if (req.getPortInfo().getOldProvider().getPassword() == null)
			throw new Exception("Invalid Port Info Old Provider Password");
		
		portInRequestType.setPortInfo(new PortInfoType());
		portInRequestType.getPortInfo().setAuthorizedBy(req.getPortInfo().getAuthorizedBy());
		portInRequestType.getPortInfo().setMdn(req.getPortInfo().getMdn());
			
        portInRequestType.getPortInfo().setBilling(new BillingType());
        portInRequestType.getPortInfo().getBilling().setFirstName(req.getPortInfo().getBilling().getFirstName());
        portInRequestType.getPortInfo().getBilling().setLastName(req.getPortInfo().getBilling().getLastName());
		portInRequestType.getPortInfo().getBilling().setAddress(new BillingAddressType());
		portInRequestType.getPortInfo().getBilling().getAddress().setCity(req.getPortInfo().getBilling().getAddress().getCity());
		portInRequestType.getPortInfo().getBilling().getAddress().setLine2(req.getPortInfo().getBilling().getAddress().getLine2());
		portInRequestType.getPortInfo().getBilling().getAddress().setState(req.getPortInfo().getBilling().getAddress().getState());
		portInRequestType.getPortInfo().getBilling().getAddress().setStreetDirection(req.getPortInfo().getBilling().getAddress().getStreetDirection());
		portInRequestType.getPortInfo().getBilling().getAddress().setStreetName(req.getPortInfo().getBilling().getAddress().getStreetName());
		portInRequestType.getPortInfo().getBilling().getAddress().setStreetNumber(req.getPortInfo().getBilling().getAddress().getStreetNumber());
		portInRequestType.getPortInfo().getBilling().getAddress().setZip(req.getPortInfo().getBilling().getAddress().getZip());
		portInRequestType.getPortInfo().setOldProvider(new OldProviderType());
		portInRequestType.getPortInfo().getOldProvider().setAccount(req.getPortInfo().getOldProvider().getAccount());
		portInRequestType.getPortInfo().getOldProvider().setEsn(req.getPortInfo().getOldProvider().getEsn());
		portInRequestType.getPortInfo().getOldProvider().setPassword(req.getPortInfo().getOldProvider().getPassword());

		portInRequest.setRequest(portInRequestType);
		portInRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(portInRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("PortInRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		PortInResponse response = (PortInResponse) CommonUtil.XML2JAXB(PortInResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.PortInResponse results = objectFactory.createPortInResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;		
	}
	
	public static com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationResponse wirelessInitialActivation(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationRequest req = (com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		WirelessInitialActivationRequest wirelessInitialActivationRequest = new WirelessInitialActivationRequest();
		
		WirelessInitialActivationRequestType wirelessInitialActivationRequestType = new WirelessInitialActivationRequestType();
		
		if (req.getMdn() == null)
			throw new Exception("Invalid MDN");
		wirelessInitialActivationRequestType.setMdn(req.getMdn());	
		
		wirelessInitialActivationRequest.setRequest(wirelessInitialActivationRequestType);
		wirelessInitialActivationRequest.setSession( new SessionType(clec, username, token));
		
		String xml = CommonUtil.JAXB2XML(wirelessInitialActivationRequest, null);
		
		// TODO Fix this!!!!!
		xml = xml.replaceAll("WirelessInitialActivationRequest", "BeQuick");
		
		request.setVerizonSynchronousRequestXML(xml);
		
		String parameters = clecParameter + requestParameter + URLEncoder.encode(xml, "UTF-8");
				
		ReturnMessage returnMessage = CommonUtil.post(parameters, endpoint);
		
		WirelessInitialActivationResponse response = (WirelessInitialActivationResponse) CommonUtil.XML2JAXB(WirelessInitialActivationResponse.class, returnMessage.getText());
		
		request.setVerizonSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
		
		ObjectFactory objectFactory = new ObjectFactory();
		com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationResponse results = objectFactory.createWirelessInitialActivationResponse();
		results.setReturnMessage(objectFactory.createReturnMessageType());
		
		if (response.getResponse().getStatus().equals("failure")) {
			for (com.budgetprepay.webservice.client.bequick.pojo.Error error : response.getResponse().getErrors().getErrors()) {
				results.getReturnMessage().setReturnCode(error.getCode());
				results.getReturnMessage().setReturnText(error.getMessage());
			}
			return results;
		}
		
		results.getReturnMessage().setReturnCode(CommonUtil.SUCCESS_CODE);
		results.getReturnMessage().setReturnText(CommonUtil.SUCCESS_TEXT);
		
		results.setReferenceId(req.getReferenceId());

		// TODO
		
		return results;		
	}
	
	public static void cancelAutoRenewing(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
	}
	
	public static void changeStatus(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
	}
}

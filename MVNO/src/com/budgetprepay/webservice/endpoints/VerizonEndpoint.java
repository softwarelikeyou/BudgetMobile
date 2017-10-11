package com.budgetprepay.webservice.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.budgetprepay.model.entity.ErrorResponse;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.CCTFacade;
import com.budgetprepay.model.facade.ErrorResponseFacade;
import com.budgetprepay.model.facade.RSSFacade;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.webservice.pojos.verizon.*;
import com.budgetprepay.webservice.util.CommonUtil;
import com.budgetprepay.webservice.util.VerizonUtil;
import com.verizonwireless.oas.OasOrderResponseDocument;
import com.verizonwireless.oas.ResellerLineResponseDocument;
import com.verizonwireless.oas.ResellerLineResponseDocument.ResellerLineResponse;
import com.verizonwireless.oas.ResellerLineResponseType;
import com.verizonwireless.oas.ResellerOrderResponseDocument;
import com.verizonwireless.oas.ResellerOrderResponseDocument.ResellerOrderResponse;
import com.verizonwireless.oas.ResellerPRLResponseDocument;
import com.verizonwireless.oas.ValidateDeviceResponseDocument;

@Endpoint
public class VerizonEndpoint extends BaseEndpoint {
	 
	private static Logger logger = Logger.getLogger(VerizonEndpoint.class);
	
	public static final String NAMESPACE_URI = NAMESPACE_URI_PRE+ "/Verizon";
	
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeviceInquiryRequest")
	@ResponsePayload
	public JAXBElement<DeviceInquiryResponse> deviceInquiryRequest(@RequestPayload DeviceInquiryRequest request) throws Exception {
		DeviceInquiryResponse response = objectFactory.createDeviceInquiryResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
					    
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DEVICE_INQUIRY);
			
			RSSFacade.deviceInquiry(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;
			
	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeviceInquiryResponse>(new QName(NAMESPACE_URI, DeviceInquiryResponse.class.getSimpleName()), DeviceInquiryResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "OrderInquiryRequest")
	@ResponsePayload
	public JAXBElement<OrderInquiryResponse> orderInquiryRequest(@RequestPayload OrderInquiryRequest request) throws Exception {
		OrderInquiryResponse response = objectFactory.createOrderInquiryResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			//VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ORDER_INQUIRY);
			
			RSSFacade.orderInquiry(req);
			
			OasOrderResponseDocument document = null;
	    	try {
	    		 document = (OasOrderResponseDocument) VerizonUtil.fixOasOrderInquiry(req.getVerizonSynchronousResponseXML());
	    	}
	    	catch (Exception e) {
				ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(req.getVerizonSynchronousResponseXML()));
				throw new Exception("Unsupported response (errorResponseId = " + errorResponse.getId() + ")");
	    	}
			
	    	response.getReturnMessage().setReturnCode(document.getOasOrderResponse().getOrderResponse().getErrorCode());
			response.getReturnMessage().setReturnText(document.getOasOrderResponse().getOrderResponse().getErrorMessage());
			if (document.getOasOrderResponse().getOrderResponse().getMdn() != null)
			    response.setMdn(document.getOasOrderResponse().getOrderResponse().getMdn().getStringValue());
			if (document.getOasOrderResponse().getOrderResponse().getMessage() != null)
			    response.setMessage(document.getOasOrderResponse().getOrderResponse().getMessage());
			if (document.getOasOrderResponse().getOrderResponse().getNoOfLines() != null)
			    response.setNoOfLines(document.getOasOrderResponse().getOrderResponse().getNoOfLines());
			if (document.getOasOrderResponse().getOrderResponse().getOrderStatus() != null)
			    response.setOrderStatus(document.getOasOrderResponse().getOrderResponse().getOrderStatus());
			if (document.getOasOrderResponse().getOrderResponse().getOrderTimeStamp() != null)
			    response.setOrderTimeStamp(document.getOasOrderResponse().getOrderResponse().getOrderTimeStamp());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getCause().getMessage());
		}
		return new JAXBElement<OrderInquiryResponse>(new QName(NAMESPACE_URI, OrderInquiryResponse.class.getSimpleName()), OrderInquiryResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "LineInquiryRequest")
	@ResponsePayload
	public JAXBElement<LineInquiryResponse> lineInquiryRequest(@RequestPayload LineInquiryRequest request) throws Exception {
		LineInquiryResponse response = objectFactory.createLineInquiryResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		response.setLineResponse(objectFactory.createLineInquiryResponseType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.LINE_INQUIRY);
			
			RSSFacade.lineInquiry(req);
			
	    	ResellerLineResponseDocument document = null;
	    	try {
	    		 document = (ResellerLineResponseDocument) VerizonUtil.fixLineInquiry(req.getVerizonSynchronousResponseXML());
	    	}
	    	catch (Exception e) {
				ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(req.getVerizonSynchronousResponseXML()));
				throw new Exception("Unsupported response (errorResponseId = " + errorResponse.getId() + ")");
	    	}
	    	
	    	ResellerLineResponse resellerLineResponse = document.getResellerLineResponse();
	    	
	    	if (resellerLineResponse == null) 
	    		throw new Exception("LineInqury Verizon ResellerLineResponse null");
	    	
	    	ResellerLineResponseType resellerLineResponseType = document.getResellerLineResponse().getLineResponse();
	    	if (resellerLineResponseType == null)
	    		throw new Exception("LineInqury Verizon ResellerLineResponseType null");

	    	response.getReturnMessage().setReturnCode(resellerLineResponseType.getErrorCode());
			response.getReturnMessage().setReturnText(resellerLineResponseType.getErrorMessage());
			if (resellerLineResponseType.getMin() != null)
				response.getLineResponse().setMin(resellerLineResponseType.getMin());
			if (resellerLineResponseType.getMdn() != null)
				response.getLineResponse().setMdn(resellerLineResponseType.getMdn().getStringValue());
		    if (resellerLineResponseType.getEsn() != null)
		    	response.getLineResponse().setEsn(resellerLineResponseType.getEsn());
		    if (resellerLineResponseType.getMeid() != null)
		    	response.getLineResponse().setMeid(resellerLineResponseType.getMeid());
			if (resellerLineResponseType.getMobileIPAddress() != null)
				response.getLineResponse().setMobileIPAddress(resellerLineResponseType.getMobileIPAddress().getStringValue());
			if (resellerLineResponseType.getStatusCode() != null)
				response.getLineResponse().setStatusCode(resellerLineResponseType.getStatusCode().getStringValue());
			if (resellerLineResponseType.getFeatureArray() != null) {
				for (int i=0; i<resellerLineResponseType.getFeatureArray().length; i++) {
					FeatureType ft = objectFactory.createFeatureType();
					ft.setFeatureCode(resellerLineResponseType.getFeatureArray()[i].getFeatureCode().getStringValue());
					if (resellerLineResponseType.getFeatureArray()[i].getSubscribe().getStringValue().equals("A"))
						ft.setSubscribe(AddDeleteType.A);
					else
						ft.setSubscribe(AddDeleteType.D);
					response.getLineResponse().getFeature().add(ft);
				}
		    }
			if (resellerLineResponseType.getEquipment() != null) {
				EquipmentType equipment = objectFactory.createEquipmentType();
				if (resellerLineResponseType.getEquipment().getMake() != null)
					equipment.setMake(resellerLineResponseType.getEquipment().getMake().getStringValue());
				if (resellerLineResponseType.getEquipment().getMode() != null)
					equipment.setMake(resellerLineResponseType.getEquipment().getMode().getStringValue());
				if (resellerLineResponseType.getEquipment().getModel() != null)
					equipment.setMake(resellerLineResponseType.getEquipment().getModel().getStringValue());				
				response.getLineResponse().setEquipment(equipment);
			}
			if (resellerLineResponseType.getInitialServiceDate() != null)
				response.getLineResponse().setInitialServiceDate(resellerLineResponseType.getInitialServiceDate().getStringValue());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<LineInquiryResponse>(new QName(NAMESPACE_URI, LineInquiryResponse.class.getSimpleName()), LineInquiryResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInInquiryRequest")
	@ResponsePayload
	public JAXBElement<PortInInquiryResponse> portInInquiryRequest(@RequestPayload PortInInquiryRequest request) throws Exception {
		PortInInquiryResponse response = objectFactory.createPortInInquiryResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.PORTIN_INQUIRY);
			
			RSSFacade.portInInquiry(req);
			
			com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerPortInInquiryResponse document = (com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerPortInInquiryResponse) VerizonUtil.XML2JAXB(com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerPortInInquiryResponse.class, req.getVerizonSynchronousResponseXML());
			
	    	response.getReturnMessage().setReturnCode(document.getPortInInquiryResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getPortInInquiryResponse().getReturnMessage() +
					             "-" + document.getPortInInquiryResponse().getReasonDetail());
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<PortInInquiryResponse>(new QName(NAMESPACE_URI, PortInInquiryResponse.class.getSimpleName()), PortInInquiryResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PrlInquiryRequest")
	@ResponsePayload
	public JAXBElement<PrlInquiryResponse> prlInquiryRequest(@RequestPayload PrlInquiryRequest request) throws Exception {
		PrlInquiryResponse response = objectFactory.createPrlInquiryResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.LINE_INQUIRY);
			
			RSSFacade.prlInquiry(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerPRLResponseDocument document = (ResellerPRLResponseDocument) xmlObject;
			
	    	response.getReturnMessage().setReturnCode(document.getResellerPRLResponse().getPrlResponse().getErrorCode());
			response.getReturnMessage().setReturnText(document.getResellerPRLResponse().getPrlResponse().getErrorMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<PrlInquiryResponse>(new QName(NAMESPACE_URI, PrlInquiryResponse.class.getSimpleName()), PrlInquiryResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeviceActivationRequest")
	@ResponsePayload
	public JAXBElement<DeviceActivationResponse> deviceActivationRequest(@RequestPayload DeviceActivationRequest request) throws Exception {
		DeviceActivationResponse response = objectFactory.createDeviceActivationResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DEVICE_ACTIVATION);
			
			RSSFacade.activateSubscriber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeviceActivationResponse>(new QName(NAMESPACE_URI, DeviceActivationResponse.class.getSimpleName()), DeviceActivationResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeviceActivationPortInRequest")
	@ResponsePayload
	public JAXBElement<DeviceActivationPortInResponse> deviceActivationPortInRequest(@RequestPayload DeviceActivationPortInRequest request) throws Exception {
		DeviceActivationPortInResponse response = objectFactory.createDeviceActivationPortInResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DEVICE_ACTIVATION_PORTIN);
			
			RSSFacade.activateSubscriberPortIn(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeviceActivationPortInResponse>(new QName(NAMESPACE_URI, DeviceActivationPortInResponse.class.getSimpleName()), DeviceActivationPortInResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteSubscriberRequest")
	@ResponsePayload
	public JAXBElement<DeleteSubscriberResponse> deleteSubscriberRequest(@RequestPayload DeleteSubscriberRequest request) throws Exception {
		DeleteSubscriberResponse response = objectFactory.createDeleteSubscriberResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DELETE_SUBSCRIBER);
			
			RSSFacade.deleteSubscriber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;
			
	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeleteSubscriberResponse>(new QName(NAMESPACE_URI, DeleteSubscriberResponse.class.getSimpleName()), DeleteSubscriberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ValidateMDNPortabilityRequest")
	@ResponsePayload
	public JAXBElement<ValidateMDNPortabilityResponse> validateMDNPortabilityRequest(@RequestPayload ValidateMDNPortabilityRequest request) throws Exception {
		ValidateMDNPortabilityResponse response = objectFactory.createValidateMDNPortabilityResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VALIDATE_MDN_PORTIN);
			
			RSSFacade.validateMDNPortIn(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;
			
	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ValidateMDNPortabilityResponse>(new QName(NAMESPACE_URI, ValidateMDNPortabilityResponse.class.getSimpleName()), ValidateMDNPortabilityResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeESNRequest")
	@ResponsePayload
	public JAXBElement<ChangeESNResponse> changeESNRequest(@RequestPayload ChangeESNRequest request) throws Exception {
		ChangeESNResponse response = objectFactory.createChangeESNResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.CHANGE_ESN);
			
			RSSFacade.changeESN(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;
			
	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ChangeESNResponse>(new QName(NAMESPACE_URI, ChangeESNResponse.class.getSimpleName() ), ChangeESNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchBucketRequest")
	@ResponsePayload
	public JAXBElement<SearchBucketResponse> searchBucketRequest(@RequestPayload SearchBucketRequest request) throws Exception {
		SearchBucketResponse response = objectFactory.createSearchBucketResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			VerizonUtil.validateMDN(request.getMdn());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_BUCKET);
			
			response = CCTFacade.searchBucketRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchBucketResponse>(new QName(NAMESPACE_URI, SearchBucketResponse.class.getSimpleName()), SearchBucketResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddBucketRequest")
	@ResponsePayload
	public JAXBElement<AddBucketResponse> addBucketRequest(@RequestPayload AddBucketRequest request) throws Exception {
		AddBucketResponse response = objectFactory.createAddBucketResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ADD_BUCKET);
			
			response = CCTFacade.addBucketRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<AddBucketResponse>(new QName(NAMESPACE_URI, AddBucketResponse.class.getSimpleName()), AddBucketResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteBucketRequest")
	@ResponsePayload
	public JAXBElement<DeleteBucketResponse> deleteBucketRequest(@RequestPayload DeleteBucketRequest request) throws Exception {
		DeleteBucketResponse response = objectFactory.createDeleteBucketResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DELETE_BUCKET);
			
			response = CCTFacade.deleteBucketRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeleteBucketResponse>(new QName(NAMESPACE_URI, DeleteBucketResponse.class.getSimpleName()), DeleteBucketResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateBucketRequest")
	@ResponsePayload
	public JAXBElement<UpdateBucketResponse> updateBucketRequest(@RequestPayload UpdateBucketRequest request) throws Exception {
		UpdateBucketResponse response = objectFactory.createUpdateBucketResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_BUCKET);
			
			response = CCTFacade.updateBucketRequest(req);
		
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdateBucketResponse>(new QName(NAMESPACE_URI, UpdateBucketResponse.class.getSimpleName()), UpdateBucketResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddHotlineRequest")
	@ResponsePayload
	public JAXBElement<AddHotlineResponse> addHotlineRequest(@RequestPayload AddHotlineRequest request) throws Exception {
		AddHotlineResponse response = objectFactory.createAddHotlineResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ADD_HOTLINE);
			
			RSSFacade.addHotline(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<AddHotlineResponse>(new QName(NAMESPACE_URI, AddHotlineResponse.class.getSimpleName()), AddHotlineResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RemoveHotlineRequest")
	@ResponsePayload
	public JAXBElement<RemoveHotlineResponse> removeHotlineRequest(@RequestPayload RemoveHotlineRequest request) throws Exception {
		RemoveHotlineResponse response = objectFactory.createRemoveHotlineResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.REMOVE_HOTLINE);
			
			RSSFacade.removeHotline(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<RemoveHotlineResponse>(new QName(NAMESPACE_URI, RemoveHotlineResponse.class.getSimpleName()), RemoveHotlineResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddHotlineSubscriberRequest")
	@ResponsePayload
	public JAXBElement<AddHotlineSubscriberResponse> addHotlineSubscriberRequest(@RequestPayload AddHotlineSubscriberRequest request) throws Exception {
		AddHotlineSubscriberResponse response = objectFactory.createAddHotlineSubscriberResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ADD_HOTLINE);
			
			RSSFacade.addHotlineSubscriber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<AddHotlineSubscriberResponse>(new QName(NAMESPACE_URI, AddHotlineSubscriberResponse.class.getSimpleName()), AddHotlineSubscriberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReconnectMDNRequest")
	@ResponsePayload
	public JAXBElement<ReconnectMDNResponse> reconnectMDNRequest(@RequestPayload ReconnectMDNRequest request) throws Exception {
		ReconnectMDNResponse response = objectFactory.createReconnectMDNResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.RECONNECT_MDN);
			
			RSSFacade.reconnectMDN(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ReconnectMDNResponse>(new QName(NAMESPACE_URI, ReconnectMDNResponse.class.getSimpleName()), ReconnectMDNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RestoreSuspendedSubscriberRequest")
	@ResponsePayload
	public JAXBElement<RestoreSuspendedSubscriberResponse> restoreSuspendedSubscriberRequest(@RequestPayload RestoreSuspendedSubscriberRequest request) throws Exception {
		RestoreSuspendedSubscriberResponse response = objectFactory.createRestoreSuspendedSubscriberResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.RESTORE_SUSPENDED_SUBSCRIBER);
			
			RSSFacade.restoreSuspendedSubscriber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<RestoreSuspendedSubscriberResponse>(new QName(NAMESPACE_URI, RestoreSuspendedSubscriberResponse.class.getSimpleName()), RestoreSuspendedSubscriberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SuspendSubscriberRequest")
	@ResponsePayload
	public JAXBElement<SuspendSubscriberResponse> suspendSubscriberRequest(@RequestPayload SuspendSubscriberRequest request) throws Exception {
		SuspendSubscriberResponse response = objectFactory.createSuspendSubscriberResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SUSPEND_SUBSCRIBER);
			
			RSSFacade.suspendSubscriber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SuspendSubscriberResponse>(new QName(NAMESPACE_URI, SuspendSubscriberResponse.class.getSimpleName()), SuspendSubscriberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ValidateDeviceRequest")
	@ResponsePayload
	public JAXBElement<ValidateDeviceResponse> validateDeviceRequest(@RequestPayload ValidateDeviceRequest request) throws Exception {
		ValidateDeviceResponse response = objectFactory.createValidateDeviceResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());
			
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VALIDATE_DEVICE);
			
			RSSFacade.validateDevice(req);
			
			XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
			
			if (xmlObject instanceof com.verizonwireless.oas.impl.ResellerOrderResponseDocumentImpl) {
				ResellerOrderResponseDocument resellerOrderResponseDocument = null;
				try {
					resellerOrderResponseDocument = (ResellerOrderResponseDocument) VerizonUtil.fixOasValidateDeviceResponse(req.getVerizonSynchronousResponseXML());
					if (resellerOrderResponseDocument.getResellerOrderResponse() != null) {
						ResellerOrderResponse resellerResponse = resellerOrderResponseDocument.getResellerOrderResponse();
						if (resellerResponse.getMessageHeader() != null) {
						    ;	
						}
						if (resellerResponse.getOrderResponse() != null) {
				 	    	response.getReturnMessage().setReturnCode(resellerResponse.getOrderResponse().getReturnCode());
							response.getReturnMessage().setReturnText(resellerResponse.getOrderResponse().getReturnMessage());
						}	
					}
				    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

				    logRequest(req);
					logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
					
					req = RequestFacade.update(req);
				}
				catch (Exception e) {
					ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(req.getVerizonSynchronousResponseXML()));
					throw new Exception("Unable to parse OrderResponse, see this URL for details: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));
				}
			}
			else if (xmlObject instanceof com.verizonwireless.oas.ValidateDeviceResponseDocument) {
				ValidateDeviceResponseDocument document = null;
		    	try {
		            document = (ValidateDeviceResponseDocument) VerizonUtil.fixOasValidateDeviceResponse(req.getVerizonSynchronousResponseXML());
		 	    	response.getReturnMessage().setReturnCode(document.getValidateDeviceResponse().getDeviceResponse().getReturnCode());
					response.getReturnMessage().setReturnText(document.getValidateDeviceResponse().getDeviceResponse().getReturnMessage());
					response.setDeviceId(document.getValidateDeviceResponse().getDeviceResponse().getDeviceId());
					if (document.getValidateDeviceResponse().getDeviceResponse().getEquipment() != null) {
					    response.setEquipment(objectFactory.createEquipmentType());
					    if (document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getMake() != null)
					        response.getEquipment().setMake(document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getMake().getStringValue());
					    if (document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getModel() != null)
					    	response.getEquipment().setModel(document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getModel().getStringValue());
					    if (document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getMode() != null)
					    	response.getEquipment().setMode(document.getValidateDeviceResponse().getDeviceResponse().getEquipment().getMode().getStringValue());
					}
					if (document.getValidateDeviceResponse().getDeviceResponse().getIsValid() != null) {
						if (document.getValidateDeviceResponse().getDeviceResponse().getIsValid().getStringValue().equals("Y"))
						     response.setIsValid(TrueFalseType.TRUE);
						else
							 response.setIsValid(TrueFalseType.FALSE);
					}
					if (document.getValidateDeviceResponse().getDeviceResponse().getIsInDMD() != null) {
						if (document.getValidateDeviceResponse().getDeviceResponse().getIsInDMD().getStringValue().equals("Y"))
						     response.setIsInDMD(TrueFalseType.TRUE);
						else
							 response.setIsInDMD(TrueFalseType.FALSE);
					}
					if (document.getValidateDeviceResponse().getDeviceResponse().getIsPIBLock() != null) {
						if (document.getValidateDeviceResponse().getDeviceResponse().getIsPIBLock().getStringValue().equals("Y"))
						     response.setIsPIBLock(TrueFalseType.TRUE);
						else
							 response.setIsPIBLock(TrueFalseType.FALSE);
					}
					if (document.getValidateDeviceResponse().getDeviceResponse().getIsLostOrStolen() != null) {
						if (document.getValidateDeviceResponse().getDeviceResponse().getIsLostOrStolen().getStringValue().equals("Y"))
						     response.setIsLostOrStolden(TrueFalseType.TRUE);
						else
							 response.setIsLostOrStolden(TrueFalseType.FALSE);
					}
					
				    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

				    logRequest(req);
					logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
					
					req = RequestFacade.update(req);	    	
		    	}
		    	catch (Exception e) {
					ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(req.getVerizonSynchronousResponseXML()));
					throw new Exception("Unable to parse ValidateDeviceResponse, see this URL for details: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));
		    	}				
			}
			else {
				ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(req.getVerizonSynchronousResponseXML()));
				throw new Exception("Unsupported response, see this URL for details: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));

			}
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ValidateDeviceResponse>(new QName(NAMESPACE_URI, ValidateDeviceResponse.class.getSimpleName()), ValidateDeviceResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeMobileNumberRequest")
	@ResponsePayload
	public JAXBElement<ChangeMobileNumberResponse> changeMobileNumberRequest(@RequestPayload ChangeMobileNumberRequest request) throws Exception {
		ChangeMobileNumberResponse response = objectFactory.createChangeMobileNumberResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.CHANGE_MOBILE_NUMBER);
			
			RSSFacade.changeMobileNumber(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ChangeMobileNumberResponse>(new QName(NAMESPACE_URI, ChangeMobileNumberResponse.class.getSimpleName()), ChangeMobileNumberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ResetFeatureRequest")
	@ResponsePayload
	public JAXBElement<ResetFeatureResponse> resetFeatureRequest(@RequestPayload ResetFeatureRequest request) throws Exception {
		ResetFeatureResponse response = objectFactory.createResetFeatureResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.RESET_FEATURE);
			
			RSSFacade.resetFeature(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
		
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ResetFeatureResponse>(new QName(NAMESPACE_URI, ResetFeatureResponse.class.getSimpleName()), ResetFeatureResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeFeaturesRequest")
	@ResponsePayload
	public JAXBElement<ChangeFeaturesResponse> changeFeatures(@RequestPayload ChangeFeaturesRequest request) throws Exception {
		ChangeFeaturesResponse response = objectFactory.createChangeFeaturesResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.CHANGE_FEATURES);
			
			RSSFacade.changeFeatures(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ChangeFeaturesResponse>(new QName(NAMESPACE_URI, ChangeFeaturesResponse.class.getSimpleName()), ChangeFeaturesResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeRatePlanRequest")
	@ResponsePayload
	public JAXBElement<ChangeRatePlanResponse> changeRatePlanRequest(@RequestPayload ChangeRatePlanRequest request) throws Exception {
		ChangeRatePlanResponse response = objectFactory.createChangeRatePlanResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.CHANGE_RATEPLAN);
			
			RSSFacade.changeRatePlan(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ChangeRatePlanResponse>(new QName(NAMESPACE_URI, ChangeRatePlanResponse.class.getSimpleName()), ChangeRatePlanResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeSIMRequest")
	@ResponsePayload
	public JAXBElement<ChangeSIMResponse> changeSIMRequest(@RequestPayload ChangeSIMRequest request) throws Exception {
		ChangeSIMResponse response = objectFactory.createChangeSIMResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			response.setMessageHeader(request.getMessageHeader());

			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.CHANGE_RATEPLAN);
			
			RSSFacade.changeSIM(req);
			
	    	XmlObject xmlObject = XmlObject.Factory.parse(req.getVerizonSynchronousResponseXML());
	    	ResellerOrderResponseDocument document = (ResellerOrderResponseDocument) xmlObject;

	    	response.getReturnMessage().setReturnCode(document.getResellerOrderResponse().getOrderResponse().getReturnCode());
			response.getReturnMessage().setReturnText(document.getResellerOrderResponse().getOrderResponse().getReturnMessage());
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ChangeSIMResponse>(new QName(NAMESPACE_URI, ChangeSIMResponse.class.getSimpleName()), ChangeSIMResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddAutoReplenishRequest")
	@ResponsePayload
	public JAXBElement<AddAutoReplenishResponse> addAutoReplenishRequest(@RequestPayload AddAutoReplenishRequest request) throws Exception {
		AddAutoReplenishResponse response = objectFactory.createAddAutoReplenishResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ADD_AUTO_REPLENISH);
			
			response = CCTFacade.addAutoReplenishRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<AddAutoReplenishResponse>(new QName(NAMESPACE_URI, AddAutoReplenishResponse.class.getSimpleName()), AddAutoReplenishResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateAutoReplenishRequest")
	@ResponsePayload
	public JAXBElement<UpdateAutoReplenishResponse> updateAutoReplenishRequest(@RequestPayload UpdateAutoReplenishRequest request) throws Exception {
		UpdateAutoReplenishResponse response = objectFactory.createUpdateAutoReplenishResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_AUTO_REPLENISH);
			
			response = CCTFacade.updateAutoReplenishRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdateAutoReplenishResponse>(new QName(NAMESPACE_URI, UpdateAutoReplenishResponse.class.getSimpleName()), UpdateAutoReplenishResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAutoReplenishRequest")
	@ResponsePayload
	public JAXBElement<GetAutoReplenishResponse> getAutoReplenishRequest(@RequestPayload GetAutoReplenishRequest request) throws Exception {
		GetAutoReplenishResponse response = objectFactory.createGetAutoReplenishResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.GET_AUTO_REPLENISH);
			
			response = CCTFacade.getAutoReplenishRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<GetAutoReplenishResponse>(new QName(NAMESPACE_URI, GetAutoReplenishResponse.class.getSimpleName()), GetAutoReplenishResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchSubscriberInfoRequest")
	@ResponsePayload
	public JAXBElement<SearchSubscriberInfoResponse> searchSubscriberInfoRequest(@RequestPayload SearchSubscriberInfoRequest request) throws Exception {
		SearchSubscriberInfoResponse response = objectFactory.createSearchSubscriberInfoResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_SUBSCRIBER_INFO);
			
			response = CCTFacade.searchSubscriberInfo(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchSubscriberInfoResponse>(new QName(NAMESPACE_URI, SearchSubscriberInfoResponse.class.getSimpleName()), SearchSubscriberInfoResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateSubscriberFieldRequest")
	@ResponsePayload
	public JAXBElement<UpdateSubscriberFieldResponse> updateSubscriberFieldRequest(@RequestPayload UpdateSubscriberFieldRequest request) throws Exception {
		UpdateSubscriberFieldResponse response = objectFactory.createUpdateSubscriberFieldResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_SUBSCRIBER_FIELD);
			
			response = CCTFacade.updateSubscriberFieldRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdateSubscriberFieldResponse>(new QName(NAMESPACE_URI, UpdateSubscriberFieldResponse.class.getSimpleName()), UpdateSubscriberFieldResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteAllBucketsRequest")
	@ResponsePayload
	public JAXBElement<DeleteAllBucketsResponse> deleteAllBucketsRequest(@RequestPayload DeleteAllBucketsRequest request) throws Exception {
		DeleteAllBucketsResponse response = objectFactory.createDeleteAllBucketsResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.DELETE_ALL_BUCKETS);
			
			response = CCTFacade.deleteAllBucketsRequest(req);
		
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));

		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DeleteAllBucketsResponse>(new QName(NAMESPACE_URI, DeleteAllBucketsResponse.class.getSimpleName()), DeleteAllBucketsResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateAccountBalanceRequest")
	@ResponsePayload
	public JAXBElement<UpdateAccountBalanceResponse> updateAccountBalanceRequest(@RequestPayload UpdateAccountBalanceRequest request) throws Exception {
		UpdateAccountBalanceResponse response = objectFactory.createUpdateAccountBalanceResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_ACCOUNT_BALANCE);
			
			response = CCTFacade.updateAccountBalanceRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdateAccountBalanceResponse>(new QName(NAMESPACE_URI, UpdateAccountBalanceResponse.class.getSimpleName()), UpdateAccountBalanceResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateCreditRequest")
	@ResponsePayload
	public JAXBElement<UpdateCreditResponse> updateCreditRequest(@RequestPayload UpdateCreditRequest request) throws Exception {
		UpdateCreditResponse response = objectFactory.createUpdateCreditResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_CREDIT);
			
			response = CCTFacade.updateCreditRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdateCreditResponse>(new QName(NAMESPACE_URI, UpdateCreditResponse.class.getSimpleName()), UpdateCreditResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ActivatePINRequest")
	@ResponsePayload
	public JAXBElement<ActivatePINResponse> activatePINRequest(@RequestPayload ActivatePINRequest request) throws Exception {
		ActivatePINResponse response = objectFactory.createActivatePINResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.ACTIVATE_PIN);
			
			response = CCTFacade.activatePINRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ActivatePINResponse>(new QName(NAMESPACE_URI, ActivatePINResponse.class.getSimpleName()), ActivatePINResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchCDRRequest")
	@ResponsePayload
	public JAXBElement<SearchCDRResponse> searchCDRRequest(@RequestPayload SearchCDRRequest request) throws Exception {
		SearchCDRResponse response = objectFactory.createSearchCDRResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_CDR);
			
			response = CCTFacade.searchCDRRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchCDRResponse>(new QName(NAMESPACE_URI, SearchCDRResponse.class.getSimpleName()), SearchCDRResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchCDRDetailRequest")
	@ResponsePayload
	public JAXBElement<SearchCDRDetailResponse> searchCDRDetailRequest(@RequestPayload SearchCDRDetailRequest request) throws Exception {
		SearchCDRDetailResponse response = objectFactory.createSearchCDRDetailResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_CDR_DETAIL);
			
			response = CCTFacade.searchCDRDetailRequest(req);
			
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchCDRDetailResponse>(new QName(NAMESPACE_URI, SearchCDRDetailResponse.class.getSimpleName()), SearchCDRDetailResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchPINRequest")
	@ResponsePayload
	public JAXBElement<SearchPINResponse> searchPINRequest(@RequestPayload SearchPINRequest request) throws Exception {
		SearchPINResponse response = objectFactory.createSearchPINResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_PIN);
			
			response = CCTFacade.searchPINRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchPINResponse>(new QName(NAMESPACE_URI, SearchPINResponse.class.getSimpleName()), SearchPINResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "VoidPINRequest")
	@ResponsePayload
	public JAXBElement<VoidPINResponse> voidPINRequest(@RequestPayload VoidPINRequest request) throws Exception {
		VoidPINResponse response = objectFactory.createVoidPINResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VOID_PIN);
			
			response = CCTFacade.voidPINRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<VoidPINResponse>(new QName(NAMESPACE_URI, VoidPINResponse.class.getSimpleName()), VoidPINResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchPINBatchRequest")
	@ResponsePayload
	public JAXBElement<SearchPINBatchResponse> searchPINBatchRequest(@RequestPayload SearchPINBatchRequest request) throws Exception {
		SearchPINBatchResponse response = objectFactory.createSearchPINBatchResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_PIN_BATCH);
			
			response = CCTFacade.searchPINBatchRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchPINBatchResponse>(new QName(NAMESPACE_URI, SearchPINBatchResponse.class.getSimpleName()), SearchPINBatchResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "VoidPINRangeRequest")
	@ResponsePayload
	public JAXBElement<VoidPINRangeResponse> voidPINRangeRequest(@RequestPayload VoidPINRangeRequest request) throws Exception {
		VoidPINRangeResponse response = objectFactory.createVoidPINRangeResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VOID_PIN_RANGE);
			
			response = CCTFacade.voidPINRangeRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<VoidPINRangeResponse>(new QName(NAMESPACE_URI, VoidPINRangeResponse.class.getSimpleName()), VoidPINRangeResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "VoidGroupRequest")
	@ResponsePayload
	public JAXBElement<VoidGroupResponse> voidGroupRequest(@RequestPayload VoidGroupRequest request) throws Exception {
		VoidGroupResponse response = objectFactory.createVoidGroupResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VOID_GROUP);
			
			response = CCTFacade.voidGroupRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<VoidGroupResponse>(new QName(NAMESPACE_URI, VoidGroupResponse.class.getSimpleName()), VoidGroupResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "VoidBatchRequest")
	@ResponsePayload
	public JAXBElement<VoidBatchResponse> voidBatchRequest(@RequestPayload VoidBatchRequest request) throws Exception {
		VoidBatchResponse response = objectFactory.createVoidBatchResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.VOID_BATCH);
			
			response = CCTFacade.voidBatchRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<VoidBatchResponse>(new QName(NAMESPACE_URI, VoidBatchResponse.class.getSimpleName()), VoidBatchResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchPINGroupRequest")
	@ResponsePayload
	public JAXBElement<SearchPINGroupResponse> searchPINGroupRequest(@RequestPayload SearchPINGroupRequest request) throws Exception {
		SearchPINGroupResponse response = objectFactory.createSearchPINGroupResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.SEARCH_PIN_GROUP);
			
			response = CCTFacade.searchPINGroupRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SearchPINGroupResponse>(new QName(NAMESPACE_URI, SearchPINGroupResponse.class.getSimpleName()), SearchPINGroupResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdatePINBatchStatusRequest")
	@ResponsePayload
	public JAXBElement<UpdatePINBatchStatusResponse> updatePINBatchStatusRequest(@RequestPayload UpdatePINBatchStatusRequest request) throws Exception {
		UpdatePINBatchStatusResponse response = objectFactory.createUpdatePINBatchStatusResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_PIN_BATCH_STATUS);
			
			response = CCTFacade.updatePINBatchStatusRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdatePINBatchStatusResponse>(new QName(NAMESPACE_URI, UpdatePINBatchStatusResponse.class.getSimpleName()), UpdatePINBatchStatusResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdatePINGroupInfoRequest")
	@ResponsePayload
	public JAXBElement<UpdatePINGroupInfoResponse> updatePINGroupInfoRequest(@RequestPayload UpdatePINGroupInfoRequest request) throws Exception {
		UpdatePINGroupInfoResponse response = objectFactory.createUpdatePINGroupInfoResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.UPDATE_PIN_GROUP_INFO);
			
			response = CCTFacade.updatePINGroupInfoRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<UpdatePINGroupInfoResponse>(new QName(NAMESPACE_URI, UpdatePINGroupInfoResponse.class.getSimpleName()), UpdatePINGroupInfoResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RevertCallsRequest")
	@ResponsePayload
	public JAXBElement<RevertCallsResponse> revertCallsRequest(@RequestPayload RevertCallsRequest request) throws Exception {
		RevertCallsResponse response = objectFactory.createRevertCallsResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			User user = VerizonUtil.retrieveByUsername(request.getMessageHeader().getUserId());
			
			VerizonUtil.validateClientReference(user, request.getMessageHeader().getReferenceNumber());
			
			VerizonUtil.validatePlanCode(user, request.getMessageHeader().getPlanCode());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(request.getMessageHeader().getReferenceNumber());
			req.setClientAsynchronousReturnUrl(request.getMessageHeader().getAnsynchronousReturnUrl());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(VerizonUtil.JAXB2XML(request));
			req.setReferenceNumber(request.getMessageHeader().getPlanCode() + "_" + request.getMessageHeader().getReferenceNumber());
			req.setType(Request.RequestType.REVERT_CALLS);
			
			response = CCTFacade.revertCallsRequest(req);
		    req.setClientSynchronousResponseXML(VerizonUtil.JAXB2XML(response));
		    
		    logRequest(req);
			logger.debug("Saving request " + request.getMessageHeader().getReferenceNumber());
			
			req = RequestFacade.create(req);
	    }
		catch (Exception e) {
			logger.error(e);
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<RevertCallsResponse>(new QName(NAMESPACE_URI, RevertCallsResponse.class.getSimpleName()), RevertCallsResponse.class, response);
	}
}
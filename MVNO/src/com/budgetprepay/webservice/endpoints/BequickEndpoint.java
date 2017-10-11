package com.budgetprepay.webservice.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.BeQuickFacade;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.webservice.pojos.bequick.ActivateRequest;
import com.budgetprepay.webservice.pojos.bequick.ActivateResponse;
import com.budgetprepay.webservice.pojos.bequick.DisconnectRequest;
import com.budgetprepay.webservice.pojos.bequick.DisconnectResponse;
import com.budgetprepay.webservice.pojos.bequick.GetCoverageRequest;
import com.budgetprepay.webservice.pojos.bequick.GetCoverageResponse;
import com.budgetprepay.webservice.pojos.bequick.GetServiceInformationRequest;
import com.budgetprepay.webservice.pojos.bequick.GetServiceInformationResponse;
import com.budgetprepay.webservice.pojos.bequick.ObjectFactory;
import com.budgetprepay.webservice.pojos.bequick.PortInRequest;
import com.budgetprepay.webservice.pojos.bequick.PortInResponse;
import com.budgetprepay.webservice.pojos.bequick.PurchaseRequest;
import com.budgetprepay.webservice.pojos.bequick.PurchaseResponse;
import com.budgetprepay.webservice.pojos.bequick.RestoreRequest;
import com.budgetprepay.webservice.pojos.bequick.RestoreResponse;
import com.budgetprepay.webservice.pojos.bequick.SuspendRequest;
import com.budgetprepay.webservice.pojos.bequick.SuspendResponse;
import com.budgetprepay.webservice.pojos.bequick.SwapESNRequest;
import com.budgetprepay.webservice.pojos.bequick.SwapESNResponse;
import com.budgetprepay.webservice.pojos.bequick.SwapMDNRequest;
import com.budgetprepay.webservice.pojos.bequick.SwapMDNResponse;
import com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationRequest;
import com.budgetprepay.webservice.pojos.bequick.WirelessInitialActivationResponse;
import com.budgetprepay.webservice.util.CommonUtil;

@Endpoint
public class BequickEndpoint extends BaseEndpoint {
	
	private static Logger logger = Logger.getLogger(BequickEndpoint.class);
	
	public static final String NAMESPACE_URI = NAMESPACE_URI_PRE+ "/Bequick";
	
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCoverageRequest")
	@ResponsePayload
	public JAXBElement<GetCoverageResponse> getCoverageRequest(@RequestPayload GetCoverageRequest request) throws Exception {
		GetCoverageResponse response = objectFactory.createGetCoverageResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_GET_COVERAGE);
			
			response = BeQuickFacade.getCoverageInfomration(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<GetCoverageResponse>(new QName(NAMESPACE_URI, GetCoverageResponse.class.getSimpleName()), GetCoverageResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetServiceInformationRequest")
	@ResponsePayload
	public JAXBElement<GetServiceInformationResponse> getServiceInformationRequest(@RequestPayload GetServiceInformationRequest request) throws Exception {
		GetServiceInformationResponse response = objectFactory.createGetServiceInformationResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_GET_SERVICE_INFORMATION);
			
			response = BeQuickFacade.getServiceInformation(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<GetServiceInformationResponse>(new QName(NAMESPACE_URI, GetServiceInformationResponse.class.getSimpleName()), GetServiceInformationResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ActivateRequest")
	@ResponsePayload
	public JAXBElement<ActivateResponse> activateRequest(@RequestPayload ActivateRequest request) throws Exception {
		ActivateResponse response = objectFactory.createActivateResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_ACTIVATE);
			
			response = BeQuickFacade.activate(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<ActivateResponse>(new QName(NAMESPACE_URI, ActivateResponse.class.getSimpleName()), ActivateResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SwapMDNRequest")
	@ResponsePayload
	public JAXBElement<SwapMDNResponse> swapMDNRequest(@RequestPayload SwapMDNRequest request) throws Exception {
		SwapMDNResponse response = objectFactory.createSwapMDNResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_SWAPMDN);
			
			response = BeQuickFacade.swapMDN(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SwapMDNResponse>(new QName(NAMESPACE_URI, SwapMDNResponse.class.getSimpleName()), SwapMDNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SwapESNRequest")
	@ResponsePayload
	public JAXBElement<SwapESNResponse> swapESNRequest(@RequestPayload SwapESNRequest request) throws Exception {
		SwapESNResponse response = objectFactory.createSwapESNResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_SWAPMDN);
			
			response = BeQuickFacade.swapESN(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SwapESNResponse>(new QName(NAMESPACE_URI, SwapESNResponse.class.getSimpleName()), SwapESNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SuspendRequest")
	@ResponsePayload
	public JAXBElement<SuspendResponse> suspendRequest(@RequestPayload SuspendRequest request) throws Exception {
		SuspendResponse response = objectFactory.createSuspendResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_SUSPEND);
			
			response = BeQuickFacade.suspend(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<SuspendResponse>(new QName(NAMESPACE_URI, SuspendResponse.class.getSimpleName()), SuspendResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RestoreRequest")
	@ResponsePayload
	public JAXBElement<RestoreResponse> restoreRequest(@RequestPayload RestoreRequest request) throws Exception {
		RestoreResponse response = objectFactory.createRestoreResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_RESTORE);
			
			response = BeQuickFacade.restore(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<RestoreResponse>(new QName(NAMESPACE_URI, RestoreResponse.class.getSimpleName()), RestoreResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "DisconnectRequest")
	@ResponsePayload
	public JAXBElement<DisconnectResponse> disconnectRequest(@RequestPayload DisconnectRequest request) throws Exception {
		DisconnectResponse response = objectFactory.createDisconnectResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_DISCONNECT);
			
			response = BeQuickFacade.disconnect(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<DisconnectResponse>(new QName(NAMESPACE_URI, DisconnectResponse.class.getSimpleName()), DisconnectResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PurchaseRequest")
	@ResponsePayload
	public JAXBElement<PurchaseResponse> purchaseRequest(@RequestPayload PurchaseRequest request) throws Exception {
		PurchaseResponse response = objectFactory.createPurchaseResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_PURCHASE);
			
			response = BeQuickFacade.purchase(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<PurchaseResponse>(new QName(NAMESPACE_URI, PurchaseResponse.class.getSimpleName()), PurchaseResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInRequest")
	@ResponsePayload
	public JAXBElement<PortInResponse> portInRequest(@RequestPayload PortInRequest request) throws Exception {
		PortInResponse response = objectFactory.createPortInResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_PORTIN);
			
			response = BeQuickFacade.portIn(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		
		return new JAXBElement<PortInResponse>(new QName(NAMESPACE_URI, PortInResponse.class.getSimpleName()), PortInResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "WirelessInitialActivationRequest")
	@ResponsePayload
	public JAXBElement<WirelessInitialActivationResponse> wirelessInitialActivationRequest(@RequestPayload WirelessInitialActivationRequest request) throws Exception {
		WirelessInitialActivationResponse response = objectFactory.createWirelessInitialActivationResponse();

		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    CommonUtil.validateClientReference(user, request.getReferenceId());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + CommonUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.BEQUICK_PORTIN);
			
			response = BeQuickFacade.wirelessInitialActivation(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.create(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.setReturnMessage(objectFactory.createReturnMessageType());
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		
		return new JAXBElement<WirelessInitialActivationResponse>(new QName(NAMESPACE_URI, WirelessInitialActivationResponse.class.getSimpleName()), WirelessInitialActivationResponse.class, response);
	}
}

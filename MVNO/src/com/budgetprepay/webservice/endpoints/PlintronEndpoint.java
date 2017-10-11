package com.budgetprepay.webservice.endpoints;

import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.budgetprepay.model.entity.PlintronBulkMessageRequest;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.PlintronBulkMessageRequestFacade;
import com.budgetprepay.model.facade.PlintronFacade;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.scheduler.CommitScheduler;
import com.budgetprepay.webservice.pojos.plintron.AddSOCRequest;
import com.budgetprepay.webservice.pojos.plintron.AddSOCResponse;
import com.budgetprepay.webservice.pojos.plintron.AllocateMDNRequest;
import com.budgetprepay.webservice.pojos.plintron.AllocateMDNResponse;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMRequest;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMResponse;
import com.budgetprepay.webservice.pojos.plintron.CancelMessageBulkRequest;
import com.budgetprepay.webservice.pojos.plintron.CancelMessageBulkResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangeIMSIRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangeIMSIResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangeMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangeMSISDNResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangePlanRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangePlanResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangeVMPinRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangeVMPinResponse;
import com.budgetprepay.webservice.pojos.plintron.GetAccountDetailsRequest;
import com.budgetprepay.webservice.pojos.plintron.GetAccountDetailsResponse;
import com.budgetprepay.webservice.pojos.plintron.GetBundleSubscriptionRequest;
import com.budgetprepay.webservice.pojos.plintron.GetBundleSubscriptionResponse;
import com.budgetprepay.webservice.pojos.plintron.GetSubscriberInfoRequest;
import com.budgetprepay.webservice.pojos.plintron.GetSubscriberInfoResponse;
import com.budgetprepay.webservice.pojos.plintron.GetSubscriptionStatusRequest;
import com.budgetprepay.webservice.pojos.plintron.GetSubscriptionStatusResponse;
import com.budgetprepay.webservice.pojos.plintron.ModifySubscriberBucketRequest;
import com.budgetprepay.webservice.pojos.plintron.ModifySubscriberBucketResponse;
import com.budgetprepay.webservice.pojos.plintron.ModifySubscriberStatusRequest;
import com.budgetprepay.webservice.pojos.plintron.ModifySubscriberStatusResponse;
import com.budgetprepay.webservice.pojos.plintron.ModifyingSubscriberLanguageTypeRequest;
import com.budgetprepay.webservice.pojos.plintron.ModifyingSubscriberLanguageTypeResponse;
import com.budgetprepay.webservice.pojos.plintron.ObjectFactory;
import com.budgetprepay.webservice.pojos.plintron.PortInCancelRequest;
import com.budgetprepay.webservice.pojos.plintron.PortInCancelResponse;
import com.budgetprepay.webservice.pojos.plintron.PortInCreateRequest;
import com.budgetprepay.webservice.pojos.plintron.PortInCreateResponse;
import com.budgetprepay.webservice.pojos.plintron.PortInStatusRequest;
import com.budgetprepay.webservice.pojos.plintron.PortInStatusResponse;
import com.budgetprepay.webservice.pojos.plintron.PortInUpdateRequest;
import com.budgetprepay.webservice.pojos.plintron.PortInUpdateResponse;
import com.budgetprepay.webservice.pojos.plintron.PortInValidateRequest;
import com.budgetprepay.webservice.pojos.plintron.PortInValidateResponse;
import com.budgetprepay.webservice.pojos.plintron.QuerySubscriberUsageRequest;
import com.budgetprepay.webservice.pojos.plintron.QuerySubscriberUsageResponse;
import com.budgetprepay.webservice.pojos.plintron.ReactivateSubscriberRequest;
import com.budgetprepay.webservice.pojos.plintron.ReactivateSubscriberResponse;
import com.budgetprepay.webservice.pojos.plintron.RemoveSOCRequest;
import com.budgetprepay.webservice.pojos.plintron.RemoveSOCResponse;
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberRequest;
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberResponse;
import com.budgetprepay.webservice.pojos.plintron.ReplaceMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.ReplaceMSISDNResponse;
import com.budgetprepay.webservice.pojos.plintron.ReportMessageBulkRequest;
import com.budgetprepay.webservice.pojos.plintron.ReportMessageBulkResponse;
import com.budgetprepay.webservice.pojos.plintron.SendMessageBulkRequest;
import com.budgetprepay.webservice.pojos.plintron.SendMessageBulkResponse;
import com.budgetprepay.webservice.pojos.plintron.SendMessageRequest;
import com.budgetprepay.webservice.pojos.plintron.SendMessageResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateResponse;
import com.budgetprepay.webservice.pojos.plintron.SmsMessageType;
import com.budgetprepay.webservice.pojos.plintron.StatusMessageBulkRequest;
import com.budgetprepay.webservice.pojos.plintron.StatusMessageBulkResponse;
import com.budgetprepay.webservice.pojos.plintron.SwapIMSIRequest;
import com.budgetprepay.webservice.pojos.plintron.SwapIMSIResponse;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNResponse;
import com.budgetprepay.webservice.util.CommonUtil;

@Endpoint
public class PlintronEndpoint extends BaseEndpoint {

	private static Logger logger = Logger.getLogger(PlintronEndpoint.class);
	
	public static final String NAMESPACE_URI = NAMESPACE_URI_PRE+ "/Plintron";
	
	private ObjectFactory objectFactory = new ObjectFactory();

	private static String TRANSACTION_ID_PREFIX = "MNP_";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendMessageRequest")
	@ResponsePayload
	public JAXBElement<SendMessageResponse> sendMessageRequest(@RequestPayload SendMessageRequest request) throws Exception {
		SendMessageResponse response = objectFactory.createSendMessageResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMessage() == null)
				throw new Exception("Message cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
				
			request.setDataCoding("1");
			request.setServiceType("RN");
			request.setSender("7025");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SEND_MESSAGE);
			
			response = PlintronFacade.sendMessage(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setError(e.getMessage());
			response.setCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<SendMessageResponse>(new QName(NAMESPACE_URI, SendMessageResponse.class.getSimpleName()), SendMessageResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendMessageBulkRequest")
	@ResponsePayload
	public JAXBElement<SendMessageBulkResponse> sendMessageBulkRequest(@RequestPayload SendMessageBulkRequest request) throws Exception {
		SendMessageBulkResponse response = objectFactory.createSendMessageBulkResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMdn().size() == 0)
				throw new Exception("MDN cannot be empty");
			
			for (String mdn : request.getMdn()) {
				if (mdn.length() < 10)
					throw new Exception("MDN: " + mdn + " must be atleast 10 numbers");
			}
			
			if (request.getMessage() == null)
				throw new Exception("Message cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);

			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SEND_BULK_MESSAGE);
			
			CommitScheduler.scheduleSendBulkMessageJob(req);
			
			response.setErrorCode("0");
			response.setErrorDescription("Send Bulk Message has been scheduled. Use transaction Id " + reference + " to check on status");
			response.setTransactionId(reference);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<SendMessageBulkResponse>(new QName(NAMESPACE_URI, SendMessageBulkResponse.class.getSimpleName()), SendMessageBulkResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CancelMessageBulkRequest")
	@ResponsePayload
	public JAXBElement<CancelMessageBulkResponse> cancelMessageBulkRequest(@RequestPayload CancelMessageBulkRequest request) throws Exception {
		CancelMessageBulkResponse response = objectFactory.createCancelMessageBulkResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
						
			reference = user.getGroup().getId() + CommonUtil.getRandom();

			if (request.getTransactionId() == null)
				throw new Exception("Transaction Id cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);

			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CANCEL_BULK_MESSAGE);
			
			CommitScheduler.stopJob(request.getTransactionId());
			CommitScheduler.unScheduleJob(request.getTransactionId());
			
			response.setResult("0");
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setResult("-1");
		}
		return new JAXBElement<CancelMessageBulkResponse>(new QName(NAMESPACE_URI, CancelMessageBulkResponse.class.getSimpleName()), CancelMessageBulkResponse.class, response);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StatusMessageBulkRequest")
	@ResponsePayload
	public JAXBElement<StatusMessageBulkResponse> statusMessageBulkRequest(@RequestPayload StatusMessageBulkRequest request) throws Exception {
		StatusMessageBulkResponse response = objectFactory.createStatusMessageBulkResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
						
			reference = user.getGroup().getId() + CommonUtil.getRandom();

			if (request.getTransactionId() == null)
				throw new Exception("Transaction Id cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);

			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CANCEL_BULK_MESSAGE);
			
			response.setResult(CommitScheduler.getJobStatus(request.getTransactionId()));
						
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setResult("-1");
		}
		return new JAXBElement<StatusMessageBulkResponse>(new QName(NAMESPACE_URI, StatusMessageBulkResponse.class.getSimpleName()), StatusMessageBulkResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReportMessageBulkRequest")
	@ResponsePayload
	public JAXBElement<ReportMessageBulkResponse> reportMessageBulkRequest(@RequestPayload ReportMessageBulkRequest request) throws Exception {
		ReportMessageBulkResponse response = objectFactory.createReportMessageBulkResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
						
			reference = user.getGroup().getId() + CommonUtil.getRandom();

			if (request.getTransactionId() == null)
				throw new Exception("Transaction Id cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);

			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_REPORT_BULK_MESSAGE);
			
			List<PlintronBulkMessageRequest> messages = PlintronBulkMessageRequestFacade.retrieveAllByReferenceNumber(request.getTransactionId());
			
			for (PlintronBulkMessageRequest message : messages) {	
				SmsMessageType sms = objectFactory.createSmsMessageType();
				sms.setId(message.getId().toString());
				sms.setUser(message.getUser().getUsername());
				sms.setReferenceNumber(message.getReferenceNumber());
				sms.setMdn(message.getMdn());
				sms.setStarted(message.getStarted().toString());
				sms.setEnded(message.getEnded().toString());
				sms.setRequest(message.getRequestXML());
				sms.setResponse(message.getResponseXML());
				response.getMessage().add(sms);
			}
			
			// Just too big to save
			//req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
		}
		return new JAXBElement<ReportMessageBulkResponse>(new QName(NAMESPACE_URI, ReportMessageBulkResponse.class.getSimpleName()), ReportMessageBulkResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInValidateRequest")
	@ResponsePayload
	public JAXBElement<PortInValidateResponse> portInValidateRequest(@RequestPayload PortInValidateRequest request) throws Exception {
		PortInValidateResponse response = objectFactory.createPortInValidateResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() != 10)
				throw new Exception("MDN must be 10 numbers");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_PORTIN_VALIDATE);
			
			response = PlintronFacade.portInValidate(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<PortInValidateResponse>(new QName(NAMESPACE_URI, PortInValidateResponse.class.getSimpleName()), PortInValidateResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInCreateRequest")
	@ResponsePayload
	public JAXBElement<PortInCreateResponse> portInCreateRequest(@RequestPayload PortInCreateRequest request) throws Exception {
		PortInCreateResponse response = objectFactory.createPortInCreateResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() != 10)
				throw new Exception("MDN must be 10 numbers");
			
			Request req = new Request();
			req.setUser(user);
		    req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_PORTIN_CREATE);
			
			response = PlintronFacade.portInCreate(req);
						
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getCause().getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<PortInCreateResponse>(new QName(NAMESPACE_URI, PortInCreateResponse.class.getSimpleName()), PortInCreateResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInUpdateRequest")
	@ResponsePayload
	public JAXBElement<PortInUpdateResponse> portInUpdateRequest(@RequestPayload PortInUpdateRequest request) throws Exception {
		PortInUpdateResponse response = objectFactory.createPortInUpdateResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();

			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() != 10)
				throw new Exception("MDN must be 10 numbers");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_PORTIN_UPDATE);
			
			response = PlintronFacade.portInUpdate(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getCause().getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<PortInUpdateResponse>(new QName(NAMESPACE_URI, PortInUpdateResponse.class.getSimpleName()), PortInUpdateResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInStatusRequest")
	@ResponsePayload
	public JAXBElement<PortInStatusResponse> portInStatusRequest(@RequestPayload PortInStatusRequest request) throws Exception {
		PortInStatusResponse response = objectFactory.createPortInStatusResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();

			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() != 10)
				throw new Exception("MDN must be 10 numbers");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_PORTIN_STATUS);
			
			response = PlintronFacade.portInStatus(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<PortInStatusResponse>(new QName(NAMESPACE_URI, PortInStatusResponse.class.getSimpleName()), PortInStatusResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PortInCancelRequest")
	@ResponsePayload
	public JAXBElement<PortInCancelResponse> portInCancelRequest(@RequestPayload PortInCancelRequest request) throws Exception {
		PortInCancelResponse response = objectFactory.createPortInCancelResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() != 10)
				throw new Exception("MDN must be 10 numbers");
			
			if (request.getSim() == null)
				throw new Exception("SIM cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_PORTIN_CANCEL);
			
			response = PlintronFacade.portInCancel(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<PortInCancelResponse>(new QName(NAMESPACE_URI, PortInCancelResponse.class.getSimpleName()), PortInCancelResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeVMPinRequest")
	@ResponsePayload
	public JAXBElement<ChangeVMPinResponse> changeVMPinRequest(@RequestPayload ChangeVMPinRequest request) throws Exception {
		ChangeVMPinResponse response = objectFactory.createChangeVMPinResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getOldPin() == null)
				throw new Exception("Old pin cannot be empty");
			
			if (request.getNewPin() == null)
				throw new Exception("New pin cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CHANGE_VM_PIN);
			
			response = PlintronFacade.changeVMPin(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setErrorCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ChangeVMPinResponse>(new QName(NAMESPACE_URI, ChangeVMPinResponse.class.getSimpleName()), ChangeVMPinResponse.class, response);
	}		
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ServiceActivateRequest")
	@ResponsePayload
	public JAXBElement<ServiceActivateResponse> serviceActivateRequest(@RequestPayload ServiceActivateRequest request) throws Exception {
		ServiceActivateResponse response = objectFactory.createServiceActivateResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getClientType() == null)
				throw new Exception("Client type cannot be empty");
			
			if (request.getServiceId() == null)
				throw new Exception("Service id cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SERVICE_ACTIVATE);
			
			response = PlintronFacade.serviceActivate(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ServiceActivateResponse>(new QName(NAMESPACE_URI, ServiceActivateResponse.class.getSimpleName()), ServiceActivateResponse.class, response);
	}		
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ServiceDeactivateRequest")
	@ResponsePayload
	public JAXBElement<ServiceDeactivateResponse> serviceDeactivateRequest(@RequestPayload ServiceDeactivateRequest request) throws Exception {
		ServiceDeactivateResponse response = objectFactory.createServiceDeactivateResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getClientType() == null)
				throw new Exception("Client type cannot be empty");
			
			if (request.getServiceId() == null)
				throw new Exception("Service id cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SERVICE_DEACTIVATE);
			
			response = PlintronFacade.serviceDeactivate(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ServiceDeactivateResponse>(new QName(NAMESPACE_URI, ServiceDeactivateResponse.class.getSimpleName()), ServiceDeactivateResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAccountDetailsRequest")
	@ResponsePayload
	public JAXBElement<GetAccountDetailsResponse> getAccountDetailsRequest(@RequestPayload GetAccountDetailsRequest request) throws Exception {
		GetAccountDetailsResponse response = objectFactory.createGetAccountDetailsResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_GET_ACCOUNT_DETAILS);
			
			response = PlintronFacade.getAccountDetails(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<GetAccountDetailsResponse>(new QName(NAMESPACE_URI, GetAccountDetailsResponse.class.getSimpleName()), GetAccountDetailsResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSubscriptionStatusRequest")
	@ResponsePayload
	public JAXBElement<GetSubscriptionStatusResponse> getSubscriptionStatusRequest(@RequestPayload GetSubscriptionStatusRequest request) throws Exception {
		GetSubscriptionStatusResponse response = objectFactory.createGetSubscriptionStatusResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_GET_SUBSCRIPTION_STATUS);
			
			response = PlintronFacade.getSubscriptionStatus(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<GetSubscriptionStatusResponse>(new QName(NAMESPACE_URI, GetSubscriptionStatusResponse.class.getSimpleName()), GetSubscriptionStatusResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetBundleSubscriptionRequest")
	@ResponsePayload
	public JAXBElement<GetBundleSubscriptionResponse> getBundleSubscriptionRequest(@RequestPayload GetBundleSubscriptionRequest request) throws Exception {
		GetBundleSubscriptionResponse response = objectFactory.createGetBundleSubscriptionResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getServiceCode() == null)
				throw new Exception("Service code cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_GET_BUNDLE_SUBSCRIPTION);
			
			response = PlintronFacade.getBundleSubscription(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<GetBundleSubscriptionResponse>(new QName(NAMESPACE_URI, GetBundleSubscriptionResponse.class.getSimpleName()), GetBundleSubscriptionResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RemoveSubscriberRequest")
	@ResponsePayload
	public JAXBElement<RemoveSubscriberResponse> removeSubscriberRequest(@RequestPayload RemoveSubscriberRequest request) throws Exception {
		RemoveSubscriberResponse response = objectFactory.createRemoveSubscriberResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_REMOVE_SUBSCRIBER);
			
			response = PlintronFacade.removeSubscriber(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<RemoveSubscriberResponse>(new QName(NAMESPACE_URI, RemoveSubscriberResponse.class.getSimpleName()), RemoveSubscriberResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AllocateMDNRequest")
	@ResponsePayload
	public JAXBElement<AllocateMDNResponse> allocateMDNRequest(@RequestPayload AllocateMDNRequest request) throws Exception {
		AllocateMDNResponse response = objectFactory.createAllocateMDNResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setMdn(request.getMDN());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_ALLOCATE_MDN);
			
			response = PlintronFacade.allocateMDN(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<AllocateMDNResponse>(new QName(NAMESPACE_URI, AllocateMDNResponse.class.getSimpleName()), AllocateMDNResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetSubscriberInfoRequest")
	@ResponsePayload
	public JAXBElement<GetSubscriberInfoResponse> getSubscriberInfoRequest(@RequestPayload GetSubscriberInfoRequest request) throws Exception {
		GetSubscriberInfoResponse response = objectFactory.createGetSubscriberInfoResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getQueryType() == null)
				throw new Exception("Query type cannot be empty");
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_GET_SUBSCRIBER_INFO);
			
			response = PlintronFacade.getSubscriberInfo(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setDescription(e.getMessage());
			response.setResult("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<GetSubscriberInfoResponse>(new QName(NAMESPACE_URI, GetSubscriberInfoResponse.class.getSimpleName()), GetSubscriberInfoResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModifySubscriberStatusRequest")
	@ResponsePayload
	public JAXBElement<ModifySubscriberStatusResponse> modifySubscriberStatusRequest(@RequestPayload ModifySubscriberStatusRequest request) throws Exception {
		ModifySubscriberStatusResponse response = objectFactory.createModifySubscriberStatusResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getStatus() == null)
				throw new Exception("Status type cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_GET_SUBSCRIBER_INFO);
			
			response = PlintronFacade.getModifySubscriberStatus(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ModifySubscriberStatusResponse>(new QName(NAMESPACE_URI, ModifySubscriberStatusResponse.class.getSimpleName()), ModifySubscriberStatusResponse.class, response);
	}	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangePlanRequest")
	@ResponsePayload
	public JAXBElement<ChangePlanResponse> changePlanRequest(@RequestPayload ChangePlanRequest request) throws Exception {
		ChangePlanResponse response = objectFactory.createChangePlanResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CHANGE_PLAN);
			
			response = PlintronFacade.changePlan(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ChangePlanResponse>(new QName(NAMESPACE_URI, ChangePlanResponse.class.getSimpleName()), ChangePlanResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "QuerySubscriberUsageRequest")
	@ResponsePayload
	public JAXBElement<QuerySubscriberUsageResponse> querySubscriberUsageRequest(@RequestPayload QuerySubscriberUsageRequest request) throws Exception {
		QuerySubscriberUsageResponse response = objectFactory.createQuerySubscriberUsageResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_QUERY_SUBSCRIBER_USAGE);
			
			response = PlintronFacade.querySubscriberUsage(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDesc(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<QuerySubscriberUsageResponse>(new QName(NAMESPACE_URI, QuerySubscriberUsageResponse.class.getSimpleName()), QuerySubscriberUsageResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReactivateSubscriberRequest")
	@ResponsePayload
	public JAXBElement<ReactivateSubscriberResponse> reactivateSubscriberRequest(@RequestPayload ReactivateSubscriberRequest request) throws Exception {
		ReactivateSubscriberResponse response = objectFactory.createReactivateSubscriberResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			reference = CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_REACTIVATE_SUBSCRIBER);
			
			response = PlintronFacade.reactivateSubscriber(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDesc(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ReactivateSubscriberResponse>(new QName(NAMESPACE_URI, ReactivateSubscriberResponse.class.getSimpleName()), ReactivateSubscriberResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ReplaceMSISDNRequest")
	@ResponsePayload
	public JAXBElement<ReplaceMSISDNResponse> replaceMSISDNRequest(@RequestPayload ReplaceMSISDNRequest request) throws Exception {
		ReplaceMSISDNResponse response = objectFactory.createReplaceMSISDNResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null && request.getIccid() == null)
				throw new Exception("Both IMSI & ICCID cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getZipCode() == null)
				throw new Exception("Zip code cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_REPLACE_MSISDN);
			
			response = PlintronFacade.replaceMSISDN(req);
			
			req.setMdn(response.getMsisdn());
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDesc(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ReplaceMSISDNResponse>(new QName(NAMESPACE_URI, ReplaceMSISDNResponse.class.getSimpleName()), ReplaceMSISDNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeMSISDNRequest")
	@ResponsePayload
	public JAXBElement<ChangeMSISDNResponse> changeMSISDNRequest(@RequestPayload ChangeMSISDNRequest request) throws Exception {
		ChangeMSISDNResponse response = objectFactory.createChangeMSISDNResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getNewMDN() == null)
				throw new Exception("New MDN cannot be empty");
			
			if (request.getNewMDN().length() < 10)
				throw new Exception("New MDN must be atleast 10 numbers");
			
			if (request.getPortInFlag() == null)
				throw new Exception("Port in flag cannot be empty");
			
			if (request.getNewMDN().startsWith("1") == false)
				request.setNewMDN("1" + request.getNewMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CHANGE_MSISDN);
			
			response = PlintronFacade.changeMSISDN(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDesc(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ChangeMSISDNResponse>(new QName(NAMESPACE_URI, ChangeMSISDNResponse.class.getSimpleName()), ChangeMSISDNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "BlockUnblockSIMRequest")
	@ResponsePayload
	public JAXBElement<BlockUnblockSIMResponse> blockUnblockSIMRequest(@RequestPayload BlockUnblockSIMRequest request) throws Exception {
		BlockUnblockSIMResponse response = objectFactory.createBlockUnblockSIMResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getOperationCode() == null)
				throw new Exception("Operation code cannot be empty");
			
			if (request.getSetFlag() == null)
				throw new Exception("Set flag cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_BLOCK_UNBLOCK_SIM);
			
			response = PlintronFacade.blockUnblockSIM(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDescription(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<BlockUnblockSIMResponse>(new QName(NAMESPACE_URI, BlockUnblockSIMResponse.class.getSimpleName()), BlockUnblockSIMResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModifyingSubscriberLanguageTypeRequest")
	@ResponsePayload
	public JAXBElement<ModifyingSubscriberLanguageTypeResponse> modifyingSubscriberLanguageTypeRequest(@RequestPayload ModifyingSubscriberLanguageTypeRequest request) throws Exception {
		ModifyingSubscriberLanguageTypeResponse response = objectFactory.createModifyingSubscriberLanguageTypeResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getLanguageType() == null)
				throw new Exception("Lanaguage type cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_MODIFY_LANGUAGE);
			
			response = PlintronFacade.modifyingSubscriberLanguageType(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setResultCode("-1");
			response.setErrorDescription(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ModifyingSubscriberLanguageTypeResponse>(new QName(NAMESPACE_URI, ModifyingSubscriberLanguageTypeResponse.class.getSimpleName()), ModifyingSubscriberLanguageTypeResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SwapMSISDNRequest")
	@ResponsePayload
	public JAXBElement<SwapMSISDNResponse> swapMSISDNRequest(@RequestPayload SwapMSISDNRequest request) throws Exception {
		SwapMSISDNResponse response = objectFactory.createSwapMSISDNResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getImsi() == null && request.getIccid() == null)
				throw new Exception("Either Imsi or Iccid is Mandatory");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SWAP_MSISDN);
			
			response = PlintronFacade.swapMSISDN(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setResultCode("-1");
			response.setErrorDescription(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<SwapMSISDNResponse>(new QName(NAMESPACE_URI, SwapMSISDNResponse.class.getSimpleName()), SwapMSISDNResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SwapIMSIRequest")
	@ResponsePayload
	public JAXBElement<SwapIMSIResponse> swapIMSIRequest(@RequestPayload SwapIMSIRequest request) throws Exception {
		SwapIMSIResponse response = objectFactory.createSwapIMSIResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getImsi() == null && request.getIccid() == null)
				throw new Exception("Either Imsi or Iccid is Mandatory");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_SWAP_IMSI);
			
			response = PlintronFacade.swapIMSI(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setResultCode("-1");
			response.setErrorDescription(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<SwapIMSIResponse>(new QName(NAMESPACE_URI, SwapIMSIResponse.class.getSimpleName()), SwapIMSIResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ChangeIMSIRequest")
	@ResponsePayload
	public JAXBElement<ChangeIMSIResponse> changeIMSIRequest(@RequestPayload ChangeIMSIRequest request) throws Exception {
		ChangeIMSIResponse response = objectFactory.createChangeIMSIResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getMDN() == null)
				throw new Exception("MDN cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getNewIMSI() == null)
				throw new Exception("New IMSO cannot be empty");
			
			if (request.getOldIMSI() == null)
				throw new Exception("Old IMSI cannot be empty");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_CHANGE_IMSI);
			
			response = PlintronFacade.changeIMSI(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setErrorCode("-1");
			response.setErrorDesc(e.getMessage());
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ChangeIMSIResponse>(new QName(NAMESPACE_URI, ChangeIMSIResponse.class.getSimpleName()), ChangeIMSIResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddSOCRequest")
	@ResponsePayload
	public JAXBElement<AddSOCResponse> addSOCRequest(@RequestPayload AddSOCRequest request) throws Exception {
		AddSOCResponse response = objectFactory.createAddSOCResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_ADD_SOC);
			
			response = PlintronFacade.addSOC(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setReturnDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<AddSOCResponse>(new QName(NAMESPACE_URI, AddSOCResponse.class.getSimpleName()), AddSOCResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "RemoveSOCRequest")
	@ResponsePayload
	public JAXBElement<RemoveSOCResponse> removeSOCRequest(@RequestPayload RemoveSOCRequest request) throws Exception {
		RemoveSOCResponse response = objectFactory.createRemoveSOCResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_REMOVE_SOC);
			
			response = PlintronFacade.removeSOC(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setReturnDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<RemoveSOCResponse>(new QName(NAMESPACE_URI, RemoveSOCResponse.class.getSimpleName()), RemoveSOCResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModifySubscriberBucketRequest")
	@ResponsePayload
	public JAXBElement<ModifySubscriberBucketResponse> modifySubscriberBucketRequest(@RequestPayload ModifySubscriberBucketRequest request) throws Exception {
		ModifySubscriberBucketResponse response = objectFactory.createModifySubscriberBucketResponse();
		String reference = null;
		
		try {			
			User user = CommonUtil.retrieveByUsername(request.getMessageHeader().getUsername());

			reference = TRANSACTION_ID_PREFIX + user.getGroup().getId() + CommonUtil.getRandom();
			
			if (request.getImsi() == null)
				throw new Exception("IMSI cannot be empty");
			
			if (request.getMDN() == null)
				throw new Exception("MDN type cannot be empty");
			
			if (request.getMDN().length() < 10)
				throw new Exception("MDN must be atleast 10 numbers");
			
			if (request.getMDN().startsWith("1") == false)
				request.setMDN("1" + request.getMDN());
			
			Request req = new Request();
			req.setUser(user);
			req.setClientReference(reference);
			req.setReferenceNumber(reference);
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(CommonUtil.JAXB2XML(request, NAMESPACE_URI));
			req.setType(Request.RequestType.PLINTRON_MODIFY_SUBSCRIBER_BUCKET);
			
			response = PlintronFacade.modifySubscriberBucket(req);
			
			req.setClientSynchronousResponseXML(CommonUtil.JAXB2XML(response, null));
			
			RequestFacade.create(req);
			
			logRequest(req);
		}
		catch (Exception e) {
			logger.error(e);
			response.setReturnDescription(e.getMessage());
			response.setReturnCode("-1");
			if (reference != null)
			    response.setTransactionId(reference);
		}
		return new JAXBElement<ModifySubscriberBucketResponse>(new QName(NAMESPACE_URI, ModifySubscriberBucketResponse.class.getSimpleName()), ModifySubscriberBucketResponse.class, response);
	}
}

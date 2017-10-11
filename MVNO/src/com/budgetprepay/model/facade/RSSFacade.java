package com.budgetprepay.model.facade;

import org.apache.xmlbeans.XmlObject;

import com.budgetprepay.model.entity.ErrorRequest;
import com.budgetprepay.model.entity.ErrorResponse;
import com.budgetprepay.model.entity.Request;
import com.verizonwireless.oas.AuthorizationStatusType;
import com.verizonwireless.oas.CityType;
import com.verizonwireless.oas.EsnWithOldEsnMeidType;
import com.verizonwireless.oas.HotCutType;
import com.verizonwireless.oas.LnpAddressType;
import com.verizonwireless.oas.LnpNameType;
import com.verizonwireless.oas.LnpPersonNameType;
import com.verizonwireless.oas.LnpType;
import com.verizonwireless.oas.MdnType;
import com.verizonwireless.oas.MeidWithOldEsnMeidType;
import com.verizonwireless.oas.NextAvailablewithOldMDNType;
import com.verizonwireless.oas.NpaNxxType;
import com.verizonwireless.oas.OasOrderResponseDocument;
import com.verizonwireless.oas.OrderInquiryDocument;
import com.verizonwireless.oas.OrderInquiryDocument.OrderInquiry;
import com.verizonwireless.oas.CountryType;
import com.verizonwireless.oas.DrvLicenseStateType;
import com.verizonwireless.oas.MdnWithOldMdnType;
import com.verizonwireless.oas.PhoneType;
import com.verizonwireless.oas.PlanType;
import com.verizonwireless.oas.RatePlanType;
import com.verizonwireless.oas.ResellerAddHotlineSubscriberType;
import com.verizonwireless.oas.ResellerAddSubscriberPortInType;
import com.verizonwireless.oas.ResellerAddSubscriberType;
import com.verizonwireless.oas.ResellerAsyncResponseDocument;
import com.verizonwireless.oas.ResellerAsyncResponseType;
import com.verizonwireless.oas.ResellerChangeESNType;
import com.verizonwireless.oas.ResellerChangeNumberType;
import com.verizonwireless.oas.ResellerChangeRatePlanType;
import com.verizonwireless.oas.ResellerChangeSIMType;
import com.verizonwireless.oas.ResellerDeleteSubscriberType;
import com.verizonwireless.oas.ResellerDeviceInquiryType;
import com.verizonwireless.oas.ResellerDeviceNotificationDocument;
import com.verizonwireless.oas.ResellerDeviceResponseType;
import com.verizonwireless.oas.ResellerHBQualInfoResponseDocument;
import com.verizonwireless.oas.ResellerHotlineSubscriberType;
import com.verizonwireless.oas.ResellerLineInquiryType;
import com.verizonwireless.oas.ResellerLineResponseDocument;
import com.verizonwireless.oas.ResellerLineResponseType;
import com.verizonwireless.oas.ResellerOrderDocument;
import com.verizonwireless.oas.ResellerOrderResponseDocument;
import com.verizonwireless.oas.ResellerOrderType;
import com.verizonwireless.oas.ResellerPRLInquiryType;
import com.verizonwireless.oas.ResellerPRLResponseDocument;
import com.verizonwireless.oas.ResellerPRLResponseType;
import com.verizonwireless.oas.ResellerReconnectType;
import com.verizonwireless.oas.ResellerRemoveHotlineType;
import com.verizonwireless.oas.ResellerReserveResponseDocument;
import com.verizonwireless.oas.ResellerResetFeatureType;
import com.verizonwireless.oas.ResellerRestoreSubscriberType;
import com.verizonwireless.oas.ResellerSubOrderType;
import com.verizonwireless.oas.ResellerSubscribeFeatureType;
import com.verizonwireless.oas.ResellerSuspendSubscriberType;
import com.verizonwireless.oas.ResellerValidateMDNPortabilityType;
import com.verizonwireless.oas.SIMCardWithOldSIMCardType;
import com.verizonwireless.oas.SsnOrTaxIdType;
import com.verizonwireless.oas.StateType;
import com.verizonwireless.oas.ValidateDeviceResponseDocument;
import com.verizonwireless.oas.ValidateDeviceType;
import com.verizonwireless.oas.ZipCodeType;
import com.verizonwireless.oas.ResellerOrderDocument.ResellerOrder;
import com.verizonwireless.oas.StreetNameType;
import com.budgetprepay.util.EmailUtil;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerPortInInquiryType;
import com.budgetprepay.webservice.pojos.verizon.AddDeleteType;
import com.budgetprepay.webservice.pojos.verizon.AddHotlineRequest;
import com.budgetprepay.webservice.pojos.verizon.AddHotlineSubscriberRequest;
import com.budgetprepay.webservice.pojos.verizon.ChangeESNRequest;
import com.budgetprepay.webservice.pojos.verizon.ChangeFeaturesRequest;
import com.budgetprepay.webservice.pojos.verizon.ChangeMobileNumberRequest;
import com.budgetprepay.webservice.pojos.verizon.ChangeRatePlanRequest;
import com.budgetprepay.webservice.pojos.verizon.ChangeSIMRequest;
import com.budgetprepay.webservice.pojos.verizon.DeleteSubscriberRequest;
import com.budgetprepay.webservice.pojos.verizon.DeviceActivationPortInRequest;
import com.budgetprepay.webservice.pojos.verizon.DeviceActivationRequest;
import com.budgetprepay.webservice.pojos.verizon.DeviceAsyncResponse;
import com.budgetprepay.webservice.pojos.verizon.DeviceInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.FeatureType;
import com.budgetprepay.webservice.pojos.verizon.LineAsyncResponse;
import com.budgetprepay.webservice.pojos.verizon.LineInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.ObjectFactory;
import com.budgetprepay.webservice.pojos.verizon.OrderAsyncResponse;
import com.budgetprepay.webservice.pojos.verizon.PortInInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.PrlAsyncResponse;
import com.budgetprepay.webservice.pojos.verizon.PrlInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.ReconnectMDNRequest;
import com.budgetprepay.webservice.pojos.verizon.RemoveHotlineRequest;
import com.budgetprepay.webservice.pojos.verizon.ResetFeatureRequest;
import com.budgetprepay.webservice.pojos.verizon.RestoreSuspendedSubscriberRequest;
import com.budgetprepay.webservice.pojos.verizon.SuspendSubscriberRequest;
import com.budgetprepay.webservice.pojos.verizon.ValidateDeviceRequest;
import com.budgetprepay.webservice.util.CommonUtil;
import com.budgetprepay.webservice.util.VerizonUtil;
import com.budgetprepay.webservice.util.ReturnMessage;

public class RSSFacade {

	private static boolean send(Request request, final XmlObject document) throws Exception {
		try {
			String verizonRequestXML = VerizonUtil.pojo2XML(document);
			verizonRequestXML = VerizonUtil.fixRootAttributes(verizonRequestXML);	
		    request.setVerizonSynchronousRequestXML(verizonRequestXML);
		    VerizonUtil util = new VerizonUtil();
		    ReturnMessage returnMessage = util.postXml(verizonRequestXML, ResourceUtil.get("verizon.rss.endpoint.url"));
		    request.setVerizonSynchronousResponseXML(returnMessage.getText());
		    return true;
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}

	private static boolean sendJABX(Request request, final Object document) throws Exception {
		try {
			String verizonRequestXML = VerizonUtil.JAXB2XML(document);
			verizonRequestXML = VerizonUtil.fixRootAttributes(verizonRequestXML.replaceAll("ns2:ResellerOrder", "resellerOrder"));	
		    request.setVerizonSynchronousRequestXML(verizonRequestXML);
		    VerizonUtil util = new VerizonUtil();
		    ReturnMessage returnMessage = util.postXml(verizonRequestXML, ResourceUtil.get("verizon.rss.endpoint.url"));
		    request.setVerizonSynchronousResponseXML(returnMessage.getText());
		    return true;
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static void responseHandler(final XmlObject response) throws Exception {
		ReturnMessage returnMessage = null;
		XmlObject error = null;
		ObjectFactory objectFactory = new ObjectFactory();
		try {
			switch (response.getClass().getCanonicalName()) {			
			case "com.verizonwireless.oas.impl.ResellerAsyncResponseDocumentImpl":
				ResellerAsyncResponseDocument resellerAsyncResponseDocument = (ResellerAsyncResponseDocument) response;
				error = resellerAsyncResponseDocument;
				String verizonAsynchronousResponse = resellerAsyncResponseDocument.xmlText();
				
				String referenceNumber = resellerAsyncResponseDocument.getResellerAsyncResponse().getMessageHeader().getReferenceNumber().getStringValue();
				Request request = RequestFacade.retrieveByReferenceNumber(referenceNumber);
				if (request == null) {
					ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(error.xmlText()));
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));
				}
				
				request.setVerizonAsynchronousResponseXML(verizonAsynchronousResponse);
				RequestFacade.update(request);
				
				if (resellerAsyncResponseDocument.getResellerAsyncResponse().getDeviceResponse() != null) {
					DeviceAsyncResponse postBackResponse = objectFactory.createDeviceAsyncResponse();
					postBackResponse.setMessageHeader(objectFactory.createMessageHeaderType());
					postBackResponse.setReturnMessage(objectFactory.createReturnMessageType());
					postBackResponse.getMessageHeader().setAnsynchronousReturnUrl(request.getClientAsynchronousResponseXML());
					postBackResponse.getMessageHeader().setReferenceNumber(request.getClientReference());
					postBackResponse.getMessageHeader().setUserId(request.getUser().getUsername());
					ResellerDeviceResponseType type = resellerAsyncResponseDocument.getResellerAsyncResponse().getDeviceResponse();
					if (type.getDeviceId() != null)
						postBackResponse.setDeviceId(type.getDeviceId());
					if (type.getEquipment() != null) {
					    postBackResponse.setEquipment(objectFactory.createEquipmentType());
					    if (type.getEquipment().getMake() != null)
					        postBackResponse.getEquipment().setMake(type.getEquipment().getMake().getStringValue());
					    if (type.getEquipment().getModel() != null)
					    	postBackResponse.getEquipment().setModel(type.getEquipment().getModel().getStringValue());
					    if (type.getEquipment().getMode() != null)
					    	postBackResponse.getEquipment().setMode(type.getEquipment().getMode().getStringValue());
					}
					if (type.getFeatureArray() != null) {
					    for (int i=0; i<type.getFeatureArray().length; i++) {
							FeatureType ft = objectFactory.createFeatureType();
							ft.setFeatureCode(type.getFeatureArray()[i].getFeatureCode().getStringValue());
							if (type.getFeatureArray()[i].getSubscribe().getStringValue().equals("A"))
								ft.setSubscribe(AddDeleteType.A);
							else
								ft.setSubscribe(AddDeleteType.D);
							postBackResponse.getFeature().add(ft);
						}
					}
					if (type.getIccid() != null) 
					    postBackResponse.setIccid(type.getIccid());
					if (type.getIec() != null)
					    postBackResponse.setIec(type.getIec().getStringValue());
					if (type.getInitialServiceDate() != null)
					    postBackResponse.getInitialServiceDate();
					if (type.getMdn() != null)
					    postBackResponse.setMdn(type.getMdn().getStringValue());
				    if (type.getEsn() != null)
				    	postBackResponse.setEsn(type.getEsn());
					if (type.getMeid() != null)
					    postBackResponse.setMeid(type.getMeid());
					if (type.getMin() != null) 
					    postBackResponse.setMin(type.getMin());
					if (type.getMobileIPAddress() != null)
					    postBackResponse.setMobileIPAddress(type.getMobileIPAddress().getStringValue());
					if (type.getReturnCode() != null)
					    postBackResponse.getReturnMessage().setReturnCode(type.getReturnCode());
					if (type.getReturnMessage() != null)
					    postBackResponse.getReturnMessage().setReturnText(type.getReturnMessage());
					if (type.getStatusCode() != null)
					    postBackResponse.setStatusCode(type.getStatusCode().getStringValue());
					
					String postBackResponseXML = VerizonUtil.JAXB2XML(postBackResponse);
					request.setClientAsynchronousResponseXML(postBackResponseXML);
					RequestFacade.update(request);
					try {
					    returnMessage = postBackXml(request, postBackResponseXML, request.getClientAsynchronousReturnUrl());
					    request.setClientAsynchronousReturnHttpCode(returnMessage.getCode());
					    RequestFacade.update(request);
					} 
					catch (Exception e) {
						;
					}
				}
				else if (resellerAsyncResponseDocument.getResellerAsyncResponse().getOrderProgrammingResponse() != null) {

				} 
				else if (resellerAsyncResponseDocument.getResellerAsyncResponse().getOrderResponse() != null) {
					OrderAsyncResponse postBackResponse = objectFactory.createOrderAsyncResponse();
					postBackResponse.setMessageHeader(objectFactory.createMessageHeaderType());
					postBackResponse.getMessageHeader().setAnsynchronousReturnUrl(request.getClientAsynchronousResponseXML());
					postBackResponse.getMessageHeader().setReferenceNumber(request.getClientReference());
					postBackResponse.getMessageHeader().setUserId(request.getUser().getUsername());
					ResellerAsyncResponseType type = resellerAsyncResponseDocument.getResellerAsyncResponse().getOrderResponse();
					if (type.getErrorCode() != null) 
						postBackResponse.setErrorCode(type.getErrorCode());
					if (type.getErrorMessage() != null)
						postBackResponse.setErrorMessage(type.getErrorMessage());
					if (type.getErrorDescriptionArray() != null) {
						for (int i=0; i<type.getErrorDescriptionArray().length;i++)
							postBackResponse.getErrorDecription().add(type.getErrorDescriptionArray()[i]);
					}
					if (type.getIccid() != null)
						postBackResponse.setIccid(type.getIccid());
					if (type.getMdn() != null)
						postBackResponse.setMdn(type.getMdn());
					if (type.getMin() != null)
						postBackResponse.setMin(type.getMin());
					if (type.getMobileIPAddress() != null)
						postBackResponse.setMobileIPAddress(type.getMobileIPAddress().getStringValue());
					if (type.getStatusCode() != null)
						postBackResponse.setStatus(type.getStatusCode());
					
					String postBackResponseXML = VerizonUtil.JAXB2XML(postBackResponse);
					request.setClientAsynchronousResponseXML(postBackResponseXML);
					RequestFacade.update(request);
					try {
					    returnMessage = postBackXml(request, postBackResponseXML, request.getClientAsynchronousReturnUrl());
					    request.setClientAsynchronousReturnHttpCode(returnMessage.getCode());
					    RequestFacade.update(request);
					} 
					catch (Exception e) {
						;
					}
				}
				else {
					ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(verizonAsynchronousResponse));
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));
				}
				break;
			case "com.verizonwireless.oas.impl.ResellerDeviceNotificationDocumentImpl":
				ResellerDeviceNotificationDocument resellerDeviceNotificationDocument = (ResellerDeviceNotificationDocument) response;
				error = resellerDeviceNotificationDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			case "com.verizonwireless.oas.impl.ResellerHBQualInfoResponseDocumentImpl":
				ResellerHBQualInfoResponseDocument resellerHBQualInfoResponseDocument = (ResellerHBQualInfoResponseDocument) response;
				error = resellerHBQualInfoResponseDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			case "com.verizonwireless.oas.impl.ResellerLineResponseDocumentImpl":
				ResellerLineResponseDocument resellerLineResponseDocument = (ResellerLineResponseDocument) response;
				error = resellerLineResponseDocument;
				verizonAsynchronousResponse = resellerLineResponseDocument.xmlText();
				
				referenceNumber = resellerLineResponseDocument.getResellerLineResponse().getMessageHeader().getReferenceNumber().getStringValue();
				request = RequestFacade.retrieveByReferenceNumber(referenceNumber);
				if (request == null)
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
				
				request.setVerizonAsynchronousResponseXML(verizonAsynchronousResponse);
				if (resellerLineResponseDocument.getResellerLineResponse().getLineResponse() != null) {
					LineAsyncResponse postBackResponse = objectFactory.createLineAsyncResponse();
					postBackResponse.setMessageHeader(objectFactory.createMessageHeaderType());
					postBackResponse.setReturnMessage(objectFactory.createReturnMessageType());
					postBackResponse.getMessageHeader().setAnsynchronousReturnUrl(request.getClientAsynchronousResponseXML());
					postBackResponse.getMessageHeader().setReferenceNumber(request.getClientReference());
					postBackResponse.getMessageHeader().setUserId(request.getUser().getUsername());
					ResellerLineResponseType type = resellerLineResponseDocument.getResellerLineResponse().getLineResponse();
					
					if (type.getErrorCode() != null) 
						postBackResponse.getReturnMessage().setReturnCode(type.getErrorCode());
					if (type.getErrorMessage() != null)
						postBackResponse.getReturnMessage().setReturnText(type.getErrorMessage());
					if (type.getMin() != null)
						postBackResponse.setMin(type.getMin());
					if (type.getMdn() != null)
						postBackResponse.setMdn(type.getMdn().getStringValue());
				    if (type.getEsn() != null)
				    	postBackResponse.setEsn(type.getEsn());
				    if (type.getMeid() != null)
				    	postBackResponse.setMeid(type.getMeid());
					if (type.getMobileIPAddress() != null)
						postBackResponse.setMobileIPAddress(type.getMobileIPAddress().getStringValue());
					if (type.getStatusCode() != null)
						postBackResponse.setStatusCode(type.getStatusCode().getStringValue());
					if (type.getFeatureArray() != null) {
						for (int i=0; i<type.getFeatureArray().length; i++) {
							FeatureType ft = objectFactory.createFeatureType();
							ft.setFeatureCode(type.getFeatureArray()[i].getFeatureCode().getStringValue());
							if (type.getFeatureArray()[i].getSubscribe().getStringValue().equals("A"))
								ft.setSubscribe(AddDeleteType.A);
							else
								ft.setSubscribe(AddDeleteType.D);
							postBackResponse.getFeature().add(ft);
						}
				    }
					if (type.getEquipment() != null) {
					    postBackResponse.setEquipment(objectFactory.createEquipmentType());
					    if (type.getEquipment().getMake() != null)
					        postBackResponse.getEquipment().setMake(type.getEquipment().getMake().getStringValue());
					    if (type.getEquipment().getModel() != null)
					    	postBackResponse.getEquipment().setModel(type.getEquipment().getModel().getStringValue());
					    if (type.getEquipment().getMode() != null)
					    	postBackResponse.getEquipment().setMode(type.getEquipment().getMode().getStringValue());
					}
					if (type.getInitialServiceDate() != null)
						postBackResponse.setInitialServiceDate(type.getInitialServiceDate().getStringValue());
					
					String postBackResponseXML = VerizonUtil.JAXB2XML(postBackResponse);
					request.setClientAsynchronousResponseXML(postBackResponseXML);
					RequestFacade.update(request);
					try {
					    returnMessage = postBackXml(request, postBackResponseXML, request.getClientAsynchronousReturnUrl());
					    request.setClientAsynchronousReturnHttpCode(returnMessage.getCode());
					    RequestFacade.update(request);
					} 
					catch (Exception e) {
						;
					}
				}
				else {
					ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(verizonAsynchronousResponse));
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(errorResponse.getId()));
				}
				break;
			case "com.verizonwireless.oas.impl.ResellerOrderResponseDocumentImpl ":
				ResellerOrderResponseDocument resellerOrderResponseDocument = (ResellerOrderResponseDocument) response;
				error = resellerOrderResponseDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			case "com.verizonwireless.oas.impl.ResellerPRLResponseDocumentImpl":
				ResellerPRLResponseDocument resellerPRLResponseDocument = (ResellerPRLResponseDocument) response;
				error = resellerPRLResponseDocument;
				verizonAsynchronousResponse = resellerPRLResponseDocument.xmlText();
				
				referenceNumber = resellerPRLResponseDocument.getResellerPRLResponse().getMessageHeader().getReferenceNumber().getStringValue();
				request = RequestFacade.retrieveByReferenceNumber(referenceNumber);
				if (request == null)
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
				
				request.setVerizonAsynchronousResponseXML(verizonAsynchronousResponse);
	
				if (resellerPRLResponseDocument.getResellerPRLResponse().getPrlResponse() != null) {
					PrlAsyncResponse postBackResponse = objectFactory.createPrlAsyncResponse();
					postBackResponse.setMessageHeader(objectFactory.createMessageHeaderType());
					postBackResponse.setReturnMessage(objectFactory.createReturnMessageType());
					postBackResponse.getMessageHeader().setAnsynchronousReturnUrl(request.getClientAsynchronousResponseXML());
					postBackResponse.getMessageHeader().setReferenceNumber(request.getClientReference());
					postBackResponse.getMessageHeader().setUserId(request.getUser().getUsername());
					ResellerPRLResponseType type = resellerPRLResponseDocument.getResellerPRLResponse().getPrlResponse();
					
					if (type.getErrorCode() != null) 
						postBackResponse.getReturnMessage().setReturnCode(type.getErrorCode());
					if (type.getErrorMessage() != null)
						postBackResponse.getReturnMessage().setReturnText(type.getErrorMessage());
					if (type.getMin() != null)
						postBackResponse.setMin(type.getMin());
					if (type.getMdn() != null)
						postBackResponse.setMdn(type.getMdn().getStringValue());
				    if (type.getEsn() != null)
				    	postBackResponse.setEsn(type.getEsn());
				    if (type.getMeid() != null)
				    	postBackResponse.setMeid(type.getMeid());
					if (type.getPLMNNumber() != null)
						postBackResponse.setPrlNumber(type.getPLMNNumber());
					if (type.getPLMNDownloadDate() != null) 
						postBackResponse.setDownloadDate(type.getPLMNDownloadDate());
					
					String postBackResponseXML = VerizonUtil.JAXB2XML(postBackResponse);
					request.setClientAsynchronousResponseXML(postBackResponseXML);
					RequestFacade.update(request);
					try {
					    returnMessage = postBackXml(request, postBackResponseXML, request.getClientAsynchronousReturnUrl());
					    request.setClientAsynchronousReturnHttpCode(returnMessage.getCode());
					    RequestFacade.update(request);
					} 
					catch (Exception e) {
						;
					}
				}
				else
					throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(verizonAsynchronousResponse)).getId()));
				break;
			case "com.verizonwireless.oas.impl.ResellerReserveResponseDocumentImpl":
				ResellerReserveResponseDocument resellerReserveResponseDocument = (ResellerReserveResponseDocument) response;
				error = resellerReserveResponseDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			case "com.verizonwireless.oas.impl.ValidateDeviceResponseDocumentImpl":
				ValidateDeviceResponseDocument validateDeviceResponseDocument = (ValidateDeviceResponseDocument) response;
				error = validateDeviceResponseDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			case "com.verizonwireless.oas.impl.OasOrderResponseDocumentImpl":
				OasOrderResponseDocument oasOrderResponseDocument = (OasOrderResponseDocument) response;
				error = oasOrderResponseDocument;
				throw new Exception("ERROR: " + CommonUtil.getErrorResponseURL(ErrorResponseFacade.create(new ErrorResponse(error.xmlText())).getId()));
			default:
				break;
			}
		}
		catch (Exception e) {
			ErrorResponse errorResponse = ErrorResponseFacade.create(new ErrorResponse(error.xmlText()));
			throw new Exception("Unable to handle response (errorResponseId=" + errorResponse.getId() + ")", e);
		}
	}
	
	public static ReturnMessage postBackXml(final Request request, final String xml, final String urlString) throws Exception {
		try {
			VerizonUtil util = new VerizonUtil();
			Boolean success = Boolean.FALSE;
			ReturnMessage returnMessage = new ReturnMessage();
			for (int i = 0; i < 3; i++) {
				returnMessage = util.postXml(xml, urlString);
				if (returnMessage.getCode() == 200) {
					success = Boolean.TRUE;
					break;
				}
			}
			if (success == Boolean.FALSE && request.getUser().getEmail() != null) {
				EmailUtil email = new EmailUtil();
				email.setSubject("BudgetPrepay MVNO " + returnMessage.getCode() + "-" + returnMessage.getText());
				email.sendXML(request.getUser().getEmail(), xml);
			}
			return returnMessage;
		}
		catch (Exception e) {
			throw new Exception("Unable to post response back to client", e);
		}
	}
	
	public static boolean deviceInquiry(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		try {
    	    DeviceInquiryRequest req = (DeviceInquiryRequest) VerizonUtil.XML2JAXB(DeviceInquiryRequest.class, request.getClientRequestXML());
    	    
    		ResellerDeviceInquiryType resellerDeviceInquiry = ResellerDeviceInquiryType.Factory.newInstance();
            if (req.getMeid() != null)
    		    resellerDeviceInquiry.setMeid(req.getMeid());
            if (req.getEsn() != null)
                resellerDeviceInquiry.setEsn(req.getEsn());

		    ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		    resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
				                                                        request.getUser().getGroup().getName(), 
				                                                        VerizonUtil.RequestType.ORDER, 
				                                                        VerizonUtil.OrderType.MNTMLND));
		
		    ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		    resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		    resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));
		
		    ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();
		
		    resellerSubOrder.setResellerDeviceInquiry(resellerDeviceInquiry);
		
		    resellerOrderType.setSubOrder(resellerSubOrder);
		
		    resellerOrder.setOrder(resellerOrderType);
		
		    ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		    document.setResellerOrder(resellerOrder);
		
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean lineInquiry(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		try {
    	    LineInquiryRequest req = (LineInquiryRequest) VerizonUtil.XML2JAXB(LineInquiryRequest.class, request.getClientRequestXML());

    		ResellerLineInquiryType resellerLineInquiry = ResellerLineInquiryType.Factory.newInstance();
            if (req.getMdn() != null) {
            	MdnType mdn = MdnType.Factory.newInstance();
            	mdn.setStringValue(req.getMdn());
    		    resellerLineInquiry.setMdn(mdn);
    		    request.setMdn(req.getMdn());
            }
            if (req.getMin() != null)
    		    resellerLineInquiry.setMin(req.getMin());;
          
		    ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		    resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
				                                                        request.getUser().getGroup().getName(), 
				                                                        VerizonUtil.RequestType.INQUIRE, 
				                                                        VerizonUtil.OrderType.INQSLND));
		
		    ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		    resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		
		    ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();
		
		    resellerSubOrder.setResellerLineInquiry(resellerLineInquiry);
		
		    resellerOrderType.setSubOrder(resellerSubOrder);
		
		    resellerOrder.setOrder(resellerOrderType);
		
		    ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		    document.setResellerOrder(resellerOrder);
		
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean portInInquiry(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		try {
    	    PortInInquiryRequest req = (PortInInquiryRequest) VerizonUtil.XML2JAXB(PortInInquiryRequest.class, request.getClientRequestXML());
    	    
    		ResellerPortInInquiryType resellerPortInInquiry = new ResellerPortInInquiryType();
            if (req.getMdn() != null) {
            	com.budgetprepay.webservice.client.verizon.rss.pojo.MdnType mdn = new com.budgetprepay.webservice.client.verizon.rss.pojo.MdnType();
            	mdn.setValue(req.getMdn());
            	resellerPortInInquiry.setMdn(mdn);
    		    request.setMdn(req.getMdn());
            }
          
            com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerOrder resellerOrder = new com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerOrder();
		    resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader38(VerizonUtil.getReferenceNumberType38(request.getReferenceNumber()), 
				                                                        request.getUser().getGroup().getName(), 
				                                                        VerizonUtil.RequestType.PRLINQUIRE, 
				                                                        VerizonUtil.OrderType.INQPRL));
		
		    com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerOrderType resellerOrderType = new com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerOrderType();
		    resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType38(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		
		    com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerSubOrderType resellerSubOrder = new com.budgetprepay.webservice.client.verizon.rss.pojo.ResellerSubOrderType();
		
		    resellerSubOrder.setResellerPortInInquiry(resellerPortInInquiry);
		
		    resellerOrderType.setSubOrder(resellerSubOrder);
		
		    resellerOrder.setOrder(resellerOrderType);
				
		    return sendJABX(request, resellerOrder);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean prlInquiry(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		try {
    	    PrlInquiryRequest req = (PrlInquiryRequest) VerizonUtil.XML2JAXB(PrlInquiryRequest.class, request.getClientRequestXML());
    	    
    		ResellerPRLInquiryType resellerPRLInquiry = ResellerPRLInquiryType.Factory.newInstance();
            if (req.getMdn() != null) {
            	MdnType mdn = MdnType.Factory.newInstance();
            	mdn.setStringValue(req.getMdn());
    		    resellerPRLInquiry.setMdn(mdn);
    		    request.setMdn(req.getMdn());
            }
          
		    ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		    resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
				                                                        request.getUser().getGroup().getName(), 
				                                                        VerizonUtil.RequestType.PRLINQUIRE, 
				                                                        VerizonUtil.OrderType.INQPRL));
		
		    ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		    resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		
		    ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();
		
		    resellerSubOrder.setResellerPRLInquiry(resellerPRLInquiry);
		
		    resellerOrderType.setSubOrder(resellerSubOrder);
		
		    resellerOrder.setOrder(resellerOrderType);
		
		    ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		    document.setResellerOrder(resellerOrder);
		
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean deleteSubscriber(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		try {
    	    DeleteSubscriberRequest req = (DeleteSubscriberRequest) VerizonUtil.XML2JAXB(DeleteSubscriberRequest.class, request.getClientRequestXML());

    		ResellerDeleteSubscriberType resellerDeleteSubscriber = ResellerDeleteSubscriberType.Factory.newInstance();
    		
    		if (req.getMdn() != null) {
    		    resellerDeleteSubscriber.setMdn(VerizonUtil.getMdnType(req.getMdn()));
    		    request.setMdn(req.getMdn());
    		}

		    ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
		    resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
				                                                        request.getUser().getGroup().getName(), 
				                                                        VerizonUtil.RequestType.ORDER, 
				                                                        VerizonUtil.OrderType.MNTMLND));
		
		    ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
		    resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
		    resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));
		
		    ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();
		
		    resellerSubOrder.setResellerDeleteSubscriber(resellerDeleteSubscriber);
		
		    resellerOrderType.setSubOrder(resellerSubOrder);
		
		    resellerOrder.setOrder(resellerOrderType);
		
		    ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
		    document.setResellerOrder(resellerOrder);
		
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean orderInquiry(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
        try {
			OrderInquiryDocument document = OrderInquiryDocument.Factory.newInstance();
			
			OrderInquiry orderInquiry = OrderInquiry.Factory.newInstance();
			
			orderInquiry.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                                                       request.getUser().getGroup().getName(), 
                                                                       VerizonUtil.RequestType.STATUS, 
                                                                       VerizonUtil.OrderType.INQSLND));

			document.setOrderInquiry(orderInquiry);
			
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean validateDevice(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
        try {
    	    ValidateDeviceRequest req = (ValidateDeviceRequest) VerizonUtil.XML2JAXB(ValidateDeviceRequest.class, request.getClientRequestXML());

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime("mm/dd/yyyy hh:mm:ss")));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(ResourceUtil.get("verizon.rss.accountnumber")));
			
		    ResellerSubOrderType resellerSubOrder = ResellerSubOrderType.Factory.newInstance();

			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			if (req.getDeviceId() != null) {
				ValidateDeviceType validateDeviceType = ValidateDeviceType.Factory.newInstance();
			    validateDeviceType.setDeviceId(req.getDeviceId());
		        resellerSubOrder.setValidateDevice(validateDeviceType);
			}
			
			resellerOrderType.setSubOrder(resellerSubOrder);
			
			resellerOrder.setOrder(resellerOrderType);

			document.setResellerOrder(resellerOrder);
			
		    return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean activateSubscriber(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    DeviceActivationRequest req = (DeviceActivationRequest) VerizonUtil.XML2JAXB(DeviceActivationRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();

            ResellerAddSubscriberType resellerAddSubscriberType = ResellerAddSubscriberType.Factory.newInstance();

            if (req.getMdn() != null) {
                 resellerAddSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
                 request.setMdn(req.getMdn());
            }
            if (req.getNextAvailableMDN() != null) {
            	if (req.getNextAvailableMDN().getNpaNXX() != null)
                    resellerAddSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_NPANXX(req.getNextAvailableMDN().getNpaNXX()));
                if (req.getNextAvailableMDN().getZipCode() != null)
                	resellerAddSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_ZIPCODE(req.getNextAvailableMDN().getZipCode())); 
                if (req.getNextAvailableMDN().getCityState() != null)
                	resellerAddSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_CITY_STATE(req.getNextAvailableMDN().getCityState().getCity(), 
                                                                                                 req.getNextAvailableMDN().getCityState().getState())); 
            }
            if (req.getMeid() != null)
                resellerAddSubscriberType.setMeid(req.getMeid());
            if (req.getEsn() != null)
                resellerAddSubscriberType.setEsn(req.getEsn());

            resellerAddSubscriberType.setPlan(VerizonUtil.getPlanType(req.getMessageHeader().getPlanCode()));
            resellerAddSubscriberType.setFeatureArray(VerizonUtil.addFeatures(req.getFeature()));

            resellerSubOrderType.setResellerAddSubscriber(resellerAddSubscriberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean activateSubscriberPortIn(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
        
        try {
    	    DeviceActivationPortInRequest req = (DeviceActivationPortInRequest) VerizonUtil.XML2JAXB(DeviceActivationPortInRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();

            ResellerAddSubscriberPortInType resellerAddSubscriberType = ResellerAddSubscriberPortInType.Factory.newInstance();

            if (req.getMdn() != null) {
                resellerAddSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
                request.setMdn(req.getMdn());
            }
            if (req.getMeid() != null)
                resellerAddSubscriberType.setMeid(req.getMeid());
            if (req.getEsn() != null)
                resellerAddSubscriberType.setEsn(req.getEsn());
            if (req.getMobileIPAddress() != null)
                resellerAddSubscriberType.setMobileIPAddress(VerizonUtil.getOasStringType(req.getMobileIPAddress()));
            if (req.getMpnPoolName() != null)
                resellerAddSubscriberType.setMPNPoolName(VerizonUtil.getOasStringType(req.getMpnPoolName()));
            if (req.getSubOrgId() != null)
                resellerAddSubscriberType.setSubOrgID(VerizonUtil.getOasStringType(req.getSubOrgId()));
            LnpType lnp = LnpType.Factory.newInstance();
            if (req.getAddress() != null) {
                LnpAddressType address = LnpAddressType.Factory.newInstance();
                if (req.getAddress().getStreet1() != null) {
            	    StreetNameType street1 = StreetNameType.Factory.newInstance();
                    street1.setStringValue(req.getAddress().getStreet1());
                    address.setAddressLine1(street1);
                }
                if (req.getAddress().getStreet2() != null) {
                    StreetNameType street2 = StreetNameType.Factory.newInstance();
                    street2.setStringValue(req.getAddress().getStreet2());
                    address.setAddressLine1(street2);
                }
                if (req.getAddress().getCity() != null) {
                    CityType city = CityType.Factory.newInstance();
                    city.setStringValue(req.getAddress().getCity());
                    address.setCity(city);
                }
                if (req.getAddress().getState() != null) {
                    StateType state = StateType.Factory.newInstance();
                    state.setStringValue(req.getAddress().getState());
                    address.setState(state);
                }
                if (req.getAddress().getZipCode() !=null) {
                    ZipCodeType zip = ZipCodeType.Factory.newInstance();
                    zip.setStringValue(req.getAddress().getZipCode());
                    address.setZip(zip);
                }
                if (req.getAddress().getCountry() != null) {
                    CountryType country = CountryType.Factory.newInstance();
                    country.setStringValue(req.getAddress().getCountry());
                    address.setCountry(country);
                }
                lnp.setAddress(address);
            }
            LnpNameType name = LnpNameType.Factory.newInstance(); 
            if (req.getBusiess() != null) 
            	name.setBusiness(VerizonUtil.getOasString60Type(req.getBusiess()));
            if (req.getName() != null) {
            	LnpPersonNameType person = LnpPersonNameType.Factory.newInstance();
            	if (req.getName().getFirst() != null)
            	    person.setFirst(VerizonUtil.getPersonNameType(req.getName().getFirst()));
            	if (req.getName().getMiddleInitial() != null && req.getName().getMiddleInitial().length() > 0)
            	    person.setMiddleInitial(VerizonUtil.getOasSingleCharacterType(req.getName().getMiddleInitial().substring(0, 1)));
            	if (req.getName().getLast() != null)
            	    person.setLast(VerizonUtil.getPersonNameType(req.getName().getLast()));
            	if (req.getName().getPrefix() != null)
            	    person.setPrefix(VerizonUtil.getOasString10Type(req.getName().getPrefix()));
            	if (req.getName().getSuffix() != null)
            	    person.setSuffix(VerizonUtil.getOasString10Type(req.getName().getSuffix()));
            	name.setName(person);
            }
            lnp.setLnpName(name);
            SsnOrTaxIdType tax = SsnOrTaxIdType.Factory.newInstance();
            if (req.getSsn() != null)
            	tax.setSsn(VerizonUtil.getOasStringType(req.getSsn()));
            if (req.getTaxId() != null)
            	tax.setTaxId(VerizonUtil.getOasStringType(req.getTaxId()));
            lnp.setSsnOrTaxId(tax);
            if (req.getOspAccountNo() != null)
                lnp.setOspAccountNo(VerizonUtil.getOspAccountNoType(req.getOspAccountNo()));
            if (req.getHotCut() != null) {
                if (req.getHotCut().substring(0, 1).equals("Y"))
                    lnp.setHotCut(HotCutType.Y);
                else
            	    lnp.setHotCut(HotCutType.N);
            }
            if (req.getPin() != null)
                lnp.setPin(VerizonUtil.getPinType(req.getPin()));
            if (req.getRemark() != null)
                lnp.setRemark(VerizonUtil.getOasString160Type(req.getRemark()));
            if (req.getAuthorizedSigner() !=null)
                lnp.setAuthorizedSigner(VerizonUtil.getOasString60Type(req.getAuthorizedSigner()));
            if (req.getAuthorizationStatus() != null) {
                if (req.getAuthorizationStatus().substring(0, 1).equals("Y"))
                    lnp.setAuthorizationStatus(AuthorizationStatusType.Y);
                else
            	    lnp.setAuthorizationStatus(AuthorizationStatusType.N);
            }
            if (req.getDirectionalIndicator() != null) {
            	if (req.getDirectionalIndicator().length() > 0)
                    lnp.setDirectionalIndicator(VerizonUtil.getDirectionalIndicatorType(req.getDirectionalIndicator().substring(0, 1)));
            }
            if (req.getPhoneUserName() != null)
                lnp.setPhoneUserName(VerizonUtil.getOasStringType(req.getPhoneUserName()));
            
            resellerAddSubscriberType.setLnp(lnp);
            
            resellerAddSubscriberType.setFeatureArray(VerizonUtil.addFeatures(req.getFeature()));

            resellerAddSubscriberType.setPlan(VerizonUtil.getPlanType(req.getMessageHeader().getPlanCode()));
            resellerSubOrderType.setResellerAddSubscriberPortIn(resellerAddSubscriberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean validateMDNPortIn(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    DeviceActivationRequest req = (DeviceActivationRequest) VerizonUtil.XML2JAXB(DeviceActivationRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();

            ResellerValidateMDNPortabilityType resellerAddSubscriberType = ResellerValidateMDNPortabilityType.Factory.newInstance();
            
            if (req.getMdn() != null) {
                resellerAddSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
                request.setMdn(req.getMdn());
            }
            
			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));
			resellerSubOrderType.setResellerValidateMDNPortability(resellerAddSubscriberType);
			
			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean changeESN(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ChangeESNRequest req = (ChangeESNRequest) VerizonUtil.XML2JAXB(ChangeESNRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();

            ResellerChangeESNType resellerChangeESNType = ResellerChangeESNType.Factory.newInstance();
                        
            if (req.getMdn() != null) {
                resellerChangeESNType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
                request.setMdn(req.getMdn());
            }
            
            if (req.getEsnWithOldEsn() != null) {
            	EsnWithOldEsnMeidType esn = EsnWithOldEsnMeidType.Factory.newInstance();
            	esn.setStringValue(req.getEsnWithOldEsn().getValue());
            	esn.setOld(req.getEsnWithOldEsn().getOld());
            	resellerChangeESNType.setEsn(esn);
            }
            else if (req.getEsnWithOldMeid() != null) {
            	EsnWithOldEsnMeidType esn = EsnWithOldEsnMeidType.Factory.newInstance();
            	esn.setStringValue(req.getEsnWithOldMeid().getValue());
            	esn.setOld(req.getEsnWithOldMeid().getOld());
            	resellerChangeESNType.setEsn(esn);
            }
            else if (req.getMeidWithOldEsn() != null) {
            	MeidWithOldEsnMeidType meid = MeidWithOldEsnMeidType.Factory.newInstance();
            	meid.setStringValue(req.getMeidWithOldEsn().getValue());
            	meid.setOld(req.getMeidWithOldEsn().getOld());
            	resellerChangeESNType.setMeid(meid);
            }
            else if (req.getMeidWithOldMeid() != null) {
            	MeidWithOldEsnMeidType meid = MeidWithOldEsnMeidType.Factory.newInstance();
            	meid.setStringValue(req.getMeidWithOldMeid().getValue());
            	meid.setOld(req.getMeidWithOldMeid().getOld());
            	resellerChangeESNType.setMeid(meid);
            }
            
			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));
			resellerSubOrderType.setResellerChangeESN(resellerChangeESNType);
			
			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
		}
		catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
		}
	}
	
	public static boolean addHotline(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    AddHotlineRequest req = (AddHotlineRequest) VerizonUtil.XML2JAXB(AddHotlineRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerHotlineSubscriberType resellerHotlineSubscriberType = ResellerHotlineSubscriberType.Factory.newInstance();

            if (req.getMdn() != null) {
                resellerHotlineSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
                request.setMdn(req.getMdn());
            }
            
            if (req.getHotlineType() != null)
            	resellerHotlineSubscriberType.setHotlineType(VerizonUtil.getOasStringType(req.getHotlineType().name()));
            
            if (req.getHotlineNumber() != null) {
            	PhoneType phoneType = PhoneType.Factory.newInstance();
            	phoneType.setStringValue(req.getHotlineNumber());
            	resellerHotlineSubscriberType.setHotlineNumber(phoneType);
            }

            resellerSubOrderType.setResellerHotlineSubscriber(resellerHotlineSubscriberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean removeHotline(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    RemoveHotlineRequest req = (RemoveHotlineRequest) VerizonUtil.XML2JAXB(RemoveHotlineRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerRemoveHotlineType resellerRemoveHotlineType = ResellerRemoveHotlineType.Factory.newInstance();

            if (req.getMdn() != null) {
                resellerRemoveHotlineType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
            	request.setMdn(req.getMdn());
            }

            resellerSubOrderType.setResellerRemoveHotline(resellerRemoveHotlineType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean addHotlineSubscriber(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    AddHotlineSubscriberRequest req = (AddHotlineSubscriberRequest) VerizonUtil.XML2JAXB(AddHotlineSubscriberRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerAddHotlineSubscriberType resellerAddHotlineSubscriberType = ResellerAddHotlineSubscriberType.Factory.newInstance();

            if (req.getMdn() != null) {
            	resellerAddHotlineSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
            	request.setMdn(req.getMdn());
            }
            if (req.getNextAvailableMDN() != null) {
           	if (req.getNextAvailableMDN().getNpaNXX() != null)
           		resellerAddHotlineSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_NPANXX(req.getNextAvailableMDN().getNpaNXX()));
            if (req.getNextAvailableMDN().getZipCode() != null)
            	   resellerAddHotlineSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_ZIPCODE(req.getNextAvailableMDN().getZipCode())); 
            if (req.getNextAvailableMDN().getCityState() != null)
            	   resellerAddHotlineSubscriberType.setNextAvailableMDN(VerizonUtil.nextMDN_CITY_STATE(req.getNextAvailableMDN().getCityState().getCity(), 
                                                                                                req.getNextAvailableMDN().getCityState().getState())); 
            }
            if (req.getMeid() != null)
        	    resellerAddHotlineSubscriberType.setMeid(req.getMeid());
            if (req.getEsn() != null)
        	    resellerAddHotlineSubscriberType.setEsn(req.getEsn());
            if (req.getMobileIPAddress() != null)
            	resellerAddHotlineSubscriberType.setMobileIPAddress(VerizonUtil.getOasStringType(req.getMobileIPAddress()));
            if (req.getMpnPoolName() != null)
            	resellerAddHotlineSubscriberType.setMPNPoolName(VerizonUtil.getOasStringType(req.getMpnPoolName()));
            if (req.getSubOrgId() != null)
            	resellerAddHotlineSubscriberType.setSubOrgID(VerizonUtil.getOasStringType(req.getSubOrgId()));
            resellerAddHotlineSubscriberType.setFeatureArray(VerizonUtil.addFeatures(req.getFeature()));
            if (req.getHotlineType() != null)
            	resellerAddHotlineSubscriberType.setHotlineType(VerizonUtil.getOasStringType(req.getHotlineType().name()));
            if (req.getHotlineNumber() != null) {
            	PhoneType phoneType = PhoneType.Factory.newInstance();
            	phoneType.setStringValue(req.getHotlineNumber());
            	resellerAddHotlineSubscriberType.setHotlineNumber(phoneType);
            }

            resellerSubOrderType.setResellerAddHotlineSubscriber(resellerAddHotlineSubscriberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean reconnectMDN(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ReconnectMDNRequest req = (ReconnectMDNRequest) VerizonUtil.XML2JAXB(ReconnectMDNRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerReconnectType resellerReconnectType = ResellerReconnectType.Factory.newInstance();

            if (req.getMdn() != null) {
            	resellerReconnectType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
            	request.setMdn(req.getMdn());
            }
            if (req.getMeid() != null)
        	    resellerReconnectType.setMeid(req.getMeid());
            if (req.getEsn() != null)
        	    resellerReconnectType.setEsn(req.getEsn());

            resellerSubOrderType.setResellerReconnect(resellerReconnectType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean restoreSuspendedSubscriber(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    RestoreSuspendedSubscriberRequest req = (RestoreSuspendedSubscriberRequest) VerizonUtil.XML2JAXB(RestoreSuspendedSubscriberRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerRestoreSubscriberType resellerRestoreSubscriberType = ResellerRestoreSubscriberType.Factory.newInstance();

            if (req.getMdn() != null) {
            	resellerRestoreSubscriberType.setMdn(VerizonUtil.getMdnType(req.getMdn()));
            	request.setMdn(req.getMdn());
            }

            resellerSubOrderType.setResellerRestoreSubscriber(resellerRestoreSubscriberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean suspendSubscriber(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    SuspendSubscriberRequest req = (SuspendSubscriberRequest) VerizonUtil.XML2JAXB(SuspendSubscriberRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerSuspendSubscriberType suspendSubscriberRequest = ResellerSuspendSubscriberType.Factory.newInstance();

            if (req.getMdn() != null) {
            	suspendSubscriberRequest.setMdn(VerizonUtil.getMdnType(req.getMdn()));
            	request.setMdn(req.getMdn());
            }

            resellerSubOrderType.setResellerSuspendSubscriber(suspendSubscriberRequest);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean changeMobileNumber(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ChangeMobileNumberRequest req = (ChangeMobileNumberRequest) VerizonUtil.XML2JAXB(ChangeMobileNumberRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerChangeNumberType resellerChangeNumberType = ResellerChangeNumberType.Factory.newInstance();
            	
            if (req.getMdn() != null) {
            	MdnWithOldMdnType mdn = MdnWithOldMdnType.Factory.newInstance();
            	mdn.setStringValue(req.getMdn());
            	if (req.getOldMdn() != null)
            	    mdn.setOld(req.getOldMdn());
            	resellerChangeNumberType.setMdn(mdn);
            }
            if (req.getNextAvailableMDN() != null) {
            	NextAvailablewithOldMDNType next = NextAvailablewithOldMDNType.Factory.newInstance();
            	if (req.getNextAvailableMDN().getCityState() != null) {
            	    if (req.getNextAvailableMDN().getCityState().getCity() != null) {
            	    	CityType city = CityType.Factory.newInstance();
            	        city.setStringValue(req.getNextAvailableMDN().getCityState().getCity());
            	        next.setCity(city);
            	    }
            	    if (req.getNextAvailableMDN().getCityState().getState() != null) {
            	    	DrvLicenseStateType state = DrvLicenseStateType.Factory.newInstance();
            	    	state.setStringValue(req.getNextAvailableMDN().getCityState().getState());
            	    	next.setState(state);
            	    }
            	}
            	if (req.getNextAvailableMDN().getZipCode() != null) {
            	    ZipCodeType zip = ZipCodeType.Factory.newInstance();
            	    zip.setStringValue(req.getNextAvailableMDN().getZipCode());
            	    next.setZipCode(zip);
            	}
            	if (req.getNextAvailableMDN().getNpaNXX() != null) {
            	    NpaNxxType npaNxx = NpaNxxType.Factory.newInstance();
            	    npaNxx.setStringValue(req.getNextAvailableMDN().getNpaNXX());
            	    next.setNpaNxx(npaNxx);
            	}
            	if (req.getOldMdn() != null) {
            	    MdnType oldMdn = MdnType.Factory.newInstance();
            	    oldMdn.setStringValue(req.getOldMdn());
            	    next.setOldMdn(oldMdn);
            	}
            	resellerChangeNumberType.setNextAvailableMDN(next);
            }
            if (req.getEsn() != null)
            	resellerChangeNumberType.setEsn(req.getEsn());
            if (req.getMeid() != null)
            	resellerChangeNumberType.setMeid(req.getMeid());
            resellerSubOrderType.setResellerChangeNumber(resellerChangeNumberType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean resetFeature(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ResetFeatureRequest req = (ResetFeatureRequest) VerizonUtil.XML2JAXB(ResetFeatureRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerResetFeatureType resellerResetFeatureType = ResellerResetFeatureType.Factory.newInstance();


            if (req.getMdn() != null) {
            	resellerResetFeatureType.setMdn(MdnType.Factory.newInstance());
            	resellerResetFeatureType.getMdn().setStringValue(req.getMdn());
            	request.setMdn(req.getMdn());
            }
            
            resellerResetFeatureType.setResetId(req.getResetId());
            resellerResetFeatureType.setPassword(VerizonUtil.getOasStringType(String.valueOf(req.getPassword())));
            resellerResetFeatureType.setFeatureCode(VerizonUtil.getOasStringType(req.getFeatureCode()));
            
            resellerSubOrderType.setResellerResetFeature(resellerResetFeatureType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean changeFeatures(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ChangeFeaturesRequest req = (ChangeFeaturesRequest) VerizonUtil.XML2JAXB(ChangeFeaturesRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerSubscribeFeatureType resellerSubscribeFeatureType = ResellerSubscribeFeatureType.Factory.newInstance();

            if (req.getMdn() != null) {
            	resellerSubscribeFeatureType.setMdn(MdnType.Factory.newInstance());
            	resellerSubscribeFeatureType.getMdn().setStringValue(req.getMdn());
            	request.setMdn(req.getMdn());
            }
            if (req.getMobileIPAddress() != null)
            	resellerSubscribeFeatureType.setMobileIPAddress(VerizonUtil.getOasStringType(req.getMobileIPAddress()));
            if (req.getMpnPoolName() != null)
            	resellerSubscribeFeatureType.setMPNPoolName(VerizonUtil.getOasStringType(req.getMpnPoolName()));
            if (req.getSubOrgId() != null)
            	resellerSubscribeFeatureType.setSubOrgID(VerizonUtil.getOasStringType(req.getSubOrgId()));
            resellerSubscribeFeatureType.setFeatureArray(VerizonUtil.addFeatures(req.getFeature()));

            resellerSubOrderType.setResellerSubscribeFeature(resellerSubscribeFeatureType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean changeRatePlan(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ChangeRatePlanRequest req = (ChangeRatePlanRequest) VerizonUtil.XML2JAXB(ChangeRatePlanRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerChangeRatePlanType resellerChangeRatePlanType = ResellerChangeRatePlanType.Factory.newInstance();


            if (req.getMdn() != null) {
            	resellerChangeRatePlanType.setMdn(MdnType.Factory.newInstance());
            	resellerChangeRatePlanType.getMdn().setStringValue(req.getMdn());
            	request.setMdn(req.getMdn());
            }
            if (req.getMobileIPAddress() != null)
            	resellerChangeRatePlanType.setMobileIPAddress(VerizonUtil.getOasStringType(req.getMobileIPAddress()));
            if (req.getMpnPoolName() != null)
            	resellerChangeRatePlanType.setMPNPoolName(VerizonUtil.getOasStringType(req.getMpnPoolName()));
            if (req.getSubOrgId() != null)
            	resellerChangeRatePlanType.setSubOrgID(VerizonUtil.getOasStringType(req.getSubOrgId()));
            if (req.getPlanCode() != null) {
                resellerChangeRatePlanType.setNewRatePlan(RatePlanType.Factory.newInstance());
                resellerChangeRatePlanType.getNewRatePlan().setPlan(PlanType.Factory.newInstance());
                resellerChangeRatePlanType.getNewRatePlan().getPlan().setPlanCode(VerizonUtil.getOasStringType(req.getPlanCode().getValue()));
                resellerChangeRatePlanType.setOldRatePlan(RatePlanType.Factory.newInstance());
                resellerChangeRatePlanType.getOldRatePlan().setPlan(PlanType.Factory.newInstance());
                resellerChangeRatePlanType.getOldRatePlan().getPlan().setPlanCode(VerizonUtil.getOasStringType(req.getPlanCode().getOld()));
            }
            
            resellerSubOrderType.setResellerChangeRatePlan(resellerChangeRatePlanType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
	
	public static boolean changeSIM(Request request) throws Exception {
        if (request == null) 
        	throw new Exception("Request is null");
     
        try {
    	    ChangeSIMRequest req = (ChangeSIMRequest) VerizonUtil.XML2JAXB(ChangeSIMRequest.class, request.getClientRequestXML());

            ResellerSubOrderType resellerSubOrderType = ResellerSubOrderType.Factory.newInstance();
            		
            ResellerChangeSIMType resellerChangeSIMType = ResellerChangeSIMType.Factory.newInstance();


            if (req.getMdn() != null) {
            	resellerChangeSIMType.setMdn(MdnType.Factory.newInstance());
            	resellerChangeSIMType.getMdn().setStringValue(req.getMdn());
            	request.setMdn(req.getMdn());
            }
            if (req.getIccid() != null) {
            	resellerChangeSIMType.setIccid(SIMCardWithOldSIMCardType.Factory.newInstance());
            	resellerChangeSIMType.getIccid().setStringValue(req.getIccid().getValue());
            	resellerChangeSIMType.getIccid().setOld(req.getIccid().getOld());
            }
            
            resellerSubOrderType.setResellerChangeSIM(resellerChangeSIMType);

			ResellerOrderDocument document = ResellerOrderDocument.Factory.newInstance();
			
			ResellerOrder resellerOrder = ResellerOrder.Factory.newInstance();
			
			resellerOrder.setMessageHeader(VerizonUtil.getMessageHeader(VerizonUtil.getReferenceNumberType(request.getReferenceNumber()), 
                                           request.getUser().getGroup().getName(), 
                                           VerizonUtil.RequestType.ORDER, 
                                           VerizonUtil.OrderType.MNTMLND));
			
			ResellerOrderType resellerOrderType = ResellerOrderType.Factory.newInstance();
			resellerOrderType.setOrderTimeStamp(VerizonUtil.getOasStringType(VerizonUtil.getDateTime(VerizonUtil.LONG_DATE_FORMAT)));
			resellerOrderType.setAccountNumber(VerizonUtil.getOasStringType(request.getUser().getGroup().getAccountNumber()));

			resellerOrderType.setSubOrder(resellerSubOrderType);
			
			resellerOrder.setOrder(resellerOrderType);
			
			document.setResellerOrder(resellerOrder);
			
			return send(request, document);
        }
        catch (Exception e) {
			ErrorRequest error = ErrorRequestFacade.create(new ErrorRequest(request.getClientRequestXML()));
			throw new Exception("ERROR: " + CommonUtil.getErrorRequestURL(error.getId()), e);
        }
    }
}

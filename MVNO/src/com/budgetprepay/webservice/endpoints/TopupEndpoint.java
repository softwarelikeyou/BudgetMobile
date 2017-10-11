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
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.model.facade.TopupFacade;
import com.budgetprepay.webservice.pojos.topup.CancelOrderRequest;
import com.budgetprepay.webservice.pojos.topup.CancelOrderResponse;
import com.budgetprepay.webservice.pojos.topup.EnterOrderDetailsRequest;
import com.budgetprepay.webservice.pojos.topup.EnterOrderDetailsResponse;
import com.budgetprepay.webservice.pojos.topup.ObjectFactory;
import com.budgetprepay.webservice.util.TopupUtil;

@Endpoint
public class TopupEndpoint extends BaseEndpoint {
	 
	private static Logger logger = Logger.getLogger(TopupEndpoint.class);
	
	public static final String NAMESPACE_URI = NAMESPACE_URI_PRE+ "/Topup";
	
	private ObjectFactory objectFactory = new ObjectFactory();
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "EnterOrderDetailsRequest")
	@ResponsePayload
	public JAXBElement<EnterOrderDetailsResponse> enterOrderDetails(@RequestPayload EnterOrderDetailsRequest request) throws Exception {
		EnterOrderDetailsResponse response = objectFactory.createEnterOrderDetailsResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());
		
		try {			
			User user = TopupUtil.retrieveByUsername(request.getMessageHeader().getUsername());
			
			if (request.getReferenceId() != null)
			    TopupUtil.validateClientReference(user, request.getReferenceId());
					
			TopupUtil.validateMDN(request.getMdn());
			
			Request req = new Request();
			req.setUser(user);
			if (request.getReferenceId() == null)
			    req.setClientReference((user.getGroup().getId() + TopupUtil.getRandom()).substring(0, 12));
			else 
			    req.setClientReference(request.getReferenceId());
			req.setReferenceNumber("0");
			req.setMdn(request.getMdn());
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(TopupUtil.JAXB2XML(request));
			req.setType(Request.RequestType.ENTER_ORDER_DETAILS);
			
			response = TopupFacade.enterOrderDetails(req);
			
			req.setClientSynchronousResponseXML(TopupUtil.JAXB2XML(response));
			
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.update(req);
		}
		catch (Exception e) {
			e.printStackTrace();
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<EnterOrderDetailsResponse>(new QName(NAMESPACE_URI, EnterOrderDetailsResponse.class.getSimpleName()), EnterOrderDetailsResponse.class, response);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CancelOrderRequest")
	@ResponsePayload
	public JAXBElement<CancelOrderResponse> cancelOrder(@RequestPayload CancelOrderRequest request) throws Exception {
		CancelOrderResponse response = objectFactory.createCancelOrderResponse();
		response.setReturnMessage(objectFactory.createReturnMessageType());

		try {
			
			User user = TopupUtil.retrieveByUsername(request.getMessageHeader().getUsername());
						
			Request original = RequestFacade.retrieveByClientReference(request.getReferenceId());
			
			if (original == null) 
				throw new Exception("ERROR-Unable to find reference id " + request.getReferenceId());
			
			if (original.getCommited() != null)
				throw new Exception("ERROR-Already committed ");
	
		    Request req = new Request();
			req.setUser(user);
			req.setClientReference(original.getClientReference() + "-C");
			req.setReferenceNumber(request.getReferenceId() + "-C");
			req.setClientRequestClass(request.getClass().getCanonicalName());
			req.setClientRequestXML(TopupUtil.JAXB2XML(request));
			req.setType(Request.RequestType.CANCEL_ORDER);
			req.setMdn(original.getMdn());
			req = RequestFacade.create(req);
			
			response = TopupFacade.cancelOrder(original);
			
			req.setClientSynchronousResponseXML(TopupUtil.JAXB2XML(response));
			
			logRequest(req);
			logger.debug("Saving request " + req.getClientReference());
			
		    RequestFacade.update(req);
	    }
		catch (Exception e) {
			e.printStackTrace();
			response.getReturnMessage().setReturnCode("-1");
			response.getReturnMessage().setReturnText(e.getMessage());
		}
		return new JAXBElement<CancelOrderResponse>(new QName(NAMESPACE_URI, CancelOrderResponse.class.getSimpleName()), CancelOrderResponse.class, response);
	}
}

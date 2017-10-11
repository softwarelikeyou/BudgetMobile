package com.budgetprepay.model.facade;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.ShortHolder;
import javax.xml.rpc.holders.StringHolder;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.webservice.client.topup.TopUpResellerSoap;
import com.budgetprepay.webservice.client.topup.TopUpResellerSoapProxy;
import com.budgetprepay.webservice.pojos.airfaire.CancelOrderResponse;
import com.budgetprepay.webservice.pojos.airfaire.EnterOrderDetailsRequest;
import com.budgetprepay.webservice.pojos.airfaire.EnterOrderDetailsResponse;
import com.budgetprepay.webservice.pojos.airfaire.ReturnMessageType;
import com.budgetprepay.webservice.util.TopupUtil;

public class AirfaireFacade {
	
	public static EnterOrderDetailsResponse enterOrderDetails(Request request) throws Exception {
		
		EnterOrderDetailsResponse response = new EnterOrderDetailsResponse();
		response.setReturnMessage(new ReturnMessageType());
        
		try {
			EnterOrderDetailsRequest req = (EnterOrderDetailsRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
			
			String clientRefID = request.getClientReference();
	        String MDN = req.getMdn();
	        String productID = req.getProductId();
	        short resellerID = (short) (int) request.getUser().getGroup().getResellerId();
	        StringHolder referenceID = new StringHolder();
	        ShortHolder errorCode = new ShortHolder();
	        StringHolder errorMessage = new StringHolder();
	        
            request.setVerizonSynchronousRequestXML("<?xml version=\"1.0\"?>" + "<EnterOrderDetailsRequest>" + "<ClientRefID>" + clientRefID + "</ClientRefID>" + "<resellerID>" + resellerID + "</resellerID>" + "<MDN>" + MDN + "</MDN>" + "<ProductID>" + productID + "</ProductID>" + "</EnterOrderDetailsRequest>");
            
            TopUpResellerSoap proxy = new TopUpResellerSoapProxy();
            
            try {
    		    proxy.enterOrderDetail(clientRefID, MDN, productID, resellerID, referenceID, errorCode, errorMessage);
    		    request.setReferenceNumber(referenceID.value);
            }
            catch (RemoteException e) {
            	throw new Exception("Topup enter order detail remote exeception: " + clientRefID, e);
            }
            
			response.getReturnMessage().setReturnCode(String.valueOf(errorCode.value));
			response.getReturnMessage().setReturnText(errorMessage.value);
    		
        	request.setVerizonSynchronousResponseXML("<?xml version=\"1.0\"?>" + "<EnterOrderDetailsResponse>" + "<referenceID>" + referenceID.value + "</referenceID>" + "<errorCode>" + errorCode.value + "</errorCode>" + "<errorMessage>" + errorMessage.value + "</errorMessage>" + "</EnterOrderDetailsResponse>");

		    request = RequestFacade.create(request);
		    
		    if (errorCode.value == 0) {
		    	try {
			        commitOrder(request);
		    	}
		    	catch (Exception e) {
					response.getReturnMessage().setReturnCode("-1");
					response.getReturnMessage().setReturnText(e.getMessage());
		    	}
		    }
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return response;
	}
	
	public static CancelOrderResponse cancelOrder(Request request) throws Exception {
		com.budgetprepay.webservice.pojos.airfaire.CancelOrderResponse response = new com.budgetprepay.webservice.pojos.airfaire.CancelOrderResponse();
		response.setReturnMessage(new ReturnMessageType());
		
		try {
			EnterOrderDetailsRequest req = (EnterOrderDetailsRequest) TopupUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
			
			String referenceID = req.getReferenceId();
			ShortHolder errorCode = new ShortHolder();
	        StringHolder errorMessage = new StringHolder();
	        
            request.setVerizonSynchronousRequestXML("<?xml version=\"1.0\"?>" + "<CancelOrderRequest>" + "<referenceID>" + referenceID + "</referenceID>" + "</CancelOrderRequest>");
            	
            TopUpResellerSoap proxy = new TopUpResellerSoapProxy();
            
            try {
            	proxy.cancelOrder(referenceID, errorCode, errorMessage);
            }
            catch (RemoteException e) {
            	throw new Exception("Topup cancel order remote exeception: " + referenceID, e);
            }
            
			response.getReturnMessage().setReturnCode(String.valueOf(errorCode.value));
			response.getReturnMessage().setReturnText(errorMessage.value);
        	request.setVerizonSynchronousResponseXML("<?xml version=\"1.0\"?>" + "<CancelOrderResponse>" + "<referenceID>" + referenceID + "</referenceID>" + "<errorCode>" + errorCode.value + "</errorCode>" + "<errorMessage>" + errorMessage.value + "</errorMessage>" + "</CancelOrderResponse>");
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			RequestFacade.update(request);
		}
		return response;
	}
	
	public static void commitOrder(Request request) throws Exception {
		try {
			String referenceID = request.getReferenceNumber();
	        LongHolder topUpID = new LongHolder();
	        ShortHolder errorCode = new ShortHolder();
	        StringHolder errorMessage = new StringHolder();
        	request.setVerizonAsynchronousResponseXML("<?xml version=\"1.0\"?>" + "<commitOrderRequest>" + "<referenceID>" + referenceID + "</referenceID>" + "</commitOrderRequest>");

	        TopUpResellerSoap proxy = new TopUpResellerSoapProxy();
	        
            try {
            	proxy.commitOrder(referenceID, topUpID, errorCode, errorMessage);
            	request.setClientAsynchronousResponseXML("<?xml version=\"1.0\"?>" + "<commitOrderResponse>" + "<referenceID>" + referenceID + "</referenceID>" + "<topUpID>" + topUpID.value + "</topUpID>" + "<errorCode>" + errorCode.value + "</errorCode>" + "<errorMessage>" + errorMessage.value + "</errorMessage>" + "</commitOrderResponse>");
            	request.setReferenceNumber(String.valueOf(topUpID.value));
            	request.setClientAsynchronousReturnUrl("errorCode: " + errorCode.value + " errorMessage: " + errorMessage.value);
            }
            catch (Exception e) {
            	request.setClientAsynchronousReturnUrl("errorCode: " + errorCode.value + " errorMessage: " + errorMessage.value);
            	request.setClientAsynchronousReturnUrl(e.getMessage());
            	throw new Exception("Topup commit order remote exeception-referenceID: " + referenceID + " errorCode" + errorCode.value + " errorMessage: " + errorMessage.value, e);
            }
		}
		catch (Exception e) {
			request.setClientAsynchronousReturnUrl(e.getMessage());
			throw new Exception(e);
		}
		finally {
			RequestFacade.update(request);
		}
	}
}

package com.budgetprepay.model.facade;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.ReturnMessage;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LoginRequest;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LoginResponse;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LogoutRequest;
import com.budgetprepay.webservice.client.plintron.billing.pojo.LogoutResponse;
import com.budgetprepay.webservice.client.plintron.billing.pojo.Session;
import com.budgetprepay.webservice.client.plintron.esme.pojo.SMSNotifyRequest;
import com.budgetprepay.webservice.client.plintron.esme.pojo.SMSNotifyResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.ADD_SOCRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.ADD_SOCResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_IMSIRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_IMSIResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_MSISDNRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_MSISDNResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_PLANRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.CHANGE_PLANResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.GET_SUBSCRIBER_INFORequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.GET_SUBSCRIBER_INFOResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.MODIFY_SUBSCRIBER_BUCKETRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.MODIFY_SUBSCRIBER_BUCKETResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.MODIFY_SUBSCRIBER_STATUSRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.MODIFY_SUBSCRIBER_STATUSResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.PackageType;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.PlanType;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.QUERY_SUBSCRIBER_USAGERequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.QUERY_SUBSCRIBER_USAGEResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REACTIVATE_SUBSCRIBERRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REACTIVATE_SUBSCRIBERResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REMOVE_SOCRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REMOVE_SOCResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REPLACE_MSISDNRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.REPLACE_MSISDNResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.RegistrationRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.SocType;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.UsageDetailType;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleCancelPortInRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleCancelPortInResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleCreatePortInRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleCreatePortInResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleQueryPortInStatusRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleQueryPortInStatusResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleUpdatePortInRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleUpdatePortInResponse;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleValidatePortInEligibilityRequest;
import com.budgetprepay.webservice.client.plintron.provisioning.pojo.WholesaleValidatePortInEligibilityResponse;
import com.budgetprepay.webservice.pojos.plintron.AddSOCRequest;
import com.budgetprepay.webservice.pojos.plintron.AddSOCResponse;
import com.budgetprepay.webservice.pojos.plintron.AllocateMDNRequest;
import com.budgetprepay.webservice.pojos.plintron.AllocateMDNResponse;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMRequest;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMResponse;
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
import com.budgetprepay.webservice.pojos.plintron.SendMessageBulkRequest;
import com.budgetprepay.webservice.pojos.plintron.SendMessageRequest;
import com.budgetprepay.webservice.pojos.plintron.SendMessageResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceInfoType;
import com.budgetprepay.webservice.pojos.plintron.SwapIMSIRequest;
import com.budgetprepay.webservice.pojos.plintron.SwapIMSIResponse;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNResponse;
import com.budgetprepay.webservice.pojos.plintron.UsageType;
import com.budgetprepay.webservice.util.CommonUtil;

public class PlintronFacade {

	private static String esmeHost = null;
	private static Integer esmePort = null;
	private static String provisioningHost = null;
	private static Integer provisioningPort = null;
	private static Integer provisioningTimeout = null;
	
	static {
		esmeHost = ResourceUtil.get("plintron.esme.host");
		esmePort = Integer.valueOf(ResourceUtil.get("plintron.esme.port"));
		provisioningHost = ResourceUtil.get("plintron.provisioning.host");
		provisioningPort = Integer.valueOf(ResourceUtil.get("plintron.provisioning.port"));
		provisioningTimeout = Integer.valueOf(ResourceUtil.get("plintron.provisioning.socket.timeout"));
	}
	
	private static Socket getProvisioningSocket() throws Exception {
		Socket  socket = null;
		@SuppressWarnings("unused")
		String response = null;
		try {
            socket = new Socket(provisioningHost, provisioningPort);
		
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        return socket;
		}
		catch (Exception e) {
			throw new Exception("Unable to open provisioning socket", e);
		}
	}
	
	private static String send2Provisioning(Socket socket, String message) throws Exception {
		String response = null;
		ByteBuffer out = null;
		DataOutputStream outToServer = null;
		DataInputStream inFromServer = null;
		
		try {
			
			if (socket == null)
				throw new Exception("Socket is null");
			
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        int trys = 1;
	        while (inFromServer.available() <= 0) {
	        	if (trys == provisioningTimeout)
	        		throw new Exception("Have not received any bytes from Plintron in " + provisioningTimeout + " seconds, please try again!");
	        	else {
	                Thread.sleep(1000 * 1);
	                trys++;
	        	}
	        }
	    	
	        if (inFromServer.available() > 0) {
	        	Thread.sleep(1000 * 2);
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        return response;
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			if (socket != null)
		        socket.close();	
		}
	}
	
	public static SendMessageResponse sendMessage(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		SendMessageRequest req = (SendMessageRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		SendMessageResponse results = new SendMessageResponse();
		
		SMSNotifyRequest sMSNotifyRequest = new SMSNotifyRequest();
		if (request.getClientReference() != null)
		    sMSNotifyRequest.setTRANSACTIONID(request.getClientReference());
		if (req.getDataCoding() != null)
			sMSNotifyRequest.setDataCoding(req.getDataCoding());
		if (req.getMDN() != null)
			sMSNotifyRequest.setDestAddr(req.getMDN());
		if (req.getMessage() != null)		
			sMSNotifyRequest.setText(req.getMessage());
		if (req.getScheduledDelivery() != null)
			sMSNotifyRequest.setScheduledDelivery(req.getScheduledDelivery());
	    if (req.getSender() != null)
	    	sMSNotifyRequest.setSender(req.getSender());
		if (req.getSenderTON() != null)		
			sMSNotifyRequest.setSenderTON(req.getSenderTON());
		if (req.getServiceType() != null)
			sMSNotifyRequest.setServiceType(req.getServiceType());
		if (req.getValidityPeriod() != null)
			sMSNotifyRequest.setValidityPeriod(req.getValidityPeriod());
			
		request.setVerizonSynchronousRequestXML(sMSNotifyRequest.toString());
		
		String response = PlintronFacade.send2ESME(esmeHost, esmePort, sMSNotifyRequest.toString());
		
		request.setVerizonSynchronousResponseXML(response.substring(0, response.lastIndexOf("<SMSNotifyResponse>")));
		
		SMSNotifyResponse sMSNotifyResponse = SMSNotifyResponse.parse(response);
		
		results.setCode(sMSNotifyResponse.getCode());
		results.setTransactionId(sMSNotifyResponse.getTRANSACTIONID() == null ? request.getReferenceNumber() : sMSNotifyResponse.getTRANSACTIONID());
		return results;
	}
	
	public static List<SMSNotifyRequest> getSMSNotifyRequestList(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		SendMessageBulkRequest req = (SendMessageBulkRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		List<SMSNotifyRequest> results = new ArrayList<SMSNotifyRequest>();
		
		for (String mdn : req.getMdn()) {
		    SMSNotifyRequest sMSNotifyRequest = new SMSNotifyRequest();
		    sMSNotifyRequest.setTRANSACTIONID(request.getReferenceNumber());
		    sMSNotifyRequest.setDataCoding("1");
	        sMSNotifyRequest.setSender("7025");
		    sMSNotifyRequest.setServiceType("RN");
		    if (mdn.startsWith("1") == false)
			    sMSNotifyRequest.setDestAddr("1" + mdn);	
			sMSNotifyRequest.setText(req.getMessage());
			results.add(sMSNotifyRequest);
		}
		return results;
	}
	
	public static PortInValidateResponse portInValidate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		PortInValidateRequest req = (PortInValidateRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInValidateResponse results = new PortInValidateResponse();
		
		WholesaleValidatePortInEligibilityRequest wholesaleValidatePortInEligibilityRequest = new WholesaleValidatePortInEligibilityRequest();
		if (request.getClientReference() != null)
			wholesaleValidatePortInEligibilityRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			wholesaleValidatePortInEligibilityRequest.setMsisdn(req.getMDN());

		request.setVerizonSynchronousRequestXML(wholesaleValidatePortInEligibilityRequest.toString());
				
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
	        request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        WholesaleValidatePortInEligibilityResponse wholesaleValidatePortInEligibilityResponse = WholesaleValidatePortInEligibilityResponse.parse(request.getVerizonSynchronousResponseXML());				
			results.setErrorCode(wholesaleValidatePortInEligibilityResponse.getErrorCode());
			results.setErrorDescription(wholesaleValidatePortInEligibilityResponse.getErrorDesc());
			results.setResult(wholesaleValidatePortInEligibilityResponse.getResult());
			results.setResultCode(wholesaleValidatePortInEligibilityResponse.getMessageCode());
			results.setResultDescription(wholesaleValidatePortInEligibilityResponse.getDescription());
			results.setResultStatus(wholesaleValidatePortInEligibilityResponse.getStatus());
			results.setTransactionId(wholesaleValidatePortInEligibilityResponse.getTransactionId());
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		
	    return results;
	}
	
	public static PortInCreateResponse portInCreate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		PortInCreateRequest req = (PortInCreateRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInCreateResponse results = new PortInCreateResponse();
		
		WholesaleCreatePortInRequest wholesaleCreatePortInRequest = new WholesaleCreatePortInRequest();
		if (request.getClientReference() != null)
			wholesaleCreatePortInRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			wholesaleCreatePortInRequest.setMsisdn(req.getMDN());
		if (req.getName() != null)
			wholesaleCreatePortInRequest.setName(req.getName());
		if (req.getAddress1() != null)
			wholesaleCreatePortInRequest.setAddressLine1(req.getAddress1());
		if (req.getCity() != null)
			wholesaleCreatePortInRequest.setCity(req.getCity());
		if (req.getState() != null)
			wholesaleCreatePortInRequest.setState(req.getState());
		if (req.getZip() != null)
			wholesaleCreatePortInRequest.setZip(req.getZip());
		if (req.getSim() != null)
			wholesaleCreatePortInRequest.setSim(req.getSim());
		if (req.getAccountNumber() != null)
			wholesaleCreatePortInRequest.setOspAccountNumber(req.getAccountNumber() );
		if (req.getAccountPin() != null)
			wholesaleCreatePortInRequest.setOspPin(req.getAccountPin());
			
		request.setVerizonSynchronousRequestXML(wholesaleCreatePortInRequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
			request.setVerizonSynchronousResponseXML(response.substring(9));
	    		
			try {
	            WholesaleCreatePortInResponse wholesaleCreatePortInResponse = WholesaleCreatePortInResponse.parse(request.getVerizonSynchronousResponseXML());				
			    results.setErrorCode(wholesaleCreatePortInResponse.getErrorCode());
			    results.setErrorDescription(wholesaleCreatePortInResponse.getErrorDesc());
			    results.setResult(wholesaleCreatePortInResponse.getResult());
			    results.setResultDescription(wholesaleCreatePortInResponse.getDescription());
			    results.setResultStatus(wholesaleCreatePortInResponse.getStatus());
			    results.setTransactionId(wholesaleCreatePortInResponse.getTransactionId());
			}
			catch (Exception e) {
				results.setErrorCode("-2");
				results.setErrorDescription("Unable to create port request for MDN: " + req.getMDN());
			}
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		
	    return results;
	}
	
	public static PortInUpdateResponse portInUpdate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		PortInUpdateRequest req = (PortInUpdateRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInUpdateResponse results = new PortInUpdateResponse();
		
		WholesaleUpdatePortInRequest wholesaleUpdatePortInRequest = new WholesaleUpdatePortInRequest();
		if (request.getClientReference() != null)
			wholesaleUpdatePortInRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			wholesaleUpdatePortInRequest.setMsisdn(req.getMDN());
		if (req.getName() != null)
			wholesaleUpdatePortInRequest.setName(req.getName());
		if (req.getAddress1() != null)
			wholesaleUpdatePortInRequest.setAddressLine1(req.getAddress1());
		if (req.getCity() != null)
			wholesaleUpdatePortInRequest.setCity(req.getCity());
		if (req.getState() != null)
			wholesaleUpdatePortInRequest.setState(req.getState());
		if (req.getZip() != null)
			wholesaleUpdatePortInRequest.setZip(req.getZip());
		if (req.getSim() != null)
			wholesaleUpdatePortInRequest.setSim(req.getSim());
		if (req.getAccountNumber() != null)
			wholesaleUpdatePortInRequest.setOspAccountNumber(req.getAccountNumber() );
		if (req.getAccountPin() != null)
			wholesaleUpdatePortInRequest.setOspPin(req.getAccountPin());
			
		request.setVerizonSynchronousRequestXML(wholesaleUpdatePortInRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	WholesaleUpdatePortInResponse wholesaleUpdatePortInResponse = WholesaleUpdatePortInResponse.parse(request.getVerizonSynchronousResponseXML());				
				results.setErrorCode(wholesaleUpdatePortInResponse.getErrorCode());
				results.setErrorDescription(wholesaleUpdatePortInResponse.getErrorDesc());
				results.setResult(wholesaleUpdatePortInResponse.getResult());
				results.setResultDescription(wholesaleUpdatePortInResponse.getDescription());
				results.setResultStatus(wholesaleUpdatePortInResponse.getStatus());
				results.setTransactionId(wholesaleUpdatePortInResponse.getTransactionId());
	        }
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static PortInStatusResponse portInStatus(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		PortInStatusRequest req = (PortInStatusRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInStatusResponse results = new PortInStatusResponse();
		
		WholesaleQueryPortInStatusRequest wholesaleQueryPortInStatusRequest = new WholesaleQueryPortInStatusRequest();
		if (request.getClientReference() != null)
			wholesaleQueryPortInStatusRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			wholesaleQueryPortInStatusRequest.setMsisdn(req.getMDN());

		request.setVerizonSynchronousRequestXML(wholesaleQueryPortInStatusRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	        
	        if (inFromServer.available() > 0) {
	            Thread.sleep(1000 * 2);
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	WholesaleQueryPortInStatusResponse wholesaleQueryPortInStatusResponse = WholesaleQueryPortInStatusResponse.parse(request.getVerizonSynchronousResponseXML());				
				results.setErrorCode(wholesaleQueryPortInStatusResponse.getErrorCode());
				results.setErrorDescription(wholesaleQueryPortInStatusResponse.getErrorDesc());
				results.setResult(wholesaleQueryPortInStatusResponse.getResult());
				results.setResultCode(wholesaleQueryPortInStatusResponse.getMessageCode());
				results.setResultDescription(wholesaleQueryPortInStatusResponse.getDescription());
				results.setResultStatus(wholesaleQueryPortInStatusResponse.getStatus());
				results.setTransactionId(wholesaleQueryPortInStatusResponse.getTransactionId());
	        }
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static PortInCancelResponse portInCancel(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		PortInCancelRequest req = (PortInCancelRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		PortInCancelResponse results = new PortInCancelResponse();
		
		WholesaleCancelPortInRequest wholesaleCancelPortInRequest = new WholesaleCancelPortInRequest();
		if (request.getClientReference() != null)
			wholesaleCancelPortInRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			wholesaleCancelPortInRequest.setMsisdn(req.getMDN());
		if (req.getSim() != null)
			wholesaleCancelPortInRequest.setSim(req.getSim());
		
		request.setVerizonSynchronousRequestXML(wholesaleCancelPortInRequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
			request.setVerizonSynchronousResponseXML(response.substring(9));
	    		
			try {
	        	WholesaleCancelPortInResponse wholesaleCancelPortInResponse = WholesaleCancelPortInResponse.parse(request.getVerizonSynchronousResponseXML());				
				results.setErrorCode(wholesaleCancelPortInResponse.getErrorCode());
				results.setErrorDescription(wholesaleCancelPortInResponse.getErrorDesc());
				results.setResult(wholesaleCancelPortInResponse.getResult());
				results.setResultCode(wholesaleCancelPortInResponse.getMessageCode());
				results.setResultDescription(wholesaleCancelPortInResponse.getDescription());
				results.setResultStatus(wholesaleCancelPortInResponse.getStatus());
				results.setTransactionId(wholesaleCancelPortInResponse.getTransactionId());
			}
			catch (Exception e) {
				results.setErrorCode("-2");
				results.setErrorDescription("Unable to cancel port request for MDN: " + req.getMDN());
			}
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		
	    return results;
	}

	private static Session login() throws Exception {
		byte[] buffer = null;
		Socket socket = null;
		
		try {			
			LoginRequest request = new LoginRequest();
			request.setDialogID(CommonUtil.getRandom());
			request.setUserID(ResourceUtil.get("plintron.billing.username"));
			request.setPassword(ResourceUtil.get("plintron.billing.password"));
			
			socket = new Socket(ResourceUtil.get("plintron.billing.host"), Integer.valueOf(ResourceUtil.get("plintron.billing.port")));
			ByteBuffer out = ByteBuffer.allocate(new String(length(request.toString()) + request.toString()).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(request.toString()) + request.toString()).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());

	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        LoginResponse loginResponse = LoginResponse.parse(new String(buffer).substring(9));

	        return new Session(socket, loginResponse.getSESSIONID(), loginResponse.getDIALOGID());
		}
		catch (Exception e) {
			if (socket != null)
				socket.close();
			throw new Exception(e);
		}	
	}
	
	private static LogoutResponse logout(final Session session) {
		LogoutResponse logoutResponse = null;
		try {			
			LogoutRequest logoutRequest = new LogoutRequest();
			logoutRequest.setSessionId(session.sessionId);
			logoutRequest.setDialogID(session.dialogId);
			
			logoutResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.LogoutResponse.parse(send2Billing(session.socket, logoutRequest.toString()).substring(9));
		
			return logoutResponse;
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
		finally {
			if (session.socket != null) {
				try {
				    session.socket.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return logoutResponse;
	}
	
	public static ChangeVMPinResponse changeVMPin(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ChangeVMPinRequest changeVMPinRequest = (ChangeVMPinRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		ChangeVMPinResponse changeVMPinResponse = new ChangeVMPinResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.ChangeVMPinRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.ChangeVMPinRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.ChangeVMPinResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(changeVMPinRequest.getMDN());
			plintronRequest.setNewPin(changeVMPinRequest.getNewPin());
			plintronRequest.setOldPin(changeVMPinRequest.getOldPin());
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.ChangeVMPinResponse.parse(response);
			
			changeVMPinResponse.setErrorCode(plintronResponse.getReturnCode());
			changeVMPinResponse.setErrorDescription(plintronResponse.getErrorDescription());
			changeVMPinResponse.setResult(plintronResponse.getSessionId());
			changeVMPinResponse.setTransactionId(request.getReferenceNumber());
			changeVMPinResponse.setResultCode(plintronResponse.getReturnCode());
		}
		catch (Exception e) {
			changeVMPinResponse.setErrorCode("-1");
			changeVMPinResponse.setErrorDescription("ERROR - " + e.getMessage());
			changeVMPinResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return changeVMPinResponse;
	}	
	
	public static ServiceActivateResponse serviceActivate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ServiceActivateRequest serviceActivateRequest = (ServiceActivateRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		ServiceActivateResponse serviceActivateResponse = new ServiceActivateResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceActivateRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceActivateRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceActivateResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(serviceActivateRequest.getMDN());
			plintronRequest.setClientType(serviceActivateRequest.getClientType());
			plintronRequest.setServiceId(serviceActivateRequest.getServiceId());
			plintronRequest.setDialogID(session.dialogId);
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String responseString = send2Billing(session.socket, plintronRequest.toString());
			request.setVerizonSynchronousResponseXML(responseString);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceActivateResponse.parse(responseString.substring(9));
			
			serviceActivateResponse.setReturnCode(plintronResponse.getReturnCode());
			serviceActivateResponse.setErrorDescription(plintronResponse.getErrorDescription());
			serviceActivateResponse.setAccountBalance(plintronResponse.getNewBalance());
			serviceActivateResponse.setTransactionId(request.getReferenceNumber());
			serviceActivateResponse.setNetworkId(plintronResponse.getNetworkId());
			serviceActivateResponse.setServiceCharge(plintronResponse.getServiceCharge());
		}
		catch (Exception e) {
			serviceActivateResponse.setReturnCode("-1");
			serviceActivateResponse.setErrorDescription("ERROR - " + e.getMessage());
			serviceActivateResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return serviceActivateResponse;
	}	
	
	public static ServiceDeactivateResponse serviceDeactivate(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ServiceDeactivateRequest serviceDeactivateRequest = (ServiceDeactivateRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		ServiceDeactivateResponse serviceDeactivateResponse = new ServiceDeactivateResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceDeactivateRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceDeactivateRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceDeactivateResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(serviceDeactivateRequest.getMDN());
			plintronRequest.setClientType(serviceDeactivateRequest.getClientType());
			plintronRequest.setServiceId(serviceDeactivateRequest.getServiceId());
			plintronRequest.setDialogID(session.dialogId);
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String responseString = send2Billing(session.socket, plintronRequest.toString());
			request.setVerizonSynchronousResponseXML(responseString);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.ServiceDeactivateResponse.parse(responseString.substring(9));
			
			serviceDeactivateResponse.setReturnCode(plintronResponse.getReturnCode());
			serviceDeactivateResponse.setErrorDescription(plintronResponse.getErrorDescription());
			serviceDeactivateResponse.setAccountBalance(plintronResponse.getNewBalance());
			serviceDeactivateResponse.setTransactionId(request.getReferenceNumber());
			serviceDeactivateResponse.setNetworkId(plintronResponse.getNetworkId());
			serviceDeactivateResponse.setServiceCharge(plintronResponse.getServiceCharge());
		}
		catch (Exception e) {
			serviceDeactivateResponse.setReturnCode("-1");
			serviceDeactivateResponse.setErrorDescription("ERROR - " + e.getMessage());
			serviceDeactivateResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return serviceDeactivateResponse;
	}	
	
	public static GetAccountDetailsResponse getAccountDetails(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		GetAccountDetailsRequest getAccountDetailsRequest = (GetAccountDetailsRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		GetAccountDetailsResponse getAccountDetailsResponse = new GetAccountDetailsResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetAccountDetailsRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.GetAccountDetailsRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetAccountDetailsResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(getAccountDetailsRequest.getMDN());
			plintronRequest.setDialogID(session.dialogId);
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.GetAccountDetailsResponse.parse(response);
			
			getAccountDetailsResponse.setAccountStatus(plintronResponse.getACCOUNTSTATUS());
			getAccountDetailsResponse.setCbs(plintronResponse.getCBS());
			getAccountDetailsResponse.setCurrentBalance(plintronResponse.getCURRENTBALANCE());
			getAccountDetailsResponse.setErrorDescription(plintronResponse.getErrorDescription());
			getAccountDetailsResponse.setLanguage(plintronResponse.getLANGUAGE());
			getAccountDetailsResponse.setLifeCycleState(plintronResponse.getLIFECYCLESTATE());
			getAccountDetailsResponse.setMainBalance(plintronResponse.getMAINBALANCE());
			getAccountDetailsResponse.setMHAPin(plintronResponse.getMHAPIN());
			getAccountDetailsResponse.setMNPInd(plintronResponse.getMNPIND());
			getAccountDetailsResponse.setNetworkId(plintronResponse.getNetworkId());
			getAccountDetailsResponse.setPlanId(plintronResponse.getPLANID());
			getAccountDetailsResponse.setPromoBalance(plintronResponse.getPROMOBALANCE());
			getAccountDetailsResponse.setPromoValidityDate(plintronResponse.getPROMOVALIDITYDATE());
			getAccountDetailsResponse.setReturnCode(plintronResponse.getReturnCode());
			getAccountDetailsResponse.setSIMStatus(plintronResponse.getSIMSTATUS());
			getAccountDetailsResponse.setSubStatus(plintronResponse.getSUBSTATUS());
			getAccountDetailsResponse.setSubType(plintronResponse.getSUBSTYPE());
			getAccountDetailsResponse.setTopUpInd(plintronResponse.getTOPUPIND());
			getAccountDetailsResponse.setTransactionId(request.getReferenceNumber());
			getAccountDetailsResponse.setTransPin(plintronResponse.getTRANS_PIN());
			getAccountDetailsResponse.setValidityDate(plintronResponse.getVALIDITYDATE());
			getAccountDetailsResponse.setVmsPin(plintronResponse.getVMS_PIN());
		}
		catch (Exception e) {
			getAccountDetailsResponse.setReturnCode("-1");
			getAccountDetailsResponse.setErrorDescription("ERROR - " + e.getMessage());
			getAccountDetailsResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return getAccountDetailsResponse;
	}	
	
	public static GetSubscriptionStatusResponse getSubscriptionStatus(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		GetSubscriptionStatusRequest getSubscriptionStatusRequest = (GetSubscriptionStatusRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		GetSubscriptionStatusResponse getSubscriptionStatusResponse = new GetSubscriptionStatusResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetSubscriptionStatusRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.GetSubscriptionStatusRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetSubscriptionStatusResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(getSubscriptionStatusRequest.getMDN());
			plintronRequest.setDialogID(session.dialogId);
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.GetSubscriptionStatusResponse.parse(response);
			
			getSubscriptionStatusResponse.setErrorDescription(plintronResponse.getErrorDescription());
			getSubscriptionStatusResponse.setReturnCode(plintronResponse.getReturnCode());
			getSubscriptionStatusResponse.setTransactionId(request.getReferenceNumber());
			getSubscriptionStatusResponse.setMDN(plintronResponse.getMdn());
			getSubscriptionStatusResponse.setNetworkId(plintronResponse.getNetworkId());
			getSubscriptionStatusResponse.setServiceInfo(getServiceInfo(plintronResponse.getServiceInfo()));

		}
		catch (Exception e) {
			getSubscriptionStatusResponse.setReturnCode("-1");
			getSubscriptionStatusResponse.setErrorDescription("ERROR - " + e.getMessage());
			getSubscriptionStatusResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return getSubscriptionStatusResponse;
	}	
	
	public static GetBundleSubscriptionResponse getBundleSubscription(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		GetBundleSubscriptionRequest getBundleSubscriptionRequest = (GetBundleSubscriptionRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		GetBundleSubscriptionResponse getBundleSubscriptionResponse = new GetBundleSubscriptionResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetBundleSubscriptionRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.GetBundleSubscriptionRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.GetBundleSubscriptionResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(getBundleSubscriptionRequest.getMDN());
			plintronRequest.setServiceCode(getBundleSubscriptionRequest.getServiceCode());
			plintronRequest.setDialogID(session.dialogId);
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.GetBundleSubscriptionResponse.parse(response);
			
			getBundleSubscriptionResponse.setErrorDescription(plintronResponse.getErrorDescription());
			getBundleSubscriptionResponse.setReturnCode(plintronResponse.getReturnCode());
			getBundleSubscriptionResponse.setTransactionId(request.getReferenceNumber());
			getBundleSubscriptionResponse.setMDN(request.getMdn());
			getBundleSubscriptionResponse.setBundleAmount(plintronResponse.getBundleAmount());
			getBundleSubscriptionResponse.setBundlePromotionApplied(plintronResponse.getBPA());

		}
		catch (Exception e) {
			getBundleSubscriptionResponse.setReturnCode("-1");
			getBundleSubscriptionResponse.setErrorDescription("ERROR - " + e.getMessage());
			getBundleSubscriptionResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return getBundleSubscriptionResponse;
	}	
	
	public static RemoveSubscriberResponse removeSubscriber(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		RemoveSubscriberRequest req = (RemoveSubscriberRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		RemoveSubscriberResponse results = new RemoveSubscriberResponse();
		
		com.budgetprepay.webservice.client.plintron.provisioning.pojo.RemoveSubscriberRequest removeSubsriberRequest = new com.budgetprepay.webservice.client.plintron.provisioning.pojo.RemoveSubscriberRequest(); 
		if (request.getClientReference() != null)
			removeSubsriberRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			removeSubsriberRequest.setMdn(req.getMDN());
		if (req.getImsi() != null)
			removeSubsriberRequest.setImsi(req.getImsi());
		if (req.getReason() != null)
			removeSubsriberRequest.setReason(req.getReason());
		else
			removeSubsriberRequest.setReason("Ported-Out");

		request.setVerizonSynchronousRequestXML(removeSubsriberRequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
	        request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	    	com.budgetprepay.webservice.client.plintron.provisioning.pojo.RemoveSubscriberResponse removeSubsriberResponse = com.budgetprepay.webservice.client.plintron.provisioning.pojo.RemoveSubscriberResponse.parse(request.getVerizonSynchronousResponseXML()); 
			results.setReturnCode(removeSubsriberResponse.getErrorCode());
			results.setErrorDescription(removeSubsriberResponse.getErrorDesc());
			results.setTransactionId(removeSubsriberResponse.getTransactionId());
			results.setResult(removeSubsriberResponse.getResult());
			results.setDescription(removeSubsriberResponse.getDescription());
			results.setMessageCode(removeSubsriberResponse.getMessageCode());
		}
		catch (Exception e) {
			results.setTransactionId(removeSubsriberRequest.getTransactionId());
			results.setReturnCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		
	    return results;
	}
	
	public static AllocateMDNResponse allocateMDN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		AllocateMDNRequest req = (AllocateMDNRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		AllocateMDNResponse results = new AllocateMDNResponse();
		
		com.budgetprepay.webservice.client.plintron.provisioning.pojo.LERGDAllocateMSISDNRequest lERGDAllocateMSISDNRequest = new com.budgetprepay.webservice.client.plintron.provisioning.pojo.LERGDAllocateMSISDNRequest(); 
		if (request.getClientReference() != null)
			lERGDAllocateMSISDNRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			lERGDAllocateMSISDNRequest.setMdn(req.getMDN());
		if (req.getImsi() != null)
			lERGDAllocateMSISDNRequest.setImsi(req.getImsi());

		request.setVerizonSynchronousRequestXML(lERGDAllocateMSISDNRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	    		com.budgetprepay.webservice.client.plintron.provisioning.pojo.LERGDAllocateMSISDNResponse lERGDAllocateMSISDNResponse = com.budgetprepay.webservice.client.plintron.provisioning.pojo.LERGDAllocateMSISDNResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(lERGDAllocateMSISDNResponse.getErrorCode());
				results.setErrorDescription(lERGDAllocateMSISDNResponse.getErrorDesc());
				results.setTransactionId(lERGDAllocateMSISDNResponse.getTransactionId());
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static GetSubscriberInfoResponse getSubscriberInfo(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		GetSubscriberInfoRequest req = (GetSubscriberInfoRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		GetSubscriberInfoResponse results = new GetSubscriberInfoResponse();
		
		GET_SUBSCRIBER_INFORequest gET_SUBSCRIBER_INFORequest = new GET_SUBSCRIBER_INFORequest(); 
		if (request.getClientReference() != null)
			gET_SUBSCRIBER_INFORequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			gET_SUBSCRIBER_INFORequest.setImsi(req.getImsi().trim());
		if (req.getQueryType() != null)
			gET_SUBSCRIBER_INFORequest.setQueryType(req.getQueryType());
		gET_SUBSCRIBER_INFORequest.setType("D");

		request.setVerizonSynchronousRequestXML(gET_SUBSCRIBER_INFORequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
	        request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        GET_SUBSCRIBER_INFOResponse gET_SUBSCRIBER_INFOResponse = GET_SUBSCRIBER_INFOResponse.parse(request.getVerizonSynchronousResponseXML()); 
			results.setErrorCode(gET_SUBSCRIBER_INFOResponse.getErrorCode());
			results.setErrorDescription(gET_SUBSCRIBER_INFOResponse.getErrorDesc());
			results.setResult(gET_SUBSCRIBER_INFOResponse.getResult());
			results.setDescription(gET_SUBSCRIBER_INFOResponse.getDescription());
			results.setStatus(gET_SUBSCRIBER_INFOResponse.getStatus());
			results.setTransactionId(gET_SUBSCRIBER_INFOResponse.getTransactionId());
			results.setImei(gET_SUBSCRIBER_INFOResponse.getImei());
			results.setImsi(gET_SUBSCRIBER_INFOResponse.getImsi());
			results.setMsisdn(gET_SUBSCRIBER_INFOResponse.getMsisdn());
			for (PackageType pkg : gET_SUBSCRIBER_INFOResponse.getPackages()) {
				results.setPackageName(pkg.getName());
				results.setPackageEffectiveDate(pkg.getEffectiveDate());
			}
			for (PlanType plan : gET_SUBSCRIBER_INFOResponse.getPlans()) {
				results.setPlanName(plan.getName());
				results.setPlanEffectiveDate(plan.getEffectiveDate());
			}
			results.setServiceStartDate(gET_SUBSCRIBER_INFOResponse.getServiceStartDate());
			results.setSim(gET_SUBSCRIBER_INFOResponse.getSim());
			results.setStatus(gET_SUBSCRIBER_INFOResponse.getStatus());
			for (SocType socs : gET_SUBSCRIBER_INFOResponse.getSocs()) {
			    com.budgetprepay.webservice.pojos.plintron.SocType soc = new com.budgetprepay.webservice.pojos.plintron.SocType();
				soc.setName(socs.getName());
				soc.setEffectiveDate(socs.getEffectiveDate());
				results.getSoc().add(soc);
			}
		}
		catch (Exception e) {
			results.setTransactionId(gET_SUBSCRIBER_INFORequest.getTransactionId());
			results.setResult("-1");
			results.setDescription(e.getMessage());
		}
		
	    return results;
	}
	
	public static ModifySubscriberStatusResponse getModifySubscriberStatus(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ModifySubscriberStatusRequest req = (ModifySubscriberStatusRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ModifySubscriberStatusResponse results = new ModifySubscriberStatusResponse();
		
		MODIFY_SUBSCRIBER_STATUSRequest mODIFY_SUBSCRIBER_STATUSRequest = new MODIFY_SUBSCRIBER_STATUSRequest(); 
		if (request.getClientReference() != null)
			mODIFY_SUBSCRIBER_STATUSRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			mODIFY_SUBSCRIBER_STATUSRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			mODIFY_SUBSCRIBER_STATUSRequest.setMsisdn(req.getMDN());
		if (req.getStatus() != null)
			mODIFY_SUBSCRIBER_STATUSRequest.setStatus(req.getStatus());

		request.setVerizonSynchronousRequestXML(mODIFY_SUBSCRIBER_STATUSRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	MODIFY_SUBSCRIBER_STATUSResponse mODIFY_SUBSCRIBER_STATUSResponse = MODIFY_SUBSCRIBER_STATUSResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(mODIFY_SUBSCRIBER_STATUSResponse.getErrorCode());
				results.setErrorDescription(mODIFY_SUBSCRIBER_STATUSResponse.getErrorDesc());
				results.setReturnCode(mODIFY_SUBSCRIBER_STATUSResponse.getResult());
				results.setTransactionId(mODIFY_SUBSCRIBER_STATUSResponse.getTransactionId());				
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static ChangePlanResponse changePlan(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ChangePlanRequest req = (ChangePlanRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ChangePlanResponse results = new ChangePlanResponse();
		
		CHANGE_PLANRequest cHANGE_PLANRequest = new CHANGE_PLANRequest(); 
		if (request.getClientReference() != null)
			cHANGE_PLANRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			cHANGE_PLANRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			cHANGE_PLANRequest.setMsisdn(req.getMDN());
		if (req.getIccid() != null)
			cHANGE_PLANRequest.setIccid(req.getIccid());
		if (req.getPlan() != null)
			cHANGE_PLANRequest.setPlan(req.getPlan());
		if (req.getPackageName() != null)
			cHANGE_PLANRequest.setPackageName(req.getPackageName());
		if (req.getFeature() != null)
			cHANGE_PLANRequest.setSocs(req.getFeature());

		request.setVerizonSynchronousRequestXML(cHANGE_PLANRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	CHANGE_PLANResponse cHANGE_PLANResponse = CHANGE_PLANResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(cHANGE_PLANResponse.getErrorCode());
				results.setErrorDescription(cHANGE_PLANResponse.getErrorDesc());
				results.setReturnCode(cHANGE_PLANResponse.getResult());
				results.setTransactionId(cHANGE_PLANResponse.getTransactionId());				
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setErrorDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static QuerySubscriberUsageResponse querySubscriberUsage(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		QuerySubscriberUsageRequest req = (QuerySubscriberUsageRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		QuerySubscriberUsageResponse results = new QuerySubscriberUsageResponse();
		
		QUERY_SUBSCRIBER_USAGERequest qUERY_SUBSCRIBER_USAGERequest = new QUERY_SUBSCRIBER_USAGERequest(); 
		if (request.getClientReference() != null)
			qUERY_SUBSCRIBER_USAGERequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			qUERY_SUBSCRIBER_USAGERequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			qUERY_SUBSCRIBER_USAGERequest.setMsisdn(req.getMDN());

		request.setVerizonSynchronousRequestXML(qUERY_SUBSCRIBER_USAGERequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        int trys = 1;
	        while (inFromServer.available() <= 0) {
	        	if (trys == 10)
	        		throw new Exception("Time-out");
	        	else {
	                Thread.sleep(1000 * 1);
	                trys++;
	        	}
	        }
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	QUERY_SUBSCRIBER_USAGEResponse qUERY_SUBSCRIBER_USAGE = QUERY_SUBSCRIBER_USAGEResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setDescription(qUERY_SUBSCRIBER_USAGE.getDescription());
				results.setErrorCode(qUERY_SUBSCRIBER_USAGE.getErrorCode());
				results.setErrorDesc(qUERY_SUBSCRIBER_USAGE.getErrorDesc());
				results.setImei(qUERY_SUBSCRIBER_USAGE.getImei());
				results.setMsisdn(qUERY_SUBSCRIBER_USAGE.getMsisdn());
				results.setResult(qUERY_SUBSCRIBER_USAGE.getResult());
				results.setSim(qUERY_SUBSCRIBER_USAGE.getSim());
				results.setStatus(qUERY_SUBSCRIBER_USAGE.getStatus());
				results.setTransactionId(qUERY_SUBSCRIBER_USAGE.getTransactionId());
				for (UsageDetailType usage : qUERY_SUBSCRIBER_USAGE.getUsage()) {
					UsageType usageType = new UsageType();
					usageType.setExpiryDateTime(usage.getExpiryDateTime());
					usageType.setLimit(usage.getLimit());
					usageType.setSoc(usage.getSoc());
					usageType.setStatus(usage.getStatus());
					usageType.setType(usage.getType());
					usageType.setUsed(usage.getUsed());
					results.getUsage().add(usageType);
				}
			
	        }
		}
		catch (Exception e) {
			results.setTransactionId(qUERY_SUBSCRIBER_USAGERequest.getTransactionId());
			results.setErrorCode("-1");
			results.setErrorDesc(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static ReactivateSubscriberResponse reactivateSubscriber(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ReactivateSubscriberRequest req = (ReactivateSubscriberRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ReactivateSubscriberResponse results = new ReactivateSubscriberResponse();
		
		REACTIVATE_SUBSCRIBERRequest rEACTIVATE_SUBSCRIBERRequest = new REACTIVATE_SUBSCRIBERRequest(); 
		if (request.getClientReference() != null)
			rEACTIVATE_SUBSCRIBERRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			rEACTIVATE_SUBSCRIBERRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			rEACTIVATE_SUBSCRIBERRequest.setMsisdn(req.getMDN());
		if (req.getIccid() != null)
			rEACTIVATE_SUBSCRIBERRequest.setIccid(req.getIccid());

		request.setVerizonSynchronousRequestXML(rEACTIVATE_SUBSCRIBERRequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
	        request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        REACTIVATE_SUBSCRIBERResponse rEACTIVATE_SUBSCRIBERResponse = REACTIVATE_SUBSCRIBERResponse.parse(request.getVerizonSynchronousResponseXML()); 
			results.setAction(rEACTIVATE_SUBSCRIBERResponse.getAction());
			results.setErrorCode(rEACTIVATE_SUBSCRIBERResponse.getErrorCode());
			results.setErrorDesc(rEACTIVATE_SUBSCRIBERResponse.getErrorDesc());
			results.setResult(rEACTIVATE_SUBSCRIBERResponse.getResult());
			results.setDescription(rEACTIVATE_SUBSCRIBERResponse.getDescription());
			results.setMessageCode(rEACTIVATE_SUBSCRIBERResponse.getMessageCode());
			results.setMsisdn(rEACTIVATE_SUBSCRIBERResponse.getMsisdn());
			results.setTransactionId(rEACTIVATE_SUBSCRIBERResponse.getTransactionId());
	        
		}
		catch (Exception e) {
			results.setTransactionId(rEACTIVATE_SUBSCRIBERRequest.getTransactionId());
			results.setErrorCode("-1");
			results.setErrorDesc(e.getMessage());
		}
		
	    return results;
	}
	
	public static ReplaceMSISDNResponse replaceMSISDN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ReplaceMSISDNRequest req = (ReplaceMSISDNRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ReplaceMSISDNResponse results = new ReplaceMSISDNResponse();
		
		REPLACE_MSISDNRequest rEPLACE_MSISDNRequest = new REPLACE_MSISDNRequest(); 
		if (request.getClientReference() != null)
			rEPLACE_MSISDNRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			rEPLACE_MSISDNRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			rEPLACE_MSISDNRequest.setMsisdn(req.getMDN());
		if (req.getIccid() != null)
			rEPLACE_MSISDNRequest.setIccid(req.getIccid());
		if (req.getZipCode() != null)
			rEPLACE_MSISDNRequest.setZipCode(req.getZipCode());

		request.setVerizonSynchronousRequestXML(rEPLACE_MSISDNRequest.toString());
		
		String response = null;
		
		try {
	        response = send2Provisioning(getProvisioningSocket(), request.getVerizonSynchronousRequestXML());
	        request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        REPLACE_MSISDNResponse rEPLACE_MSISDNResponse = REPLACE_MSISDNResponse.parse(request.getVerizonSynchronousResponseXML()); 
			results.setAction(rEPLACE_MSISDNResponse.getAction());
			results.setErrorCode(rEPLACE_MSISDNResponse.getErrorCode());
			results.setErrorDesc(rEPLACE_MSISDNResponse.getErrorDesc());
			results.setMsisdn(rEPLACE_MSISDNResponse.getMsisdn());
			results.setTransactionId(rEPLACE_MSISDNResponse.getTransactionId());
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDesc(e.getMessage());
		}
		
	    return results;
	}
	
	public static ChangeMSISDNResponse changeMSISDN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ChangeMSISDNRequest req = (ChangeMSISDNRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ChangeMSISDNResponse results = new ChangeMSISDNResponse();
		
		CHANGE_MSISDNRequest cHANGE_MSISDNRequest = new CHANGE_MSISDNRequest(); 
		if (request.getClientReference() != null)
			cHANGE_MSISDNRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			cHANGE_MSISDNRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			cHANGE_MSISDNRequest.setMsisdn(req.getMDN());
		if (req.getIccid() != null)
			cHANGE_MSISDNRequest.setIccId(req.getIccid());
		if (req.getPortInFlag() != null)
			cHANGE_MSISDNRequest.setPortInFlag(req.getPortInFlag());

		request.setVerizonSynchronousRequestXML(cHANGE_MSISDNRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        int trys = 1;
	        while (inFromServer.available() <= 0) {
	        	if (trys == 10)
	        		throw new Exception("Time-out");
	        	else {
	                Thread.sleep(1000 * 1);
	                trys++;
	        	}
	        }
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	CHANGE_MSISDNResponse cHANGE_MSISDNResponse = CHANGE_MSISDNResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setErrorCode(cHANGE_MSISDNResponse.getErrorCode());
				results.setErrorDesc(cHANGE_MSISDNResponse.getErrorDesc());
				results.setMsisdn(cHANGE_MSISDNResponse.getMsisdn());
				results.setTransactionId(cHANGE_MSISDNResponse.getTransactionId());
	        }
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDesc(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static ChangeIMSIResponse changeIMSI(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ChangeIMSIRequest req = (ChangeIMSIRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ChangeIMSIResponse results = new ChangeIMSIResponse();
		
		CHANGE_IMSIRequest cHANGE_IMSIRequest = new CHANGE_IMSIRequest(); 
		if (request.getClientReference() != null)
			cHANGE_IMSIRequest.setTransactionId(request.getClientReference());
		if (req.getMDN() != null)
			cHANGE_IMSIRequest.setMsisdn(req.getMDN());
		if (req.getNewIMSI() != null)
			cHANGE_IMSIRequest.setNewImsi(req.getNewIMSI());
		if (req.getOldIMSI() != null)
			cHANGE_IMSIRequest.setOldImsi(req.getOldIMSI());

		request.setVerizonSynchronousRequestXML(cHANGE_IMSIRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        int trys = 1;
	        while (inFromServer.available() <= 0) {
	        	if (trys == 10)
	        		throw new Exception("Time-out");
	        	else {
	                Thread.sleep(1000 * 1);
	                trys++;
	        	}
	        }
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	CHANGE_IMSIResponse cHANGE_IMSIResponse = CHANGE_IMSIResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setErrorCode(cHANGE_IMSIResponse.getErrorCode());
				results.setErrorDesc(cHANGE_IMSIResponse.getErrorDesc());
				results.setTmoResponse(cHANGE_IMSIResponse.getTmoResponse());
				results.setTransactionId(cHANGE_IMSIResponse.getTransactionId());
	        }
		}
		catch (Exception e) {
			results.setErrorCode("-1");
			results.setErrorDesc(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static BlockUnblockSIMResponse blockUnblockSIM(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		BlockUnblockSIMRequest blockUnblockSIMRequest = (BlockUnblockSIMRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		BlockUnblockSIMResponse blockUnblockSIMResponse = new BlockUnblockSIMResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.BlockUnblockSIMRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.BlockUnblockSIMRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.BlockUnblockSIMResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(blockUnblockSIMRequest.getMDN());
			plintronRequest.setOperationCode(blockUnblockSIMRequest.getOperationCode());
			plintronRequest.setSetFlag(blockUnblockSIMRequest.getSetFlag());
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.BlockUnblockSIMResponse.parse(response);
			
			blockUnblockSIMResponse.setErrorCode(plintronResponse.getReturnCode());
			blockUnblockSIMResponse.setErrorDescription(plintronResponse.getErrorDescription());
			blockUnblockSIMResponse.setResult(plintronResponse.getSessionId());
			blockUnblockSIMResponse.setTransactionId(request.getReferenceNumber());
			blockUnblockSIMResponse.setResultCode(plintronResponse.getReturnCode());
		}
		catch (Exception e) {
			blockUnblockSIMResponse.setErrorCode("-1");
			blockUnblockSIMResponse.setErrorDescription("ERROR - " + e.getMessage());
			blockUnblockSIMResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return blockUnblockSIMResponse;
	}	
	
	public static SwapMSISDNResponse swapMSISDN(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		SwapMSISDNRequest swapMSISDNRequest = (SwapMSISDNRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		SwapMSISDNResponse swapMSISDNResponse = new SwapMSISDNResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.SwapMSISDNRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.SwapMSISDNRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.SwapMSISDNResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(swapMSISDNRequest.getMDN());
			plintronRequest.setDna(swapMSISDNRequest.getDna());
			plintronRequest.setIccid(swapMSISDNRequest.getIccid());
			plintronRequest.setImsi(swapMSISDNRequest.getImsi());
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.SwapMSISDNResponse.parse(response);
			
			swapMSISDNResponse.setResultCode(plintronResponse.getReturnCode());
			swapMSISDNResponse.setErrorDescription(plintronResponse.getErrorDescription());
			swapMSISDNResponse.setOldMsisdn(plintronResponse.getOldMsisdn());
			swapMSISDNResponse.setMultiImsi(plintronResponse.getMultiImsi());
			swapMSISDNResponse.setTransactionId(request.getReferenceNumber());
			swapMSISDNResponse.setResultCode(plintronResponse.getReturnCode());
		}
		catch (Exception e) {
			swapMSISDNResponse.setResultCode("-1");
			swapMSISDNResponse.setErrorDescription("ERROR - " + e.getMessage());
			swapMSISDNResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return swapMSISDNResponse;
	}	
	
	public static SwapIMSIResponse swapIMSI(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		SwapIMSIRequest swapIMSIRequest = (SwapIMSIRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		SwapIMSIResponse swapIMSIResponse = new SwapIMSIResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.SwapIMSIRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.SwapIMSIRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.SwapIMSIResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(swapIMSIRequest.getMDN());
			plintronRequest.setIccid(swapIMSIRequest.getIccid());
			plintronRequest.setImsi(swapIMSIRequest.getImsi());
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.SwapIMSIResponse.parse(response);
			
			swapIMSIResponse.setResultCode(plintronResponse.getReturnCode());
			swapIMSIResponse.setErrorDescription(plintronResponse.getErrorDescription());
			swapIMSIResponse.setOldImsi(plintronResponse.getOldImsi());
			swapIMSIResponse.setPriImsi(plintronResponse.getPriImsi());
			swapIMSIResponse.setSecImsi(plintronResponse.getSecImsi());
			swapIMSIResponse.setMultiImsi(plintronResponse.getMultiImsi());
			swapIMSIResponse.setTransactionId(request.getReferenceNumber());
			swapIMSIResponse.setResultCode(plintronResponse.getReturnCode());
		}
		catch (Exception e) {
			swapIMSIResponse.setResultCode("-1");
			swapIMSIResponse.setErrorDescription("ERROR - " + e.getMessage());
			swapIMSIResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return swapIMSIResponse;
	}	
	
	public static ModifyingSubscriberLanguageTypeResponse modifyingSubscriberLanguageType(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ModifyingSubscriberLanguageTypeRequest modifyingSubscriberLanguageTypeRequest = (ModifyingSubscriberLanguageTypeRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());
		ModifyingSubscriberLanguageTypeResponse modifyingSubscriberLanguageTypeResponse = new ModifyingSubscriberLanguageTypeResponse();
		
		com.budgetprepay.webservice.client.plintron.billing.pojo.ModifyingSubscriberLanguageTypeRequest plintronRequest = new com.budgetprepay.webservice.client.plintron.billing.pojo.ModifyingSubscriberLanguageTypeRequest();
		com.budgetprepay.webservice.client.plintron.billing.pojo.ModifyingSubscriberLanguageTypeResponse plintronResponse = null;
		
		Session session = null;
		
		try {
			session = login();
				
			plintronRequest.setDialogID(CommonUtil.getRandom());
			plintronRequest.setMdn(modifyingSubscriberLanguageTypeRequest.getMDN());
			plintronRequest.setLangType(modifyingSubscriberLanguageTypeRequest.getLanguageType());
			plintronRequest.setSessionId(session.sessionId);
			request.setVerizonSynchronousRequestXML(plintronRequest.toString());

			String response = send2Billing(session.socket, plintronRequest.toString()).substring(9);
			request.setVerizonSynchronousResponseXML(response);
			plintronResponse = com.budgetprepay.webservice.client.plintron.billing.pojo.ModifyingSubscriberLanguageTypeResponse.parse(response);
			
			modifyingSubscriberLanguageTypeResponse.setErrorDescription(plintronResponse.getErrorDescription());
			modifyingSubscriberLanguageTypeResponse.setTransactionId(request.getReferenceNumber());
			modifyingSubscriberLanguageTypeResponse.setResultCode(plintronResponse.getReturnCode());
			modifyingSubscriberLanguageTypeResponse.setLanguageType(plintronResponse.getLang());
			modifyingSubscriberLanguageTypeResponse.setOldLanguageType(plintronResponse.getOldLang());
		}
		catch (Exception e) {
			modifyingSubscriberLanguageTypeResponse.setResultCode("-1");
			modifyingSubscriberLanguageTypeResponse.setErrorDescription("ERROR - " + e.getMessage());
			modifyingSubscriberLanguageTypeResponse.setTransactionId(request.getReferenceNumber());
		}
		finally {
			if (session != null)
		        logout(session);		
		}
	    return modifyingSubscriberLanguageTypeResponse;
	}	
	
	public static AddSOCResponse addSOC(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		AddSOCRequest req = (AddSOCRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		AddSOCResponse results = new AddSOCResponse();
		
		ADD_SOCRequest aDD_SOCRequest = new ADD_SOCRequest(); 
		if (request.getClientReference() != null)
			aDD_SOCRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			aDD_SOCRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			aDD_SOCRequest.setMsisdn(req.getMDN());
		if (req.getSoc() != null)
			aDD_SOCRequest.setSocs(req.getSoc());

		request.setVerizonSynchronousRequestXML(aDD_SOCRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	ADD_SOCResponse aDD_SOCResponse = ADD_SOCResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(aDD_SOCResponse.getErrorCode());
				results.setReturnDescription(aDD_SOCResponse.getErrorDesc());
				results.setTransactionId(aDD_SOCResponse.getTransactionId());				
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setReturnDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static ModifySubscriberBucketResponse modifySubscriberBucket(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		ModifySubscriberBucketRequest req = (ModifySubscriberBucketRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		ModifySubscriberBucketResponse results = new ModifySubscriberBucketResponse();
		
		MODIFY_SUBSCRIBER_BUCKETRequest mODIFY_SUBSCRIBER_BUCKETRequest = new MODIFY_SUBSCRIBER_BUCKETRequest(); 
		if (request.getClientReference() != null)
			mODIFY_SUBSCRIBER_BUCKETRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			mODIFY_SUBSCRIBER_BUCKETRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			mODIFY_SUBSCRIBER_BUCKETRequest.setMsisdn(req.getMDN());
		if (req.getSoc() != null)
			mODIFY_SUBSCRIBER_BUCKETRequest.setSocs(req.getSoc());

		request.setVerizonSynchronousRequestXML(mODIFY_SUBSCRIBER_BUCKETRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	MODIFY_SUBSCRIBER_BUCKETResponse mODIFY_SUBSCRIBER_BUCKETResponse = MODIFY_SUBSCRIBER_BUCKETResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(mODIFY_SUBSCRIBER_BUCKETResponse.getResult());
				results.setReturnDescription(mODIFY_SUBSCRIBER_BUCKETResponse.getDescription());
				results.setTransactionId(mODIFY_SUBSCRIBER_BUCKETResponse.getTransactionId());				
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setReturnDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	public static RemoveSOCResponse removeSOC(Request request) throws Exception {
		if (request == null)
			throw new Exception("Request is null");
		
		RemoveSOCRequest req = (RemoveSOCRequest) CommonUtil.XML2JAXB(Class.forName(request.getClientRequestClass()), request.getClientRequestXML());

		RemoveSOCResponse results = new RemoveSOCResponse();
		
		REMOVE_SOCRequest rEMOVE_SOCRequest = new REMOVE_SOCRequest(); 
		if (request.getClientReference() != null)
			rEMOVE_SOCRequest.setTransactionId(request.getClientReference());
		if (req.getImsi() != null)
			rEMOVE_SOCRequest.setImsi(req.getImsi());
		if (req.getMDN() != null)
			rEMOVE_SOCRequest.setMsisdn(req.getMDN());
		if (req.getSoc() != null)
			rEMOVE_SOCRequest.setSocs(req.getSoc());

		request.setVerizonSynchronousRequestXML(rEMOVE_SOCRequest.toString());
		
		String response = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(ResourceUtil.get("plintron.provisioning.host"), Integer.valueOf(ResourceUtil.get("plintron.provisioning.port")));
			
			String register = getRegistration(InetAddress.getLocalHost().getHostAddress());
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(register) + register).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(register) + register).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        }
	        
	        String message = request.getVerizonSynchronousRequestXML();
	        
			out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	byte[] buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        	response = new String(buffer);
	        	request.setVerizonSynchronousResponseXML(response.substring(9));
	        
	        	REMOVE_SOCResponse rEMOVE_SOCResponse = REMOVE_SOCResponse.parse(request.getVerizonSynchronousResponseXML()); 
				results.setReturnCode(rEMOVE_SOCResponse.getErrorCode());
				results.setReturnDescription(rEMOVE_SOCResponse.getErrorDesc());
				results.setTransactionId(rEMOVE_SOCResponse.getTransactionId());				
	        }
		}
		catch (Exception e) {
			results.setReturnCode("-1");
			results.setReturnDescription(e.getMessage());
		}
		finally {
			if (socket != null)
		        socket.close();		
		}
		
	    return results;
	}
	
	private static ServiceInfoType getServiceInfo(final String values) throws Exception {
		ServiceInfoType serviceInfoType = new ServiceInfoType();
		String[] tokens = values.split(",");
		for (int i = 0; i < tokens.length; i++) {
			switch (i) {
			case 0:
				serviceInfoType.setMOCall(tokens[i]);
			    break;
			case 1:
				serviceInfoType.setMTCall(tokens[i]);
			    break;
			case 2:
				serviceInfoType.setMORoamingCall(tokens[i]);
			    break;
			case 3:
				serviceInfoType.setMTRoamingCall(tokens[i]);
			    break;	
			case 4:
				serviceInfoType.setMOSMS(tokens[i]);
			    break;
			case 5:
				serviceInfoType.setMTSMS(tokens[i]);
			    break;
			case 6:
				serviceInfoType.setMORoamingSMS(tokens[i]);
			    break;
			case 7:
				serviceInfoType.setMTRoamingSMS(tokens[i]);
			    break;
			case 8:
				serviceInfoType.setIVR(tokens[i]);
			    break;
			case 9:
				serviceInfoType.setUSSD(tokens[i]);
			    break;
			case 10:
				serviceInfoType.setVMS(tokens[i]);
			    break;
			case 11:
				serviceInfoType.setSMSTopup(tokens[i]);
			    break;	
			case 12:
				serviceInfoType.setMobileHomeAccount(tokens[i]);
			    break;
			case 13:
				serviceInfoType.setMOVideoCall(tokens[i]);
			    break;
			case 14:
				serviceInfoType.setMTVideoCall(tokens[i]);
			    break;
			case 15:
				serviceInfoType.setMORoamingVideoCall(tokens[i]);
			    break;	
			case 16:
				serviceInfoType.setMTRoamingVideoCall(tokens[i]);
			    break;
			case 17:
				serviceInfoType.setMCA(tokens[i]);
			    break;	
			case 18:
				serviceInfoType.setCRBT(tokens[i]);
			    break;
			case 19:
				serviceInfoType.setMOData(tokens[i]);
			    break;
			case 20:
				serviceInfoType.setMORoamData(tokens[i]);
			    break;
			case 21:
				serviceInfoType.setCBS(tokens[i]);
			    break;		    
			}
		}
		return serviceInfoType;
	}
		
	public static String send2ESME(final String host, final int port, final String message) throws Exception {
		byte[] buffer = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(host, port);
			
			ByteBuffer out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        
			DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());
			
	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	            buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        return new String(buffer);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			if (socket != null)
				socket.close();
		}
	}
	
	public static String send2Billing(Socket socket, final String message) throws Exception {
		byte[] buffer = null;
		
		try {
			ByteBuffer out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());

	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        return new String(buffer);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static String send2Billing(final String host, final int port, final String message) throws Exception {
		byte[] buffer = null;
		Socket  socket = null;
		
		try {
			socket = new Socket(host, port);
			ByteBuffer out = ByteBuffer.allocate(new String(length(message) + message).length());
			out.order(ByteOrder.LITTLE_ENDIAN);
			out.put(new String(length(message) + message).getBytes());
	        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
	        outToServer.write(out.array());

	        DataInputStream inFromServer = new DataInputStream(socket.getInputStream());
	        
	        while (inFromServer.available() <= 0)
	            Thread.sleep(1000 * 1);
	    	
	        if (inFromServer.available() > 0) {
	        	buffer = new byte[inFromServer.available()];
	        	inFromServer.readFully(buffer);
	        }
	        
	        return new String(buffer);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			if (socket != null)
				socket.close();
		}
	}
	
	private static String getRegistration(final String entityName) throws Exception {
		return new RegistrationRequest(entityName).toString();
	}
	
	public static String length(final String value) {
		return String.format("%09d", value.length());
	}
	
	public static void validateTransactionId(final User user, final String reference) throws Exception {
		if (user == null)
			throw new Exception("ERROR: user is null");
		if (reference == null)
			throw new Exception("ERROR: transaction id is null");
		if (RequestFacade.retrieveByClientReference(user, reference) != null)
			throw new Exception("ERROR-Transaction id must be unique");
	}
	
	public static void sendPortCSRFeedback(final PlintronAsyncResponse plintronAsyncResponse) throws Exception {
        ReturnMessage results = new ReturnMessage();
        String url = new String("");
        Integer count = 0;
        
        try {
        	while(true) {
    			if (count >= 5)
    				break;
    			Thread.sleep(5000);
    			count++;
        		try {
        	        url = ResourceUtil.get("plintron.budget.updateportstatus.url").replaceFirst("###", plintronAsyncResponse.getMdn());
        	        results = CommonUtil.get(url);
        		}
        		catch (Exception e) {
        			;
        		}
        		
        		if (results.getText().startsWith("{\"ERRORCODE\":0")) { //{"ERRORCODE":0,"ERRORMESSAGE":""} {
        			try {
                        Request budgetRequest = RequestFacade.retrieveByReferenceNumber(plintronAsyncResponse.getReferenceNumber());
                		if (budgetRequest != null) {
                			StringBuffer xml = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                			xml.append("<updateportstatus>");
                			xml.append("<code>" + results.getCode() + "</code>");
                			xml.append("<message>" + results.getText() + "</message>");
                	 		xml.append("</updateportstatus>");
        	        		budgetRequest.setClientAsynchronousResponseXML(xml.toString());
        	        		RequestFacade.update(budgetRequest);
                		}
                	}
                	catch (Exception e) {
                		throw new Exception("Unable to update ClientAsynchronousResponseXML Request table for MDN " + plintronAsyncResponse.getMdn() + " = " + results.getText());
                	}
        			break;
        		}
        	}
        }
        catch (Exception e) {
    		throw new Exception("Unable to send message to CSR for MDN " + plintronAsyncResponse.getMdn() + " = " + results.getText());
        }
	}
}

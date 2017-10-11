package com.budgetprepay.viewcontroller.verizon;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.facade.GroupFacade;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.filter.StringFilter;
import com.budgetprepay.viewcontroller.filter.StringFilterType;
import com.budgetprepay.viewcontroller.request.RequestListFilter;
import com.budgetprepay.webservice.endpoints.VerizonEndpoint;
import com.budgetprepay.webservice.pojos.verizon.DeviceInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.DeviceInquiryResponse;
import com.budgetprepay.webservice.pojos.verizon.LineInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.LineInquiryResponse;
import com.budgetprepay.webservice.pojos.verizon.MessageHeaderType;
import com.budgetprepay.webservice.pojos.verizon.OrderInquiryRequest;
import com.budgetprepay.webservice.pojos.verizon.OrderInquiryResponse;
import com.budgetprepay.webservice.pojos.verizon.SearchBucketRequest;
import com.budgetprepay.webservice.pojos.verizon.SearchBucketResponse;
import com.budgetprepay.webservice.pojos.verizon.ValidateDeviceRequest;
import com.budgetprepay.webservice.pojos.verizon.ValidateDeviceResponse;
import com.budgetprepay.webservice.pojos.verizon.ValidateMDNPortabilityRequest;
import com.budgetprepay.webservice.pojos.verizon.ValidateMDNPortabilityResponse;
import com.budgetprepay.webservice.util.VerizonUtil;

public class Controller extends BaseController {

	private static final long serialVersionUID = 1L;

	protected ValidateDeviceWindow validateDeviceWindow;
	private static final String VALIDATE_DEVICE_URL = "/Verizon/validate-device-window.zul";

	protected ValidatePortinWindow validatePortinWindow;
	private static final String VALIDATE_PORTIN_URL = "/Verizon/validate-portin-window.zul";
	
	protected OrderInquiryWindow orderInquiryWindow;
	private static final String ORDER_INQUIRY_URL = "/Verizon/order-inquiry-window.zul";
	
	protected LineInquiryWindow lineInquiryWindow;
	private static final String LINE_INQUIRY_URL = "/Verizon/line-inquiry-window.zul";
	
	protected DeviceInquiryWindow deviceInquiryWindow;
	private static final String DEVICE_INQUIRY_URL = "/Verizon/device-inquiry-window.zul";
	
	protected SearchBucketWindow searchBucketWindow;
	private static final String SEARCH_BUCKET_URL = "/Verizon/search-bucket-window.zul";
	
	public void onValidateDeviceSetup(Event event) {
		validateDeviceWindow = (ValidateDeviceWindow) Executions.createComponents(VALIDATE_DEVICE_URL, null, null);
		validateDeviceWindow.doHighlighted();
	}
	
	public void onValidateDevice(Event event) {
		if (validateDeviceWindow == null) throw new IllegalStateException("Validate Device Window object is not available");
		validateDeviceWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.VALIDATING_DEVICE, validateDeviceWindow.getDeviceId()));
		Events.echoEvent("onDoValidateDevice", validateDeviceWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoValidateDevice(Event event) {
		ValidateDeviceRequest request = new ValidateDeviceRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(validateDeviceWindow.getClassOfService().getName());
		try {
	    	request.getMessageHeader().setReferenceNumber(VerizonUtil.getRandom());
		}
		catch (Exception e) {
			showErrorBox(e, "Could not validate device");
			return;
		}
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		request.setDeviceId(validateDeviceWindow.getDeviceId());

		ValidateDeviceResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.validateDeviceRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not validate device");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }	
		    else 
		        Messagebox.show("Could not validate device", "Validate Device - " + request.getDeviceId(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not validate device");
		}
		validateDeviceWindow.detach();
		validateDeviceWindow = null;
	}
	
	public void onValidatePortinSetup(Event event) {
		validatePortinWindow = (ValidatePortinWindow) Executions.createComponents(VALIDATE_PORTIN_URL, null, null);
		validatePortinWindow.doHighlighted();
	}
	
	public void onValidatePortin(Event event) {
		if (validatePortinWindow == null) throw new IllegalStateException("Validate Portin Window object is not available");
		validatePortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.VALIDATING_PORTIN, validatePortinWindow.getMdn()));
		Events.echoEvent("onDoValidatePortin", validatePortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoValidatePortin(Event event) {
		ValidateMDNPortabilityRequest request = new ValidateMDNPortabilityRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(validatePortinWindow.getClassOfService().getName());
		try {
	    	request.getMessageHeader().setReferenceNumber(VerizonUtil.getRandom());
		}
		catch (Exception e) {
			showErrorBox(e, "Could not validate porintin");
			return;
		}
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		request.setMdn(validatePortinWindow.getMdn());

		ValidateMDNPortabilityResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.validateMDNPortabilityRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not validate portin");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not validate portin", "Validate Portin - " + request.getMdn(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not validate portin");
		}
		validatePortinWindow.detach();
		validatePortinWindow = null;
	}
	
	public void onOrderInquirySetup(Event event) {
		orderInquiryWindow = (OrderInquiryWindow) Executions.createComponents(ORDER_INQUIRY_URL, null, null);
		orderInquiryWindow.doHighlighted();
	}
	
	public void onOrderInquiry(Event event) {
		if (orderInquiryWindow == null) throw new IllegalStateException("Orcer Inquiry Window object is not available");
		orderInquiryWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.ORDER_INQUIRY, orderInquiryWindow.getReferenceNumber()));
		Events.echoEvent("onDoOrderInquiry", orderInquiryWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoOrderInquiry(Event event) {
		OrderInquiryRequest request = new OrderInquiryRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(orderInquiryWindow.getClassOfService().getName());
	    request.getMessageHeader().setReferenceNumber(orderInquiryWindow.getReferenceNumber());
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		
		OrderInquiryResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.orderInquiryRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not inquiry on order");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not inquiry on order", "Order Inquiry - " + request.getMessageHeader().getReferenceNumber(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not inquiry on order");
		}
		orderInquiryWindow.detach();
		orderInquiryWindow = null;
	}
	
	public void onLineInquirySetup(Event event) {
		lineInquiryWindow = (LineInquiryWindow) Executions.createComponents(LINE_INQUIRY_URL, null, null);
		lineInquiryWindow.doHighlighted();
	}
	
	public void onLineInquiry(Event event) {
		if (lineInquiryWindow == null) throw new IllegalStateException("Line Inquiry Window object is not available");
		lineInquiryWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.LINE_INQUIRY, lineInquiryWindow.getMdn()));
		Events.echoEvent("onDoLineInquiry", lineInquiryWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoLineInquiry(Event event) {
		LineInquiryRequest request = new LineInquiryRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(lineInquiryWindow.getClassOfService().getName());
		try {
	        request.getMessageHeader().setReferenceNumber(VerizonUtil.getRandom());
		}
		catch (Exception e) {
			showErrorBox(e, "Could not inquiry on line");
			return;
		}
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		request.setMdn(lineInquiryWindow.getMdn());
		LineInquiryResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.lineInquiryRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not inquiry on line");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not inquiry on line", "Line Inquiry - " + request.getMdn(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not inquiry on line");
		}
		lineInquiryWindow.detach();
		lineInquiryWindow = null;
	}
	
	public void onDeviceInquirySetup(Event event) {
		deviceInquiryWindow = (DeviceInquiryWindow) Executions.createComponents(DEVICE_INQUIRY_URL, null, null);
		deviceInquiryWindow.doHighlighted();
	}
	
	public void onDeviceInquiry(Event event) {
		if (deviceInquiryWindow == null) throw new IllegalStateException("Device Inquiry Window object is not available");
		deviceInquiryWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.LINE_INQUIRY, deviceInquiryWindow.getDeviceId()));
		Events.echoEvent("onDoDeviceInquiry", deviceInquiryWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoDeviceInquiry(Event event) {
		DeviceInquiryRequest request = new DeviceInquiryRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(deviceInquiryWindow.getClassOfService().getName());
		try {
	        request.getMessageHeader().setReferenceNumber(VerizonUtil.getRandom());
		}
		catch (Exception e) {
			showErrorBox(e, "Could not inquiry on device");
			return;
		}
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		if (deviceInquiryWindow.getDeviceType().equals("MEID"))
		    request.setMeid(deviceInquiryWindow.getDeviceId());
		else
			request.setEsn(deviceInquiryWindow.getDeviceId());
		
		DeviceInquiryResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.deviceInquiryRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not inquiry on device");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not inquiry on line", "Device Inquiry - " + request.getEsn(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not inquiry on device");
		}
		deviceInquiryWindow.detach();
		deviceInquiryWindow = null;
	}
	
	public void onSearchBucketSetup(Event event) {
		searchBucketWindow = (SearchBucketWindow) Executions.createComponents(SEARCH_BUCKET_URL, null, null);
		searchBucketWindow.doHighlighted();
	}
	
	public void onSearchBucket(Event event) {
		if (searchBucketWindow == null) throw new IllegalStateException("Search Bucket Window object is not available");
		searchBucketWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.SEARCH_BUCKET, searchBucketWindow.getMdn()));
		Events.echoEvent("onDoSearchBucket", searchBucketWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoSearchBucket(Event event) {
		SearchBucketRequest request = new SearchBucketRequest();
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setAnsynchronousReturnUrl("http://localhost/MVNO/PostBackTestServlet");
		request.getMessageHeader().setPlanCode(searchBucketWindow.getClassOfService().getName());
		try {
	        request.getMessageHeader().setReferenceNumber(VerizonUtil.getRandom());
		}
		catch (Exception e) {
			showErrorBox(e, "Could not search bucket");
			return;
		}
		request.getMessageHeader().setUserId(SessionUtil.getCurrentUsername());
		request.setMdn(searchBucketWindow.getMdn());
	    SearchBucketResponse response = null;
		VerizonEndpoint endpoint = new VerizonEndpoint();
		
		try {
			response = endpoint.searchBucketRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not search bucket");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(request.getMessageHeader().getReferenceNumber());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not search bucket", "Search Bucket - " + request.getMdn(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not search bucket");
		}
		searchBucketWindow.detach();
		searchBucketWindow = null;
	}
	
	public List<ClassOfService> getClassOfServices() {
		List<ClassOfService> classOfServices = null;
		try {
	        classOfServices = new ArrayList<ClassOfService>(GroupFacade.retrieveByName(SessionUtil.getCurrentUser().getGroup().getName()).getClassOfServices());
	    }
		catch (Exception e) {
			classOfServices = new ArrayList<ClassOfService>();
		    showErrorBox(e, Messages.FAILED_TO_RETRIEVE_CLASSOFSERVICES);
		}
		return classOfServices;
	}
}

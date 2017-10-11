package com.budgetprepay.viewcontroller.plintron;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Center;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.filter.StringFilter;
import com.budgetprepay.viewcontroller.filter.StringFilterType;
import com.budgetprepay.viewcontroller.plintron.BasicFilterWindow;
import com.budgetprepay.viewcontroller.request.RequestListFilter;
import com.budgetprepay.webservice.endpoints.PlintronEndpoint;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMRequest;
import com.budgetprepay.webservice.pojos.plintron.BlockUnblockSIMResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangeIMSIRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangeIMSIResponse;
import com.budgetprepay.webservice.pojos.plintron.ChangeMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.ChangeMSISDNResponse;
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
import com.budgetprepay.webservice.pojos.plintron.MessageHeaderType;
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
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberRequest;
import com.budgetprepay.webservice.pojos.plintron.RemoveSubscriberResponse;
import com.budgetprepay.webservice.pojos.plintron.ReplaceMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.ReplaceMSISDNResponse;
import com.budgetprepay.webservice.pojos.plintron.SendMessageRequest;
import com.budgetprepay.webservice.pojos.plintron.SendMessageResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceActivateResponse;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateRequest;
import com.budgetprepay.webservice.pojos.plintron.ServiceDeactivateResponse;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNRequest;
import com.budgetprepay.webservice.pojos.plintron.SwapMSISDNResponse;

public class Controller extends BaseController {

	private static final long serialVersionUID = 1L;

	protected BasicFilterWindow basicFilterWindow;
	protected static final String LIST_FILTER_PARAM_KEY = "plintronListFilter";
	private static final String BASIC_FILTER_URL = "/Plintron/basic-filter.zul";
	
	protected ChangeVMPinWindow changeVMPinWindow;
	private static final String CHANGE_VM_PIN_URL = "/Plintron/change-vm-pin-window.zul";

	protected CreatePortinWindow createPortinWindow;
	private static final String CREATE_PORTIN_URL = "/Plintron/create-portin-window.zul";
	
	protected ValidatePortinWindow validatePortinWindow;
	private static final String VALIDATE_PORTIN_URL = "/Plintron/validate-portin-window.zul";
	
	protected StatusOfPortinWindow statusOfPortinWindow;
	private static final String STATUS_OF_PORTIN_URL = "/Plintron/status-of-portin-window.zul";
	
	protected UpdatePortinWindow updatePortinWindow;
	private static final String UPDATE_PORTIN_URL = "/Plintron/update-portin-window.zul";
	
	protected CancelPortinWindow cancelPortinWindow;
	private static final String CANCEL_PORTIN_URL = "/Plintron/cancel-portin-window.zul";
	
	protected AccountDetailWindow accountDetailWindow;
	private static final String ACCOUNT_DETAIL_URL = "/Plintron/account-detail-window.zul";
	
	protected SubscriptionStatusWindow subscriptionStatusWindow;
	private static final String SUBSCRIPTION_STATUS_URL = "/Plintron/subscription-status-window.zul";
	
	protected BundleSubscriptionWindow bundleSubscriptionWindow;
	private static final String BUNDLE_SUBSCRIPTION_URL = "/Plintron/bundle-subscription-window.zul";
	
	protected SendMessageWindow sendMessageWindow;
	private static final String SEND_MESSAGE_URL = "/Plintron/send-message-window.zul";
	
	protected SubscriberInfoWindow subscriberInfoWindow;
	private static final String SUBSCRIBER_INFO_URL = "/Plintron/subscriber-info-window.zul";
	
	protected RemoveSubscriberWindow removeSubscriberWindow;
	private static final String REMOVE_SUBSCRIBER_URL = "/Plintron/remove-subscriber-window.zul";
	
	protected ActivateServiceWindow activateServiceWindow;
	private static final String ACTIVATE_SERVICE_URL = "/Plintron/activate-service-window.zul";
	
	protected DeactivateServiceWindow deactivateServiceWindow;
	private static final String DEACTIVATE_SERVICE_URL = "/Plintron/deactivate-service-window.zul";
	
	protected ModifySubscriberStatusWindow modifySubscriberStatusWindow;
	private static final String MODIFY_SUBSCRIBER_STATUS_URL = "/Plintron/modify-subscriber-status-window.zul";
	
	protected QuerySubscriberUsageWindow querySubscriberUsageWindow;
	private static final String QUERY_SUBSCRIBER_USAGE_URL = "/Plintron/query-subscriber-usage-window.zul";
	
	protected ReactivateSubscriberWindow reactivateSubscriberWindow;
	private static final String REACTIVATE_SUBSCRIBER_URL = "/Plintron/reactivate-subscriber-window.zul";
	
	protected ReplaceMSISDNWindow replaceMSISDNWindow;
	private static final String REPLACE_MSISDN_URL = "/Plintron/replace-msisdn-window.zul";
	
	protected ChangeMSISDNWindow changeMSISDNWindow;
	private static final String CHANGE_MSISDN_URL = "/Plintron/change-msisdn-window.zul";
	
	protected BlockUnblockSIMWindow blockUnblockSIMWindow;
	private static final String BLOCK_UNBLOCK_SIM_URL = "/Plintron/block-unblock-sim-window.zul";
	
	protected ModifyLanguageWindow modifyLanguageWindow;
	private static final String MODIFY_LANGUAGE_URL = "/Plintron/modify-language-window.zul";
	
	protected SwapMSISDNWindow swapMSISDNWindow;
	private static final String SWAP_MSISDN_URL = "/Plintron/swap-msisdn-window.zul";
	
	protected ChangeIMSIWindow changeIMSIWindow;
	private static final String CHANGE_IMSI_URL = "/Plintron/change-imsi-window.zul";
	
	protected PortoutDetailWindow portoutDetailWindow;
	protected static final String PORTOUT_DETAILS_PANEL_ID = "detailsPanel";
	private static final String PORTOUT_DETAIL_URL = "/Plintron/portout-detail-window.zul";
	
	protected AsyncDetailWindow asyncdetailWindow;
	protected static final String ASYNC_DETAILS_PANEL_ID = "detailsPanel";
	private static final String ASYNC_DETAIL_URL = "/Plintron/async-detail-window.zul";
	
	public void onBasicFilterSetup(Event evt) {
		basicFilterWindow = (BasicFilterWindow) Executions.createComponents(BASIC_FILTER_URL, null, null);
		basicFilterWindow.setMaximizable(true);
		basicFilterWindow.setClosable(true);
		basicFilterWindow.setMinimizable(true);
		basicFilterWindow.doHighlighted();
	}

	public void onBasicFilter(Event evt) {
		if( basicFilterWindow == null ) 
			throw new IllegalStateException("BasicFilterWindow object is not available");
		Clients.showBusy("Filtering List");
		Events.echoEvent("onDoBasicFilter", basicFilterWindow, null);
	}

	@SuppressWarnings("unchecked")
	public void onDoBasicFilter(Event evt) {

		if( basicFilterWindow == null ) 
			throw new IllegalStateException("BasicFilterWindow object is not available");

		RequestListFilter filter = basicFilterWindow.getListFilter();
		sessionScope.put(LIST_FILTER_PARAM_KEY, filter);

		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).publish(new Event(EventConstants.REQUEST_FILTER_EVENT_NAME, null, null));

		Clients.clearBusy();

		basicFilterWindow.detach();
		basicFilterWindow = null;
	}
	

	public void onClearFilter(Event evt) {

		sessionScope.remove(LIST_FILTER_PARAM_KEY);

		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).publish(
			new Event(EventConstants.REQUEST_FILTER_EVENT_NAME, null, null)
			);

	}	
	
	public void onChangeVMPinSetup(Event event) {
		changeVMPinWindow = (ChangeVMPinWindow) Executions.createComponents(CHANGE_VM_PIN_URL, null, null);
		changeVMPinWindow.doHighlighted();
	}
	
	public void onChangeVMPin(Event event) {
		if (changeVMPinWindow == null) throw new IllegalStateException("Change VM Pin Window object is not available");
		changeVMPinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CHANGE_VOICE_MAIL_PIN, changeVMPinWindow.getMdn()));
		Events.echoEvent("onDoChangeVMPin", changeVMPinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoChangeVMPin(Event event) {
		ChangeVMPinRequest request = new ChangeVMPinRequest();
		request.setMDN(changeVMPinWindow.getMdn());
		request.setNewPin(changeVMPinWindow.getNewPin());
		request.setOldPin(changeVMPinWindow.getOldPin());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ChangeVMPinResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.changeVMPinRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not change pin");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not change pin", "Change VM Pin - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not change pin");
		}
		changeVMPinWindow.detach();
		changeVMPinWindow = null;
	}
	
	public void onDoValidateDevice(Event event) {
	
	}
	
	public void onPortOutRequests(Event event) {
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, "centerPanel");

		if( parent == null )
			throw new IllegalArgumentException("Could not identify center panel");

		Center center = (Center) parent;
		center.getChildren().clear();
		
		Executions.createComponents("/Plintron/portout-requests.zul", center, null);
	}
	
	public void onAsyncRequests(Event event) {
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, "centerPanel");

		if( parent == null )
			throw new IllegalArgumentException("Could not identify center panel");

		Center center = (Center) parent;
		center.getChildren().clear();
		
		Executions.createComponents("/Plintron/async-requests.zul", center, null);
	}
	
	public void onPortoutSelected(Event event) {
		PlintronAsyncResponse request = (PlintronAsyncResponse) event.getData();
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, PORTOUT_DETAILS_PANEL_ID);

		if( parent == null )
			throw new IllegalArgumentException("Could not identify detail window");

		Center center = (Center) parent;
		center.getChildren().clear();

		portoutDetailWindow = (PortoutDetailWindow) Executions.createComponents(PORTOUT_DETAIL_URL, center, null);
		portoutDetailWindow.setRequest(request);
	}
	
	public void onAsyncSelected(Event event) {
		PlintronAsyncResponse request = (PlintronAsyncResponse) event.getData();
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, ASYNC_DETAILS_PANEL_ID);

		if( parent == null )
			throw new IllegalArgumentException("Could not identify detail window");

		Center center = (Center) parent;
		center.getChildren().clear();

		asyncdetailWindow = (AsyncDetailWindow) Executions.createComponents(ASYNC_DETAIL_URL, center, null);
		asyncdetailWindow.setRequest(request);
	}
	
	public void onCreatePortinSetup(Event event) {
		createPortinWindow = (CreatePortinWindow) Executions.createComponents(CREATE_PORTIN_URL, null, null);
		createPortinWindow.doHighlighted();
	}
	
	public void onCreatePortin(Event event) {
		if (createPortinWindow == null) throw new IllegalStateException("Create PortIn Window object is not available");
		createPortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CREATING_PORTIN, createPortinWindow.getMdn()));
		Events.echoEvent("onDoCreatePortin", createPortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoCreatePortin(Event event) {
		PortInCreateRequest request = new PortInCreateRequest();
		request.setAccountNumber(createPortinWindow.getAccountNumber());
		request.setAccountPin(createPortinWindow.getAccountPin());
		request.setAddress1(createPortinWindow.getAddress1());
		request.setCity(createPortinWindow.getCity());
		request.setMDN(createPortinWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		request.setName(createPortinWindow.getName());
		request.setSim(createPortinWindow.getSim());
		request.setState(createPortinWindow.getState());
		request.setZip(createPortinWindow.getZip());
		PortInCreateResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.portInCreateRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not create portin");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not create portin", "Create PortIn - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not create portin");
		}
		createPortinWindow.detach();
		createPortinWindow = null;
	}
	
	public void onCancelPortinSetup(Event event) {
		cancelPortinWindow = (CancelPortinWindow) Executions.createComponents(CANCEL_PORTIN_URL, null, null);
		cancelPortinWindow.doHighlighted();
	}
	
	public void onCancelPortin(Event event) {
		if (cancelPortinWindow == null) throw new IllegalStateException("Cancel PortIn Window object is not available");
		cancelPortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CANCELING_PORTIN, cancelPortinWindow.getMdn()));
		Events.echoEvent("onDoCancelPortin", cancelPortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoCancelPortin(Event event) {
		PortInCancelRequest request = new PortInCancelRequest();
		request.setMDN(cancelPortinWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		request.setSim(cancelPortinWindow.getSim());
		PortInCancelResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.portInCancelRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not cancel portin");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not cancel portin", "Cancel PortIn - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not cancel portin");
		}
		cancelPortinWindow.detach();
		cancelPortinWindow = null;
	}	
	
	
	
	
	
	
	public void onValidatePortinSetup(Event event) {
		validatePortinWindow = (ValidatePortinWindow) Executions.createComponents(VALIDATE_PORTIN_URL, null, null);
		validatePortinWindow.doHighlighted();
	}
	
	public void onValidatePortin(Event event) {
		if (validatePortinWindow == null) throw new IllegalStateException("Validate PortIn Window object is not available");
		validatePortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.VALIDATING_PORTIN, validatePortinWindow.getMdn()));
		Events.echoEvent("onDoValidatePortin", validatePortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoValidatePortin(Event event) {
		PortInValidateRequest request = new PortInValidateRequest();
		request.setMDN(validatePortinWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		PortInValidateResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.portInValidateRequest(request).getValue();
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
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not validate portin", "Validate PortIn - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not validate portin");
		}
		validatePortinWindow.detach();
		validatePortinWindow = null;
	}
	
	public void onStatusOfPortinSetup(Event event) {
		statusOfPortinWindow = (StatusOfPortinWindow) Executions.createComponents(STATUS_OF_PORTIN_URL, null, null);
		statusOfPortinWindow.doHighlighted();
	}
	
	public void onStatusOfPortin(Event event) {
		if (statusOfPortinWindow == null) throw new IllegalStateException("Status Of PortIn Window object is not available");
		statusOfPortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DETERMINING_THE_STATUS_OF_PORTIN, statusOfPortinWindow.getMdn()));
		Events.echoEvent("onDoStatusOfPortin", statusOfPortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoStatusOfPortin(Event event) {
		PortInStatusRequest request = new PortInStatusRequest();
		request.setMDN(statusOfPortinWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		PortInStatusResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.portInStatusRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_DETERMINE_THE_STATUS_OF_PORTIN);
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not determine the status of portin", "Status Of PortIn - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e,  Messages.COULD_NOT_DETERMINE_THE_STATUS_OF_PORTIN);
		}
		statusOfPortinWindow.detach();
		statusOfPortinWindow = null;
	}
	
	public void onUpdatePortinSetup(Event event) {
		updatePortinWindow = (UpdatePortinWindow) Executions.createComponents(UPDATE_PORTIN_URL, null, null);
		updatePortinWindow.doHighlighted();
	}
	
	public void onUpdatePortin(Event event) {
		if (updatePortinWindow == null) throw new IllegalStateException("Update PortIn Window object is not available");
		updatePortinWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.UPDATING_PORTIN, updatePortinWindow.getMdn()));
		Events.echoEvent("onDoUpdatePortin", updatePortinWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoUpdatePortin(Event event) {
		PortInUpdateRequest request = new PortInUpdateRequest();
		request.setAccountNumber(updatePortinWindow.getAccountNumber());
		request.setAccountPin(updatePortinWindow.getAccountPin());
		request.setAddress1(updatePortinWindow.getAddress1());
		request.setCity(updatePortinWindow.getCity());
		request.setMDN(updatePortinWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		request.setName(updatePortinWindow.getName());
		request.setSim(updatePortinWindow.getSim());
		request.setState(updatePortinWindow.getState());
		request.setZip(updatePortinWindow.getZip());
		PortInUpdateResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.portInUpdateRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not update portin");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not update portin", "Update PortIn - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not update portin");
		}
		updatePortinWindow.detach();
		updatePortinWindow = null;
	}
	
	public void onAccountDetailSetup(Event event) {
		accountDetailWindow = (AccountDetailWindow) Executions.createComponents(ACCOUNT_DETAIL_URL, null, null);
		accountDetailWindow.doHighlighted();
	}
	
	public void onAccountDetail(Event event) {
		if (accountDetailWindow == null) throw new IllegalStateException("Account Detail Window object is not available");
		accountDetailWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DETERMINING_ACCOUNT_DETAIL, accountDetailWindow.getMdn()));
		Events.echoEvent("onDoAccountDetail", accountDetailWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoAccountDetail(Event event) {
		GetAccountDetailsRequest request = new GetAccountDetailsRequest();
		request.setMDN(accountDetailWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		GetAccountDetailsResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.getAccountDetailsRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not determine account detail");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not determine account detail", "Account Detail - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not determine account detail");
		}
		accountDetailWindow.detach();
		accountDetailWindow = null;
	}
	
	public void onBundleSubscriptionSetup(Event event) {
		bundleSubscriptionWindow = (BundleSubscriptionWindow) Executions.createComponents(BUNDLE_SUBSCRIPTION_URL, null, null);
		bundleSubscriptionWindow.doHighlighted();
	}
	
	public void onBundleSubscription(Event event) {
		if (bundleSubscriptionWindow == null) throw new IllegalStateException("Bundle Subscription Window object is not available");
		bundleSubscriptionWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DETERMINING_BUNDLE_SUBSCRIPTION, bundleSubscriptionWindow.getMdn()));
		Events.echoEvent("onDoBundleSubscription", bundleSubscriptionWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoBundleSubscription(Event event) {
		GetBundleSubscriptionRequest request = new GetBundleSubscriptionRequest();
		request.setMDN(bundleSubscriptionWindow.getMdn());
		request.setServiceCode(bundleSubscriptionWindow.getService());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		GetBundleSubscriptionResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.getBundleSubscriptionRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not determine bundle subscription");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not determine bundle subscription", "Bundle Subscription - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not determine bundle subscription");
		}
		bundleSubscriptionWindow.detach();
		bundleSubscriptionWindow = null;
	}
	
	public void onSubscriptionStatusSetup(Event event) {
		subscriptionStatusWindow = (SubscriptionStatusWindow) Executions.createComponents(SUBSCRIPTION_STATUS_URL, null, null);
		subscriptionStatusWindow.doHighlighted();
	}
	
	public void onSubscriptionStatus(Event event) {
		if (subscriptionStatusWindow == null) throw new IllegalStateException("Bundle Subscription Window object is not available");
		subscriptionStatusWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DETERMINING_SUBSCRIPTION_STATUS, subscriptionStatusWindow.getMdn()));
		Events.echoEvent("onDoSubscriptionStatus", subscriptionStatusWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoSubscriptionStatus(Event event) {
		GetSubscriptionStatusRequest request = new GetSubscriptionStatusRequest();
		request.setMDN(subscriptionStatusWindow.getMdn());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		GetSubscriptionStatusResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.getSubscriptionStatusRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not determine subscription status");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not determine subscription status", "Subscription Status - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not determine subscription status");
		}
		subscriptionStatusWindow.detach();
		subscriptionStatusWindow = null;
	}
	
	public void onSendMessageSetup(Event event) {
		sendMessageWindow = (SendMessageWindow) Executions.createComponents(SEND_MESSAGE_URL, null, null);
		sendMessageWindow.doHighlighted();
	}
	
	public void onSendMessage(Event event) {
		if (sendMessageWindow == null) throw new IllegalStateException("Bundle Subscription Window object is not available");
		sendMessageWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.SENDING_MESSAGE, sendMessageWindow.getMdn()));
		Events.echoEvent("onDoSendMessage", sendMessageWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoSendMessage(Event event) {
		SendMessageRequest request = new SendMessageRequest();
		request.setMDN(sendMessageWindow.getMdn());
		request.setMessage(sendMessageWindow.getMessage());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
	    SendMessageResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.sendMessageRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not send message");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not send message", "Send Message - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not send message");
		}
		sendMessageWindow.detach();
		sendMessageWindow = null;
	}
	
	public void onSubscriberInfoSetup(Event event) {
		subscriberInfoWindow = (SubscriberInfoWindow) Executions.createComponents(SUBSCRIBER_INFO_URL, null, null);
		subscriberInfoWindow.doHighlighted();
	}
	
	public void onSubscriberInfo(Event event) {
		if (subscriberInfoWindow == null) throw new IllegalStateException("Subscriber Info Window object is not available");
		subscriberInfoWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DETERMINING_SUBSCRIBER_INFO, subscriberInfoWindow.getImsi()));
		Events.echoEvent("onDoSubscriberInfo", subscriberInfoWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoSubscriberInfo(Event event) {
		GetSubscriberInfoRequest request = new GetSubscriberInfoRequest();
		request.setImsi(subscriberInfoWindow.getImsi());
		request.setQueryType("0");
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		GetSubscriberInfoResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.getSubscriberInfoRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not send message");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not determine subscriber info", "Subscriber Info - " + request.getImsi(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not determine subscriber info");
		}
		subscriberInfoWindow.detach();
		subscriberInfoWindow = null;
	}
	
	public void onRemoveSubscriberSetup(Event event) {
		removeSubscriberWindow = (RemoveSubscriberWindow) Executions.createComponents(REMOVE_SUBSCRIBER_URL, null, null);
		removeSubscriberWindow.doHighlighted();
	}
	
	public void onRemoveSubscriber(Event event) {
		if (removeSubscriberWindow == null) throw new IllegalStateException("Remove Subscriber Window object is not available");
		removeSubscriberWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.REMOVING_SUBSCRIBER, removeSubscriberWindow.getMdn()));
		Events.echoEvent("onDoRemoveSubscriber", removeSubscriberWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoRemoveSubscriber(Event event) {
		RemoveSubscriberRequest request = new RemoveSubscriberRequest();
		request.setMDN(removeSubscriberWindow.getMdn());
		request.setImsi(removeSubscriberWindow.getImsi());
		request.setReason(removeSubscriberWindow.getReason());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		RemoveSubscriberResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.removeSubscriberRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not remove subscriber");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not remove subscriber", "Remove Subscriber - " + request.getImsi(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not remove subscriber");
		}
		removeSubscriberWindow.detach();
		removeSubscriberWindow = null;
	}
	
	public void onActivateServiceSetup(Event event) {
		activateServiceWindow = (ActivateServiceWindow) Executions.createComponents(ACTIVATE_SERVICE_URL, null, null);
		activateServiceWindow.doHighlighted();
	}
	
	public void onActivateService(Event event) {
		if (activateServiceWindow == null) throw new IllegalStateException("Activate Service Window object is not available");
		activateServiceWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.ACTIVATING_SERVICE, activateServiceWindow.getMdn()));
		Events.echoEvent("onDoActivateService", activateServiceWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoActivateService(Event event) {
		ServiceActivateRequest request = new ServiceActivateRequest();
		request.setMDN(activateServiceWindow.getMdn());
		request.setClientType(activateServiceWindow.getClientType());
		request.setServiceId(activateServiceWindow.getServiceId());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ServiceActivateResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.serviceActivateRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not activate service");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not activate servier", "Activate service - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not activate service");
		}
		activateServiceWindow.detach();
		activateServiceWindow = null;
	}
	
	public void onDeactivateServiceSetup(Event event) {
		deactivateServiceWindow = (DeactivateServiceWindow) Executions.createComponents(DEACTIVATE_SERVICE_URL, null, null);
		deactivateServiceWindow.doHighlighted();
	}
	
	public void onDeactivateService(Event event) {
		if (deactivateServiceWindow == null) throw new IllegalStateException("Deactivate Service Window object is not available");
		deactivateServiceWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DEACTIVATING_SERVICE, deactivateServiceWindow.getMdn()));
		Events.echoEvent("onDoDeactivateService", deactivateServiceWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoDeactivateService(Event event) {
		ServiceDeactivateRequest request = new ServiceDeactivateRequest();
		request.setMDN(deactivateServiceWindow.getMdn());
		request.setClientType(deactivateServiceWindow.getClientType());
		request.setServiceId(deactivateServiceWindow.getServiceId());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ServiceDeactivateResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.serviceDeactivateRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not deactivate service");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not deactivate service", "Deactivate service - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not deactivate service");
		}
		deactivateServiceWindow.detach();
		deactivateServiceWindow = null;
	}
	
	public void onModifySubscriberStatusSetup(Event event) {
		modifySubscriberStatusWindow = (ModifySubscriberStatusWindow) Executions.createComponents(MODIFY_SUBSCRIBER_STATUS_URL, null, null);
		modifySubscriberStatusWindow.doHighlighted();
	}
	
	public void onModifySubscriberStatus(Event event) {
		if (modifySubscriberStatusWindow == null) throw new IllegalStateException("Modify Subscriber Status Window object is not available");
		modifySubscriberStatusWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.MODIFYING_SUBSCRIBER_STATUS, modifySubscriberStatusWindow.getMdn()));
		Events.echoEvent("onDoModifySubscriberStatus", modifySubscriberStatusWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoModifySubscriberStatus(Event event) {
		ModifySubscriberStatusRequest request = new ModifySubscriberStatusRequest();
		request.setMDN(modifySubscriberStatusWindow.getMdn());
		request.setImsi(modifySubscriberStatusWindow.getImsi());
		request.setStatus(modifySubscriberStatusWindow.getStatus());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ModifySubscriberStatusResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.modifySubscriberStatusRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not modify subscriber status");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not modify subscriber status", "Modify Subscriber Status - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not modify subscriber status");
		}
		modifySubscriberStatusWindow.detach();
		modifySubscriberStatusWindow = null;
	}
	
	public void onQuerySubscriberUsageSetup(Event event) {
		querySubscriberUsageWindow = (QuerySubscriberUsageWindow) Executions.createComponents(QUERY_SUBSCRIBER_USAGE_URL, null, null);
		querySubscriberUsageWindow.doHighlighted();
	}
	
	public void onQuerySubscriberUsage(Event event) {
		if (querySubscriberUsageWindow == null) throw new IllegalStateException("Modify Subscriber Status Window object is not available");
		querySubscriberUsageWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.QUERYING_SUBSCRIBER_USAGE, querySubscriberUsageWindow.getMdn()));
		Events.echoEvent("onDoQuerySubscriberUsage", querySubscriberUsageWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoQuerySubscriberUsage(Event event) {
		QuerySubscriberUsageRequest request = new QuerySubscriberUsageRequest();
		request.setMDN(querySubscriberUsageWindow.getMdn());
		request.setImsi(querySubscriberUsageWindow.getImsi());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		QuerySubscriberUsageResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.querySubscriberUsageRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not query subscriber usage");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not query subscriber usage", "Query Subscriber Usage - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not query subscriber usage");
		}
		querySubscriberUsageWindow.detach();
		querySubscriberUsageWindow = null;
	}
	
	public void onReactivateSubscriberSetup(Event event) {
		reactivateSubscriberWindow = (ReactivateSubscriberWindow) Executions.createComponents(REACTIVATE_SUBSCRIBER_URL, null, null);
		reactivateSubscriberWindow.doHighlighted();
	}
	
	public void onReactivateSubscriber(Event event) {
		if (reactivateSubscriberWindow == null) throw new IllegalStateException("Reactivate Subscriber Window object is not available");
		reactivateSubscriberWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.REACTIVATING_SUBSCRIBER, reactivateSubscriberWindow.getMdn()));
		Events.echoEvent("onDoReactivateSubscriber", reactivateSubscriberWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoReactivateSubscriber(Event event) {
		ReactivateSubscriberRequest request = new ReactivateSubscriberRequest();
		request.setMDN(reactivateSubscriberWindow.getMdn());
		request.setImsi(reactivateSubscriberWindow.getImsi());
		request.setIccid(reactivateSubscriberWindow.getIccid());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ReactivateSubscriberResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.reactivateSubscriberRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not reactivate subscriber");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not reactivate subscriber", "Reativate Subscriber - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not reactivate subscriber");
		}
		reactivateSubscriberWindow.detach();
		reactivateSubscriberWindow = null;
	}
	
	public void onReplaceMSISDNSetup(Event event) {
		replaceMSISDNWindow = (ReplaceMSISDNWindow) Executions.createComponents(REPLACE_MSISDN_URL, null, null);
		replaceMSISDNWindow.doHighlighted();
	}
	
	public void onReplaceMSISDN(Event event) {
		if (replaceMSISDNWindow == null) throw new IllegalStateException("Replace MSISDN Window object is not available");
		replaceMSISDNWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.REPLACING_MSISDN, replaceMSISDNWindow.getMdn()));
		Events.echoEvent("onDoReplaceMSISDN", replaceMSISDNWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoReplaceMSISDN(Event event) {
		ReplaceMSISDNRequest request = new ReplaceMSISDNRequest();
		request.setMDN(replaceMSISDNWindow.getMdn());
		request.setImsi(replaceMSISDNWindow.getImsi());
		request.setIccid(replaceMSISDNWindow.getIccid());
		request.setZipCode(replaceMSISDNWindow.getZipCode());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ReplaceMSISDNResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.replaceMSISDNRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not replace MSISDN");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not replace MSISDN", "Replace MSISDN - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not replace MSISDN");
		}
		replaceMSISDNWindow.detach();
		replaceMSISDNWindow = null;
	}
	
	public void onChangeMSISDNSetup(Event event) {
		changeMSISDNWindow = (ChangeMSISDNWindow) Executions.createComponents(CHANGE_MSISDN_URL, null, null);
		changeMSISDNWindow.doHighlighted();
	}
	
	public void onChangeMSISDN(Event event) {
		if (changeMSISDNWindow == null) throw new IllegalStateException("Change MSISDN Window object is not available");
		changeMSISDNWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CHANGING_MSISDN, changeMSISDNWindow.getMdn()));
		Events.echoEvent("onDoChnageMSISDN", changeMSISDNWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoChangeMSISDN(Event event) {
		ChangeMSISDNRequest request = new ChangeMSISDNRequest();
		request.setMDN(changeMSISDNWindow.getMdn());
		request.setImsi(changeMSISDNWindow.getImsi());
		request.setIccid(changeMSISDNWindow.getIccid());
		request.setNewMDN(changeMSISDNWindow.getNewMdn());
		request.setPortInFlag(changeMSISDNWindow.getPortInFlag());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ChangeMSISDNResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.changeMSISDNRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not change MSISDN");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not change MSISDN", "Change MSISDN - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not change MSISDN");
		}
		changeMSISDNWindow.detach();
		changeMSISDNWindow = null;
	}
	
	public void onBlockUnblockSIMSetup(Event event) {
		blockUnblockSIMWindow = (BlockUnblockSIMWindow) Executions.createComponents(BLOCK_UNBLOCK_SIM_URL, null, null);
		blockUnblockSIMWindow.doHighlighted();
	}
	
	public void onBlockUnblockSIM(Event event) {
		if (blockUnblockSIMWindow == null) throw new IllegalStateException("Block/Unblock SIM Window object is not available");
		blockUnblockSIMWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.BLOCKING_UNBLOCKING_SIM, blockUnblockSIMWindow.getMdn()));
		Events.echoEvent("onDoBlockUnblockSIM", blockUnblockSIMWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoBlockUnblockSIM(Event event) {
		BlockUnblockSIMRequest request = new BlockUnblockSIMRequest();
		request.setMDN(blockUnblockSIMWindow.getMdn());
		request.setOperationCode(blockUnblockSIMWindow.getOperationCode());
		request.setSetFlag(blockUnblockSIMWindow.getSetFlag());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		BlockUnblockSIMResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.blockUnblockSIMRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not block/unblock SIM");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not block/unblock SIM", "Block/Unblock SIM - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not block/unblock SIM");
		}
		blockUnblockSIMWindow.detach();
		blockUnblockSIMWindow = null;
	}
	
	public void onModifyLanguageSetup(Event event) {
		modifyLanguageWindow = (ModifyLanguageWindow) Executions.createComponents(MODIFY_LANGUAGE_URL, null, null);
		modifyLanguageWindow.doHighlighted();
	}
	
	public void onModifyLanguage(Event event) {
		if (modifyLanguageWindow == null) throw new IllegalStateException("Modify Language Window object is not available");
		modifyLanguageWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.MODIFYING_LANGAGUE, modifyLanguageWindow.getMdn()));
		Events.echoEvent("onDoModifyLanguage", modifyLanguageWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoModifyLanguage(Event event) {
		ModifyingSubscriberLanguageTypeRequest request = new ModifyingSubscriberLanguageTypeRequest();
		request.setMDN(modifyLanguageWindow.getMdn());
		request.setLanguageType(modifyLanguageWindow.getNewLanaguage());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ModifyingSubscriberLanguageTypeResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.modifyingSubscriberLanguageTypeRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not modify language");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not modify language", "Modify Lanaguage - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not modify language");
		}
		modifyLanguageWindow.detach();
		modifyLanguageWindow = null;
	}
	
	public void onSwapMSISDNSetup(Event event) {
		swapMSISDNWindow = (SwapMSISDNWindow) Executions.createComponents(SWAP_MSISDN_URL, null, null);
		swapMSISDNWindow.doHighlighted();
	}
	
	public void onSwapMSISDN(Event event) {
		if (swapMSISDNWindow == null) throw new IllegalStateException("Swap MSISDN Window object is not available");
		swapMSISDNWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.SWAPING_MSISDN, swapMSISDNWindow.getMdn()));
		Events.echoEvent("onDoSwapMSISDN", swapMSISDNWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoSwapMSISDN(Event event) {
		SwapMSISDNRequest request = new SwapMSISDNRequest();
		request.setMDN(swapMSISDNWindow.getMdn());
		request.setDna(swapMSISDNWindow.getDna());
		request.setIccid(swapMSISDNWindow.getIccid());
		request.setImsi(swapMSISDNWindow.getImsi());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		SwapMSISDNResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.swapMSISDNRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not swap MSISDN");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not swap MSISDN", "Swap MSISDN - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not swap MSISDN");
		}
		swapMSISDNWindow.detach();
		swapMSISDNWindow = null;
	}
	
	public void onChangeIMSISetup(Event event) {
		changeIMSIWindow = (ChangeIMSIWindow) Executions.createComponents(CHANGE_IMSI_URL, null, null);
		changeIMSIWindow.doHighlighted();
	}
	
	public void onChangeIMSI(Event event) {
		if (changeIMSIWindow == null) throw new IllegalStateException("Change IMSI Window object is not available");
		changeIMSIWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CHANGING_IMSI, changeIMSIWindow.getMdn()));
		Events.echoEvent("onDoChnageIMSI", changeIMSIWindow, null);
	}
	
	@SuppressWarnings("unchecked")
	public void onDoChangeIMSI(Event event) {
		ChangeIMSIRequest request = new ChangeIMSIRequest();
		request.setMDN(changeIMSIWindow.getMdn());
		request.setNewIMSI(changeIMSIWindow.getNewImsi());
		request.setOldIMSI(changeIMSIWindow.getOldImsi());
		request.setMessageHeader(new MessageHeaderType());
		request.getMessageHeader().setUsername(SessionUtil.getCurrentUsername());
		ChangeIMSIResponse response = null;
		PlintronEndpoint endpoint = new PlintronEndpoint();
		
		try {
			response = endpoint.changeIMSIRequest(request).getValue();
		}
		catch (Exception e) {
			showErrorBox(e, "Could not change IMSI");
		}
		Clients.clearBusy();
		try {
		    if (response != null) {
		    	RequestListFilter filter = new RequestListFilter();
				StringFilter clientReferenceFilter = new StringFilter();
				clientReferenceFilter.setFilterType(StringFilterType.STARTS_WITH);
				clientReferenceFilter.setValue(response.getTransactionId());
				filter.addPropertyFilter(Request.CLIENTREFERENCE_PARAM, clientReferenceFilter);
				sessionScope.put("requestListFilter", filter);
				Executions.sendRedirect("/Request/");
		    }
		    else 
		        Messagebox.show("Could not change IMSI", "Change IMSI - " + request.getMDN(), Messagebox.OK, Messagebox.NONE);
		}
		catch(InterruptedException e) {
			showErrorBox(e, "Could not change IMSI");
		}
		changeIMSIWindow.detach();
		changeIMSIWindow = null;
	}
}

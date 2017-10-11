package com.budgetprepay.viewcontroller.plintron;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.A;
import org.zkoss.zul.Vbox;

import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.viewcontroller.plintron.Controller;
import com.budgetprepay.viewcontroller.request.RequestListFilter;

public class Actions extends Vbox implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected A clearFilter;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		setClearFilter();

		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).subscribe(
			new EventListener() {
				public void onEvent( Event event ) throws Exception {
					if (event.getName().equals(EventConstants.REQUEST_FILTER_EVENT_NAME)) 
						setClearFilter();
				}
			}
		);
	}
	
	public void onClick$basicFilter(Event event) { 
		Events.postEvent(new Event("onBasicFilterSetup", null, null));
	}
	
	public void onClick$clearFilter(Event event) { 
		Events.postEvent(new Event("onClearFilter", null, null));
	}
	
	public void setClearFilter() {
	    RequestListFilter filter = (RequestListFilter) getAttribute(Controller.LIST_FILTER_PARAM_KEY, Component.SESSION_SCOPE);
		clearFilter.setVisible(filter != null);
	}	
	
	public void onClick$asyncRequests(Event event) { 
		Events.postEvent(new Event("onAsyncRequests", null, null));
	}
	
	public void onClick$portOutRequests(Event event) { 
		Events.postEvent(new Event("onPortOutRequests", null, null));
	}
	
	public void onClick$createPortinRequest(Event event) { 
		Events.postEvent(new Event("onCreatePortinSetup", null, null));
	}
	
	public void onClick$updatePortinRequest(Event event) { 
		Events.postEvent(new Event("onUpdatePortinSetup", null, null));
	}
	
	public void onClick$cancelPortinRequest(Event event) { 
		Events.postEvent(new Event("onCancelPortinSetup", null, null));
	}
	
	public void onClick$statusOfPortinRequest(Event event) { 
		Events.postEvent(new Event("onStatusOfPortinSetup", null, null));
	}
	
	public void onClick$validatePortinRequest(Event event) { 
		Events.postEvent(new Event("onValidatePortinSetup", null, null));
	}
	
	public void onClick$changeVMPinRequest(Event event) {
		Events.postEvent(new Event("onChangeVMPinSetup", null, null));
	}
	
	public void onClick$accountDetailRequest(Event event) {
		Events.postEvent(new Event("onAccountDetailSetup", null, null));
	}
	
	public void onClick$bundleSubscriptionRequest(Event event) {
		Events.postEvent(new Event("onBundleSubscriptionSetup", null, null));
	}
	
	public void onClick$subscriptionStatusRequest(Event event) {
		Events.postEvent(new Event("onSubscriptionStatusSetup", null, null));
	}
	
	public void onClick$sendMessageRequest(Event event) {
		Events.postEvent(new Event("onSendMessageSetup", null, null));
	}
	
	public void onClick$subscriberInfoRequest(Event event) {
		Events.postEvent(new Event("onSubscriberInfoSetup", null, null));
	}
	
	public void onClick$removeSubscriberRequest(Event event) {
		Events.postEvent(new Event("onRemoveSubscriberSetup", null, null));
	}
	
	public void onClick$activateServiceRequest(Event event) {
		Events.postEvent(new Event("onActivateServiceSetup", null, null));
	}
	
	public void onClick$deactivateServiceRequest(Event event) {
		Events.postEvent(new Event("onDeactivateServiceSetup", null, null));
	}
	
	public void onClick$modifySubscriberStatusRequest(Event event) {
		Events.postEvent(new Event("onModifySubscriberStatusSetup", null, null));
	}
	
	public void onClick$querySubscriberUsageRequest(Event event) {
		Events.postEvent(new Event("onQuerySubscriberUsageSetup", null, null));
	}
	
	public void onClick$reactivateSubscriberRequest(Event event) {
		Events.postEvent(new Event("onReactivateSubscriberSetup", null, null));
	}
	
	public void onClick$replaceMSISDNRequest(Event event) {
		Events.postEvent(new Event("onReplaceMSISDNSetup", null, null));
	}
	
	public void onClick$changeMSISDNRequest(Event event) {
		Events.postEvent(new Event("onChangeMSISDNSetup", null, null));
	}
	
	public void onClick$blockUnblockSIMRequest(Event event) {
		Events.postEvent(new Event("onBlockUnblockSIMSetup", null, null));
	}
	
	public void onClick$modifyLanguageRequest(Event event) {
		Events.postEvent(new Event("onModifyLanguageSetup", null, null));
	}
	
	public void onClick$swapMSISDNRequest(Event event) {
		Events.postEvent(new Event("onSwapMSISDNSetup", null, null));
	}
	
	public void onClick$changeIMSIRequest(Event event) {
		Events.postEvent(new Event("onChangeIMSISetup", null, null));
	}
}
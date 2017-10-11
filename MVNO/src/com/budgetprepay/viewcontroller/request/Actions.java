package com.budgetprepay.viewcontroller.request;

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

public class Actions extends Vbox implements AfterCompose {

	static final long serialVersionUID = 1L;
	
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
}

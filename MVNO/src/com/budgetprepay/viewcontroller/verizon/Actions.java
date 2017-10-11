package com.budgetprepay.viewcontroller.verizon;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.Vbox;

public class Actions extends Vbox implements AfterCompose {

	private static final long serialVersionUID = 1L;

	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
	}

	public void onClick$validateDevice(Event event) { 
		Events.postEvent(new Event("onValidateDeviceSetup", null, null));
	}
	
	public void onClick$validatePortin(Event event) { 
		Events.postEvent(new Event("onValidatePortinSetup", null, null));
	}
	
	public void onClick$orderInquiry(Event event) { 
		Events.postEvent(new Event("onOrderInquirySetup", null, null));
	}
	
	public void onClick$lineInquiry(Event event) { 
		Events.postEvent(new Event("onLineInquirySetup", null, null));
	}
	
	public void onClick$deviceInquiry(Event event) { 
		Events.postEvent(new Event("onDeviceInquirySetup", null, null));
	}
	
	public void onClick$searchBucket(Event event) { 
		Events.postEvent(new Event("onSearchBucketSetup", null, null));
	}
}

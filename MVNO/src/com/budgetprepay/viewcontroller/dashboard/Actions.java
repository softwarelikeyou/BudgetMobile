package com.budgetprepay.viewcontroller.dashboard;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zul.Vbox;

public class Actions extends Vbox implements AfterCompose {
	static final long serialVersionUID = 1L;
	
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
	}
	
	public void onClick$mapAnchor(Event event) {
		Events.postEvent(new Event("onPieChart", null, null));		
	}
	
	public void onClick$proximityAnchor(Event event) {
		Events.postEvent(new Event("onExcelDownload", null, null));		
	}
	
	public void onClick$preferredAnchor(Event event) {
		Events.postEvent(new Event("onSubmitBug", null, null));		
	}
}

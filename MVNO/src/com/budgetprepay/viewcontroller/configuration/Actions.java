package com.budgetprepay.viewcontroller.configuration;

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
	
	public void onClick$serverInfo(Event event) {
		Events.postEvent(new Event("onServerInfoSetup", null, null));				
	}
	
	public void onClick$schedulerInfo(Event event) {
		Events.postEvent(new Event("onShowSchedulerSetup", null, null));				
	}
}

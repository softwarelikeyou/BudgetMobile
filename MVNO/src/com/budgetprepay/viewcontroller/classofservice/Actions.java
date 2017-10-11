package com.budgetprepay.viewcontroller.classofservice;

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
	
	public void onClick$createButton(Event event) {
		Events.postEvent(new Event("onCreateSetup", null, null));		
	}
}

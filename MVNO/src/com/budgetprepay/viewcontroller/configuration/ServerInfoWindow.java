package com.budgetprepay.viewcontroller.configuration;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;

import com.budgetprepay.model.facade.ServerFacade;
import com.budgetprepay.model.facade.ServerInfoSpec;
import com.budgetprepay.viewcontroller.BaseWindow;

public class ServerInfoWindow extends BaseWindow implements AfterCompose {
	static final long serialVersionUID = 1L;
	
	protected AnnotateDataBinder binder;
	protected ServerInfoWindow local;
	
	public void afterCompose() {
		
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		local = this;
		refreshSystemDetails(ServerFacade.getServerInfoSpec());
	
		AnnotateDataBinder binder = getBinder();
	
	    binder.loadAll();
	}
	
	protected void refreshSystemDetails(ServerInfoSpec spec) {
		AnnotateDataBinder binder = getBinder();
		binder.bindBean("spec", spec);
		binder.loadAll();		
	}
	
	protected AnnotateDataBinder getBinder() { 
		
		if( binder == null ) { 
			binder = (AnnotateDataBinder) getAttributeOrFellow("binder", false);
			if( binder == null ) binder = new AnnotateDataBinder(this);
		}
		
		return binder;
	}

}

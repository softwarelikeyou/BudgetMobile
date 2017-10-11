package com.budgetprepay.viewcontroller.user;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Window;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.ServiceType;

public class ManageServicesWindow extends Window implements AfterCompose {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;

	private User user;
	
    protected Checkbox verizon;

    protected Checkbox plintron;
    
    protected Checkbox bequick;
    
    protected Checkbox topup;
    
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
		try {
			UserData data = UserFacade.retrieveProperty(getUser(), ServiceType.VERIZON.name());
			if (data != null) {
				if (Boolean.valueOf(data.getValue()))
				    verizon.setChecked(true);
			}
			data = UserFacade.retrieveProperty(getUser(), ServiceType.PLINTRON.name());
			if (data != null) {
				if (Boolean.valueOf(data.getValue()))
				    plintron.setChecked(true);
			}
			data = UserFacade.retrieveProperty(getUser(), ServiceType.BEQUICK.name());
			if (data != null) {
				if (Boolean.valueOf(data.getValue()))
				    bequick.setChecked(true);
			}
			data = UserFacade.retrieveProperty(getUser(), ServiceType.TOPUP.name());
			if (data != null) {
				if (Boolean.valueOf(data.getValue()))
				    topup.setChecked(true);
			}
		}
		catch (Exception e) {
			;
		}
	}
	
	public boolean isVerizon() {
		return verizon.isChecked();
	}
	
	public boolean isPlintron() {
		return plintron.isChecked();
	}
	
	public boolean isBequick() {
		return bequick.isChecked();
	}
	
	public boolean isTopup() {
		return topup.isChecked();
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);
		
		binder = new AnnotateDataBinder(this);
		binder.loadAll();
	}

	public void onClick$cancelButton(Event event) { 
		this.detach();
	}
}

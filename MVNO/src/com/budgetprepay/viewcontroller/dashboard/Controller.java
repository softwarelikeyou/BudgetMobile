package com.budgetprepay.viewcontroller.dashboard;

import org.zkoss.zk.ui.event.ClientInfoEvent;

import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.SessionUtil;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L; 
			
	protected static final String DASHBOARD_CENTER_ID = "dashboardCenter";
	
	public void onClientInfo(ClientInfoEvent event) {
	    SessionUtil.setScreenHeight(event.getDesktopHeight());
	    SessionUtil.setScreenWidth(event.getDesktopWidth());
	}
}

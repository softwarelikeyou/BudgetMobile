package com.budgetprepay.viewcontroller.dashboard;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.OpenEvent;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Panelchildren;

import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;

@SuppressWarnings("serial")
public abstract class DashboardPortlet extends Panelchildren {

	protected static final boolean DEFAULT_COLLAPSED_STATE = true;
	protected static final String PORTLET_COLLAPSED_KEY_PREFIX = "dashboard.portal.portlet.";
	protected static final String PORTLET_COLLAPSED_KEY_SUFFIX = ".collapsed";

	protected String getCollapsedKey() {
		StringBuffer sb = new StringBuffer(PORTLET_COLLAPSED_KEY_PREFIX);
		sb.append(getParent().getId());
		sb.append(PORTLET_COLLAPSED_KEY_SUFFIX);
		return sb.toString();
	}

	public void onCreate() {
		Component parent = getParent();
		if (!(parent instanceof Panel)) return;
		
		Panel panel = (Panel)getParent();
		panel.setStyle(getPanelStyle());
		panel.setTitle(ELFunctions.getLabelWithParams(getPanelTitleI18NKey()));

		panel.setCollapsible(canPanelBeCollapsed());
		if (panel.isCollapsible()) panel.setOpen(getSavedCollapsedState());
		
		if (shouldSetHeight()) panel.setHeight(getHeightSetting());
	}
	
	public void handleOpenCloseEvent(OpenEvent event) {
		try {
			Boolean collapsedState = event.isOpen();
			SessionUtil.setUserData(getCollapsedKey(), collapsedState.toString());
		} catch (Exception e) {
			WebUtil.showErrorBox(false, e, Messages.COULD_NOT_SAVE_DASHBOARD_LAYOUT_FOR_USER);
		}
	}
	
	protected boolean getSavedCollapsedState() {
		String collapsedStateString = null;
		UserData userData = SessionUtil.getUserData(getCollapsedKey());
		if (userData != null)
			collapsedStateString = userData.getValue();

		if (collapsedStateString != null) return Boolean.parseBoolean(collapsedStateString);
		return DEFAULT_COLLAPSED_STATE;
	}
	
	protected String getHeightSetting() {
		return "";
	}
	
	protected String getPanelStyle() {
		return "margin: 10px auto";
	}
	
	protected boolean shouldSetHeight() {
		return false;
	}
	
	protected boolean canPanelBeCollapsed() {
		return true;
	}
	
	abstract protected String getPanelTitleI18NKey();

	
}

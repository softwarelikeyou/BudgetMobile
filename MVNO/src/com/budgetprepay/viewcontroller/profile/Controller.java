package com.budgetprepay.viewcontroller.profile;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Center;

import com.budgetprepay.model.dao.UserDAO;
import com.budgetprepay.model.entity.PasswordEncoder;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;

	private Center center;
	
	private EditWindow editWindow;
	private static final String EDIT_URL = "/Profile/edit.zul";
	
	public void onEditSetup(Event event) {
		center = (Center) WebUtil.getComponentById(desktop, "centerPanel");
		center.getChildren().clear();
		editWindow = (EditWindow) Executions.createComponents(EDIT_URL, center, null);
	}

	public void onEdit(Event event) {
		if (editWindow == null) 
			throw new IllegalStateException("EditWindow object is not available");
		editWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.EDITTING_USER, editWindow.getUsername()));
		Events.echoEvent("onDoEdit", editWindow, null);
	}

	public void onDoEdit(Event event) {
		Clients.clearBusy();
		if (editWindow == null ) 
			throw new IllegalStateException("EditWindow object is not available");
		User user = null;
		try {
			user = new UserDAO().findByName(editWindow.getUsername());
			if (editWindow.getPassword().length() > 0)
			    user.setPassword(new PasswordEncoder().encodePassword(editWindow.getPassword(), null));
			user.setDisplay(editWindow.getDisplay());
			user = new UserDAO().createOrUpdate(user);
			SessionUtil.setCurrentUser(user);
			logger.info(Messages.SUCCESSFULLY_EDITTED_USER, user.getUsername());

			try {
				Messagebox.show(
						ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_EDITTED_USER, user.getUsername()),
						ELFunctions.getLabel(Labels.SUCCESS),
						Messagebox.OK,
						Messagebox.NONE
				); 
			}
			catch(InterruptedException ex) {
				// TODO do a better job on exceptions
				ex.printStackTrace();
			}

		}
		catch(Exception ex) {
			showErrorBox(ex, Messages.COULD_NOT_EDIT_USER, user.getUsername());
		}
		center = (Center) WebUtil.getComponentById(desktop, "centerPanel");
		if (center != null)
			center.getChildren().clear();
		editWindow.detach();
		editWindow = null;
	}
}

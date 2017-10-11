package com.budgetprepay.viewcontroller.user;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.PasswordEncoder;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.ServiceType;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;
	
	protected CreateWindow createWindow;
	private static final String CREATE_URL = "/User/create.zul";
	protected UserWindow disableWindow;
	private static final String DISABLE_ONE_URL = "/User/disable-one.zul";
	protected UserWindow enableWindow;
	private static final String ENABLE_ONE_URL = "/User/enable-one.zul";
	protected UserWindow resetWindow;
	private static final String RESET_ONE_URL = "/User/reset-one.zul";
	protected TypeChangeWindow typeChangeWindow;
	private static final String TYPE_CHANGE_URL = "/User/type-change.zul";
	protected ManageServicesWindow manageServicesWindow;
	private static final String MANAGE_SERVICES_URL = "/User/manage-services.zul";
	
	public void onCreateSetup(Event event) {
		createWindow = (CreateWindow) Executions.createComponents(CREATE_URL, null, null);
		createWindow.doHighlighted();
	}
	
	public void onCreateUser(Event event) {
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");
		createWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CREATING_USER, createWindow.getUsername()));
		Events.echoEvent("onDoCreate", createWindow, null);
	}
	
	public void onDoCreate(Event event) {
		Clients.clearBusy();
		
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");

		User user = new User();

		
		try {
			user.setDisplay(createWindow.getDisplay());
			user.setPassword(new PasswordEncoder().encodePassword(createWindow.getPassword(), null));
			user.setType(createWindow.getUserType());
			user.setUsername(createWindow.getUsername());
			user.setGroup(createWindow.getGroup());
			user.setEmail(createWindow.getEmail());
			user = UserFacade.create(user);
			try {
				Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_CREATED_USER, user.getUsername()),
						        ELFunctions.getLabel(Labels.SUCCESS),
						        Messagebox.OK,
						        Messagebox.NONE);
			}
			catch(InterruptedException e) {
				showErrorBox(e, Messages.COULD_NOT_CREATE_USER, user.getUsername());
			}
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_CREATE_USER, user.getUsername());
		}

		createWindow.detach();
		createWindow = null;
	}
	
	public void onDisableSetup(Event event) {
		User user = (User) event.getData();
		disableWindow = (UserWindow) Executions.createComponents(DISABLE_ONE_URL, null, null);
		disableWindow.setUser(user);
		disableWindow.doHighlighted();
	}
	
	public void onDisable(Event event) {		
		User user = disableWindow.getUser();				
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.DISABLING, user.getUsername()));			
		Events.echoEvent("onDoDisable", disableWindow, user);
	}
	
	public void onDoDisable(Event event) {
		try {
			Clients.clearBusy();
			User user = ((User)event.getData());
			user = UserFacade.disable(user);
		    if (!user.isEnabled()) {
			   logger.info(Messages.SUCCESSFULLY_DISABLED_USER, user.getUsername());
		       Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_DISABLED_USER, user.getUsername()),
					           ELFunctions.getLabel(Labels.SUCCESS),
					           Messagebox.OK,
					           Messagebox.NONE);
		    }
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_DISABLE_USER);
		}
		finally {
			disableWindow.detach();
			disableWindow = null;
			Clients.clearBusy();
		}
	}
	
	public void onEnableSetup(Event event) {
		User user = (User) event.getData();
		enableWindow = (UserWindow) Executions.createComponents(ENABLE_ONE_URL, null, null);
		enableWindow.setUser(user);
		enableWindow.doHighlighted();
	}
	
	public void onEnable(Event event) {		
		User user = enableWindow.getUser();				
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.ENABLING, user.getUsername()));			
		Events.echoEvent("onDoEnable", enableWindow, user);
	}
	
	public void onDoEnable(Event event) {
		try {
			Clients.clearBusy();
			User user = ((User)event.getData());
			user = UserFacade.enable(user);
		    if (user.isEnabled()) {
			   logger.info(Messages.SUCCESSFULLY_ENABLED_USER, user.getUsername());
		       Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_ENABLED_USER, user.getUsername()),
					           ELFunctions.getLabel(Labels.SUCCESS),
					           Messagebox.OK,
					           Messagebox.NONE);
		    }
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_ENABLE_USER);
		}
		finally {
			enableWindow.detach();
			enableWindow = null;
			Clients.clearBusy();
		}
	}
	
	public void onResetSetup(Event event) {
		User user = (User) event.getData();
		resetWindow = (UserWindow) Executions.createComponents(RESET_ONE_URL, null, null);
		resetWindow.setUser(user);
		resetWindow.doHighlighted();
	}
	
	public void onReset(Event event) {		
		User user = resetWindow.getUser();				
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.RESETTING_PASSWORD_USER, user.getUsername()));			
		Events.echoEvent("onDoReset", resetWindow, user);
	}
	
	public void onDoReset(Event event) {
		try {
			Clients.clearBusy();
			User user = ((User)event.getData());
			user = UserFacade.resetPassword(user);
		    if (user != null) {
			   logger.info(Messages.SUCCESSFULLY_RESET_PASSWORD_FOR_USER, user.getUsername());
		       Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_RESET_PASSWORD_FOR_USER, user.getUsername()),
					           ELFunctions.getLabel(Labels.SUCCESS),
					           Messagebox.OK,
					           Messagebox.NONE);
		    }
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RESET_PASSWORD);
		}
		finally {
			resetWindow.detach();
			resetWindow = null;
			Clients.clearBusy();
		}
	}	
	
	public void onTypeChangeSetup(Event event) {
		User user = (User) event.getData();
		typeChangeWindow = (TypeChangeWindow) Executions.createComponents(TYPE_CHANGE_URL, null, null);
		typeChangeWindow.setUserType(user.getType().name());
		typeChangeWindow.setUser(user);
	    typeChangeWindow.doHighlighted();
	}
	
	public void onTypeChange(Event event) {		
		User user = typeChangeWindow.getUser();				
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CHANGING_USER_TYPE, user.getUsername()));			
		Events.echoEvent("onDoTypeChange", typeChangeWindow, user);
	}
	
	public void onDoTypeChange(Event event) {
		try {
			Clients.clearBusy();
			User user = ((User)event.getData());
			user.setType(User.UserType.get(typeChangeWindow.userType.getSelectedItem().getValue()));
			user = UserFacade.changeType(user);
			logger.info(Messages.SUCCESSFULLY_CHANGED_USER_TYPE, user.getUsername());
		    Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_CHANGED_USER_TYPE, user.getUsername()),
					        ELFunctions.getLabel(Labels.SUCCESS),
					        Messagebox.OK,
					        Messagebox.NONE);
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_CHANGE_USER_TYPE);
		}
		finally {
			typeChangeWindow.detach();
			typeChangeWindow = null;
			Clients.clearBusy();
		}
	}
	
	public void onManageServicesSetup(Event event) {
		User user = (User) event.getData();
		manageServicesWindow = (ManageServicesWindow) Executions.createComponents(MANAGE_SERVICES_URL, null, null);
		manageServicesWindow.setUser(user);
		manageServicesWindow.doHighlighted();
	}
	
	public void onManageServices(Event event) {		
		User user = manageServicesWindow.getUser();				
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.MANAGING_SERVICES, user.getUsername()));			
		Events.echoEvent("onDoManageServices", manageServicesWindow, user);
	}
	
	public void onDoManageServices(Event event) {
		try {				
			setServiceType(manageServicesWindow.getUser(), ServiceType.VERIZON, manageServicesWindow.isVerizon());
			setServiceType(manageServicesWindow.getUser(), ServiceType.PLINTRON, manageServicesWindow.isPlintron());
			setServiceType(manageServicesWindow.getUser(), ServiceType.BEQUICK, manageServicesWindow.isBequick());
			setServiceType(manageServicesWindow.getUser(), ServiceType.TOPUP, manageServicesWindow.isTopup());
	
		    Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_CHANGED_SERVICE_TYPES, manageServicesWindow.getUser().getUsername()),
					        ELFunctions.getLabel(Labels.SUCCESS),
					        Messagebox.OK,
					        Messagebox.NONE);
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_CHANGE_SERVICE_TYPES);
		}
		finally {
			manageServicesWindow.detach();
			manageServicesWindow = null;
			Clients.clearBusy();
		}
	}
	
	private void setServiceType(final User user, final ServiceType serviceType, final boolean value) throws Exception {
		UserData data = UserFacade.retrieveProperty(user, serviceType.name());
		if (data == null) {
			data = new UserData();
			data.setUserId(user.getId());
			data.setProperty(serviceType.name());
		}
		data.setValue(String.valueOf(value));
		UserFacade.persist(data);
	}
}

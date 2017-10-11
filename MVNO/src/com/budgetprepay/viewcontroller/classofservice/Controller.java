package com.budgetprepay.viewcontroller.classofservice;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.facade.ClassOfServiceFacade;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.Messages;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;
	
	protected CreateWindow createWindow;
	private static final String CREATE_URL = "/ClassOfService/create.zul";
	
	protected EditWindow editWindow;
	private static final String EDIT_URL = "/ClassOfService/edit.zul";
	
	public void onCreateSetup(Event event) {
		createWindow = (CreateWindow) Executions.createComponents(CREATE_URL, null, null);
		createWindow.doHighlighted();
	}
	
	public void onCreateUser(Event event) {
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");
		createWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CREATING_CLASSOFSERVICE, createWindow.getName()));
		Events.echoEvent("onDoCreate", createWindow, null);
	}
	
	public void onDoCreate(Event event) {
		Clients.clearBusy();
		
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");

		ClassOfService classOfService = new ClassOfService();

		try {
			classOfService.setName(createWindow.getName());
			classOfService.setRatePlan(createWindow.getRatePlan());
			classOfService = ClassOfServiceFacade.createOrUpdate(classOfService);
			try {
				Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_CREATED_CLASSOFSERVICE, classOfService.getName()),
						        ELFunctions.getLabel(Labels.SUCCESS),
						        Messagebox.OK,
						        Messagebox.NONE);
			}
			catch(InterruptedException e) {
				showErrorBox(e, Messages.COULD_NOT_CREATE_CLASSOFSERVICE, classOfService.getName());
			}
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_CREATE_CLASSOFSERVICE, classOfService.getName());
		}

		createWindow.detach();
		createWindow = null;
	}
	
	public void onEditSetup(Event event) {
		ClassOfService classOfService = (ClassOfService) event.getData();
		editWindow = (EditWindow) Executions.createComponents(EDIT_URL, null, null);
		editWindow.setClassOfService(classOfService);
		editWindow.doHighlighted();		
	}
	
	public void onEdit(Event event) {		
		editWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.EDITTING_CLASSOFSERVICE, editWindow.getClassOfService().getName()));			
		Events.echoEvent("onDoEdit", editWindow, editWindow.getClassOfService());
	}
	
	public void onDoEdit(Event event) {
		try {
			ClassOfService classOfService = (ClassOfService) event.getData();
			ClassOfServiceFacade.update(classOfService);
			if (classOfService != null) {
			    logger.info(Messages.SUCCESSFULLY_EDITTED_CLASSOFSERVICE, classOfService.getName());
		        Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_EDITTED_CLASSOFSERVICE, classOfService.getName()),
				   	            ELFunctions.getLabel(Labels.SUCCESS),
					            Messagebox.OK,
					            Messagebox.NONE);
			}
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_EDIT_CLASSOFSERVICE);
		}
		finally {
			editWindow.detach();
			editWindow = null;
			Clients.clearBusy();
		}
	}

}

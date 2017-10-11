package com.budgetprepay.viewcontroller.group;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.facade.ClassOfServiceFacade;
import com.budgetprepay.model.facade.GroupFacade;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.ELFunctions;
import com.budgetprepay.viewcontroller.Labels;
import com.budgetprepay.viewcontroller.Messages;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;
	
	protected CreateWindow createWindow;
	private static final String CREATE_URL = "/Group/create.zul";
	
	protected EditWindow editWindow;
	private static final String EDIT_URL = "/Group/edit.zul";
	
	public List<ClassOfService> getClassOfServices() {
		List<ClassOfService> classOfServices = null;
		try {
	        classOfServices = ClassOfServiceFacade.retrieveAll();
	    }
		catch (Exception e) {
			classOfServices = new ArrayList<ClassOfService>();
		    showErrorBox(e, Messages.FAILED_TO_RETRIEVE_CLASSOFSERVICES);
		}
		return classOfServices;
	}
	
	public void onCreateSetup(Event event) {
		createWindow = (CreateWindow) Executions.createComponents(CREATE_URL, null, null);
		createWindow.doHighlighted();
	}
	
	public void onCreateGroup(Event event) {
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");
		createWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.CREATING_GROUP, createWindow.getName()));
		Events.echoEvent("onDoCreate", createWindow, null);
	}
	
	public void onDoCreate(Event event) {
		Clients.clearBusy();
		
		if( createWindow == null ) throw new IllegalStateException("CreateWindow object is not available");

		Group group = new Group();

		try {
			group.setName(createWindow.getName());
			group.setAccountNumber(createWindow.getAccountNumber());
			group.setDisplay(createWindow.getDisplay());
			group.setClassOfServices(new HashSet<ClassOfService>(createWindow.getClassOfServices()));
			group.setRellerId(createWindow.getResellerId());
			group = GroupFacade.createOrUpdate(group);
			try {
				Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_CREATED_GROUP, group.getName()),
						        ELFunctions.getLabel(Labels.SUCCESS),
						        Messagebox.OK,
						        Messagebox.NONE);
			}
			catch(InterruptedException e) {
				showErrorBox(e, Messages.COULD_NOT_CREATE_GROUP, group.getName());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			showErrorBox(e, Messages.COULD_NOT_CREATE_GROUP, group.getName());
		}

		createWindow.detach();
		createWindow = null;
	}
	
	public void onEditSetup(Event event) {
		Group group = (Group) event.getData();
		editWindow = (EditWindow) Executions.createComponents(EDIT_URL, null, null);
		editWindow.setGroup(group);
		editWindow.doHighlighted();		
	}
	
	public void onEdit(Event event) {		
		editWindow.validate();
		Clients.showBusy(ELFunctions.getMessageWithParams(Messages.EDITTING_GROUP, editWindow.getGroup().getName()));			
		Events.echoEvent("onDoEdit", editWindow, editWindow.getGroup());
	}
	
	public void onDoEdit(Event event) {
		try {
			Group group = (Group) event.getData();
			//group.setClassOfServices(new HashSet<ClassOfService>(editWindow.getClassOfServicesModel()));
			group.setRellerId(editWindow.getResellerId());
			GroupFacade.update(group);
			if (group != null) {
			    logger.info(Messages.SUCCESSFULLY_EDITTED_GROUP, group.getName());
		        Messagebox.show(ELFunctions.getMessageWithParams(Messages.SUCCESSFULLY_EDITTED_GROUP, group.getName()),
				   	            ELFunctions.getLabel(Labels.SUCCESS),
					            Messagebox.OK,
					            Messagebox.NONE);
			}
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_EDIT_GROUP);
		}
		finally {
			editWindow.detach();
			editWindow = null;
			Clients.clearBusy();
		}
	}

}

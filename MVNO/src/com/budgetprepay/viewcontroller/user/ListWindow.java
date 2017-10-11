package com.budgetprepay.viewcontroller.user;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Components;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.BindingListModelList;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Paging;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericAbstractListWindow;

public class ListWindow extends GenericAbstractListWindow implements AfterCompose  {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private static final String RESULTS_PER_PAGE_KEY = "usersPerPage";

	protected Listbox usersListbox;
	protected Paging listPager;
	protected Intbox itemsPerPage;
	
	private BindingListModelList usersListModel = new BindingListModelList(new ArrayList<User>(), false);
	
	public ListModelList getUsersModel() {
		return usersListModel;
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		loadItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		
		updateUsersListModel();
		
		EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true).subscribe(
		    new EventListener() {
		        public void onEvent(Event event) throws Exception {
                    String eventName = event.getName();
                    if(eventName.equals(EventConstants.USER_CREATE_EVENT_NAME))
					    onUserCreated(event);
					else if(eventName.equals(EventConstants.USER_UPDATE_EVENT_NAME))
						onUserUpdated(event);
					else if(eventName.equals(EventConstants.USER_DELETE_EVENT_NAME) )
						onUserDeleted(event);
					else if(eventName.equals(EventConstants.USERDATA_UPDATE_EVENT_NAME) )
						onUserDataUpdated(event);
				}
			}
		);
	}
	
	protected void updateUsersListModel() {
		usersListModel.clear();
	    usersListModel.addAll(getFullUsersList());
	}
	
	protected List<User> getFullUsersList() {
		List<User> users = null;
		try {
		    users = UserFacade.retrieveAll();
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RETRIEVE_USERS);
		}
		return users;
	}
	
	protected void onUserCreated(Event event) {
		User user = (User) event.getData();
		if( !usersListModel.contains(user) ) {
			usersListModel.add(user);
		}
	}

	protected void onUserUpdated(Event event) {
		User user = (User) event.getData();
		if(usersListModel.contains(user))
			usersListModel.set(usersListModel.indexOf(user), user);
	}

	protected void onUserDeleted(Event event) {
		User user = (User) event.getData();
		if( usersListModel.contains(user) )
			usersListModel.remove(user);
	}
	
	@SuppressWarnings("unused")
	protected void onUserDataUpdated(Event event) {
		UserData userData = (UserData) event.getData();
		// TODO finish implementation
	}
	
	public void onClick$disableButton(Event event) {
		Events.postEvent(new Event("onDisableSetup", null, (User) WebUtil.getRowBindingData(event)));
	}
	
	public void onClick$enableButton(Event event) {
		Events.postEvent(new Event("onEnableSetup", null, (User) WebUtil.getRowBindingData(event)));
	}
	
	public void onOK$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onChange$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onItemsPerPageChanged(Event event) {
		setItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		updateUsersListModel();
		Events.echoEvent("onClearBusy", this, null);
	}
	
	public void onClick$resetButton(Event event) {
		Events.postEvent(new Event("onResetSetup", null, (User) WebUtil.getRowBindingData(event)));
	}
	
	public void onClick$typeChangeButton(Event event) {
		Events.postEvent(new Event("onTypeChangeSetup", null, (User) WebUtil.getRowBindingData(event)));
	}
	
	public void onClick$manageServicesButton(Event event) {
		Events.postEvent(new Event("onManageServicesSetup", null, (User) WebUtil.getRowBindingData(event)));
	}
}

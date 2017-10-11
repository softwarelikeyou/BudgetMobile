package com.budgetprepay.viewcontroller.group;

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

import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.facade.GroupFacade;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericAbstractListWindow;

public class ListWindow extends GenericAbstractListWindow implements AfterCompose  {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private static final String RESULTS_PER_PAGE_KEY = "groupsPerPage";

	protected Listbox groupsListbox;
	protected Paging listPager;
	protected Intbox itemsPerPage;
	
	private BindingListModelList groupsListModel = new BindingListModelList(new ArrayList<Group>(), false);
	
	public ListModelList getGroupsModel() {
		return groupsListModel;
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		loadItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		
		updateGroupsListModel();
		
		EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true).subscribe(
		    new EventListener() {
		        public void onEvent(Event event) throws Exception {
                    String eventName = event.getName();
                    if(eventName.equals(EventConstants.GROUP_CREATE_EVENT_NAME))
					    onGroupCreated(event);
					else if(eventName.equals(EventConstants.GROUP_UPDATE_EVENT_NAME))
						onGroupUpdated(event);
					else if(eventName.equals(EventConstants.GROUP_DELETE_EVENT_NAME) )
						;
						//onGroupDeleted(event);
				}
			}
		);
	}
	
	protected void updateGroupsListModel() {
		groupsListModel.clear();
	    groupsListModel.addAll(getFullGroupsList());
	}
	
	protected List<Group> getFullGroupsList() {
		List<Group> groups = null;
		try {
		    groups = GroupFacade.retrieveAll();
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RETRIEVE_USERS);
		}
		return groups;
	}
	
	protected void onGroupCreated(Event event) {
		Group group = (Group) event.getData();
		if( !groupsListModel.contains(group) ) {
			groupsListModel.add(group);
		}
	}

	protected void onGroupUpdated(Event event) {
		Group group = (Group) event.getData();
		if(groupsListModel.contains(group))
			groupsListModel.set(groupsListModel.indexOf(group), group);
	}
	
	public void onOK$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onChange$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onItemsPerPageChanged(Event event) {
		setItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		updateGroupsListModel();
		Events.echoEvent("onClearBusy", this, null);
	}
	
	public void onClick$editAnchor(Event event) {
		Events.postEvent(new Event("onEditSetup", null, (Group) WebUtil.getRowBindingData(event)));
	}
}

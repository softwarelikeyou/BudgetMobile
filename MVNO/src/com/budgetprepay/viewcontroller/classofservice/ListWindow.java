package com.budgetprepay.viewcontroller.classofservice;

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

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.facade.ClassOfServiceFacade;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericAbstractListWindow;

public class ListWindow extends GenericAbstractListWindow implements AfterCompose  {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private static final String RESULTS_PER_PAGE_KEY = "classOfServicesPerPage";

	protected Listbox classOfServicesListbox;
	protected Paging listPager;
	protected Intbox itemsPerPage;
	
	private BindingListModelList classOfServicesListModel = new BindingListModelList(new ArrayList<ClassOfService>(), false);
	
	public ListModelList getClassOfServicesModel() {
		return classOfServicesListModel;
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		loadItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		
		updateClassOfServicesListModel();
		
		EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true).subscribe(
		    new EventListener() {
		        public void onEvent(Event event) throws Exception {
                    String eventName = event.getName();
                    if(eventName.equals(EventConstants.CLASSOFSERVICE_CREATE_EVENT_NAME))
					    onClassOfServiceCreated(event);
					else if(eventName.equals(EventConstants.CLASSOFSERVICE_UPDATE_EVENT_NAME))
						onClassOfServiceUpdated(event);
					else if(eventName.equals(EventConstants.CLASSOFSERVICE_DELETE_EVENT_NAME) )
						;
						//onGroupDeleted(event);
				}
			}
		);
	}
	
	protected void updateClassOfServicesListModel() {
		classOfServicesListModel.clear();
	    classOfServicesListModel.addAll(getFullClassOfServicesList());
	}
	
	protected List<ClassOfService> getFullClassOfServicesList() {
		List<ClassOfService> classOfServices = null;
		try {
		    classOfServices = ClassOfServiceFacade.retrieveAll();
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RETRIEVE_CLASSOFSERVICES);
		}
		return classOfServices;
	}
	
	protected void onClassOfServiceCreated(Event event) {
		ClassOfService classOfService = (ClassOfService) event.getData();
		if( !classOfServicesListModel.contains(classOfService) ) {
			classOfServicesListModel.add(classOfService);
		}
	}

	protected void onClassOfServiceUpdated(Event event) {
		ClassOfService classOfService = (ClassOfService) event.getData();
		if(classOfServicesListModel.contains(classOfService))
			classOfServicesListModel.set(classOfServicesListModel.indexOf(classOfService), classOfService);
	}
	
	public void onOK$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onChange$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onItemsPerPageChanged(Event event) {
		setItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		updateClassOfServicesListModel();
		Events.echoEvent("onClearBusy", this, null);
	}
	
	public void onClick$editAnchor(Event event) {
		Events.postEvent(new Event("onEditSetup", null, (ClassOfService) WebUtil.getRowBindingData(event)));
	}
}

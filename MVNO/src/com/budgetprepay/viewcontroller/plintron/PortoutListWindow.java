package com.budgetprepay.viewcontroller.plintron;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
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

import com.budgetprepay.model.dao.RequestDAO.RequestFilter;
import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.facade.PlintronAsyncResponseFacade;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericAbstractListWindow;
import com.budgetprepay.viewcontroller.filter.Filter;
import com.budgetprepay.viewcontroller.filter.StringFilter;
import com.budgetprepay.viewcontroller.filter.StringFilterType;
import com.budgetprepay.viewcontroller.plintron.Controller;
import com.budgetprepay.viewcontroller.request.RequestListFilter;

public class PortoutListWindow extends GenericAbstractListWindow implements AfterCompose  {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private static final String RESULTS_PER_PAGE_KEY = "requestsPerPage";

	protected Listbox requestsListbox;
	protected Paging listPager;
	protected Intbox itemsPerPage;
	
	private BindingListModelList listModel = new BindingListModelList(new ArrayList<PlintronAsyncResponse>(), false);
	
	public ListModelList getListModel() {
		return listModel;
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		loadItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		
		updateListModel();
			
		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).subscribe(
			new EventListener() {
				public void onEvent(Event event) throws Exception {
					String eventName = event.getName();
					if (eventName.equals(EventConstants.REQUEST_FILTER_EVENT_NAME))
						updateListModel();
				}
			}
		);
	}
	
	public void onTimer() { 
		updateListModel();
		binder.loadAll();
	} 

	protected void updateListModel() {
		listModel.clear();
	    listModel.addAll(getFullList());
	}
	
	protected List<PlintronAsyncResponse> getFullList() {	
		RequestListFilter filter = (RequestListFilter) getAttribute(Controller.LIST_FILTER_PARAM_KEY, Component.SESSION_SCOPE);
		List<RequestFilter> filters = getRequestFilters(filter);

		List<PlintronAsyncResponse> list = null;
		try {
			if (filter == null)
		        list = PlintronAsyncResponseFacade.findAllPortouts();
			else
		        list = PlintronAsyncResponseFacade.findAllPortouts(filters);
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RETRIEVE_REQUESTS);
		}
		return list;
	}
	
	public void onOK$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onChange$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onItemsPerPageChanged(Event event) {
		setItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		updateListModel();
		Events.echoEvent("onClearBusy", this, null);
	}
	
	public void onSelect$portoutListbox(Event event) {
		PlintronAsyncResponse request = (PlintronAsyncResponse) WebUtil.getRowBindingData(event);
		Events.postEvent(new Event("onPortoutSelected", null, request));
	}
	
	private List<RequestFilter> getRequestFilters(RequestListFilter filter) {
		List<RequestFilter> filters = new ArrayList<RequestFilter>();
		
		if( filter != null) {
			
			List<Filter<?>> mdnFilters = filter.getPropertyFilters(PlintronAsyncResponse.MDN_PARAM);
			if( mdnFilters != null && mdnFilters.size() > 0) {
				for( Filter<?> mdnFilter : mdnFilters ) {
					if( !(mdnFilter instanceof StringFilter) ) continue;
					StringFilter strMdnFilter = (StringFilter) mdnFilter;
					String aMdn = strMdnFilter.getValue();			
					RequestFilter aFilter = new RequestFilter();
					if( strMdnFilter.getFilterType() == StringFilterType.CONTAINS)
						aFilter.filterOperation = RequestFilter.OP_CONTAINS;
					else if ( strMdnFilter.getFilterType() == StringFilterType.STARTS_WITH)
						aFilter.filterOperation = RequestFilter.OP_STARTS_WITH;
					else
						aFilter.filterOperation = RequestFilter.OP_ENDS_WITH;
					aFilter.parameter = PlintronAsyncResponse.MDN_PARAM;
					aFilter.value = aMdn;
					filters.add(aFilter);
				}
			}
			
			List<Filter<?>> clientReferenceFilters = filter.getPropertyFilters(PlintronAsyncResponse.REFERENCE_PARAM);
			if( clientReferenceFilters != null && clientReferenceFilters.size() > 0) {
				for( Filter<?> clientReferenceFilter : clientReferenceFilters ) {
					if( !(clientReferenceFilter instanceof StringFilter) ) continue;
					StringFilter strClientReferenceFilter = (StringFilter) clientReferenceFilter;
					String aClientReference = strClientReferenceFilter.getValue();			
					RequestFilter aFilter = new RequestFilter();
					if( strClientReferenceFilter.getFilterType() == StringFilterType.CONTAINS)
						aFilter.filterOperation = RequestFilter.OP_CONTAINS;
					else if ( strClientReferenceFilter.getFilterType() == StringFilterType.STARTS_WITH)
						aFilter.filterOperation = RequestFilter.OP_STARTS_WITH;
					else
						aFilter.filterOperation = RequestFilter.OP_ENDS_WITH;
					aFilter.parameter = PlintronAsyncResponse.REFERENCE_PARAM;
					aFilter.value = aClientReference;
					filters.add(aFilter);
				}
			}
		}
		return filters;
	}
}

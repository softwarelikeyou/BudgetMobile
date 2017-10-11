package com.budgetprepay.viewcontroller.request;

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
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.facade.RequestFacade;
import com.budgetprepay.viewcontroller.Messages;
import com.budgetprepay.viewcontroller.SessionUtil;
import com.budgetprepay.viewcontroller.WebUtil;
import com.budgetprepay.viewcontroller.component.GenericAbstractListWindow;
import com.budgetprepay.viewcontroller.filter.Filter;
import com.budgetprepay.viewcontroller.filter.StringFilter;
import com.budgetprepay.viewcontroller.filter.StringFilterType;

public class ListWindow extends GenericAbstractListWindow implements AfterCompose  {
	private static final long serialVersionUID = 1L;

	protected AnnotateDataBinder binder;
	
	private static final String RESULTS_PER_PAGE_KEY = "requestsPerPage";

	protected Listbox requestsListbox;
	protected Paging listPager;
	protected Intbox itemsPerPage;
	
	private BindingListModelList requestsListModel = new BindingListModelList(new ArrayList<Request>(), false);
	
	public ListModelList getRequestsModel() {
		return requestsListModel;
	}
	
	@Override
	public void afterCompose() {
		Components.wireVariables(this, this);
		Components.addForwards(this, this);

		binder = new AnnotateDataBinder(this);
		binder.loadAll();
		
		loadItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		
		updateRequestsListModel();
		
		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true).subscribe(
		    new EventListener() {
		        public void onEvent(Event event) throws Exception {
                    String eventName = event.getName();
                    RequestListFilter filter = (RequestListFilter) getAttribute(Controller.LIST_FILTER_PARAM_KEY, Component.SESSION_SCOPE);
                    if (filter != null)
                    	return;
                    if(eventName.equals(EventConstants.REQUEST_CREATE_EVENT_NAME))
					    onRequestCreated(event);
					else if(eventName.equals(EventConstants.REQUEST_UPDATE_EVENT_NAME))
						onRequestUpdated(event);
					else if(eventName.equals(EventConstants.REQUEST_DELETE_EVENT_NAME) )
						onRequestDeleted(event);
				}
			}
		);
		
		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).subscribe(
			new EventListener() {
				public void onEvent(Event event) throws Exception {
					String eventName = event.getName();
					if (eventName.equals(EventConstants.REQUEST_FILTER_EVENT_NAME))
						updateRequestsListModel();
				}
			}
		);
	}
	
	protected void updateRequestsListModel() {
		requestsListModel.clear();
	    requestsListModel.addAll(getFullUsersList());
	}
	
	protected List<Request> getFullUsersList() {
		RequestListFilter filter = (RequestListFilter) getAttribute(Controller.LIST_FILTER_PARAM_KEY, Component.SESSION_SCOPE);
		List<RequestFilter> filters = getRequestFilters(filter);
		
		List<Request> requests = null;
		try {
			if (filter == null)
		        requests = RequestFacade.retrieveAll(SessionUtil.getCurrentUser(), SessionUtil.getCurrentUser().getGroup());
			else
				requests = RequestFacade.retrieveAll(SessionUtil.getCurrentUser(), SessionUtil.getCurrentUser().getGroup(), filters);
		}
		catch (Exception e) {
			showErrorBox(e, Messages.COULD_NOT_RETRIEVE_REQUESTS);
		}
		return requests;
	}
	
	protected void onRequestCreated(Event event) {
		Request request = (Request) event.getData();
		if( !requestsListModel.contains(request) ) {
			requestsListModel.add(request);
		}
	}

	protected void onRequestUpdated(Event event) {
		Request request = (Request) event.getData();
		if(requestsListModel.contains(request))
			requestsListModel.set(requestsListModel.indexOf(request), request);
	}

	protected void onRequestDeleted(Event event) {
		Request request = (Request) event.getData();
		if( requestsListModel.contains(request) )
			requestsListModel.remove(request);
	}
	
	public void onOK$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onChange$itemsPerPage( Event event ) {
		Events.echoEvent("onItemsPerPageChanged", this, null);
	}

	public void onItemsPerPageChanged(Event event) {
		setItemsPerPage(RESULTS_PER_PAGE_KEY, itemsPerPage, listPager, DEFAULT_MAX_ITEMS_PER_PAGE, DEFAULT_ITEMS_PER_PAGE);
		updateRequestsListModel();
		Events.echoEvent("onClearBusy", this, null);
	}
	
	public void onSelect$requestsListbox(Event event) {
		Request request = (Request) WebUtil.getRowBindingData(event);
		Events.postEvent(new Event("onRequestSelected", null, request));
	}
	
	private List<RequestFilter> getRequestFilters(RequestListFilter filter) {
		List<RequestFilter> filters = new ArrayList<RequestFilter>();
		
		if( filter != null) {
			
			List<Filter<?>> mdnFilters = filter.getPropertyFilters(Request.MDN_PARAM);
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
					aFilter.parameter = Request.MDN_PARAM;
					aFilter.value = aMdn;
					filters.add(aFilter);
				}
			}
			
			List<Filter<?>> clientReferenceFilters = filter.getPropertyFilters(Request.CLIENTREFERENCE_PARAM);
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
					aFilter.parameter = Request.CLIENTREFERENCE_PARAM;
					aFilter.value = aClientReference;
					filters.add(aFilter);
				}
			}
		}
		return filters;
	}
}

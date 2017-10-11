package com.budgetprepay.viewcontroller.request;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Center;

import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.viewcontroller.BaseController;
import com.budgetprepay.viewcontroller.WebUtil;

public class Controller extends BaseController {
	private static final long serialVersionUID = 1L;
	
	protected DetailWindow detailWindow;
	protected static final String DETAILS_PANEL_ID = "detailsPanel";
	private static final String DETAIL_URL = "/Request/detail.zul";
	
	protected BasicFilterWindow basicFilterWindow;
	protected static final String LIST_FILTER_PARAM_KEY = "requestListFilter";
	private static final String BASIC_FILTER_URL = "/Request/basic-filter.zul";
	
	public void onRequestSelected(Event event) {
		Request request = (Request) event.getData();
		Desktop desktop = Executions.getCurrent().getDesktop();
		Component parent = WebUtil.getComponentById(desktop, DETAILS_PANEL_ID);

		if( parent == null )
			throw new IllegalArgumentException("Could not identify detail window");

		Center center = (Center) parent;
		center.getChildren().clear();

	    detailWindow = (DetailWindow) Executions.createComponents(DETAIL_URL, center, null);
		detailWindow.setRequest(request);
	}
	
	public void onBasicFilterSetup(Event evt) {
		basicFilterWindow = (BasicFilterWindow) Executions.createComponents(BASIC_FILTER_URL, null, null);
		basicFilterWindow.setMaximizable(true);
		basicFilterWindow.setClosable(true);
		basicFilterWindow.setMinimizable(true);
		basicFilterWindow.doHighlighted();
	}

	public void onBasicFilter(Event evt) {
		if( basicFilterWindow == null ) 
			throw new IllegalStateException("BasicFilterWindow object is not available");
		Clients.showBusy("Filtering List");
		Events.echoEvent("onDoBasicFilter", basicFilterWindow, null);
	}

	@SuppressWarnings("unchecked")
	public void onDoBasicFilter(Event evt) {

		if( basicFilterWindow == null ) 
			throw new IllegalStateException("BasicFilterWindow object is not available");

		RequestListFilter filter = basicFilterWindow.getListFilter();
		sessionScope.put(LIST_FILTER_PARAM_KEY, filter);

		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).publish(new Event(EventConstants.REQUEST_FILTER_EVENT_NAME, null, null));

		Clients.clearBusy();

		basicFilterWindow.detach();
		basicFilterWindow = null;
	}
	

	public void onClearFilter(Event evt) {

		sessionScope.remove(LIST_FILTER_PARAM_KEY);

		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.SESSION, true).publish(
			new Event(EventConstants.REQUEST_FILTER_EVENT_NAME, null, null)
			);

	}
}

package com.budgetprepay.viewcontroller;

import java.util.HashMap;
import java.util.Map;

import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueue;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.DesktopInit;
import org.zkoss.zk.ui.util.WebAppCleanup;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.event.ClassOfServiceEvent;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.event.GroupEvent;
import com.budgetprepay.model.event.RequestEvent;
import com.budgetprepay.model.event.UserEvent;

public class GlobalUpdater implements DesktopInit, WebAppCleanup {
	
	private static Map<String, EventQueue> applicationEventQueues = null;
	private static boolean shutdown = false;

	private static synchronized void initEventQueues() {
		if( applicationEventQueues == null ) {

			applicationEventQueues = new HashMap<String, EventQueue>();
			applicationEventQueues.put(EventConstants.USER_EVENT_QUEUE_NAME, EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true));
			applicationEventQueues.put(EventConstants.GROUP_EVENT_QUEUE_NAME, EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true));
			applicationEventQueues.put(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true));
			applicationEventQueues.put(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true));
			applicationEventQueues.put(EventConstants.VERIZON_EVENT_QUEUE_NAME, EventQueues.lookup(EventConstants.VERIZON_EVENT_QUEUE_NAME, EventQueues.APPLICATION, true));

			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (shutdown) return;
					if (!(event instanceof UserEvent)) return;
					if (event.getName().equals(EventConstants.USER_CREATE_EVENT_NAME))
						applicationEventQueues.get(EventConstants.USER_EVENT_QUEUE_NAME).publish(new Event(EventConstants.USER_CREATE_EVENT_NAME, null, (User)event.getData()));
					else if( event.getName().equals(EventConstants.USER_UPDATE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.USER_EVENT_QUEUE_NAME).publish(new Event(EventConstants.USER_UPDATE_EVENT_NAME, null, (User)event.getData()));
					else if( event.getName().equals(EventConstants.USER_DELETE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.USER_EVENT_QUEUE_NAME).publish(new Event(EventConstants.USER_DELETE_EVENT_NAME, null, (User)event.getData()));
					else if( event.getName().equals(EventConstants.USERDATA_UPDATE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.USER_EVENT_QUEUE_NAME).publish(new Event(EventConstants.USERDATA_UPDATE_EVENT_NAME, null, (UserData)event.getData()));
				} 
			});
			
			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (shutdown) return;
					if (!(event instanceof GroupEvent)) return;
					if (event.getName().equals(EventConstants.GROUP_CREATE_EVENT_NAME))
						applicationEventQueues.get(EventConstants.GROUP_EVENT_QUEUE_NAME).publish(new Event(EventConstants.GROUP_CREATE_EVENT_NAME, null, (Group)event.getData()));
					else if( event.getName().equals(EventConstants.GROUP_UPDATE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.GROUP_EVENT_QUEUE_NAME).publish(new Event(EventConstants.GROUP_UPDATE_EVENT_NAME, null, (Group)event.getData()));
					else if( event.getName().equals(EventConstants.GROUP_DELETE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.GROUP_EVENT_QUEUE_NAME).publish(new Event(EventConstants.GROUP_DELETE_EVENT_NAME, null, (Group)event.getData()));
				} 
			});
			
			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (shutdown) return;
					if (!(event instanceof ClassOfServiceEvent)) return;
					if (event.getName().equals(EventConstants.CLASSOFSERVICE_CREATE_EVENT_NAME))
						applicationEventQueues.get(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME).publish(new Event(EventConstants.CLASSOFSERVICE_CREATE_EVENT_NAME, null, (ClassOfService)event.getData()));
					else if( event.getName().equals(EventConstants.CLASSOFSERVICE_UPDATE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME).publish(new Event(EventConstants.CLASSOFSERVICE_UPDATE_EVENT_NAME, null, (ClassOfService)event.getData()));
					else if( event.getName().equals(EventConstants.CLASSOFSERVICE_DELETE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME).publish(new Event(EventConstants.CLASSOFSERVICE_DELETE_EVENT_NAME, null, (ClassOfService)event.getData()));
				} 
			});
			
			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (shutdown) return;
					if (!(event instanceof RequestEvent)) return;
					if (event.getName().equals(EventConstants.REQUEST_CREATE_EVENT_NAME))
						applicationEventQueues.get(EventConstants.REQUEST_EVENT_QUEUE_NAME).publish(new Event(EventConstants.REQUEST_CREATE_EVENT_NAME, null, (Request)event.getData()));
					else if( event.getName().equals(EventConstants.REQUEST_UPDATE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.REQUEST_EVENT_QUEUE_NAME).publish(new Event(EventConstants.REQUEST_UPDATE_EVENT_NAME, null, (Request)event.getData()));
					else if( event.getName().equals(EventConstants.REQUEST_DELETE_EVENT_NAME)) 
						applicationEventQueues.get(EventConstants.REQUEST_EVENT_QUEUE_NAME).publish(new Event(EventConstants.REQUEST_DELETE_EVENT_NAME, null, (Request)event.getData()));
				} 
			});
		}
	}
	
	public boolean isShutdown() {
		return shutdown;
	}
	
	protected static void start() {
		shutdown = false;
		initEventQueues();
	}

	protected static void stop() {
		shutdown = true;
		applicationEventQueues = null;
	}

	public void init(Desktop desktop, Object req) throws Exception {
		GlobalUpdater.start();
	}

	public void cleanup(WebApp webapp) throws Exception {
		GlobalUpdater.stop();
	}
}

package com.budgetprepay.model.facade;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.event.ClassOfServiceEvent;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.event.EventQueues;
import com.budgetprepay.model.event.GroupEvent;
import com.budgetprepay.model.event.RequestEvent;
import com.budgetprepay.model.event.UserDataEvent;
import com.budgetprepay.model.event.UserEvent;
import com.budgetprepay.model.event.VerizonEvent;

public class EventFacade {
	public static void fireUserCreated(final User user) {
		EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, true).publish(new UserEvent(EventConstants.USER_CREATE_EVENT_NAME, user));	
	}
	
	public static void fireUserUpdated(final User user) {
        EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, true).publish(new UserEvent(EventConstants.USER_UPDATE_EVENT_NAME, user));
	}
	
	public static void fireUserDeleted(final User user) {
        EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, true).publish(new UserEvent(EventConstants.USER_DELETE_EVENT_NAME, user));
	}
	
	public static void fireUserDataUpdated(final UserData userData) {
        EventQueues.lookup(EventConstants.USER_EVENT_QUEUE_NAME, true).publish(new UserDataEvent(EventConstants.USERDATA_UPDATE_EVENT_NAME, userData));
	}
	
	public static void fireGroupCreated(final Group group) {
		EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME, true).publish(new GroupEvent(EventConstants.GROUP_CREATE_EVENT_NAME, group));	
	}
	
	public static void fireGroupUpdated(final Group group) {
        EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME, true).publish(new GroupEvent(EventConstants.GROUP_UPDATE_EVENT_NAME, group));
	}
	
	public static void fireGroupDeleted(final Group group) {
        EventQueues.lookup(EventConstants.GROUP_EVENT_QUEUE_NAME, true).publish(new GroupEvent(EventConstants.GROUP_DELETE_EVENT_NAME, group));
	}
	
	public static void fireClassOfServiceCreated(final ClassOfService classOfService) {
		EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, true).publish(new ClassOfServiceEvent(EventConstants.CLASSOFSERVICE_CREATE_EVENT_NAME, classOfService));	
	}
	
	public static void fireClassOfServiceUpdated(final ClassOfService classOfService) {
        EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, true).publish(new ClassOfServiceEvent(EventConstants.CLASSOFSERVICE_UPDATE_EVENT_NAME, classOfService));
	}
	
	public static void fireClassOfServiceDeleted(final ClassOfService classOfService) {
        EventQueues.lookup(EventConstants.CLASSOFSERVICE_EVENT_QUEUE_NAME, true).publish(new ClassOfServiceEvent(EventConstants.CLASSOFSERVICE_DELETE_EVENT_NAME, classOfService));
	}
	public static void fireRequestCreated(final Request request) {
		EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, true).publish(new RequestEvent(EventConstants.REQUEST_CREATE_EVENT_NAME, request));	
	}
	
	public static void fireRequestUpdated(final Request request) {
        EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, true).publish(new RequestEvent(EventConstants.REQUEST_UPDATE_EVENT_NAME, request));
	}
	
	public static void fireRequestDeleted(final Request request) {
        EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, true).publish(new RequestEvent(EventConstants.REQUEST_DELETE_EVENT_NAME, request));
	}
	
	public static void fireVerizonCallback(final String data) {
        EventQueues.lookup(EventConstants.VERIZON_EVENT_QUEUE_NAME, true).publish(new VerizonEvent(EventConstants.VERIZON_RSS_CALLBACK_EVENT_NAME, data));
	}
	
	public static void fireVerizonRSSDeviceInquiry3GMEID(final Request request) {
        EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, true).publish(new RequestEvent(EventConstants.REQUEST_VERIZON_RSS_DEVICE_INQUIRY_3G_MEID_EVENT_NAME, request));
	}
	
	public static void fireVerizonRSSActivateSubscriber3GMDNMEID(final Request request) {
        EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME, true).publish(new RequestEvent(EventConstants.REQUEST_VERIZON_RSS_ACTIVATE_SUBSCRIBER_3G_MDN_MEID_EVENT_NAME, request));
	}
}

package com.budgetprepay.model.event;

public interface EventConstants {

	public static final String USER_EVENT_QUEUE_NAME = "userEventQueue";
	public static final String USER_CREATE_EVENT_NAME = "onUserCreated";
	public static final String USER_UPDATE_EVENT_NAME = "onUserUpdated";
	public static final String USER_DELETE_EVENT_NAME = "onUserDeleted";
	public static final String USER_FILTER_EVENT_NAME = "onUserFilterChanged";
	public static final String USERDATA_UPDATE_EVENT_NAME = "onUserDataChanged";
	
	public static final String GROUP_EVENT_QUEUE_NAME = "groupEventQueue";
	public static final String GROUP_CREATE_EVENT_NAME = "onGroupCreated";
	public static final String GROUP_UPDATE_EVENT_NAME = "onGroupUpdated";
	public static final String GROUP_DELETE_EVENT_NAME = "onGroupDeleted";
	public static final String GROUP_FILTER_EVENT_NAME = "onGroupFilterChanged";
	
	public static final String CLASSOFSERVICE_EVENT_QUEUE_NAME = "classOfServiceEventQueue";
	public static final String CLASSOFSERVICE_CREATE_EVENT_NAME = "onClassOfServiceCreated";
	public static final String CLASSOFSERVICE_UPDATE_EVENT_NAME = "onClassOfServiceUpdated";
	public static final String CLASSOFSERVICE_DELETE_EVENT_NAME = "onClassOfServiceDeleted";
	public static final String CLASSOFSERVICE_FILTER_EVENT_NAME = "onClassOfServiceFilterChanged";
	
	public static final String REQUEST_EVENT_QUEUE_NAME = "requestEventQueue";
	public static final String REQUEST_CREATE_EVENT_NAME = "onRequestCreated";
	public static final String REQUEST_UPDATE_EVENT_NAME = "onReqestUpdated";
	public static final String REQUEST_DELETE_EVENT_NAME = "onRequestDeleted";
	public static final String REQUEST_FILTER_EVENT_NAME = "onRequestFilterChanged";	
	public static final String REQUEST_VERIZON_RSS_DEVICE_INQUIRY_3G_MEID_EVENT_NAME = "onRequestVerizonRSSDeviceInquiry3GMEID";
	public static final String REQUEST_VERIZON_RSS_ACTIVATE_SUBSCRIBER_3G_MDN_MEID_EVENT_NAME = "onRequestVerizonRSSActivateSubscriber3GMDNMEID";
	
	public static final String VERIZON_EVENT_QUEUE_NAME = "verizonEventQueue";
	public static final String VERIZON_RSS_CALLBACK_EVENT_NAME = "onRSSCallbackCreated";
}

package com.budgetprepay.viewcontroller;

import mazz.i18n.Msg;

public interface GlobalConstants {

	public static final String				DEFAULT_MESSAGE_BUNDLE				= "messages";
	public static final Msg.BundleBaseName	DEFAULT_MESSAGE_BUNDLE_BASE_NAME	= new Msg.BundleBaseName(DEFAULT_MESSAGE_BUNDLE);
	public static final String				DEFAULT_USERNAME					= "root";
	public static final String				DEFAULT_PASSWORD					= "password";	
	public static final String				ADMIN_PASSWORD						= "dinky01";
	public static final String				ADMIN_USERNAME						= "admin";
	public static final String              DEFAULT_SALT						= "4g$h&MqL)";
	public static final String              WELL_PIN							= "pin_green";
	public static final String              COMPETITOR_PIN						= "pin_red";
	public static final String				FACILITY_PIN						= "pin_blue";
	public static final String              BRANCH_PIN                          = "pin_yellow";
	public static final String              HQ_PIN                              = "flag_blue";
	
	public static final Integer				USER_LIMIT							= 5;
}

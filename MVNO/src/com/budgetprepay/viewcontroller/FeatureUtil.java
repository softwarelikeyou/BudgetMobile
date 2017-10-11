package com.budgetprepay.viewcontroller;

import com.budgetprepay.ServerVersion;

public class FeatureUtil {
	
	public static String productHeaderString() { 
		return ELFunctions.getLabel(Labels.PRODUCT_HEADER_STRING);
	}
	
	public static String vendorCopyrightString() {
		return "&copy; " + ServerVersion.SERVER_VENDOR_COPYRIGHT;
	}
	
	public static String vendorWebsiteString() {
		return ServerVersion.SERVER_VENDOR_WEBSITE;
	}
	
	public static String helpWebsiteURL() { 
		return ServerVersion.SERVER_HELP_WEBSITE;
	}
}

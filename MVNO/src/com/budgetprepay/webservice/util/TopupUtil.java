package com.budgetprepay.webservice.util;

import java.util.HashMap;
import java.util.Map;

import com.budgetprepay.webservice.endpoints.TopupEndpoint;

public class TopupUtil extends CommonUtil {
	
	private static Map<String, String> TopupError = new HashMap<String, String>();
		
	static {
		TopupError.put("000001","Unknown Error");
		TopupError.put("000002","User is not authorized");
	}
	
	public static String getTopupErrorDescriton(final String errorCode) {
		return TopupError.get(errorCode);
	}
	
	public static String JAXB2XML(final Object object) throws Exception {
		return JAXB2XML(object, TopupEndpoint.NAMESPACE_URI);
	}
}

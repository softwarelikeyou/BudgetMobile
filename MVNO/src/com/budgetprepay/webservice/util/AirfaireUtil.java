package com.budgetprepay.webservice.util;

import java.util.HashMap;
import java.util.Map;

import com.budgetprepay.webservice.endpoints.AirfaireEndpoint;

public class AirfaireUtil extends CommonUtil {
	
	private static Map<String, String> AirfaireError = new HashMap<String, String>();
		
	static {
		AirfaireError.put("000001","Unknown Error");
		AirfaireError.put("000002","User is not authorized");
	}
	
	public static String getAirfaireErrorDescriton(final String errorCode) {
		return AirfaireError.get(errorCode);
	}
	
	public static String JAXB2XML(final Object object) throws Exception {
		return JAXB2XML(object, AirfaireEndpoint.NAMESPACE_URI);
	}
}

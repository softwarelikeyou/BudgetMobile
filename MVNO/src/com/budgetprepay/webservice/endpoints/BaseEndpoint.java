package com.budgetprepay.webservice.endpoints;

import org.apache.log4j.Logger;

import com.budgetprepay.model.entity.Request;

public abstract class BaseEndpoint {
		
	private static Logger logger = Logger.getLogger(BaseEndpoint.class);

	public static final String NAMESPACE_URI_PRE = "http://www.budgetprepay.com/MVNO";
	
	protected static void logRequest(final Request request) {
		logger.debug("**********");
		logger.debug(request.getCreated());
		logger.debug(request.getId());
		logger.debug(request.getClass().getCanonicalName());
		logger.debug(request.getUser().getUsername());
		logger.debug(request.getReferenceNumber());
		logger.debug(request.getClientReference());
		logger.debug(request.getClientRequestClass());
		logger.debug(request.getType());
		logger.debug(request.getClientRequestXML());
		logger.debug(request.getClientSynchronousResponseXML());
		logger.debug("**********");
	}
}

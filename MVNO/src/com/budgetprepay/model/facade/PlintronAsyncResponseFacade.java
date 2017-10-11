package com.budgetprepay.model.facade;

import java.util.List;

import com.budgetprepay.model.dao.PlintronAsyncResponseDAO;
import com.budgetprepay.model.dao.RequestDAO.RequestFilter;
import com.budgetprepay.model.entity.PlintronAsyncResponse;

public class PlintronAsyncResponseFacade {

	public static List<PlintronAsyncResponse> findAllPortouts() throws Exception {
		return new PlintronAsyncResponseDAO().findAllPortouts();
	}
	
	public static List<PlintronAsyncResponse> findAllPortouts(final List<RequestFilter> filters) throws Exception {
		return new PlintronAsyncResponseDAO().findAllPortouts(filters);
	}
	
	public static List<PlintronAsyncResponse> findAll() throws Exception {
		return new PlintronAsyncResponseDAO().findAll();
	}
	
	public static List<PlintronAsyncResponse> findAll(final List<RequestFilter> filters) throws Exception {
		return new PlintronAsyncResponseDAO().findAll(filters);
	}
	
	public static PlintronAsyncResponse createOrUpdate(PlintronAsyncResponse response) throws Exception {
	    return new PlintronAsyncResponseDAO().createOrUpdate(response);
	}
}

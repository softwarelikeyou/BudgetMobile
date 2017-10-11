package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.PlintronBulkMessageRequestDAO;
import com.budgetprepay.model.entity.PlintronBulkMessageRequest;
import com.budgetprepay.model.entity.User;

public class PlintronBulkMessageRequestFacade {	
	
	public static PlintronBulkMessageRequest createorUpdate(PlintronBulkMessageRequest request) throws Exception {
		try {
			request = new PlintronBulkMessageRequestDAO().createOrUpdate(request);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return request;
	}
	
	public static List<PlintronBulkMessageRequest> retrieveAll() throws Exception {
		List<PlintronBulkMessageRequest> results = null;;
		try {
		    results = new PlintronBulkMessageRequestDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<PlintronBulkMessageRequest> retrieveAll(final User user) throws Exception {
		List<PlintronBulkMessageRequest> results = null;;
		try {
			if (user.isAdministrator())
		        results = new PlintronBulkMessageRequestDAO().findAll();
			else
				results = new PlintronBulkMessageRequestDAO().findAll(user);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<PlintronBulkMessageRequest> retrieveAllByReferenceNumber(final String referenceNumber) throws Exception {
		List<PlintronBulkMessageRequest> results = null;;
		try {
			results = new PlintronBulkMessageRequestDAO().findAllByReferenceNumber(referenceNumber);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
}

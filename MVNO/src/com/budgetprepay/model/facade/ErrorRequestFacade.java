package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.ErrorRequestDAO;
import com.budgetprepay.model.entity.ErrorRequest;

public class ErrorRequestFacade {	
	
	public static List<ErrorRequest> retrieveAll() throws Exception {
		List<ErrorRequest> results = null;;
		try {
		    results = new ErrorRequestDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<ErrorRequest> retrieveAllBySearch(final String search) throws Exception {
		try {
		    return new ErrorRequestDAO().findAll(search);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
	}
	
	public static ErrorRequest retrieveById(final long id) throws Exception {
		try {
			return new ErrorRequestDAO().findById(id);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
	}
	
	public static ErrorRequest create(ErrorRequest errorRequest) throws Exception {
		try {
			errorRequest = new ErrorRequestDAO().create(errorRequest);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return errorRequest;
	}
}

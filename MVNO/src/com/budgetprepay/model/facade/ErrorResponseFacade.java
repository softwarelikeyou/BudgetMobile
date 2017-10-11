package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.ErrorResponseDAO;
import com.budgetprepay.model.entity.ErrorResponse;

public class ErrorResponseFacade {	
	
	public static List<ErrorResponse> retrieveAll() throws Exception {
		List<ErrorResponse> results = null;;
		try {
		    results = new ErrorResponseDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<ErrorResponse> retrieveAllBySearch(final String search) throws Exception {
		try {
		    return new ErrorResponseDAO().findAll(search);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
	}
	public static ErrorResponse retrieveById(final long id) throws Exception {
		try {
			return new ErrorResponseDAO().findById(id);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
	}

	public static ErrorResponse create(ErrorResponse ErrorResponse) throws Exception {
		try {
			ErrorResponse = new ErrorResponseDAO().create(ErrorResponse);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return ErrorResponse;
	}
}

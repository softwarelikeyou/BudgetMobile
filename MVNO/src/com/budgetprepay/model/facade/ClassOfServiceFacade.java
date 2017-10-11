package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.ClassOfServiceDAO;
import com.budgetprepay.model.entity.ClassOfService;

public class ClassOfServiceFacade {	

	public static ClassOfService retrieveByName(final String name) throws Exception {
		ClassOfService results = null;
		try {
		    results = new ClassOfServiceDAO().findByName(name);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<ClassOfService> retrieveAll() throws Exception {
		List<ClassOfService> results = null;;
		try {
		    results = new ClassOfServiceDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static ClassOfService persist(ClassOfService ClassOfService) throws Exception {
		try {
			ClassOfService = new ClassOfServiceDAO().createOrUpdate(ClassOfService);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
		return ClassOfService;
	}
	
	public static ClassOfService createOrUpdate(ClassOfService ClassOfService) throws Exception {
		try {
			ClassOfService = persist(ClassOfService);
			EventFacade.fireClassOfServiceCreated(ClassOfService);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return ClassOfService;
	}
	
	public static ClassOfService update(ClassOfService ClassOfService) throws Exception {
		try {
			ClassOfService = persist(ClassOfService);
			EventFacade.fireClassOfServiceUpdated(ClassOfService);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return ClassOfService;
	}
	
	public static void delete(ClassOfService ClassOfService) throws Exception {
		try {
			new ClassOfServiceDAO().remove(ClassOfService);
			EventFacade.fireClassOfServiceDeleted(ClassOfService);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}
}

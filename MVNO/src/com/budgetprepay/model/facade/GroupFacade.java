package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.GroupDAO;
import com.budgetprepay.model.entity.Group;

public class GroupFacade {	

	public static Group retrieveByName(final String name) throws Exception {
		Group results = null;
		try {
		    results = new GroupDAO().findByName(name);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Group> retrieveAll() throws Exception {
		List<Group> results = null;;
		try {
		    results = new GroupDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static Group persist(Group group) throws Exception {
		try {
			group = new GroupDAO().createOrUpdate(group);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
		return group;
	}
	
	public static Group createOrUpdate(Group group) throws Exception {
		try {
			group = persist(group);
			EventFacade.fireGroupCreated(group);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return group;
	}
	
	public static Group update(Group group) throws Exception {
		try {
			group = persist(group);
			EventFacade.fireGroupUpdated(group);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return group;
	}
	
	public static void delete(Group group) throws Exception {
		try {
			new GroupDAO().remove(group);
			EventFacade.fireGroupDeleted(group);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}
}

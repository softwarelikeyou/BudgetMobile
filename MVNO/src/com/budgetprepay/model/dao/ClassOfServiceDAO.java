package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.ClassOfService;

public class ClassOfServiceDAO extends HibernateDAO<ClassOfService, Long> {

	public ClassOfServiceDAO() {
		super();
	}
	
	public ClassOfServiceDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public ClassOfService createOrUpdate(ClassOfService entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (ClassOfService) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update classOfService " + entity.getName(), e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<ClassOfService> findAll() throws Exception {
		Session session = null;
		List<ClassOfService> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createQuery("from ClassOfService").list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all classOfServices", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	public ClassOfService findById(Long id) throws Exception {
		if (id == null) return null;
		Session session = null;
		ClassOfService entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (ClassOfService) findById(session, id, false);
		}
		catch (Exception e) {
			throw new Exception("Unable to find classOfService by id " + id, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public ClassOfService findByName(final String name) throws Exception {
		if (name == null) return null;
		Session session = null;
		ClassOfService entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (ClassOfService) session.createCriteria(ClassOfService.class)
			                         .add(Restrictions.eq("name", name))
			                         .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception("Unable to find classOfService by name " + name, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public void remove(ClassOfService entity) throws Exception {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			makeTransient(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to remove classOfService " + entity.getName(), e);
		}
		finally {
			session.close();
		}
	}	
}
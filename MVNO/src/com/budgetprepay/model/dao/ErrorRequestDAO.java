package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.ErrorRequest;

public class ErrorRequestDAO extends HibernateDAO<ErrorRequest, Long> {

	public ErrorRequestDAO() {
		super();
	}
	
	public ErrorRequestDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public ErrorRequest create(ErrorRequest entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (ErrorRequest) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update error Request ", e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<ErrorRequest> findAll() throws Exception {
		Session session = null;
		List<ErrorRequest> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(ErrorRequest.class).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all error requests", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<ErrorRequest> findAll(final String search) throws Exception {
		Session session = null;
		List<ErrorRequest> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<ErrorRequest>) session.createCriteria(ErrorRequest.class)
                                                    .add(Restrictions.like("xml", search, MatchMode.ANYWHERE))
                                                    .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all error requests for search " + search, e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	public ErrorRequest findById(final long id) throws Exception {
		Session session = null;
		ErrorRequest entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (ErrorRequest) findById(session, id, false);
			
		}
		catch (Exception e) {
			throw new Exception("Unable to find error request for id " + id, e);
		}
		finally {
			session.close();
		}
		return entity;		
	}
}
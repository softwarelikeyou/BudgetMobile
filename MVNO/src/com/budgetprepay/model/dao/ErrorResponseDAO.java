package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.ErrorResponse;

public class ErrorResponseDAO extends HibernateDAO<ErrorResponse, Long> {

	public ErrorResponseDAO() {
		super();
	}
	
	public ErrorResponseDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public ErrorResponse create(ErrorResponse entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (ErrorResponse) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update error response ", e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<ErrorResponse> findAll() throws Exception {
		Session session = null;
		List<ErrorResponse> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(ErrorResponse.class).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all error reponses", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<ErrorResponse> findAll(final String search) throws Exception {
		Session session = null;
		List<ErrorResponse> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<ErrorResponse>) session.createCriteria(ErrorResponse.class)
                                                    .add(Restrictions.like("xml", search, MatchMode.ANYWHERE))
                                                    .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all error responses for search " + search, e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	public ErrorResponse findById(final long id) throws Exception {
		Session session = null;
		ErrorResponse entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (ErrorResponse) findById(session, id, false);
			
		}
		catch (Exception e) {
			throw new Exception("Unable to find error response for id " + id, e);
		}
		finally {
			session.close();
		}
		return entity;		
	}
}
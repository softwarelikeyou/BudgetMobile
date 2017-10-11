package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.PlintronBulkMessageRequest;
import com.budgetprepay.model.entity.User;

public class PlintronBulkMessageRequestDAO extends HibernateDAO<PlintronBulkMessageRequest, Long> {

	public PlintronBulkMessageRequestDAO() {
		super();
	}
	
	public PlintronBulkMessageRequestDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public PlintronBulkMessageRequest createOrUpdate(PlintronBulkMessageRequest entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (PlintronBulkMessageRequest) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update PlintronBulkMessageRequest " + entity.getReferenceNumber(), e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronBulkMessageRequest> findAll() throws Exception {
		Session session = null;
		List<PlintronBulkMessageRequest> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(getPersistentClass())
					          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					          .addOrder(Order.desc("started"))
					          .setMaxResults(MAX_RESULTS)
					          .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all PlintronBulkMessageRequests", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronBulkMessageRequest> findAll(final User user) throws Exception {
		Session session = null;
		List<PlintronBulkMessageRequest> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<PlintronBulkMessageRequest>) session.createCriteria(getPersistentClass())
					                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                              .add(Restrictions.eq("user", user))
                                              .addOrder(Order.desc("started"))
                                              .setMaxResults(MAX_RESULTS)
                                              .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all PlintronBulkMessageRequests for user " + user.getUsername(), e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronBulkMessageRequest> findAllByReferenceNumber(final String referenceNumber) throws Exception {
		Session session = null;
		List<PlintronBulkMessageRequest> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<PlintronBulkMessageRequest>) session.createCriteria(getPersistentClass())
					                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                              .add(Restrictions.eq("referenceNumber", referenceNumber))
                                              .addOrder(Order.asc("id"))
                                              .setMaxResults(MAX_RESULTS * 10)
                                              .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all PlintronBulkMessageRequests for reference " + referenceNumber, e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
}
package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;

public class UserDataDAO extends HibernateDAO<UserData, Long> {	
	public UserDataDAO() {
		super();
	}
	
	public UserDataDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public UserData createOrUpdate(UserData entity) throws HibernateException {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (UserData) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public UserData findProperty(final User user, final String property) throws HibernateException {
		Session session = null;
		UserData entity = null;
		try {
			session = sessionFactory.openSession();
			entity= (UserData) session.createCriteria(UserData.class)
			                                      .add(Restrictions.eq("userId", user.getId()))
			                                      .add(Restrictions.eq("property", property))
			                                      .uniqueResult();
		}
		catch (Exception e) {
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<UserData> findAll(final User user) throws HibernateException {
		Session session = null;
		List<UserData> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<UserData>) session.createCriteria(UserData.class)
			                                   .add(Restrictions.eq("userId", user.getId()))
			                                   .list();
		}
		catch (Exception e) {
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
		return entities;
	}
	
	public void remove(UserData entity) throws HibernateException {
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
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
	}
}

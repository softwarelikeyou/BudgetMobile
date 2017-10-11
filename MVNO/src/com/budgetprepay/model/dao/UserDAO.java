package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.User;

public class UserDAO extends HibernateDAO<User, Long> {	
	public UserDAO() {
		super();
	}
	
	public UserDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public User createOrUpdate(User entity) throws HibernateException  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (User) makePersistent(session, entity);
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
	
	@SuppressWarnings("unchecked")
	public List<User> findAll() throws HibernateException {
		Session session = null;
		List<User> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createQuery("from User").list();
		}
		catch (Exception e) {
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<User> findByGroup(final Group group) throws HibernateException {
		Session session = null;
		List<User> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(User.class)
                              .add(Restrictions.eq("group", group))
                              .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
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
	
	public User findById(Long id) throws HibernateException {
		if (id == null) return null;
		Session session = null;
		User entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (User) findById(session, id, false);
		}
		catch (Exception e) {
			throw new HibernateException(e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public User findByName(final String username) throws HibernateException {
		if (username == null) return null;
		Session session = null;
		User entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (User) session.createCriteria(User.class)
			                       .add(Restrictions.eq("username", username))
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
	
	public User findByEmail(final String email) throws HibernateException {
		if (email == null) return null;
		Session session = null;
		User entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (User) session.createCriteria(User.class)
			                       .add(Restrictions.eq("email", email))
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
	
	public void remove(User entity) throws HibernateException {
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
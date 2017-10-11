package com.budgetprepay.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.entity.Group;

public class GroupDAO extends HibernateDAO<Group, Long> {

	public GroupDAO() {
		super();
	}
	
	public GroupDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public Group createOrUpdate(Group entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (Group) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update group " + entity.getName(), e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<Group> findAll() throws Exception {
		Session session = null;
		List<Group> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createQuery("from Group").list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all groups", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	public Group findById(Long id) throws Exception {
		if (id == null) return null;
		Session session = null;
		Group entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Group) findById(session, id, false);
		}
		catch (Exception e) {
			throw new Exception("Unable to find group by id " + id, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public Group findByName(final String name) throws Exception {
		if (name == null) return null;
		Session session = null;
		Group entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Group) session.createCriteria(Group.class)
			                         .add(Restrictions.eq("name", name))
			                         .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception("Unable to find group by name " + name, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public void remove(Group entity) throws Exception {
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
			throw new Exception("Unable to remove group " + entity.getName(), e);
		}
		finally {
			session.close();
		}
	}	
}
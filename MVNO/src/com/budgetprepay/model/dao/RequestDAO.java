package com.budgetprepay.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.dao.SimpleCriteriaRestriction.RestrictionType;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.Request.RequestType;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.UserFacade;

public class RequestDAO extends HibernateDAO<Request, Long> {

	public RequestDAO() {
		super();
	}
	
	public RequestDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	public static class RequestFilter {
		public static final int OP_STARTS_WITH = 0;
		public static final int OP_CONTAINS = 1;
		public static final int OP_ENDS_WITH = 2;
		public static final int OP_IN = 3;
		
		public String parameter;
		public String value;
		public int filterOperation;
	}
	
	public Request createOrUpdate(Request entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (Request) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update request " + entity.getReferenceNumber(), e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll() throws Exception {
		Session session = null;
		List<Request> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(Request.class)
					          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					          .addOrder(Order.desc("created"))
					          .setMaxResults(MAX_RESULTS)
					          .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll(final User user) throws Exception {
		Session session = null;
		List<Request> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<Request>) session.createCriteria(Request.class)
					                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                              .add(Restrictions.eq("user", user))
                                              .addOrder(Order.desc("created"))
                                              .setMaxResults(MAX_RESULTS)
                                              .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests for user " + user.getUsername(), e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll(final Group group) throws Exception {
		Session session = null;
		List<Request> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<Request>) session.createCriteria(Request.class)
					                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                              .add(Restrictions.in("user", UserFacade.retrieveByGroup(group)))
                                              .addOrder(Order.desc("created"))
                                              .setMaxResults(MAX_RESULTS)
                                              .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests for users in group " + group.getName(), e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	private List<SimpleCriteriaRestriction> getRestrictions(final List<RequestFilter> filters) throws Exception {
		List<SimpleCriteriaRestriction> restrictions = new ArrayList<SimpleCriteriaRestriction>();
		for (RequestFilter filter : filters) {
			String propertyName = null;
			String searchValue = null;
			switch (filter.parameter) {
			    case Request.MDN_PARAM:
				    propertyName = Request.MDN_PARAM;
				    break;
			    case Request.CLIENTREFERENCE_PARAM:
				    propertyName = Request.CLIENTREFERENCE_PARAM;
				    break;
				default:
					break;
			}

			searchValue = getSearchValue(filter);
				
			restrictions.add(new SimpleCriteriaRestriction(propertyName, searchValue, RestrictionType.LIKE_CASE_INSENSITIVE));
		}
		return restrictions;
	}
	
	private String getSearchValue(final RequestFilter filter) throws Exception {
		switch (filter.filterOperation) {
		    case RequestFilter.OP_CONTAINS:
			    return "%" + filter.value + "%";
		    case RequestFilter.OP_STARTS_WITH:
			    return filter.value + "%";
		    case RequestFilter.OP_ENDS_WITH:
			    return "%" + filter.value;
		    default:
			    return "%" + filter.value + "%";
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll(final List<RequestFilter> filters) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Request.class);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			if (filters != null) {
				for (SimpleCriteriaRestriction restriction : getRestrictions(filters))
			        criteria.add(restriction.getCriteria());
			}
			return (List<Request>) criteria.addOrder(Order.desc("created")).setMaxResults(MAX_RESULTS).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests", e);
		}
		finally {
			session.close();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll(final Group group, final List<RequestFilter> filters) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Request.class);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			criteria.add(Restrictions.in("user", UserFacade.retrieveByGroup(group)));
			if (filters != null) {
				for (SimpleCriteriaRestriction restriction : getRestrictions(filters))
			        criteria.add(restriction.getCriteria());
			}
			return (List<Request>) criteria.addOrder(Order.desc("created")).setMaxResults(MAX_RESULTS).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests", e);
		}
		finally {
			session.close();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findAll(final User user, final List<RequestFilter> filters) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Request.class);
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			criteria.add(Restrictions.eq("user", user));
			if (filters != null) {
				for (SimpleCriteriaRestriction restriction : getRestrictions(filters))
					criteria.add(restriction.getCriteria());
			}
			return (List<Request>) criteria.addOrder(Order.desc("created")).setMaxResults(MAX_RESULTS).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all requests", e);
		}
		finally {
			session.close();
		}	
	}
	
	public Request findById(Long id) throws Exception {
		if (id == null) return null;
		Session session = null;
		Request entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Request) findById(session, id, false);
		}
		catch (Exception e) {
			throw new Exception("Unable to find request by id " + id, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public Request findByReferenceNumber(final String referenceNumber) throws Exception {
		if (referenceNumber == null) 
			return null;
		Session session = null;
		Request entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Request) session.createCriteria(Request.class)
			                          .add(Restrictions.eq("referenceNumber", referenceNumber))
			                          .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception("Unable to find request by reference number " + referenceNumber, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public Request findByClientReference(final String clientReference) throws Exception {
		if (clientReference == null) 
			return null;
		Session session = null;
		Request entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Request) session.createCriteria(Request.class)
			                          .add(Restrictions.eq("clientReference", clientReference))
			                          .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception("Unable to find request by client reference " + clientReference, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	public Request findByClientReference(final User user, final String clientReference) throws Exception {
		if (clientReference == null) 
			return null;
		Session session = null;
		Request entity = null;
		try {
			session = sessionFactory.openSession();
			entity = (Request) session.createCriteria(Request.class)
			                          .add(Restrictions.eq("clientReference", clientReference))
			                          .add(Restrictions.eq("user", user))
			                          .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception("Unable to find request by user and client reference " + user.getUsername() + " & " + clientReference, e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findByUser(final User user) throws Exception {
		Session session = null;
		List<Request> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = (List<Request>) session.createCriteria(Request.class)
					                          .add(Restrictions.eq("user", user))
					                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					                          .addOrder(Order.desc("created"))
					                          .setMaxResults(MAX_RESULTS)
					                          .list();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
		return entities;
	}
	
	public void remove(Request entity) throws Exception {
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
			throw new Exception("Unable to remove request " + entity.getReferenceNumber(), e);
		}
		finally {
			session.close();
		}
	}	
	
	public Long findByUserTypeCurrentYear(final List<User> users, final RequestType type, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", type))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findActivationsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.DEVICE_ACTIVATION))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findActivationPortInsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.DEVICE_ACTIVATION_PORTIN))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findDeactivationsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.DELETE_SUBSCRIBER))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (List<Request>) session.createCriteria(Request.class)
					                      .add(Restrictions.in("user", users))
					                      .add(Restrictions.between("created", start, end))
                                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                          .addOrder(Order.desc("created"))
                                          .list();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Request> findByGroupBetweenDates(final Group group, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (List<Request>) session.createCriteria(Request.class)
					                      .add(Restrictions.eq("group", group))
					                      .add(Restrictions.between("created", start, end))
                                          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
                                          .addOrder(Order.desc("created"))
                                          .list();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findEnterOrderDetailsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.ENTER_ORDER_DETAILS))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findBequickActivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.BEQUICK_ACTIVATE))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findPlintronServiceActivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.PLINTRON_SERVICE_ACTIVATE))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findCancelOrderByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.CANCEL_ORDER))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findBequickDisconnectByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.BEQUICK_DISCONNECT))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
	
	public Long findPlintronServiceDeactivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			return (Long) session.createCriteria(Request.class)
					             .add(Restrictions.in("user", users))
					             .add(Restrictions.eq("type", Request.RequestType.PLINTRON_SERVICE_DEACTIVATE))
					             .add(Restrictions.between("created", start, end))
					             .setProjection(Projections.rowCount())
					             .uniqueResult();
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		finally {
			session.close();
		}
	}
}
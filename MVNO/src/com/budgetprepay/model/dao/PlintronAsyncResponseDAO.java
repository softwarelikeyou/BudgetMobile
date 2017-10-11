package com.budgetprepay.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.budgetprepay.model.dao.RequestDAO.RequestFilter;
import com.budgetprepay.model.dao.SimpleCriteriaRestriction.RestrictionType;
import com.budgetprepay.model.entity.PlintronAsyncResponse;

public class PlintronAsyncResponseDAO extends HibernateDAO<PlintronAsyncResponse, Long> {

	public PlintronAsyncResponseDAO() {
		super();
	}
	
	public PlintronAsyncResponseDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronAsyncResponse> findAllPortouts() throws Exception {
		Session session = null;
		List<PlintronAsyncResponse> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(getPersistentClass())
							  .add(Restrictions.eq("type", "WholesalePartnerPortoutValidationInput"))
					          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					          .addOrder(Order.desc("created"))
					          .setMaxResults(1000)
					          .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all Plintron Portout responses", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronAsyncResponse> findAllPortouts(final List<RequestFilter> filters) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(getPersistentClass());
			criteria.add(Restrictions.eq("type", "WholesalePartnerPortoutValidationInput"));
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			if (filters != null) {
				for (SimpleCriteriaRestriction restriction : getRestrictions(filters))
			        criteria.add(restriction.getCriteria());
			}
			return (List<PlintronAsyncResponse>) criteria.addOrder(Order.desc("created")).setMaxResults(MAX_RESULTS).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all Plintron Portout responses", e);
		}
		finally {
			session.close();
		}	
	}	
	
	@SuppressWarnings("unchecked")
	public List<PlintronAsyncResponse> findAll() throws Exception {
		Session session = null;
		List<PlintronAsyncResponse> entities = null;
		try {
			session = sessionFactory.openSession();
			entities = session.createCriteria(getPersistentClass())
							  .add(Restrictions.ne("type", "WholesalePartnerPortoutValidationInput"))
					          .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					          .addOrder(Order.desc("created"))
					          .setMaxResults(1000)
					          .list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all Plintron Async responses", e);
		}
		finally {
			session.close();
		}
		return entities;		
	}
	
	@SuppressWarnings("unchecked")
	public List<PlintronAsyncResponse> findAll(final List<RequestFilter> filters) throws Exception {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(getPersistentClass());
			criteria.add(Restrictions.ne("type", "WholesalePartnerPortoutValidationInput"));
			criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			if (filters != null) {
				for (SimpleCriteriaRestriction restriction : getRestrictions(filters))
			        criteria.add(restriction.getCriteria());
			}
			return (List<PlintronAsyncResponse>) criteria.addOrder(Order.desc("created")).setMaxResults(MAX_RESULTS).list();
		}
		catch (Exception e) {
			throw new Exception("Unable to find all Plintron Async responses", e);
		}
		finally {
			session.close();
		}	
	}	
	
	public PlintronAsyncResponse createOrUpdate(PlintronAsyncResponse entity) throws Exception  {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			entity = (PlintronAsyncResponse) makePersistent(session, entity);
			transaction.commit();
		}
		catch (HibernateException e) {
			transaction.rollback();
			throw new Exception("Unable to create or update PlintronAsyncResponse " + entity.getBody(), e);
		}
		finally {
			session.close();
		}
		return entity;
	}
	
	private List<SimpleCriteriaRestriction> getRestrictions(final List<RequestFilter> filters) throws Exception {
		List<SimpleCriteriaRestriction> restrictions = new ArrayList<SimpleCriteriaRestriction>();
		for (RequestFilter filter : filters) {
			String propertyName = null;
			String searchValue = null;
			switch (filter.parameter) {
			    case PlintronAsyncResponse.MDN_PARAM:
				    propertyName = PlintronAsyncResponse.MDN_PARAM;
				    break;
			    case PlintronAsyncResponse.REFERENCE_PARAM:
				    propertyName = PlintronAsyncResponse.REFERENCE_PARAM;
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
}

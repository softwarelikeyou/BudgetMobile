package com.budgetprepay.model.facade;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.RequestDAO;
import com.budgetprepay.model.dao.RequestDAO.RequestFilter;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.Request.RequestType;
import com.budgetprepay.model.entity.User;

public class RequestFacade {	
	
	public static Request retrieveByReferenceNumber(final String referenceNumber) throws Exception {
		Request results = null;
		try {
		    results = new RequestDAO().findByReferenceNumber(referenceNumber);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static Request retrieveByClientReference(final String clientReference) throws Exception {
		try {
		    return new RequestDAO().findByClientReference(clientReference);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Request retrieveByClientReference(final User user, final String clientReference) throws Exception {
		try {
		    return new RequestDAO().findByClientReference(user, clientReference);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static List<Request> retrieveAll() throws Exception {
		List<Request> results = null;;
		try {
		    results = new RequestDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Request> retrieveAll(final User user) throws Exception {
		List<Request> results = null;;
		try {
			if (user.isAdministrator())
		        results = new RequestDAO().findAll();
			else
				results = new RequestDAO().findAll(user);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Request> retrieveAll(final User user, final Group group) throws Exception {
		List<Request> results = null;;
		try {
			if (user.isAdministrator())
		        results = new RequestDAO().findAll();
			else
				results = new RequestDAO().findAll(group);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Request> retrieveAll(final User user, final List<RequestFilter> filters) throws Exception {
		List<Request> results = null;;
		try {
			if (user.isAdministrator())
		        results = new RequestDAO().findAll(filters);
			else
				results = new RequestDAO().findAll(user, filters);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Request> retrieveAll(final User user, final Group group, final List<RequestFilter> filters) throws Exception {
		List<Request> results = null;;
		try {
			if (user.isAdministrator())
		        results = new RequestDAO().findAll(filters);
			else
				results = new RequestDAO().findAll(group, filters);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<Request> retrieveAll(final List<RequestFilter> filters) throws Exception {
		List<Request> results = null;;
		try {
			results = new RequestDAO().findAll(filters);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static Request create(Request request) throws Exception {
		try {
			request = new RequestDAO().createOrUpdate(request);
			EventFacade.fireRequestCreated(request);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return request;
	}
	
	public static Request update(Request request) throws Exception {
		try {
			request = new RequestDAO().createOrUpdate(request);
			EventFacade.fireRequestUpdated(request);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return request;
	}
	
	public static List<Request> retrieveByUser(final User user) throws Exception {
		try {
			return new RequestDAO().findByUser(user);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static void delete(final Request Request) throws Exception {
		try {
			new RequestDAO().remove(Request);
			EventFacade.fireRequestDeleted(Request);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveByUserTypeCurrentYear(final List<User> users, final RequestType type) throws Exception {
		try {
			Calendar start = Calendar.getInstance();
			start.setTime(new Date());
			start.set(Calendar.DAY_OF_MONTH, 1);
			start.set(Calendar.MONTH, 0);
			start.set(Calendar.HOUR, 0);
			start.set(Calendar.MINUTE, 0);
			start.set(Calendar.SECOND, 0);
			
			Calendar end = Calendar.getInstance();
			end.setTime(new Date());
			end.set(Calendar.DAY_OF_MONTH, 31);
			end.set(Calendar.MONTH, 11);
			end.set(Calendar.HOUR, 0);
			end.set(Calendar.MINUTE, 0);
			end.set(Calendar.SECOND, 0);
			return new RequestDAO().findByUserTypeCurrentYear(users, type, start.getTime(), end.getTime());
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveActivationsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findActivationsByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveActivationPortInsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findActivationPortInsByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveDeactivationsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findDeactivationsByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static List<Request> retrieveByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static List<Request> retrieveByGroupBetweenDates(final Group group, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findByGroupBetweenDates(group, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveBequickActivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findBequickActivateByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrievePlintronServiceActivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findPlintronServiceActivateByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveEnterOrderDetailsByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findEnterOrderDetailsByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveCancelOrderByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findCancelOrderByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrieveBequickDisconnectByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findBequickDisconnectByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public static Long retrievePlintronServiceDeactivateByUserBetweenDates(final List<User> users, final Date start, final Date end) throws Exception {
		try {
			return new RequestDAO().findPlintronServiceDeactivateByUserBetweenDates(users, start, end);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
	}
}

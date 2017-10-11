package com.budgetprepay.model.facade;

import java.util.List;

import org.hibernate.HibernateException;

import com.budgetprepay.model.dao.UserDAO;
import com.budgetprepay.model.dao.UserDataDAO;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.PasswordEncoder;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.viewcontroller.GlobalConstants;

public class UserFacade {	

	public static User retrieveByUsername(final String username) throws Exception {
		User results = null;
		try {
		    results = new UserDAO().findByName(username);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static User retrieveByEmail(final String email) throws Exception {
		User results = null;
		try {
		    results = new UserDAO().findByEmail(email);
		}
		catch (Exception e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<User> retrieveAll() throws Exception {
		List<User> results = null;;
		try {
		    results = new UserDAO().findAll();
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static List<User> retrieveByGroup(final Group group) throws Exception {
		List<User> results = null;;
		try {
		    results = new UserDAO().findByGroup(group);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static User persist(User user) throws Exception {
		try {
			user = new UserDAO().createOrUpdate(user);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static User create(User user) throws Exception {
		try {
			user = persist(user);
			EventFacade.fireUserCreated(user);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static void delete(User user) throws Exception {
		try {
			new UserDAO().remove(user);
			EventFacade.fireUserDeleted(user);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}
	
	public static User disable(User user) throws Exception {
		try {
			user.setEnabled(false);
			user = new UserDAO().createOrUpdate(user);
			EventFacade.fireUserUpdated(user);
		}
		catch(Exception e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static User enable(User user) throws Exception {
		try {
			user.setEnabled(true);
			user = new UserDAO().createOrUpdate(user);
			EventFacade.fireUserUpdated(user);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static User resetPassword(User user) throws Exception {
		try {
			user.setPassword(new PasswordEncoder().encodePassword(GlobalConstants.DEFAULT_PASSWORD, null));
			user = new UserDAO().createOrUpdate(user);
			EventFacade.fireUserUpdated(user);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static UserData retrieveProperty(final User user, final String property) throws Exception {
		UserData results;
		try {
			results = new UserDataDAO().findProperty(user, property);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static User changeType(User user) throws Exception {
		try {
			user = new UserDAO().createOrUpdate(user);
			EventFacade.fireUserUpdated(user);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return user;
	}
	
	public static List<UserData> retrieveProperties(final User user) throws Exception {
		List<UserData> results;
		try {
			results = new UserDataDAO().findAll(user);
		}
		catch (HibernateException e) {
			throw new Exception(e);
		}
		return results;
	}
	
	public static UserData persist(UserData userData) throws Exception {
		try {
			userData = new UserDataDAO().createOrUpdate(userData);
			EventFacade.fireUserDataUpdated(userData);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return userData;
	}
	
	public static UserData delete(UserData userData) throws Exception {
		try {
			new UserDataDAO().remove(userData);
			EventFacade.fireUserDataUpdated(userData);
		}
		catch(HibernateException e) {
			throw new Exception(e);
		}
		return userData;
	}
}

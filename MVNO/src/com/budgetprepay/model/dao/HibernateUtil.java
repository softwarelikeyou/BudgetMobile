package com.budgetprepay.model.dao;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
	private static HibernateUtil instance = null;
	private static SessionFactory sessionFactory;
	
	private HibernateUtil() { }
	
	public static HibernateUtil getInstance(final Configuration configuration) {
		if (instance == null) {
			try {
		        sessionFactory = configuration.buildSessionFactory();
		        HibernateDAO.setSessionFactory(sessionFactory);
			}
			catch (Throwable e) {
				throw new ExceptionInInitializerError(e);
			}
		}
		return instance;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
		
	public static boolean isClosed() {
		return getSessionFactory().isClosed();
	}
	
	public static void close() {
		getSessionFactory().close();
	}
	
	public static boolean test() throws HibernateException {
		boolean result = false;
		Session session = null;
		try {
		    session = sessionFactory.openSession();
		    if (session != null) {
		        if (session.isOpen())
		    	    result = true;
		    }
		}
		finally {
			if (session != null) {
			    if (session.isOpen())
				    session.close();
			}
		}
		return result;
	}
}

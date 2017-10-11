package com.budgetprepay.viewcontroller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.User.UserType;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class SessionUtil {
	private static Logger logger = Logger.getLogger(SessionUtil.class);
	private static final String SESSION_USER_PROPERTY = "sessionUser";
	
	public static Boolean isLoggedIn() {
		return getCurrentUser() != null;
	}
	
	public static User getCurrentUser() {
		Session session = Sessions.getCurrent();
		User user = null;
		
		if( session != null )
			user = (User) session.getAttribute(SESSION_USER_PROPERTY);

		if( user == null ) {

			if( SecurityContextHolder.getContext().getAuthentication() == null) 
				return null;
			
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

			if( principal instanceof User )
				user = (User) principal;
			else if( principal != null ) {
				try {
					    user = UserFacade.retrieveByUsername(principal.toString());
					
				}
				catch (Exception e) {
					logger.error(e);
				}
				
			}
			session.setAttribute(SESSION_USER_PROPERTY, user);
		}

		return user;
	}

	public static String getCurrentUsername() {
		User user = getCurrentUser();
		return user == null ? "" : user.getUsername();
	}

	public static String getCurrentDisplayName() {
		User user = getCurrentUser();
		return user == null ? "" : user.getDisplay();
	}
	
	public static String getEncodedPassword() {
		User user = getCurrentUser();
		return user == null ? "" : user.getPassword();
	}
	
	public static Boolean isAdministrator() {
		return UserType.ADMINISTRATOR.equals(getCurrentUser().getType());
	}

	public static Boolean isSales() {
		return UserType.SALES.equals(getCurrentUser().getType());
	}

	public static Boolean isReadOnly() {
		return UserType.READ_ONLY.equals(getCurrentUser().getType());
	}
	
	public static Boolean hasVerizon() {
		if (isAdministrator())
			return true;
		UserData data = getUserData(ServiceType.VERIZON.name());
		if (data != null) {
			if (Boolean.valueOf(data.getValue()))
				return true;
		}
		return false;
	}
	
	public static Boolean hasPlintron() {
		if (isAdministrator())
			return true;
		UserData data = getUserData(ServiceType.PLINTRON.name());
		if (data != null) {
			if (Boolean.valueOf(data.getValue()))
				return true;
		}
		return false;
	}
	
	public static Locale getSelectedLocale() { 
		return Locale.getDefault();
	}
	
	public static void setCurrentUser(final User user) {
		Session session = Sessions.getCurrent();
		session.setAttribute(SESSION_USER_PROPERTY, user);
	}
	
	public static UserData getUserData(final String property) {
		UserData result = null;
		try {
		    result = UserFacade.retrieveProperty(getCurrentUser(), property);
		}
		catch (Exception e) {
			logger.equals(e);
		}
		return result;
	}
	
	public static UserData setUserData(final UserData userData) {
		UserData result = null;
		try {
			if (userData.getValue() != null && userData.getValue().length() > 0)
		       result = UserFacade.persist(userData);
			else
				UserFacade.delete(userData);
		}
		catch (Exception e) {
			logger.error(e);
		}
		return result;
	}
	
	public static UserData setUserData(final String property, final String value) {
		UserData userData = new UserData();
		userData.setProperty(property);
		userData.setValue(value);
		userData.setUserId(getCurrentUser().getId());
		return setUserData(userData);
	}
	
	public static String getPageAutoRefresh() {
		return ResourceUtil.get("default-page-auto-refresh");
	}
	
	private static int screenWidth = 0;
	public static void setScreenWidth(final int width) {
		screenWidth = width;
	}
	public static int getScreenWidth() {
		return screenWidth;
	}
	private static int screenHeight = 0;
	public static void setScreenHeight(final int height) {
		screenHeight = height;
	}
	public static int getScreenHeight() {
		return screenHeight;
	}
}

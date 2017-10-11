package com.budgetprepay.model.entity;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.budgetprepay.model.facade.UserFacade;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		User user = null;
		try {
			user = UserFacade.retrieveByUsername(username);
		} 
		catch (Exception e) {
			throw new UsernameNotFoundException("Failed to load user " + username + " from object model", e);
		}		
		if( user == null) 
			throw new UsernameNotFoundException("Username " + username + " not found");
		return user;
	}
}
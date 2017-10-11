package com.budgetmobile.controller;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

import java.util.StringTokenizer;

public class AuthenticationService {
	
	public String decode(String s) {
	    return StringUtils.newStringUtf8(Base64.decodeBase64(s));
	}
	public String encode(String s) {
	    return Base64.encodeBase64String(StringUtils.getBytesUtf8(s));
	}
	
	public boolean authenticate(String authCredentials) {

		if (null == authCredentials)
			return false;
		final String encodedUserPassword = authCredentials.replaceFirst("Basic" + " ", "");
		String usernameAndPassword = decode(encodedUserPassword);
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();

		boolean authenticationStatus = Boolean.FALSE;
		
		if (username.equals("admin"))
			authenticationStatus = "admin".equals(username) && "admin".equals(password);
	
		return authenticationStatus;
	}
}

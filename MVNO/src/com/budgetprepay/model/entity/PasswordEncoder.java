package com.budgetprepay.model.entity;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class PasswordEncoder implements org.springframework.security.crypto.password.PasswordEncoder {

	public String encodePassword(String password, Object salt) throws Exception {
    	try {
    		return encode(password);
    	} 
    	catch (Exception e) {
    		throw new Exception("Unable to encode password ", e);
    	}
	}
	
	public boolean isPasswordValid(String encodedPassword, String rawPassword, Object salt) throws Exception {
		try {
		    return matches(rawPassword, encodedPassword);
		}
		catch (Exception e) {
    		throw new Exception("Unable to validate password ", e);
		}
	}
	
	@Override
	public String encode(CharSequence rawPassword) {
		MessageDigest md = null;
    	try {
    		md = MessageDigest.getInstance("SHA-1");
    	} 
    	catch (NoSuchAlgorithmException ne) {
    		throw new RuntimeException(ne);
    	}
    	
        try {
        	md.update(rawPassword.toString().getBytes("UTF-8")); 
        }
        catch(UnsupportedEncodingException e) {
        	throw new RuntimeException(e);
        }

        byte raw[] = md.digest(); 
        String hash = (new BASE64Encoder()).encode(raw);
        
        return hash;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword ) {
		return encodedPassword.equals(encode(rawPassword));
	}
}
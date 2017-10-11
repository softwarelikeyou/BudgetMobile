package com.budgetmobile.controller;

import java.io.FileInputStream;
import java.util.Properties;

public class ServerProperties {
	
	public static String MODE = "PROD"; // DEV OR PROD
	
	private static Properties properties = new Properties();

	public static String ZENDESK_ACCOUNT = "zendesk_account";
	public static String ZENDESK_PASSWORD = "zendesk_password";
	public static String ZENDESK_ENDPOINT = "zendesk_endpoint";
	
	private ServerProperties() throws Exception { 
	    try {
	    	CATALINA_HOME = System.getenv("CATALINA_HOME");  
	    }
	    catch ( Exception e ) { 
	    	throw new Exception("CATALINA_HOME not set", e);
	    }
	    
		try {
			String file = CATALINA_HOME + FILE;
			properties.load(new FileInputStream(file));
		}
		catch (Exception e) {
			throw new Exception("Unable to load properties file", e);
		}
		
/*		try {
	        for(Object object : properties.keySet()){
	            String key = (String)object;
	            System.out.println(key + "=" + getProperty(key));
	        }
		}
		catch (Exception e) {
			throw e;
		}*/
	}
	
	private static ServerProperties instance = null;
	
	private static String CATALINA_HOME;
	private static String FILE = "\\conf\\mobileapp.properties";
	
	public static ServerProperties getInstance() throws Exception {
		if (instance == null)
			instance = new ServerProperties();
		return instance;
	}
	
	public static String getProperty(final String key) {
		return properties.getProperty(key);
	}
}

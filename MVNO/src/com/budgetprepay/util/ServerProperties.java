package com.budgetprepay.util;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class ServerProperties {

	private static Logger logger = Logger.getLogger(ServerProperties.class);
	
	private static Properties properties = new Properties();

	private static Map<String, String> map = new HashMap<String, String>();
	
	public static String VERIZON_CCT_USERNAME = "verizon.api.cct.username";
	public static String VERIZON_CCT_PASSWORD = "verizon.api.cct.password";
	public static String VERIZON_CCT_USERID = "verizon.api.cct.userid";
	public static String VERIZON_CCT_PROVIDERID = "verizon.api.cct.providerid";
	public static String VERIZON_CCT_RSID = "verizon.api.cct.rsid";
	public static String VERIZON_CCT_ACCOUNT_ENDPOINT = "verizon.api.cct.account.endpoint";
	public static String VERIZON_CCT_USAGE_ENDPOINT = "verizon.api.cct.usage.endpoint";
	public static String VERIZON_CCT_PIN_SEARCH_ENDPOINT = "verizon.api.cct.pin.search.endpoint";
	public static String VERIZON_CCT_PIN_UPDATE_ENDPOINT = "verizon.api.cct.pin.update.endpoint";
	public static String VERIZON_CCT_PIN_VOID_ENDPOINT = "verizon.api.cct.pin.void.endpoint";
    	
	private ServerProperties() { }
	
	private static ServerProperties instance = null;
	
	public static ServerProperties getInstance() {
		if (instance == null)
			instance = new ServerProperties();
		return instance;
	}
	
	static {
	    try {
	    	properties.load(ServerProperties.class.getClassLoader().getResourceAsStream(ResourceUtil.get("server.properties.file")));
	    	
	        map.put(VERIZON_CCT_USERNAME, properties.getProperty(VERIZON_CCT_USERNAME));
	        map.put(VERIZON_CCT_PASSWORD, properties.getProperty(VERIZON_CCT_PASSWORD));
	        map.put(VERIZON_CCT_USERID, properties.getProperty(VERIZON_CCT_USERID));
	        map.put(VERIZON_CCT_PROVIDERID, properties.getProperty(VERIZON_CCT_PROVIDERID));
	        map.put(VERIZON_CCT_RSID, properties.getProperty(VERIZON_CCT_RSID));
	        map.put(VERIZON_CCT_ACCOUNT_ENDPOINT, properties.getProperty(VERIZON_CCT_ACCOUNT_ENDPOINT));
	        map.put(VERIZON_CCT_USAGE_ENDPOINT, properties.getProperty(VERIZON_CCT_USAGE_ENDPOINT));
	        map.put(VERIZON_CCT_PIN_SEARCH_ENDPOINT, properties.getProperty(VERIZON_CCT_PIN_SEARCH_ENDPOINT));
	        map.put(VERIZON_CCT_PIN_UPDATE_ENDPOINT, properties.getProperty(VERIZON_CCT_PIN_UPDATE_ENDPOINT));
	        map.put(VERIZON_CCT_PIN_VOID_ENDPOINT, properties.getProperty(VERIZON_CCT_PIN_VOID_ENDPOINT));
	    }
	    catch ( Exception e ) 
	    { 
	    	logger.error("Unable to load server.properties");
	    }
	}
	
    public static String getProperty(final String key) {
    	return map.get(key);
    }
    
    public static synchronized void setProperty(final String key, final String value) {
    	map.put(key, value);
    }
    
    public static synchronized void saveProperties() throws Exception {
    	try {
    		Set<String> keys = map.keySet();
    		for (String key : keys)
    			properties.setProperty(key, map.get(key));
    		properties.store(new FileWriter(new File(ServerProperties.class.getClassLoader().getResource(ResourceUtil.get("server.properties.file")).getFile())), "Modified on " + new Date());
    	}
    	catch (Exception e) {
    		throw new Exception("Unable to save servier properties", e);
    	}
    }
}

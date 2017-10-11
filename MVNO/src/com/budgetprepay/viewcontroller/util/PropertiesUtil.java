package com.budgetprepay.viewcontroller.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class PropertiesUtil {
	public PropertiesUtil() { }
		
	private Properties load(final String fileName) throws IOException { 
		Properties properties = new Properties() ;
		properties.load(getClass().getClassLoader().getResourceAsStream(fileName));
		return properties;
	}

	public Properties get(final String fileName) throws IOException {
		if (fileName == null) return null;
		return load(fileName);
	}
	
	public String get(final String fileName, final String key) throws IOException {
		if (fileName == null || key == null) return null;
		Properties properties = load(fileName);
	    if (properties.containsKey(key))
		   return properties.getProperty(key);
	    else
	    	return null;
	}
	
	public Properties get(final String fileName, final List<String> keys) throws IOException {
		if (fileName == null || keys == null) return null;
		Properties properties = load(fileName);
		Properties results = new Properties();
		for (String key : keys) {
			if (properties.containsKey(key))
				results.setProperty(key, properties.getProperty(key));
		}
		return results;
	}
	
	public synchronized String set(final String fileName, final String vkey, final String value) throws IOException, URISyntaxException { 
		if (fileName == null || vkey == null) return null;
		String result = value;
		Properties oldProperties = load(fileName);
		Properties newProperties = new Properties();
		
		if (!oldProperties.containsKey(vkey))
		    newProperties.setProperty(vkey, value);

        Enumeration<?> keys = oldProperties.propertyNames();
        while (keys.hasMoreElements()) {
           String key = (String) keys.nextElement();
           if (key.equals(vkey)) {
               newProperties.setProperty(key, value);
           }
           else
               newProperties.setProperty(key, oldProperties.getProperty(key));          	
        }
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(fileName);
        newProperties.store(new FileOutputStream(new File(url.toURI())), "Last saved key was " + vkey);
		return result;
	}
}

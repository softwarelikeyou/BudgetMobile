package com.budgetmobile.controller;

import java.util.MissingResourceException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.budgetmobile.controller.ServerProperties;

public class ConfigurationListener implements ServletContextListener {
	private static Logger logger = Logger.getLogger(ConfigurationListener.class);

	public void contextDestroyed(ServletContextEvent sce) { }

	public void contextInitialized(ServletContextEvent sce) {
		try {
	        // Properties
	        try {
	        	ServerProperties.getInstance();
	        }
	        catch (Exception e) {
				logger.error("Missing Properties", e);
				System.exit(1);
	        } 
		}
		catch (NullPointerException ne) {
			logger.error("Null Pointer", ne);
			System.exit(1);
		}
		catch (MissingResourceException me) {
			logger.error("Missing Resource", me);
			System.exit(1);
		}
	}
}

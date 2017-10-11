package com.budgetprepay.viewcontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.MissingResourceException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.budgetprepay.model.dao.HibernateUtil;
import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.ErrorRequest;
import com.budgetprepay.model.entity.ErrorResponse;
import com.budgetprepay.model.entity.Group;
import com.budgetprepay.model.entity.PasswordEncoder;
import com.budgetprepay.model.entity.PlintronAsyncResponse;
import com.budgetprepay.model.entity.PlintronBulkMessageRequest;
import com.budgetprepay.model.entity.Request;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.entity.UserData;
import com.budgetprepay.model.event.ActiveMQUtil;
import com.budgetprepay.model.event.EventConstants;
import com.budgetprepay.model.event.RequestEvent;
import com.budgetprepay.model.event.VerizonEvent;
import com.budgetprepay.model.facade.ClassOfServiceFacade;
import com.budgetprepay.model.facade.GroupFacade;
import com.budgetprepay.model.facade.RSSFacade;
import com.budgetprepay.model.facade.UserFacade;
import com.budgetprepay.model.upgrade.InitializeDatabase;
import com.budgetprepay.scheduler.CommitScheduler;
import com.budgetprepay.util.ServerProperties;
import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class ConfigurationListener implements ServletContextListener {
	private static Logger logger = Logger.getLogger(ConfigurationListener.class);

	public void contextDestroyed(ServletContextEvent sce) {
	    	
	   try {
	        CommitScheduler.shutdown();
	   }
	   catch (Exception e) { ; }
	   
	   if (ActiveMQUtil.isStarted())
	       ActiveMQUtil.stop();
	   
	   if (!HibernateUtil.isClosed())
		   HibernateUtil.close();		
	}

	public void contextInitialized(ServletContextEvent sce) {
		try {
			// Configuration file
			try {
				ResourceUtil.test();
			}
			catch (Exception e) {
				logger.error("Configuration file not found");
				System.exit(1);
			}
			
			// Database
			Connection connection = null;
			InitializeDatabase initializeDatabase = new InitializeDatabase();
			try {
			    Class.forName(ResourceUtil.get("hibernate.connection.driver")).newInstance();
				String URI = ResourceUtil.get("hibernate.connection.url");
				connection = DriverManager.getConnection (URI, ResourceUtil.get("hibernate.connection.username"), ResourceUtil.get("hibernate.connection.password"));
				if (connection == null) {
					logger.error("Unable to connection to database");
					System.exit(1);
				}
				initializeDatabase.initDatabase(connection);
			}
			catch (ClassNotFoundException cnfe) {
				logger.error("Database driver " + ResourceUtil.get("hibernate.connection.driver_class") + " not found", cnfe);
				System.exit(1);
			}
			catch (InstantiationException ie) {
				logger.error("Database driver " + ResourceUtil.get("hibernate.connection.driver_class") + " instantiation failure", ie);
				System.exit(1);
		    }	
			catch (IllegalAccessException iae) {
				logger.error("Database driver " + ResourceUtil.get("hibernate.connection.driver_class") + " illegal access", iae);
				System.exit(1);
			}
			catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage(), e);
				System.exit(1);
			}
			finally {
				if (connection != null) {
					try {
						connection.close();
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
			// Hibernate
			try {
		        Properties hibernateProperties = new Properties();
		        hibernateProperties.setProperty(Environment.DRIVER, ResourceUtil.get("hibernate.connection.driver_class"));
		        hibernateProperties.setProperty("hibernate.connection.driver", ResourceUtil.get("hibernate.connection.driver"));
		        hibernateProperties.setProperty(Environment.URL, ResourceUtil.get("hibernate.connection.url"));
		        hibernateProperties.setProperty(Environment.USER, ResourceUtil.get("hibernate.connection.username"));
		        hibernateProperties.setProperty(Environment.PASS, ResourceUtil.get("hibernate.connection.password"));
		        hibernateProperties.setProperty(Environment.DIALECT, ResourceUtil.get("hibernate.dialect"));
		        hibernateProperties.setProperty(Environment.HBM2DDL_AUTO, ResourceUtil.get("hibernate.hbm2ddl.auto"));
		        hibernateProperties.setProperty(Environment.SHOW_SQL, ResourceUtil.get("hibernate.show_sql"));
		        hibernateProperties.setProperty("hibernate.validator.autoregister_listeners", "false");
		        hibernateProperties.setProperty("hibernate.search.autoregister_listeners", "false");
		        hibernateProperties.setProperty("hibernate.validator.apply_to_ddl", "false");
		    
	            Configuration SystemHibernateConfiguration = new Configuration()
	            .addAnnotatedClass(Group.class)
	            .addAnnotatedClass(ClassOfService.class)
	            .addAnnotatedClass(User.class)
	            .addAnnotatedClass(UserData.class)
	            .addAnnotatedClass(Request.class)
	            .addAnnotatedClass(ErrorResponse.class)
	            .addAnnotatedClass(ErrorRequest.class)
	            .addAnnotatedClass(PlintronAsyncResponse.class)
	            .addAnnotatedClass(PlintronBulkMessageRequest.class)
	            .setProperties(hibernateProperties);
	        
	            HibernateUtil.getInstance(SystemHibernateConfiguration);
	            
	            if (!HibernateUtil.test()) {
	        	    logger.error("Hibernate connection could not be initialized");
	        	    System.exit(1);
	            }
	            else {
	        	    logger.info("Initialized Hibernate connection");
	            }
	        
	            try {
	            	ClassOfService classOfService = ClassOfServiceFacade.retrieveByName(ResourceUtil.get("verizon.rss.classofservice"));
	            	if (classOfService == null) {
	            		classOfService = new ClassOfService();
	            		classOfService.setName(ResourceUtil.get("verizon.rss.classofservice"));
	            		classOfService.setRatePlan(ResourceUtil.get("verizon.rss.classofservice"));
	            		classOfService = ClassOfServiceFacade.persist(classOfService);
	            	}
	        	    Group group = GroupFacade.retrieveByName(ResourceUtil.get("verizon.rss.vendorid"));
	        	    if (group == null) {
	        		    group = new Group();
	        		    group.setName(ResourceUtil.get("verizon.rss.vendorid"));
	        		    group.setDisplay(ResourceUtil.get("verizon.rss.vendorid.display"));
	        		    group.getClassOfServices().add(classOfService);
	        		    group.setAccountNumber(ResourceUtil.get("verizon.rss.accountnumber"));
	        		    group = GroupFacade.persist(group);
	        	    }
			        User user = UserFacade.retrieveByUsername(GlobalConstants.ADMIN_USERNAME);
			        if (user == null) {
				        user = new User();
				        user.setGroup(group);
			            user.setUsername(GlobalConstants.ADMIN_USERNAME);
		                user.setDisplay("Administrator Account");
			            user.setPassword(new PasswordEncoder().encodePassword(GlobalConstants.ADMIN_PASSWORD, null));
			            user.setType(User.UserType.ADMINISTRATOR);
			            user = UserFacade.persist(user);
			        }
	            }
	            catch (Exception e) {
	        	    logger.error("Unable to create system account", e);
	        	    System.exit(1);
	            }
			}
			catch (Exception e) {
			
			}
			
			// ActiveMQ
	        try {
	            ActiveMQUtil.getInstance();
	        }
	        catch (Exception e) {
				logger.error("Unable to initialize ActiveMQ");
				System.exit(1);
	        }
	        
	        // Event Queues
	        try {
	            initEventQueues();
	        }
	        catch (Exception e) {
				logger.error("Unable to initialize event queues");
				System.exit(1);
	        }
	        
	        // Server properties
	        try {
	        	ServerProperties.getInstance();
	        }
	        catch (Exception e) {
				logger.error(e.getMessage());
				System.exit(1);
	        } 
	        
	        // Commit Scheduler
	        try {
	        	CommitScheduler.getInstance();
	        }
	        catch (Exception e) {
				logger.error("Unable to initialize Commit Scheduler");
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
	
	// TODO Move to a Singleton class
	private static synchronized void initEventQueues() {
	
			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.REQUEST_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (!(event instanceof RequestEvent)) return;
					// TODO change to switch statement
					if (event.getName().equals(EventConstants.REQUEST_CREATE_EVENT_NAME))
						;
					else if( event.getName().equals(EventConstants.REQUEST_UPDATE_EVENT_NAME)) 
						;
					else if( event.getName().equals(EventConstants.REQUEST_DELETE_EVENT_NAME)) 
						;
				} 
			});
			
			com.budgetprepay.model.event.EventQueues.lookup(EventConstants.VERIZON_EVENT_QUEUE_NAME,true).subscribe(new com.budgetprepay.model.event.EventListener() {
				@Override
				public void onEvent(com.budgetprepay.model.event.Event event) {
					if (!(event instanceof VerizonEvent)) return;
					if (event.getName().equals(EventConstants.VERIZON_RSS_CALLBACK_EVENT_NAME)) {
					    try {		
					    	XmlObject xmlObject = XmlObject.Factory.parse((String)event.getData());
					        RSSFacade.responseHandler(xmlObject);
					    }
					    catch (Exception e) {
					    	e.printStackTrace();
					    	logger.error(e);
					    }
					}
				} 
			});
	}
}

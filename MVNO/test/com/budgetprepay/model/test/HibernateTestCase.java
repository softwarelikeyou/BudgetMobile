package com.budgetprepay.model.test;

import java.util.Properties;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.budgetprepay.model.dao.HibernateUtil;
import com.budgetprepay.viewcontroller.util.ResourceUtil;

public class HibernateTestCase {

	@Before
	public void setUp() throws Exception {
	    Properties hibernateProperties = new Properties();
	    hibernateProperties.setProperty(Environment.DRIVER, ResourceUtil.get("hibernate.connection.driver_class"));
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
        .setProperties(hibernateProperties);
        
        HibernateUtil.getInstance(SystemHibernateConfiguration);
	}

	@After
	public void tearDown() throws Exception {
		if (!HibernateUtil.isClosed())
		    HibernateUtil.close();	
	}

	@Test
	public void test() throws Exception {
	    ClassPathResource cpr = new ClassPathResource("com/budgetprepay/model/upgrade/quartz.sql");
		ResourceDatabasePopulator rdp = new ResourceDatabasePopulator(); 
		rdp.addScript(cpr);
	    rdp.populate(HibernateUtil.getSessionFactory().openSession().connection());
	}

}

package com.budgetprepay.util;

import java.util.Date;

import org.junit.Test;

public class UtilTestCase {

	@Test
	public void test() throws Exception {
		EmailUtil email = new EmailUtil();
		email.setSubject("Test of email " + new Date());
		email.send("steve.thomas@softwarelikeyou.com");
	}
	
}

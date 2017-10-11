package com.budgetmobile.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneralTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testXOR() throws Exception {
		String encoded = StringXORer.encode("floresitadelimon@hotmail.com-7:3462", "55Chevy");
		System.out.println(encoded);
		String decoded = StringXORer.decode(encoded, "55Chevy");
		String[] split = decoded.split(":");
		System.out.println(split[0]);
		System.out.println(split[1]);
	}
	
	@Test public void checkAmount() throws Exception {
		String amount = "0000";
		if (Integer.valueOf(amount) == 0)
			System.out.print("0");
		else
			System.out.print("Not 0");
	}

}

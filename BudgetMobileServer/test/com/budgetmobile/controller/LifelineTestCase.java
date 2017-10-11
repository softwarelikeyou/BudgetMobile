package com.budgetmobile.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.budgetmobile.client.LifelineClient;
import com.budgetmobile.lifeline.CheckTmobileBalance;
import com.budgetmobile.lifeline.Credentials_LookupAccountByMDN;
import com.budgetmobile.lifeline.Credentials_LookupCustomerDetails;
import com.budgetmobile.lifeline.Credentials_TopUp_Enter;
import com.budgetmobile.lifeline.LifelineServicesSoapProxy;
import com.budgetmobile.lifeline.LookupAccountByMDN;
import com.budgetmobile.lifeline.LookupCustomerDetails;
//import com.budgetmobile.lifeline.MobileApp_ClerkAssociation;
import com.budgetmobile.lifeline.TopUp_Enter;
import com.budgetmobile.model.entity.PromoResult;

public class LifelineTestCase {

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
	public void testHelloWorld() throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy("http://www.budgetprepay.com/webservices/lifelineservices/lifelineservices.asmx");
		
		System.out.println(proxy.helloWorld());
	}
	
	@Test
	public void testLookupAccountByMDN() throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy();
		Credentials_LookupAccountByMDN credentials = new Credentials_LookupAccountByMDN();
		credentials.setApplicationID("LA1730");
		credentials.setApplicationPassword("eyrbstf2");
		credentials.setEmployeeName("MobileApp");
		credentials.setLocationID(29293);
		credentials.setMDN("3185290371");
		//credentials.setSales_Channel("");
		LookupAccountByMDN response = proxy.lookupAccountByMDN(credentials);
		System.out.println(response.getErrors().getErrorCode());
		System.out.println(response.getErrors().getErrorMessage());
		System.out.println(response.getBudgetMobileId());
	}
	
	@Test
	public void testLookupCustomerDetails() throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy();
		Credentials_LookupCustomerDetails credentials = new Credentials_LookupCustomerDetails();
		credentials.setApplicationID("LA1730");
		credentials.setApplicationPassword("eyrbstf2");
		credentials.setEmployeeName("MobileApp");
		credentials.setLocationID(29293);
		credentials.setBudgetMobileID(33248);
		LookupCustomerDetails response = proxy.lookupCustomerDetails(credentials);
		System.out.println(response.isIsError());
		System.out.println(response.getErrors().getErrorCode());
		System.out.println(response.getErrors().getErrorMessage());
		System.out.println(response.getMobileNumber());
		System.out.println(response.getProviderName());
		//System.out.println(response.isAssociateWithClerk());
		
	}
	
	@Test
	public void checkTmobileBalance() throws Exception {
	    String mdn = "9514268840";
	    CheckTmobileBalance res = LifelineClient.checkTmobileBalance(mdn);
	    System.out.println(res.getPlanBalance_Text());
	    System.out.println(res.getPlanBalance_Voice());
	    System.out.println(res.getServiceEndDate());
	    System.out.println(res.getTopUpBalance_Data());
	    System.out.println(res.getTopUpBalance_Text());
	    System.out.println(res.getTopUpBalance_Voice());
	    System.out.println(res.getTopUpExpiration());
	    System.out.println(res.getWirelessNumber());
	}
	
	@Test
	public void testEnterTopup() throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy();
		Credentials_TopUp_Enter credentials = new Credentials_TopUp_Enter();
		credentials.setAdvance(Boolean.FALSE);
		credentials.setApplicationID("LA1730");
		credentials.setApplicationPassword("eyrbstf2");
		credentials.setEmployeeName("MobileApp");
		credentials.setBudgetMobileID(1224957);
		credentials.setCouponAmount(0);
		credentials.setLocationID(29293);
		credentials.setOrder_ID(LifelineClient.newOrderId());
		credentials.setPurchaseWithAccountCredits(Boolean.FALSE);
		credentials.setTopUpProductID(109734);
		
		TopUp_Enter response = proxy.topUp_Enter(credentials);
		System.out.println(response.getReferenceID());
		System.out.println(response.getErrors().getErrorCode());
		System.out.println(response.getErrors().getErrorMessage());
	}
	
/*	@Test
	public void clerkAssociation() throws Exception {
		MobileApp_ClerkAssociation response = LifelineClient.clerkAssociation("jarrett1234@305spin.com", "JarrettSalesRep Woodall", 33248);
		System.out.println(response.isIsError());
		System.out.println(response.getErrors().getErrorDescription());
	}*/
}

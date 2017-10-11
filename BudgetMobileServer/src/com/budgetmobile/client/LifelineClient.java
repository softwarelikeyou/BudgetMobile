package com.budgetmobile.client;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.budgetmobile.controller.ServerProperties;
import com.budgetmobile.lifeline.CheckTmobileBalance;
import com.budgetmobile.lifeline.CheckVerizonBalance;
import com.budgetmobile.lifeline.Credentials_CheckTmobileBalance;
import com.budgetmobile.lifeline.Credentials_CheckVerizonBalance;
import com.budgetmobile.lifeline.Credentials_LookupAccountByMDN;
import com.budgetmobile.lifeline.Credentials_LookupAvailableTopUp_Existing;
import com.budgetmobile.lifeline.Credentials_LookupCustomerDetails;
//import com.budgetmobile.lifeline.Credentials_MobileApp_ClerkAssociation;
import com.budgetmobile.lifeline.Credentials_RetrVoiceandTextBalance;
import com.budgetmobile.lifeline.Credentials_TopUp_Commit;
import com.budgetmobile.lifeline.Credentials_TopUp_Enter;
import com.budgetmobile.lifeline.LifelineServicesSoapProxy;
import com.budgetmobile.lifeline.LookupAccountByMDN;
import com.budgetmobile.lifeline.LookupCustomerDetails;
//import com.budgetmobile.lifeline.MobileApp_ClerkAssociation;
import com.budgetmobile.lifeline.RetrVoiceandTextBalance;
import com.budgetmobile.lifeline.TaxItem;
import com.budgetmobile.lifeline.TopUpProduct;
import com.budgetmobile.lifeline.TopUp_Commit;
import com.budgetmobile.lifeline.TopUp_Enter;
import com.budgetmobile.model.entity.CheckoutResult;
import com.budgetmobile.model.entity.Tax;

public class LifelineClient {

	private static String APPLICATION_ID = "LA1730";
	private static String APPLICATION_PASSWORD = "eyrbstf2";
	private static Integer LOCATION_ID = 29293;
	private static String EMPLOYEE_NAME = "MobileApp";
	private static String PROD_URL = "http://www.budgetprepay.com/webservices/lifelineservices/lifelineservices.asmx";
	private static String DEV_URL = "http://www.budgetprepay.com/webservices/lifelineservices_test/lifelineservices.asmx";
	private static String URL = PROD_URL;
	private static String SALES_CHANNEL = "Mobile";
	
	static {
		if (ServerProperties.MODE.equals("DEV"))
			URL = DEV_URL;
	}
	
	public static LookupCustomerDetails lookupCustomerDetail(final Integer bmid) throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
		Credentials_LookupCustomerDetails credentials = new Credentials_LookupCustomerDetails();
		credentials.setApplicationID(APPLICATION_ID);
		credentials.setApplicationPassword(APPLICATION_PASSWORD);
		credentials.setEmployeeName(EMPLOYEE_NAME);
		credentials.setLocationID(LOCATION_ID);
		credentials.setBudgetMobileID(bmid);
		return proxy.lookupCustomerDetails(credentials);
	}
	public static LookupAccountByMDN lookupAccountByMDN(final String mdn) throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
		Credentials_LookupAccountByMDN credentials = new Credentials_LookupAccountByMDN();
		credentials.setApplicationID(APPLICATION_ID);
		credentials.setApplicationPassword(APPLICATION_PASSWORD);
		credentials.setEmployeeName(EMPLOYEE_NAME);
		credentials.setLocationID(LOCATION_ID);
		credentials.setMDN(mdn);
		return proxy.lookupAccountByMDN(credentials);
	}
	
	// TODO
/*	
	public static MobileApp_ClerkAssociation clerkAssociation(final String userName, final String fullName, final Integer budgetMobileID) throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
		Credentials_MobileApp_ClerkAssociation credentials = new Credentials_MobileApp_ClerkAssociation();
		credentials.setApplicationID(APPLICATION_ID);
		credentials.setApplicationPassword(APPLICATION_PASSWORD);
		credentials.setEmployeeName(EMPLOYEE_NAME);
		credentials.setLocationID(LOCATION_ID);
		credentials.setUserName(userName);
		credentials.setFullName(fullName);
		credentials.setBudgetMobileID(budgetMobileID);
		return proxy.mobileApp_ClerkAssociation(credentials);
	}*/
	
	public static CheckVerizonBalance checkVerizonBalance(final String mobileNumber) throws Exception {
		try {
			LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
			Credentials_CheckVerizonBalance credentials = new Credentials_CheckVerizonBalance();
			credentials.setApplicationID(APPLICATION_ID);
			credentials.setApplicationPassword(APPLICATION_PASSWORD);
			credentials.setEmployeeName(EMPLOYEE_NAME);
			credentials.setLocationID(LOCATION_ID);
			credentials.setMobileNumber(mobileNumber);
		    return proxy.checkVerizonBalance(credentials);
		}
		catch (Exception e) {
			throw new Exception("Could not check Verizon balance", e);
		}
	} 
	
	public static CheckTmobileBalance checkTmobileBalance(final String mobileNumber) throws Exception {
		try {
			LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
			Credentials_CheckTmobileBalance credentials = new Credentials_CheckTmobileBalance();
			credentials.setApplicationID(APPLICATION_ID);
			credentials.setApplicationPassword(APPLICATION_PASSWORD);
			credentials.setEmployeeName(EMPLOYEE_NAME);
			credentials.setLocationID(LOCATION_ID);
			credentials.setMobileNumber(mobileNumber);
		    return proxy.checkTmobileBalance(credentials);
		}
		catch (Exception e) {
			throw new Exception("Could not check T-Mobile balance", e);
		}
	}
	
	public static RetrVoiceandTextBalance checkSprintBalance(final Integer budgetMobileId) throws Exception {
		try {
			LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
			Credentials_RetrVoiceandTextBalance credentials = new Credentials_RetrVoiceandTextBalance();
			credentials.setApplicationID(APPLICATION_ID);
			credentials.setApplicationPassword(APPLICATION_PASSWORD);
			credentials.setEmployeeName(EMPLOYEE_NAME);
			credentials.setLocationID(LOCATION_ID);
			credentials.setBudgetMobileID(budgetMobileId);
			return proxy.retrVoiceandTextBalance(credentials); 
		}
		catch (Exception e) {
			throw new Exception("Could not check Sprint balance", e);
		}
	}
	
	public static List<TopUpProduct> getProducts(final Integer budgetMobileId) throws Exception {
		try {
			LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
			Credentials_LookupAvailableTopUp_Existing credentials = new Credentials_LookupAvailableTopUp_Existing();
			credentials.setApplicationID(APPLICATION_ID);
			credentials.setApplicationPassword(APPLICATION_PASSWORD);
			credentials.setEmployeeName(EMPLOYEE_NAME);
			credentials.setLocationID(LOCATION_ID);
			credentials.setBudgetMobileID(budgetMobileId);
			return Arrays.asList(proxy.lookupAvailableTopUp_Existing(credentials).getTopUpProducts());
		}
		catch (Exception e) {
			throw new Exception("Could not retrieve topup products", e);
		}
	}
	
	public static TopUp_Enter enterTopUp(final Integer bmid, final String orderid, final Integer topUpProductId, final Integer accountCreditsApplied ) throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
		Credentials_TopUp_Enter credentials = new Credentials_TopUp_Enter();
		credentials.setAdvance(Boolean.FALSE);
		credentials.setApplicationID(APPLICATION_ID);
		credentials.setApplicationPassword(APPLICATION_PASSWORD);
		credentials.setEmployeeName(EMPLOYEE_NAME);
		credentials.setBudgetMobileID(bmid);
		credentials.setCouponAmount(0);
		credentials.setLocationID(LOCATION_ID);
		credentials.setOrder_ID(orderid);
		credentials.setPurchaseWithAccountCredits(Boolean.FALSE);
		credentials.setTopUpProductID(topUpProductId);
		// TODO
		//credentials.setAccountCreditsApplied(accountCreditsApplied);
		credentials.setSales_Channel(SALES_CHANNEL);
		return proxy.topUp_Enter(credentials);
	}
	
	public static TopUp_Commit commitTopUp(final Integer referenceID) throws Exception {
		LifelineServicesSoapProxy proxy = new LifelineServicesSoapProxy(URL);
		Credentials_TopUp_Commit credentials = new Credentials_TopUp_Commit();
		credentials.setApplicationID(APPLICATION_ID);
		credentials.setApplicationPassword(APPLICATION_PASSWORD);
		credentials.setCCPayment(Boolean.TRUE);
		credentials.setLocationID(LOCATION_ID);
		credentials.setReferenceID(referenceID);
		return proxy.topUp_Commit(credentials);
	}
	
	public static CheckoutResult topUp_Enter2CheckoutResult(final TopUp_Enter from, final String orderId) throws Exception {
		CheckoutResult to = new CheckoutResult();
		to.setOrderID(orderId);
		to.setOrderTotal(from.getOrderTotal());
		to.setReferenceID(from.getReferenceID());
		to.setTaxesApply(from.isTaxesApply());
		to.setTopUpCost(from.getTopUpCost());
		to.setTopUpDescription(from.getTopUpDescription());
		if (from.getTaxItems() != null) {
			for (TaxItem taxItem : Arrays.asList(from.getTaxItems())) {
				Tax tax = new Tax();
				tax.setAmount(taxItem.getTaxItemAmount());
				tax.setDescription(taxItem.getTaxItemDescription());
				to.addTax(tax);
			}
		}
		return to;
	}
	
	public static String newOrderId() throws Exception {
		UUID idOne = UUID.randomUUID();
	    UUID idTwo = UUID.randomUUID();
	    return "ANDR" + idOne.toString().substring(0, 5) + idTwo.toString().substring(0, 5);
	}
}

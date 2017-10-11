package com.budgetmobile.controller;

import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.budgetprepay.www.Paymentech.NewOrderRequest;
import com.budgetprepay.www.Paymentech.NewOrderResponse;
import com.budgetprepay.www.Paymentech.PaymentechProxy;

public class PaymentechTestCase {

	private static String VERSION = "2.8";
	private static String MERCHANT_ID = "300008925240";
	private static String END_POINT = "https://ws.paymentech.net/PaymentechGateway";
	private static String TERMINAL_ID = "001";
	private static String BIN = "000002";
	private static String ORBITAL_USERNAME = "BPREPAY5240";
	private static String ORBITAL_PASSWORD = "Spring2014";
	private static String INDUSTRY_TYPE = "EC";
	private static String TRANS_TYPE = "AC";
	private static String ORDER_ID_PREFIX = "mob";
	private static String COUNTRY_CODE = "US";
	
	private String random() throws Exception {
		Random r = new Random();
		int Low = 0;
		int High = 10000000;
		int R = r.nextInt(High-Low) + Low;
		return String.valueOf(R);
	}
	
	@Test
	public void testNewOrder() throws Exception {
		String ccNum = "4847188387540638";
        String ccExp = "202307";
        String ccVerifyNum = "721";
        String ccZip = "78666";
        String ccAddress1 = "900 Peques St.";
        String ccCity = "San Marcos";
        String ccState = "TX";
        String ccName = "Steve Thomas";
        String ccEmail = "stevethomas01@yahoo.com";
        String orderId = ORDER_ID_PREFIX + random();
        String amount = "100";
        String purchaseDescription = "Test-" + new Date();
        
		PaymentechProxy proxy = new PaymentechProxy();
		NewOrderRequest newOrderRequest = new NewOrderRequest();
		
		newOrderRequest.setEndppoint(END_POINT);	    
		newOrderRequest.setBin(BIN);	
		newOrderRequest.setIndustryType(INDUSTRY_TYPE);
		newOrderRequest.setOrderID(orderId); 
		newOrderRequest.setMerchantID(MERCHANT_ID);
		newOrderRequest.setOrbitalConnectionPassword(ORBITAL_PASSWORD);	    
		newOrderRequest.setOrbitalConnectionUsername(ORBITAL_USERNAME);
		newOrderRequest.setTerminalID(TERMINAL_ID);
		newOrderRequest.setTransType(TRANS_TYPE);
		newOrderRequest.setAmount(amount);		
		newOrderRequest.setCcAccountNum(ccNum);
		newOrderRequest.setCcExp(ccExp);
		newOrderRequest.setComments(purchaseDescription);
		newOrderRequest.setAvsAddress1(ccAddress1);
		newOrderRequest.setAvsCity(ccCity);
		newOrderRequest.setAvsCountryCode(COUNTRY_CODE);
		newOrderRequest.setAvsName(ccName);
		newOrderRequest.setAvsPhone("7134443489");
		newOrderRequest.setAvsState(ccState);
		newOrderRequest.setAvsZip(ccZip);
		newOrderRequest.setCcCardVerifyNum(ccVerifyNum);
		newOrderRequest.setCcCardVerifyPresenceInd("1");
		newOrderRequest.setCustomerEmail(ccEmail);
		newOrderRequest.setShippingRef("");
		newOrderRequest.setTaxInd("0");
		newOrderRequest.setVersion(VERSION);		
									        																
		NewOrderResponse newOrderResponse = proxy.newOrder(newOrderRequest);
	    
        System.out.println("Approval Status:     " + newOrderResponse.getApprovalStatus());
        System.out.println("Authorization Code : " + newOrderResponse.getAuthorizationCode());
        System.out.println("AVS Resp Code:       " + newOrderResponse.getAvsRespCode());
        System.out.println("BIN:                 " + newOrderResponse.getBin());
        System.out.println("Card Brand:          " + newOrderResponse.getCardBrand());
        System.out.println("CVV Response Code:   " + newOrderResponse.getCvvRespCode());
        System.out.println("Host Resp Code:      " + newOrderResponse.getHostRespCode());
        System.out.println("Industry Type:       " + newOrderResponse.getIndustryType());
        System.out.println("Merchant ID:         " + newOrderResponse.getMerchantID());
        System.out.println("Order ID:            " + newOrderResponse.getOrderID());
        System.out.println("Proc Status:         " + newOrderResponse.getProcStatus());
        System.out.println("Proc Status Message: " + newOrderResponse.getProcStatusMessage());
        System.out.println("Response Code:       " + newOrderResponse.getRespCode());
        System.out.println("Response Date:       " + newOrderResponse.getRespDateTime());
        System.out.println("Terminal ID:         " + newOrderResponse.getTerminalID());
        System.out.println("Transation Type:     " + newOrderResponse.getTransType());
        System.out.println("Transaction Ref Idx: " + newOrderResponse.getTxRefIdx());
        System.out.println("Transaction Ref:     " + newOrderResponse.getTxRefNum());

        if (newOrderResponse.getErrorMessage() != null) {
            System.out.println("Error Code:       " + newOrderResponse.getErrorMessage().getErrorCode());
            System.out.println("Error Text:       " + newOrderResponse.getErrorMessage().getErrorText());
        }
		
	}

}

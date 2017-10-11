package com.budgetmobile.client;

import com.budgetprepay.www.Paymentech.NewOrderRequest;
import com.budgetprepay.www.Paymentech.NewOrderResponse;
import com.budgetprepay.www.Paymentech.PaymentechProxy;

public class PaymentechClient {

	private static String VERSION = "2.8";
	private static String MERCHANT_ID = "300008925240";
	private static String END_POINT = "https://ws.paymentech.net/PaymentechGateway";
	private static String TERMINAL_ID = "001";
	private static String BIN = "000002";
	private static String ORBITAL_USERNAME = "BPREPAY5240";
	private static String ORBITAL_PASSWORD = "Spring2014";
	private static String INDUSTRY_TYPE = "EC";
	private static String TRANS_TYPE_CAPTURE = "AC";
	private static String TRANS_TYPE_AUTH = "A";
	private static String COUNTRY_CODE = "US";
	
	public static NewOrderResponse newOrder(final String ccNum, 
			                                final String ccExp,
			                                final String ccVerifyNum,
			                                final String ccZip,
			                                final String ccAddress1,
			                                final String ccCity,
			                                final String ccState,
			                                final String ccName,
			                                final String ccPhone,
			                                final String ccEmail,
			                                final String orderId,
			                                final String amount,
			                                final String purchaseDescription) throws Exception {
		PaymentechProxy proxy = new PaymentechProxy();
		NewOrderRequest newOrderRequest = new NewOrderRequest();
		newOrderRequest.setVersion(VERSION);
		newOrderRequest.setMerchantID(MERCHANT_ID);
		newOrderRequest.setEndppoint(END_POINT);
		newOrderRequest.setTerminalID(TERMINAL_ID);
		newOrderRequest.setBin(BIN);
		newOrderRequest.setOrbitalConnectionUsername(ORBITAL_USERNAME);
		newOrderRequest.setOrbitalConnectionPassword(ORBITAL_PASSWORD);
		newOrderRequest.setIndustryType(INDUSTRY_TYPE);
		newOrderRequest.setTransType(TRANS_TYPE_CAPTURE);
		if (Integer.valueOf(amount) == 000)
			newOrderRequest.setTransType(TRANS_TYPE_AUTH);	
		newOrderRequest.setCcAccountNum(ccNum);
		newOrderRequest.setCcExp(ccExp);
		newOrderRequest.setCcCardVerifyPresenceInd("1"); 
		newOrderRequest.setCcCardVerifyNum(ccVerifyNum);
		newOrderRequest.setAvsZip(ccZip);
		newOrderRequest.setAvsAddress1(ccAddress1);
		newOrderRequest.setAvsCity(ccCity);
		newOrderRequest.setAvsState(ccState);
		newOrderRequest.setAvsName(ccName);
		newOrderRequest.setAvsCountryCode(COUNTRY_CODE);
		newOrderRequest.setAvsPhone(ccPhone);
		newOrderRequest.setCustomerEmail(ccEmail);
		newOrderRequest.setOrderID(orderId); 
		newOrderRequest.setShippingRef(orderId);
		newOrderRequest.setAmount(amount);
		newOrderRequest.setTaxInd("1");
		newOrderRequest.setComments(purchaseDescription);
		return proxy.newOrder(newOrderRequest);
	}
}

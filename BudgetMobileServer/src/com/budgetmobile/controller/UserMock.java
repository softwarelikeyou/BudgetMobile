package com.budgetmobile.controller;

import com.budgetmobile.model.entity.Address;
import com.budgetmobile.model.entity.Order;
import com.budgetmobile.model.entity.TopUpProduct;
import com.budgetmobile.model.entity.User;

public class UserMock {

	public static String VERIZON_BMID = "1224970"; // "1224970"; //"1224968";
	
	public static User mocked() {
		User user = new User();
		
		user.setEmail("kevin@305spin.com");
		user.setErrorCode("");
		user.setErrorMessage("");
		user.setfName("Ignacio");
		user.setIsError(Boolean.FALSE);
		user.setlName("Varona");
		user.setUserId("480046");
		Order order = new Order();
		Address billingAddress = new Address();
		billingAddress.setAddress1("3511 Itaska St");
		billingAddress.setAddress2("");
		billingAddress.setCity("Saint Louis");
		billingAddress.setState("MO");
		billingAddress.setZip("63111-1427");
		order.setBillingAddress(billingAddress);
		order.setBirthDate("1963/03/18");
		order.setBudgetMobileId("1224970");
		order.setContactNumber("3183492819");
		order.setEmailAddress("kevin@305spin.com");
		order.setFirstName("Ignacio");
		order.setLastName("Varona");
		order.setLifeLine("true");
		order.setLifeline_Expiration("2016/10/14");
		order.setOrderId("448271");
		order.setPhoneNumber("3183492819");
		order.setPlanBalance_Combo_VS(0);
		order.setPlanBalance_Data("0");
		order.setPlanBalance_MMS(0);
		order.setPlanBalance_Text(0);
		order.setPlanBalance_Voice(500);
		order.setProviderID("2");
		order.setProviderName("VERIZON");
		Address serviceAddress = new Address();
		serviceAddress.setAddress1("3511 Itaska St");
		serviceAddress.setAddress2("");
		serviceAddress.setCity("Saint Louis");
		serviceAddress.setState("MO");
		serviceAddress.setZip("63111-1427");
		order.setServiceAddress(serviceAddress);
		order.setServiceEndDate("2016/10/14");
		order.setServicePlan("500 PLAN");
		order.setSSN("2211");
		order.setTopUpBalance_Combo_VS(0);
		order.setTopUpBalance_Data("0");
		order.setTopUpBalance_Text(0);
		order.setTopUpBalance_Voice(0);
		order.setTopUpExpiration("2016/10/14");
		order.setTopUpExpirationSet(Boolean.FALSE);
		
		TopUpProduct topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("400 VOICE MINUTES");
		topUpProduct.setFaceValue(15.0);
		topUpProduct.setTopUpProductID(108478);
		topUpProduct.setType(1);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("100 VOICE/UNLIMITED TEXT/50MB DATA");
		topUpProduct.setFaceValue(5.0);
		topUpProduct.setTopUpProductID(112630);
		topUpProduct.setType(3);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("100 MB");
		topUpProduct.setFaceValue(5.0);
		topUpProduct.setTopUpProductID(109734);
		topUpProduct.setType(6);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("200 MMS");
		topUpProduct.setFaceValue(15.0);
		topUpProduct.setTopUpProductID(109734);
		topUpProduct.setType(5);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("UNLIMITED VOICE/UNLIMITED TEXT/500MB DATA");
		topUpProduct.setFaceValue(30.0);
		topUpProduct.setTopUpProductID(112936);
		topUpProduct.setType(3);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("4000 TEXT");
		topUpProduct.setFaceValue(15.0);
		topUpProduct.setTopUpProductID(108660);
		topUpProduct.setType(2);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("750 VOICE/UNLIMITED TEXT/400MB DATA");
		topUpProduct.setFaceValue(20.0);
		topUpProduct.setTopUpProductID(112885);
		topUpProduct.setType(3);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("250 VOICE/UNLIMITED TEXT/250MB DATA");
		topUpProduct.setFaceValue(10.0);
		topUpProduct.setTopUpProductID(112681);
		topUpProduct.setType(3);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("UNLIMITED VOICE/UNLIMITED TEXT/2GB DATA");
		topUpProduct.setFaceValue(50.0);
		topUpProduct.setTopUpProductID(112987);
		topUpProduct.setType(3);
		order.addTopUpProduct(topUpProduct);
		
		topUpProduct = new TopUpProduct();
		topUpProduct.setDescription("400 MB");
		topUpProduct.setFaceValue(15.0);
		topUpProduct.setTopUpProductID(109834);
		topUpProduct.setType(6);
		order.addTopUpProduct(topUpProduct);
		
		user.getOrders().add(order);
		
		return user;
	}
}

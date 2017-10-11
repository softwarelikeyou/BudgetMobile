package com.budgetmobile.controller;

import org.junit.Test;

import com.budgetmobile.client.SpinlifeservClient;
import com.budgetmobile.model.entity.PromoResult;

public class SpinlifeservClientTestCase {

	private static String TEST_PROMO_VALID = "jarrett1234@305spin.com";
	private static String TEST_PROMO_INVALID = "notvalid";
	
	@Test
	public void confirmPromoCodeValid() throws Exception {
		PromoResult result = SpinlifeservClient.confirmPromoCode(TEST_PROMO_VALID);
		System.out.println(result.getUserName());
		System.out.println(result.getBmiLocation());
		System.out.println(result.getIsError());
		System.out.println(result.getErrorCode());
		System.out.println(result.getErrorMessage());
	}

	@Test
	public void confirmPromoCodeInvalid() throws Exception {
		PromoResult result = SpinlifeservClient.confirmPromoCode(TEST_PROMO_INVALID);
		System.out.println(result.getUserName());
		System.out.println(result.getBmiLocation());
		System.out.println(result.getIsError());
		System.out.println(result.getErrorCode());
		System.out.println(result.getErrorMessage());
	}
}

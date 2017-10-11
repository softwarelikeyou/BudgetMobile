package com.budgetmobile.android.budgetmobile;

import android.os.Bundle;

import com.budgetmobile.android.budgetmobile.entity.CheckoutResult;
import com.budgetmobile.android.budgetmobile.entity.Order;
import com.budgetmobile.android.budgetmobile.entity.PromoResult;
import com.budgetmobile.android.budgetmobile.entity.User;

public class Cache {

    private static Cache instance = null;

    private static Bundle bundle = null;

    private static Boolean useCredits = Boolean.TRUE;

    private static String username = null;
    private static String password = null;

    private static String promoCode = null;

    private static PromoResult promoResult = null;

    private static String USER_KEY = User.class.getSimpleName();
    private static String CHECKOUT_RESULT_KEY = CheckoutResult.class.getSimpleName();

    private Cache() {
        bundle = new Bundle();
    }

    public static Cache getInstance() {
        if(instance == null)
            instance = new Cache();
        return instance;
    }

    public static User getUser() {
        return (User) bundle.getSerializable(USER_KEY);
    }

    public static void putUser(User user) {
        bundle.putSerializable(USER_KEY, user);
    }

    public static Order getOrder() {
        if (Cache.getUser() == null)
            return null;
        return (Order) Cache.getUser().getOrders().toArray()[0];
    }

    public static CheckoutResult getCheckoutResult() {
        return (CheckoutResult) bundle.getSerializable(CHECKOUT_RESULT_KEY);
    }

    public static void putCheckoutResult(CheckoutResult checkoutResult) {
        bundle.putSerializable(CHECKOUT_RESULT_KEY, checkoutResult);
    }

    public static Boolean getUseCredits() {
        return useCredits;
    }

    public static void setUseCredits(Boolean value) {
        useCredits = value;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String value) {
        username = value;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String value) {
        password = value;
    }

    public static PromoResult getPromoResult() {
        return promoResult;
    }

    public static void setPromoResult(PromoResult value) {
        promoResult = value;
    }

    public static String getPromoCode() {
        return promoCode;
    }

    public static void setPromoCode(String value) {
        promoCode = value;
    }
}

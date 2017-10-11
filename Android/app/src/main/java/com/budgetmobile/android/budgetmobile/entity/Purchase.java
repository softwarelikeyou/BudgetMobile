package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 11/15/2015.
 */
public class Purchase implements Serializable {
    private CheckoutResult checkoutResult;
    private String creditCard;
    private String expiration;
    private String ccc;
    private String name;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public CheckoutResult getCheckoutResult() {
        return checkoutResult;
    }

    public void setCheckoutResult(CheckoutResult checkoutResult) {
        this.checkoutResult = checkoutResult;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

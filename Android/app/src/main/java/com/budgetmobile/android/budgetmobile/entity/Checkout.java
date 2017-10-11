package com.budgetmobile.android.budgetmobile.entity;

public class Checkout {

    private String bmid;

    private Integer product;

    private Integer credits = 0;

    public String getBmid() {
        return bmid;
    }

    public void setBmid(String bmid) {
        this.bmid = bmid;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer value) {
        this.credits = value;
    }
}

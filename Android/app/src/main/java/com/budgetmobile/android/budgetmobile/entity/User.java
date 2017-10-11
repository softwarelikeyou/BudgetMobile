package com.budgetmobile.android.budgetmobile.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {

    private Integer userId;

    private String fName;

    private String lName;

    private String email;

    private Set<Order> orders = new HashSet<Order>();

    private Boolean isError = Boolean.FALSE;

    private String errorCode;

    private String errorMessage;

    private JSONObject jsonObject = null;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}

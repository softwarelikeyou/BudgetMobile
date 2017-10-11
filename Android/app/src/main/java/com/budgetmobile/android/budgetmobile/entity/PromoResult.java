package com.budgetmobile.android.budgetmobile.entity;

/**
 * Created by Administrator on 4/23/2016.
 */
public class PromoResult {
    private String userName;

    private String fullName;

    private String bmiLocation;

    private Boolean isError = Boolean.FALSE;

    private Integer errorCode = null;

    private String errorMessage = null;

    private String errorMessage_User = null;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBmiLocation() {
        return bmiLocation;
    }

    public void setBmiLocation(String bmiLocation) {
        this.bmiLocation = bmiLocation;
    }

    public Boolean getIsError() {
        return isError;
    }

    public void setIsError(Boolean isError) {
        this.isError = isError;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage_User() {
        return errorMessage_User;
    }

    public void setErrorMessage_User(String errorMessage_User) {
        this.errorMessage_User = errorMessage_User;
    }
}

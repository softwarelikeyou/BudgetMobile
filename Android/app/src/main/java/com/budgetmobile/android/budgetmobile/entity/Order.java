package com.budgetmobile.android.budgetmobile.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
    private String phoneNumber;

    public String budgetMobileId;

    public String lifeLine;

    public String orderId;

    private String firstName;

    private String lastName;

    private String providerID;

    private String providerName;

    private String SSN;

    private String birthDate;

    private Address serviceAddress = new Address();

    private String emailAddress;

    private String contactNumber;

    private String lifeline_Expiration;

    private String lastCallDateTime;

    private Address billingAddress = new Address();

    private String servicePlan;

    private String planBalance_Voice = "0";

    private String planBalance_Text = "0";

    private String planBalance_Combo_VS  = "0";

    private String planBalance_Data = "0";

    private String planBalance_MMS  = "0";

    private String topUpBalance_Voice= "0";

    private String topUpBalance_Text = "0";

    private String topUpBalance_Combo_VS = "0";

    private String topUpBalance_Data = "0";

    private String serviceEndDate;

    private Boolean topUpExpirationSet;

    private String topUpExpiration;

    private Integer mobileAccountCredit = 0;

    private Boolean associateWithClerk = Boolean.FALSE;

    private List<TopUpProduct> topUpProducts = new ArrayList<TopUpProduct>();

    private Boolean migrationInProgress;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBudgetMobileId() {
        return budgetMobileId;
    }

    public void setBudgetMobileId(String budgetMobileId) {
        this.budgetMobileId = budgetMobileId;
    }

    public String getLifeLine() {
        return lifeLine;
    }

    public void setLifeLine(String lifeLine) {
        this.lifeLine = lifeLine;
    }

    public String getLastCallDateTime() {
        return lastCallDateTime;
    }

    public void setLastCallDateTime(String lastCallDateTime) {
        this.lastCallDateTime = lastCallDateTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProviderID() {
        return providerID;
    }

    public void setProviderID(String providerID) {
        this.providerID = providerID;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Address getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(Address serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLifeline_Expiration() {
        return lifeline_Expiration;
    }

    public void setLifeline_Expiration(String lifeline_Expiration) {
        this.lifeline_Expiration = lifeline_Expiration;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getServicePlan() {
        return servicePlan;
    }

    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    public String getPlanBalance_Voice() {
        return planBalance_Voice;
    }

    public void setPlanBalance_Voice(String planBalance_Voice) {
        this.planBalance_Voice = planBalance_Voice;
    }

    public String getPlanBalance_Text() {
        return planBalance_Text;
    }

    public void setPlanBalance_Text(String planBalance_Text) {
        this.planBalance_Text = planBalance_Text;
    }

    public String getPlanBalance_Combo_VS() {
        return planBalance_Combo_VS;
    }

    public void setPlanBalance_Combo_VS(String planBalance_Combo_VS) {
        this.planBalance_Combo_VS = planBalance_Combo_VS;
    }

    public String getPlanBalance_Data() {
        return planBalance_Data;
    }

    public void setPlanBalance_Data(String planBalance_Data) {
        this.planBalance_Data = planBalance_Data;
    }

    public String getPlanBalance_MMS() {
        return planBalance_MMS;
    }

    public void setPlanBalance_MMS(String planBalance_MMS) {
        this.planBalance_MMS = planBalance_MMS;
    }

    public String getTopUpBalance_Voice() {
        return topUpBalance_Voice;
    }

    public void setTopUpBalance_Voice(String topUpBalance_Voice) {
        this.topUpBalance_Voice = topUpBalance_Voice;
    }

    public String getTopUpBalance_Text() {
        return topUpBalance_Text;
    }

    public void setTopUpBalance_Text(String topUpBalance_Text) {
        this.topUpBalance_Text = topUpBalance_Text;
    }

    public String getTopUpBalance_Combo_VS() {
        return topUpBalance_Combo_VS;
    }

    public void setTopUpBalance_Combo_VS(String topUpBalance_Combo_VS) {
        this.topUpBalance_Combo_VS = topUpBalance_Combo_VS;
    }

    public String getTopUpBalance_Data() {
        return topUpBalance_Data;
    }

    public void setTopUpBalance_Data(String topUpBalance_Data) {
        this.topUpBalance_Data = topUpBalance_Data;
    }

    public String getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(String serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public Boolean getTopUpExpirationSet() {
        return topUpExpirationSet;
    }

    public void setTopUpExpirationSet(Boolean topUpExpirationSet) {
        this.topUpExpirationSet = topUpExpirationSet;
    }

    public String getTopUpExpiration() {
        return topUpExpiration;
    }

    public void setTopUpExpiration(String topUpExpiration) {
        this.topUpExpiration = topUpExpiration;
    }

    public Integer getMobileAccountCredit() {
        return mobileAccountCredit;
    }

    public void setMobileAccountCredit(Integer mobileAccountCredit) {
        this.mobileAccountCredit = mobileAccountCredit;
    }

    public List<TopUpProduct> getTopUpProducts() {
        return topUpProducts;
    }

    public void setTopUpProducts(List<TopUpProduct> topUpProducts) {
        this.topUpProducts = topUpProducts;
    }

    public void addTopUpProduct(TopUpProduct topUpProduct) {
        this.topUpProducts.add(topUpProduct);
    }

    public Boolean getAssociateWithClerk() {
        return associateWithClerk;
    }

    public void setAssociateWithClerk(Boolean associateWithClerk) {
        this.associateWithClerk = associateWithClerk;
    }

    public Boolean getMigrationInProgress() {
        return migrationInProgress;
    }

    public void setMigrationInProgress(Boolean migrationInProgress) {
        this.migrationInProgress = migrationInProgress;
    }
}

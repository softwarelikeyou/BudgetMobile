package com.budgetmobile.model.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
	
	@JsonProperty("PHONENUMBER")
	private String phoneNumber;
	
	@JsonProperty("BUDGETMOBILEID")
	public String budgetMobileId;
	
	@JsonProperty("LIFELINE")
	public String lifeLine;
	
	@JsonProperty("ORDERID")
	public String orderId;

	@JsonProperty("firstName")
    private String firstName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("providerID")
    private String providerID;
	
	@JsonProperty("providerName")
    private String providerName;
	
	@JsonProperty("SSN")
    private String SSN;
	
	@JsonProperty("birthDate")
    private String birthDate;
	
	@JsonProperty("serviceAddress")
    private Address serviceAddress = new Address();
    
	@JsonProperty("emailAddress")
    private String emailAddress;
    
	@JsonProperty("contactNumber")
	private String contactNumber;
    
	@JsonProperty("lifeline_Expiration")
	private String lifeline_Expiration;
    
	@JsonProperty("lastCallDateTime")
	private String lastCallDateTime;
	
	@JsonProperty("billingAddress")
	private Address billingAddress = new Address();
    
	@JsonProperty("servicePlan")
	private String servicePlan;

	@JsonProperty("planBalance_Voice")
	private Integer planBalance_Voice;
	
	@JsonProperty("planBalance_Text")
	private Integer planBalance_Text;
	
	@JsonProperty("planBalance_Combo_VS")
	private Integer planBalance_Combo_VS;
	
	@JsonProperty("planBalance_Data")
	private String planBalance_Data;
	
	@JsonProperty("planBalance_MMS")
	private Integer planBalance_MMS;

	@JsonProperty("topUpBalance_Voice")
	private Integer topUpBalance_Voice;
	
	@JsonProperty("topUpBalance_Text")
	private Integer topUpBalance_Text;
	
	@JsonProperty("topUpBalance_Combo_VS")
	private Integer topUpBalance_Combo_VS;
	
	@JsonProperty("topUpBalance_Data")
	private String topUpBalance_Data;

	@JsonProperty("serviceEndDate")
	private String serviceEndDate;
	
	@JsonProperty("topUpExpirationSet")
	private Boolean topUpExpirationSet;
	
	@JsonProperty("topUpExpiration")
	private String topUpExpiration;
	
	@JsonProperty("TOPUP_PRODUCTS")
	private Set<TopUpProduct> topUpProducts = new HashSet<TopUpProduct>();
	
	@JsonProperty("migrationInProgress")
	private Boolean migrationInProgress;
	
	@JsonProperty("mobileAccountCredit")
	private String mobileAccountCredit;
	
	@JsonProperty("associateWithClerk")
	private Boolean associateWithClerk;

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

	public Boolean getTopUpExpirationSet() {
		return topUpExpirationSet;
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

	public void setSSN(String sSN) {
		SSN = sSN;
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

	public Integer getPlanBalance_Voice() {
		return planBalance_Voice;
	}

	public void setPlanBalance_Voice(Integer planBalance_Voice) {
		this.planBalance_Voice = planBalance_Voice;
	}

	public Integer getPlanBalance_Text() {
		return planBalance_Text;
	}

	public void setPlanBalance_Text(int planBalance_Text) {
		this.planBalance_Text = planBalance_Text;
	}

	public Integer getPlanBalance_Combo_VS() {
		return planBalance_Combo_VS;
	}

	public void setPlanBalance_Combo_VS(Integer planBalance_Combo_VS) {
		this.planBalance_Combo_VS = planBalance_Combo_VS;
	}

	public String getPlanBalance_Data() {
		return planBalance_Data;
	}

	public void setPlanBalance_Data(String planBalance_Data) {
		this.planBalance_Data = planBalance_Data;
	}

	public Integer getPlanBalance_MMS() {
		return planBalance_MMS;
	}

	public void setPlanBalance_MMS(Integer planBalance_MMS) {
		this.planBalance_MMS = planBalance_MMS;
	}

	public Integer getTopUpBalance_Voice() {
		return topUpBalance_Voice;
	}

	public void setTopUpBalance_Voice(Integer topUpBalance_Voice) {
		this.topUpBalance_Voice = topUpBalance_Voice;
	}

	public Integer getTopUpBalance_Text() {
		return topUpBalance_Text;
	}

	public void setTopUpBalance_Text(Integer topUpBalance_Text) {
		this.topUpBalance_Text = topUpBalance_Text;
	}

	public Integer getTopUpBalance_Combo_VS() {
		return topUpBalance_Combo_VS;
	}

	public void setTopUpBalance_Combo_VS(Integer topUpBalance_Combo_VS) {
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

	public Boolean isTopUpExpirationSet() {
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

	public Set<TopUpProduct> getTopUpProducts() {
		return topUpProducts;
	}

	public void setTopUpProducts(Set<TopUpProduct> topUpProducts) {
		this.topUpProducts = topUpProducts;
	}
	
	public void addTopUpProduct(TopUpProduct topUpProduct) {
		this.topUpProducts.add(topUpProduct);
	}

	public Boolean getMigrationInProgress() {
		return migrationInProgress;
	}

	public void setMigrationInProgress(Boolean migrationInProgress) {
		this.migrationInProgress = migrationInProgress;
	}
	public String getMobileAccountCredit() {
		return mobileAccountCredit;
	}

	public void setMobileAccountCredit(String mobileAccountCredit) {
		this.mobileAccountCredit = mobileAccountCredit;
	}
	
	public Boolean getAssociateWithClerk() {
		return associateWithClerk;
	}

	public void setAssociateWithClerk(Boolean associateWithClerk) {
		this.associateWithClerk = associateWithClerk;
	}
}

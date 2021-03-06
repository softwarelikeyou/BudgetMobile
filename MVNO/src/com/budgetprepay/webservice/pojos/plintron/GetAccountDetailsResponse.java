//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:52:28 AM CDT 
//


package com.budgetprepay.webservice.pojos.plintron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MHAPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vmsPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIMStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeCycleState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cbs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoValidityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topUpInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNPInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountDetailsResponse", propOrder = {
    "transactionId",
    "returnCode",
    "errorDescription",
    "networkId",
    "mhaPin",
    "accountStatus",
    "validityDate",
    "currentBalance",
    "language",
    "vmsPin",
    "transPin",
    "planId",
    "subStatus",
    "simStatus",
    "lifeCycleState",
    "subType",
    "mainBalance",
    "cbs",
    "promoBalance",
    "promoValidityDate",
    "topUpInd",
    "mnpInd"
})
public class GetAccountDetailsResponse {

    protected String transactionId;
    protected String returnCode;
    protected String errorDescription;
    protected String networkId;
    @XmlElement(name = "MHAPin")
    protected String mhaPin;
    protected String accountStatus;
    protected String validityDate;
    protected String currentBalance;
    protected String language;
    protected String vmsPin;
    protected String transPin;
    protected String planId;
    protected String subStatus;
    @XmlElement(name = "SIMStatus")
    protected String simStatus;
    protected String lifeCycleState;
    protected String subType;
    protected String mainBalance;
    protected String cbs;
    protected String promoBalance;
    protected String promoValidityDate;
    protected String topUpInd;
    @XmlElement(name = "MNPInd")
    protected String mnpInd;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the mhaPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMHAPin() {
        return mhaPin;
    }

    /**
     * Sets the value of the mhaPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMHAPin(String value) {
        this.mhaPin = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the validityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityDate() {
        return validityDate;
    }

    /**
     * Sets the value of the validityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDate(String value) {
        this.validityDate = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalance(String value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the vmsPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsPin() {
        return vmsPin;
    }

    /**
     * Sets the value of the vmsPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsPin(String value) {
        this.vmsPin = value;
    }

    /**
     * Gets the value of the transPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransPin() {
        return transPin;
    }

    /**
     * Sets the value of the transPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransPin(String value) {
        this.transPin = value;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the simStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMStatus() {
        return simStatus;
    }

    /**
     * Sets the value of the simStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMStatus(String value) {
        this.simStatus = value;
    }

    /**
     * Gets the value of the lifeCycleState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * Sets the value of the lifeCycleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleState(String value) {
        this.lifeCycleState = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the mainBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBalance() {
        return mainBalance;
    }

    /**
     * Sets the value of the mainBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBalance(String value) {
        this.mainBalance = value;
    }

    /**
     * Gets the value of the cbs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbs() {
        return cbs;
    }

    /**
     * Sets the value of the cbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbs(String value) {
        this.cbs = value;
    }

    /**
     * Gets the value of the promoBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoBalance() {
        return promoBalance;
    }

    /**
     * Sets the value of the promoBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoBalance(String value) {
        this.promoBalance = value;
    }

    /**
     * Gets the value of the promoValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoValidityDate() {
        return promoValidityDate;
    }

    /**
     * Sets the value of the promoValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoValidityDate(String value) {
        this.promoValidityDate = value;
    }

    /**
     * Gets the value of the topUpInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopUpInd() {
        return topUpInd;
    }

    /**
     * Sets the value of the topUpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopUpInd(String value) {
        this.topUpInd = value;
    }

    /**
     * Gets the value of the mnpInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNPInd() {
        return mnpInd;
    }

    /**
     * Sets the value of the mnpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNPInd(String value) {
        this.mnpInd = value;
    }

}

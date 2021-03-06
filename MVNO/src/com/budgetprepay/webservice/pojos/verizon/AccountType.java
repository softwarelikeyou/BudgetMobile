//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:23:41 PM CDT 
//


package com.budgetprepay.webservice.pojos.verizon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="langPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasBuckets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sweepOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsNotifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preCallAnnouncement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountType", propOrder = {
    "mdn",
    "accountStatus",
    "cos",
    "expiration",
    "pinCode",
    "langPref",
    "hasBuckets",
    "sweepOn",
    "smsNotifications",
    "preCallAnnouncement"
})
public class AccountType {

    protected String mdn;
    protected String accountStatus;
    protected String cos;
    protected String expiration;
    protected String pinCode;
    protected String langPref;
    protected String hasBuckets;
    protected String sweepOn;
    protected String smsNotifications;
    protected String preCallAnnouncement;

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdn(String value) {
        this.mdn = value;
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
     * Gets the value of the cos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCos() {
        return cos;
    }

    /**
     * Sets the value of the cos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCos(String value) {
        this.cos = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the langPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangPref() {
        return langPref;
    }

    /**
     * Sets the value of the langPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangPref(String value) {
        this.langPref = value;
    }

    /**
     * Gets the value of the hasBuckets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasBuckets() {
        return hasBuckets;
    }

    /**
     * Sets the value of the hasBuckets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasBuckets(String value) {
        this.hasBuckets = value;
    }

    /**
     * Gets the value of the sweepOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSweepOn() {
        return sweepOn;
    }

    /**
     * Sets the value of the sweepOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSweepOn(String value) {
        this.sweepOn = value;
    }

    /**
     * Gets the value of the smsNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsNotifications() {
        return smsNotifications;
    }

    /**
     * Sets the value of the smsNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsNotifications(String value) {
        this.smsNotifications = value;
    }

    /**
     * Gets the value of the preCallAnnouncement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCallAnnouncement() {
        return preCallAnnouncement;
    }

    /**
     * Sets the value of the preCallAnnouncement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCallAnnouncement(String value) {
        this.preCallAnnouncement = value;
    }

}

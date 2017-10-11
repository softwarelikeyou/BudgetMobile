//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 03:17:53 PM CST 
//


package com.budgetprepay.webservice.pojos.bequick;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for portInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="portInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mdn" type="{http://www.budgetprepay.com/MVNO/Bequick}mdnType"/>
 *         &lt;element name="authorizedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billing" type="{http://www.budgetprepay.com/MVNO/Bequick}billingType"/>
 *         &lt;element name="oldProvider" type="{http://www.budgetprepay.com/MVNO/Bequick}oldProviderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portInfoType", propOrder = {
    "mdn",
    "authorizedBy",
    "billing",
    "oldProvider"
})
public class PortInfoType {

    @XmlElement(required = true)
    protected String mdn;
    @XmlElement(required = true)
    protected String authorizedBy;
    @XmlElement(required = true)
    protected BillingType billing;
    @XmlElement(required = true)
    protected OldProviderType oldProvider;

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
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link BillingType }
     *     
     */
    public BillingType getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingType }
     *     
     */
    public void setBilling(BillingType value) {
        this.billing = value;
    }

    /**
     * Gets the value of the oldProvider property.
     * 
     * @return
     *     possible object is
     *     {@link OldProviderType }
     *     
     */
    public OldProviderType getOldProvider() {
        return oldProvider;
    }

    /**
     * Sets the value of the oldProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldProviderType }
     *     
     */
    public void setOldProvider(OldProviderType value) {
        this.oldProvider = value;
    }

}

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
 * <p>Java class for bucketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bucketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balanceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bucketValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bucketTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canDelete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bucketType", propOrder = {
    "reTime",
    "balanceValue",
    "sourceId",
    "uom",
    "bucketValue",
    "expTime",
    "sourceValue",
    "bucketTypeID",
    "canUpdate",
    "canDelete"
})
public class BucketType {

    protected String reTime;
    protected String balanceValue;
    protected String sourceId;
    protected String uom;
    protected String bucketValue;
    protected String expTime;
    protected String sourceValue;
    protected String bucketTypeID;
    protected String canUpdate;
    protected String canDelete;

    /**
     * Gets the value of the reTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReTime() {
        return reTime;
    }

    /**
     * Sets the value of the reTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReTime(String value) {
        this.reTime = value;
    }

    /**
     * Gets the value of the balanceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceValue() {
        return balanceValue;
    }

    /**
     * Sets the value of the balanceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceValue(String value) {
        this.balanceValue = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the bucketValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketValue() {
        return bucketValue;
    }

    /**
     * Sets the value of the bucketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketValue(String value) {
        this.bucketValue = value;
    }

    /**
     * Gets the value of the expTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpTime() {
        return expTime;
    }

    /**
     * Sets the value of the expTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpTime(String value) {
        this.expTime = value;
    }

    /**
     * Gets the value of the sourceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceValue() {
        return sourceValue;
    }

    /**
     * Sets the value of the sourceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceValue(String value) {
        this.sourceValue = value;
    }

    /**
     * Gets the value of the bucketTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketTypeID() {
        return bucketTypeID;
    }

    /**
     * Sets the value of the bucketTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketTypeID(String value) {
        this.bucketTypeID = value;
    }

    /**
     * Gets the value of the canUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanUpdate() {
        return canUpdate;
    }

    /**
     * Sets the value of the canUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanUpdate(String value) {
        this.canUpdate = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanDelete(String value) {
        this.canDelete = value;
    }

}

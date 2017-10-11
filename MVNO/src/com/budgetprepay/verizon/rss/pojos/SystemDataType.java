//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketCode" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="regionCode" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="areaName" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="fulfillment" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="databaseID" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="bta" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="msa" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="serviceZipCode" type="{http://www.verizonwireless.com/oas}zipCodeType"/>
 *         &lt;element name="serviceCity" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="serviceState" type="{http://www.verizonwireless.com/oas}stateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemDataType", propOrder = {
    "marketCode",
    "regionCode",
    "areaName",
    "fulfillment",
    "databaseID",
    "bta",
    "msa",
    "serviceZipCode",
    "serviceCity",
    "serviceState"
})
public class SystemDataType {

    protected OasStringType marketCode;
    protected OasStringType regionCode;
    protected OasStringType areaName;
    protected OasStringType fulfillment;
    protected OasStringType databaseID;
    protected OasStringType bta;
    protected OasStringType msa;
    @XmlElement(required = true)
    protected ZipCodeType serviceZipCode;
    protected OasStringType serviceCity;
    protected StateType serviceState;

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMarketCode(OasStringType value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setRegionCode(OasStringType value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setAreaName(OasStringType value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setFulfillment(OasStringType value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the databaseID property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getDatabaseID() {
        return databaseID;
    }

    /**
     * Sets the value of the databaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setDatabaseID(OasStringType value) {
        this.databaseID = value;
    }

    /**
     * Gets the value of the bta property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getBta() {
        return bta;
    }

    /**
     * Sets the value of the bta property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setBta(OasStringType value) {
        this.bta = value;
    }

    /**
     * Gets the value of the msa property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMsa() {
        return msa;
    }

    /**
     * Sets the value of the msa property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMsa(OasStringType value) {
        this.msa = value;
    }

    /**
     * Gets the value of the serviceZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link ZipCodeType }
     *     
     */
    public ZipCodeType getServiceZipCode() {
        return serviceZipCode;
    }

    /**
     * Sets the value of the serviceZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipCodeType }
     *     
     */
    public void setServiceZipCode(ZipCodeType value) {
        this.serviceZipCode = value;
    }

    /**
     * Gets the value of the serviceCity property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getServiceCity() {
        return serviceCity;
    }

    /**
     * Sets the value of the serviceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setServiceCity(OasStringType value) {
        this.serviceCity = value;
    }

    /**
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setServiceState(StateType value) {
        this.serviceState = value;
    }

}

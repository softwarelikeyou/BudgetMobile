//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://www.verizonwireless.com/oas}deviceIdType"/>
 *         &lt;element name="isValid" type="{http://www.verizonwireless.com/oas}yesNoType"/>
 *         &lt;element name="isInDMD" type="{http://www.verizonwireless.com/oas}yesNoType"/>
 *         &lt;element name="isPIBLock" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="isLostOrStolen" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="isEligible4GDevicefor3G" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="isBYOPEligible" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://www.verizonwireless.com/oas}equipmentType" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceResponseType", propOrder = {
    "deviceId",
    "isValid",
    "isInDMD",
    "isPIBLock",
    "isLostOrStolen",
    "isEligible4GDevicefor3G",
    "isBYOPEligible",
    "equipment",
    "returnCode",
    "returnMessage"
})
public class DeviceResponseType {

    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected YesNoType isValid;
    @XmlElement(required = true)
    protected YesNoType isInDMD;
    protected YesNoType isPIBLock;
    protected YesNoType isLostOrStolen;
    protected YesNoType isEligible4GDevicefor3G;
    protected YesNoType isBYOPEligible;
    protected EquipmentType equipment;
    protected String returnCode;
    protected String returnMessage;

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsValid(YesNoType value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the isInDMD property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsInDMD() {
        return isInDMD;
    }

    /**
     * Sets the value of the isInDMD property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsInDMD(YesNoType value) {
        this.isInDMD = value;
    }

    /**
     * Gets the value of the isPIBLock property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsPIBLock() {
        return isPIBLock;
    }

    /**
     * Sets the value of the isPIBLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsPIBLock(YesNoType value) {
        this.isPIBLock = value;
    }

    /**
     * Gets the value of the isLostOrStolen property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsLostOrStolen() {
        return isLostOrStolen;
    }

    /**
     * Sets the value of the isLostOrStolen property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsLostOrStolen(YesNoType value) {
        this.isLostOrStolen = value;
    }

    /**
     * Gets the value of the isEligible4GDevicefor3G property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsEligible4GDevicefor3G() {
        return isEligible4GDevicefor3G;
    }

    /**
     * Sets the value of the isEligible4GDevicefor3G property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsEligible4GDevicefor3G(YesNoType value) {
        this.isEligible4GDevicefor3G = value;
    }

    /**
     * Gets the value of the isBYOPEligible property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getIsBYOPEligible() {
        return isBYOPEligible;
    }

    /**
     * Sets the value of the isBYOPEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setIsBYOPEligible(YesNoType value) {
        this.isBYOPEligible = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipment(EquipmentType value) {
        this.equipment = value;
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
     * Gets the value of the returnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Sets the value of the returnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMessage(String value) {
        this.returnMessage = value;
    }

}

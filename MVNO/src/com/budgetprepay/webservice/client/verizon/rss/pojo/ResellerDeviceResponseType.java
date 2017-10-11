//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:13:08 PM CDT 
//


package com.budgetprepay.webservice.client.verizon.rss.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resellerDeviceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerDeviceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="esn" type="{http://www.verizonwireless.com/oas}esnType"/>
 *           &lt;element name="meid" type="{http://www.verizonwireless.com/oas}meidType"/>
 *           &lt;element name="deviceId" type="{http://www.verizonwireless.com/oas}deviceIdType"/>
 *         &lt;/choice>
 *         &lt;element name="min" type="{http://www.verizonwireless.com/oas}minType" minOccurs="0"/>
 *         &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType" minOccurs="0"/>
 *         &lt;element name="mobileIPAddress" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="iccid" type="{http://www.verizonwireless.com/oas}SIMCardType" minOccurs="0"/>
 *         &lt;element name="iec" type="{http://www.verizonwireless.com/oas}oasString10Type" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.verizonwireless.com/oas}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.verizonwireless.com/oas}planType" minOccurs="0"/>
 *         &lt;element name="equipment" type="{http://www.verizonwireless.com/oas}equipmentType" minOccurs="0"/>
 *         &lt;element name="initialServiceDate" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerDeviceResponseType", propOrder = {
    "returnCode",
    "returnMessage",
    "esn",
    "meid",
    "deviceId",
    "min",
    "mdn",
    "mobileIPAddress",
    "iccid",
    "iec",
    "statusCode",
    "feature",
    "plan",
    "equipment",
    "initialServiceDate"
})
public class ResellerDeviceResponseType {

    @XmlElement(required = true)
    protected String returnCode;
    @XmlElement(required = true)
    protected String returnMessage;
    protected String esn;
    protected String meid;
    protected String deviceId;
    protected String min;
    protected MdnType mdn;
    protected OasStringType mobileIPAddress;
    protected String iccid;
    protected OasString10Type iec;
    protected OasStringType statusCode;
    protected List<FeatureType> feature;
    protected PlanType plan;
    protected EquipmentType equipment;
    protected OasStringType initialServiceDate;

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

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the meid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeid() {
        return meid;
    }

    /**
     * Sets the value of the meid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeid(String value) {
        this.meid = value;
    }

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
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the mdn property.
     * 
     * @return
     *     possible object is
     *     {@link MdnType }
     *     
     */
    public MdnType getMdn() {
        return mdn;
    }

    /**
     * Sets the value of the mdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdnType }
     *     
     */
    public void setMdn(MdnType value) {
        this.mdn = value;
    }

    /**
     * Gets the value of the mobileIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getMobileIPAddress() {
        return mobileIPAddress;
    }

    /**
     * Sets the value of the mobileIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setMobileIPAddress(OasStringType value) {
        this.mobileIPAddress = value;
    }

    /**
     * Gets the value of the iccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Sets the value of the iccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Gets the value of the iec property.
     * 
     * @return
     *     possible object is
     *     {@link OasString10Type }
     *     
     */
    public OasString10Type getIec() {
        return iec;
    }

    /**
     * Sets the value of the iec property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString10Type }
     *     
     */
    public void setIec(OasString10Type value) {
        this.iec = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setStatusCode(OasStringType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeatureType }
     * 
     * 
     */
    public List<FeatureType> getFeature() {
        if (feature == null) {
            feature = new ArrayList<FeatureType>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlan(PlanType value) {
        this.plan = value;
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
     * Gets the value of the initialServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link OasStringType }
     *     
     */
    public OasStringType getInitialServiceDate() {
        return initialServiceDate;
    }

    /**
     * Sets the value of the initialServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasStringType }
     *     
     */
    public void setInitialServiceDate(OasStringType value) {
        this.initialServiceDate = value;
    }

}

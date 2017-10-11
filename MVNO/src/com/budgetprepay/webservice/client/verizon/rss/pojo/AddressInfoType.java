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
 * <p>Java class for addressInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLine" type="{http://www.verizonwireless.com/oas}oasString120Type"/>
 *         &lt;element name="city" type="{http://www.verizonwireless.com/oas}oasString100Type"/>
 *         &lt;element name="state" type="{http://www.verizonwireless.com/oas}stateType"/>
 *         &lt;element name="zip" type="{http://www.verizonwireless.com/oas}zipCodeType"/>
 *         &lt;element name="azimuth" type="{http://www.verizonwireless.com/oas}directionalIndicatorType"/>
 *         &lt;element name="qualification" type="{http://www.verizonwireless.com/oas}qualificationType"/>
 *         &lt;element name="qualificationDesc" type="{http://www.verizonwireless.com/oas}oasString500Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressInfoType", propOrder = {
    "addressLine",
    "city",
    "state",
    "zip",
    "azimuth",
    "qualification",
    "qualificationDesc"
})
public class AddressInfoType {

    @XmlElement(required = true)
    protected OasString120Type addressLine;
    @XmlElement(required = true)
    protected OasString100Type city;
    @XmlElement(required = true)
    protected StateType state;
    @XmlElement(required = true)
    protected ZipCodeType zip;
    @XmlElement(required = true)
    protected DirectionalIndicatorType azimuth;
    @XmlElement(required = true)
    protected String qualification;
    @XmlElement(required = true)
    protected OasString500Type qualificationDesc;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link OasString120Type }
     *     
     */
    public OasString120Type getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString120Type }
     *     
     */
    public void setAddressLine(OasString120Type value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link OasString100Type }
     *     
     */
    public OasString100Type getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString100Type }
     *     
     */
    public void setCity(OasString100Type value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link ZipCodeType }
     *     
     */
    public ZipCodeType getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZipCodeType }
     *     
     */
    public void setZip(ZipCodeType value) {
        this.zip = value;
    }

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionalIndicatorType }
     *     
     */
    public DirectionalIndicatorType getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionalIndicatorType }
     *     
     */
    public void setAzimuth(DirectionalIndicatorType value) {
        this.azimuth = value;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * Sets the value of the qualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualification(String value) {
        this.qualification = value;
    }

    /**
     * Gets the value of the qualificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OasString500Type }
     *     
     */
    public OasString500Type getQualificationDesc() {
        return qualificationDesc;
    }

    /**
     * Sets the value of the qualificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString500Type }
     *     
     */
    public void setQualificationDesc(OasString500Type value) {
        this.qualificationDesc = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lnpNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lnpNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.verizonwireless.com/oas}lnpPersonNameType"/>
 *           &lt;element name="business" type="{http://www.verizonwireless.com/oas}oasString60Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lnpNameType", propOrder = {
    "name",
    "business"
})
public class LnpNameType {

    protected LnpPersonNameType name;
    protected OasString60Type business;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link LnpPersonNameType }
     *     
     */
    public LnpPersonNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnpPersonNameType }
     *     
     */
    public void setName(LnpPersonNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link OasString60Type }
     *     
     */
    public OasString60Type getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link OasString60Type }
     *     
     */
    public void setBusiness(OasString60Type value) {
        this.business = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mdnWithOldMdnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mdnWithOldMdnType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.verizonwireless.com/oas>mdnType">
 *       &lt;attribute name="old" use="required" type="{http://www.verizonwireless.com/oas}mdnSimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mdnWithOldMdnType")
public class MdnWithOldMdnType
    extends MdnType
{

    @XmlAttribute(name = "old", required = true)
    protected String old;

    /**
     * Gets the value of the old property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOld() {
        return old;
    }

    /**
     * Sets the value of the old property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOld(String value) {
        this.old = value;
    }

}

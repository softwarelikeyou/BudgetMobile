//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 06:47:32 PM CST 
//


package com.budgetprepay.verizon.rss.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	        	Note: If an MDN is not supplied then nextAvailableMDN must be supplied.
 * 				In this case we will obtain the MDN from the Enterprise Number
 * 				Inventory pool
 * 	        	using the supplied fields in the nextAvailableMDNType.
 * 				MPNPoolName added in release 2040:
 * 				If the MPNPoolName tag is given in the xml, the feature element
 * 			for MPN static IP or MPN dynamic IP (MPNSIP or MPNDIP) should
 * 			be included in the  features section.
 * 			
 * 
 * <p>Java class for resellerAddSubscriberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resellerAddSubscriberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.verizonwireless.com/oas}resellerSubOrderBaseType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{http://www.verizonwireless.com/oas}minType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="mdn" type="{http://www.verizonwireless.com/oas}mdnType"/>
 *           &lt;element name="nextAvailableMDN" type="{http://www.verizonwireless.com/oas}nextAvailableMDNType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="esn" type="{http://www.verizonwireless.com/oas}esnType"/>
 *           &lt;element name="meid" type="{http://www.verizonwireless.com/oas}meidType"/>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element name="deviceId" type="{http://www.verizonwireless.com/oas}deviceIdType"/>
 *               &lt;element name="iccid" type="{http://www.verizonwireless.com/oas}SIMCardType" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;element name="iccid" type="{http://www.verizonwireless.com/oas}SIMCardType"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element name="mobileIPAddress" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="MPNPoolName" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="SubOrgID" type="{http://www.verizonwireless.com/oas}oasStringType" minOccurs="0"/>
 *         &lt;element name="FUSFExemptFlag" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="globalSIMCard" type="{http://www.verizonwireless.com/oas}globalSIMCardType" minOccurs="0"/>
 *         &lt;element name="portInFlag" type="{http://www.verizonwireless.com/oas}yesNoType" minOccurs="0"/>
 *         &lt;element name="iec" type="{http://www.verizonwireless.com/oas}ldcOrIecType" minOccurs="0"/>
 *         &lt;element name="ldc" type="{http://www.verizonwireless.com/oas}ldcOrIecType" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.verizonwireless.com/oas}featureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plan" type="{http://www.verizonwireless.com/oas}planType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resellerAddSubscriberType", propOrder = {
    "rest"
})
public class ResellerAddSubscriberType
    extends ResellerSubOrderBaseType
{

    @XmlElementRefs({
        @XmlElementRef(name = "feature", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "portInFlag", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FUSFExemptFlag", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deviceId", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SubOrgID", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MPNPoolName", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mdn", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "esn", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mobileIPAddress", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nextAvailableMDN", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ldc", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "min", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "iccid", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "meid", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "iec", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plan", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "globalSIMCard", namespace = "http://www.verizonwireless.com/oas", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Iccid" is used by two different parts of a schema. See: 
     * line 628 of file:/C:/Users/steve.thomas/workspace/MVNO/src/reseller.xsd
     * line 626 of file:/C:/Users/steve.thomas/workspace/MVNO/src/reseller.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link YesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link OasStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OasStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link OasStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link MdnType }{@code >}
     * {@link JAXBElement }{@code <}{@link NextAvailableMDNType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LdcOrIecType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LdcOrIecType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PlanType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}

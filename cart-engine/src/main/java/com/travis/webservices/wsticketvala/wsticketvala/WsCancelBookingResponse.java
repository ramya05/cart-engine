//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:01:03 PM IST 
//


package com.travis.webservices.wsticketvala.wsticketvala;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travis.webservices.WsCancelBookingRS;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsCancelBookingRS" type="{http://travis.com/webservices}wsCancelBookingRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsCancelBookingRS"
})
@XmlRootElement(name = "wsCancelBookingResponse")
public class WsCancelBookingResponse {

    protected WsCancelBookingRS wsCancelBookingRS;

    /**
     * Gets the value of the wsCancelBookingRS property.
     * 
     * @return
     *     possible object is
     *     {@link WsCancelBookingRS }
     *     
     */
    public WsCancelBookingRS getWsCancelBookingRS() {
        return wsCancelBookingRS;
    }

    /**
     * Sets the value of the wsCancelBookingRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCancelBookingRS }
     *     
     */
    public void setWsCancelBookingRS(WsCancelBookingRS value) {
        this.wsCancelBookingRS = value;
    }

}

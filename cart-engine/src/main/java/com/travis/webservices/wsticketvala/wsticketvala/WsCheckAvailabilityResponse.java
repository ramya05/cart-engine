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

import com.mmt.services.product.IResponse;
import com.travis.webservices.WsCheckAvailabilityRS;


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
 *         &lt;element name="wsCheckAvailabilityRS" type="{http://travis.com/webservices}wsCheckAvailabilityRS" minOccurs="0"/>
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
    "wsCheckAvailabilityRS"
})
@XmlRootElement(name = "wsCheckAvailabilityResponse")
public class WsCheckAvailabilityResponse implements IResponse{

    protected WsCheckAvailabilityRS wsCheckAvailabilityRS;

    /**
     * Gets the value of the wsCheckAvailabilityRS property.
     * 
     * @return
     *     possible object is
     *     {@link WsCheckAvailabilityRS }
     *     
     */
    public WsCheckAvailabilityRS getWsCheckAvailabilityRS() {
        return wsCheckAvailabilityRS;
    }

    /**
     * Sets the value of the wsCheckAvailabilityRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCheckAvailabilityRS }
     *     
     */
    public void setWsCheckAvailabilityRS(WsCheckAvailabilityRS value) {
        this.wsCheckAvailabilityRS = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.20 at 10:22:20 AM IST 
//


package com.mmt.car.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="FromCityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ToCityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ServiceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CarId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RateId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TripType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoOfCar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "fromCityId",
    "toCityId",
    "serviceTypeId",
    "carId",
    "vendorId",
    "rateId",
    "tripType",
    "noOfCar",
    "date",
    "month",
    "year",
    "hour",
    "minute",
    "duration"
})
@XmlRootElement(name = "OutstationInventoryRecheckRequest")
public class OutstationInventoryRecheckRequest {

    @XmlElement(name = "FromCityId")
    protected long fromCityId;
    @XmlElement(name = "ToCityId")
    protected long toCityId;
    @XmlElement(name = "ServiceTypeId")
    protected long serviceTypeId;
    @XmlElement(name = "CarId")
    protected long carId;
    @XmlElement(name = "VendorId")
    protected long vendorId;
    @XmlElement(name = "RateId")
    protected long rateId;
    @XmlElement(name = "TripType", required = true)
    protected String tripType;
    @XmlElement(name = "NoOfCar", defaultValue = "01")
    protected int noOfCar;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Month", required = true)
    protected String month;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "Hour", required = true, defaultValue = "10")
    protected String hour;
    @XmlElement(name = "Minute", required = true, defaultValue = "00")
    protected String minute;
    @XmlElement(name = "Duration", defaultValue = "01")
    protected int duration;

    /**
     * Gets the value of the fromCityId property.
     * 
     */
    public long getFromCityId() {
        return fromCityId;
    }

    /**
     * Sets the value of the fromCityId property.
     * 
     */
    public void setFromCityId(long value) {
        this.fromCityId = value;
    }

    /**
     * Gets the value of the toCityId property.
     * 
     */
    public long getToCityId() {
        return toCityId;
    }

    /**
     * Sets the value of the toCityId property.
     * 
     */
    public void setToCityId(long value) {
        this.toCityId = value;
    }

    /**
     * Gets the value of the serviceTypeId property.
     * 
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the value of the serviceTypeId property.
     * 
     */
    public void setServiceTypeId(long value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the value of the carId property.
     * 
     */
    public long getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     */
    public void setCarId(long value) {
        this.carId = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     */
    public long getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     */
    public void setVendorId(long value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the rateId property.
     * 
     */
    public long getRateId() {
        return rateId;
    }

    /**
     * Sets the value of the rateId property.
     * 
     */
    public void setRateId(long value) {
        this.rateId = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripType(String value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the noOfCar property.
     * 
     */
    public int getNoOfCar() {
        return noOfCar;
    }

    /**
     * Sets the value of the noOfCar property.
     * 
     */
    public void setNoOfCar(int value) {
        this.noOfCar = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHour(String value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinute(String value) {
        this.minute = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

}

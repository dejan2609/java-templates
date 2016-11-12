
package com.devalexb.jaxws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for helloWorld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="helloWorld">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="helloWorld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "helloWorld", propOrder = {
    "helloWorld"
})
public class HelloWorld {

    protected String helloWorld;

    /**
     * Gets the value of the helloWorld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelloWorld() {
        return helloWorld;
    }

    /**
     * Sets the value of the helloWorld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelloWorld(String value) {
        this.helloWorld = value;
    }

}

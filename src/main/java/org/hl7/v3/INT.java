//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             Integer numbers (-1,0,1,2, 100, 3398129, etc.) are precise
 *             numbers that are results of counting and enumerating.
 *             Integer numbers are discrete, the set of integers is
 *             infinite but countable.  No arbitrary limit is imposed on
 *             the range of integer numbers. Two NULL flavors are
 *             defined for the positive and negative infinity.
 *          
 * 
 * <p>Java class for INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="INT">
 *   <complexContent>
 *     <extension base="{urn:hl7-org:v3}QTY">
 *       <attribute name="value" type="{urn:hl7-org:v3}int" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INT")
@XmlSeeAlso({
    SXCMINT.class,
    IVXBINT.class,
    POCDMT000040UV02RegionOfInterestValue.class
})
public class INT
    extends QTY
{

    @XmlAttribute(name = "value")
    protected BigInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

}
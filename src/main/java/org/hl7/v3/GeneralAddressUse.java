//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralAddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GeneralAddressUse">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="BAD"/>
 *     <enumeration value="CONF"/>
 *     <enumeration value="H"/>
 *     <enumeration value="HP"/>
 *     <enumeration value="HV"/>
 *     <enumeration value="TMP"/>
 *     <enumeration value="WP"/>
 *     <enumeration value="DIR"/>
 *     <enumeration value="PUB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GeneralAddressUse")
@XmlEnum
public enum GeneralAddressUse {

    BAD,
    CONF,
    H,
    HP,
    HV,
    TMP,
    WP,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static GeneralAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
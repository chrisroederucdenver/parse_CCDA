//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullFlavor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NullFlavor">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ASKU"/>
 *     <enumeration value="DER"/>
 *     <enumeration value="INV"/>
 *     <enumeration value="MSK"/>
 *     <enumeration value="NA"/>
 *     <enumeration value="NASK"/>
 *     <enumeration value="NAV"/>
 *     <enumeration value="NI"/>
 *     <enumeration value="NINF"/>
 *     <enumeration value="OTH"/>
 *     <enumeration value="PINF"/>
 *     <enumeration value="QS"/>
 *     <enumeration value="TRC"/>
 *     <enumeration value="UNC"/>
 *     <enumeration value="UNK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NullFlavor")
@XmlEnum
public enum NullFlavor {

    ASKU,
    DER,
    INV,
    MSK,
    NA,
    NASK,
    NAV,
    NI,
    NINF,
    OTH,
    PINF,
    QS,
    TRC,
    UNC,
    UNK;

    public String value() {
        return name();
    }

    public static NullFlavor fromValue(String v) {
        return valueOf(v);
    }

}

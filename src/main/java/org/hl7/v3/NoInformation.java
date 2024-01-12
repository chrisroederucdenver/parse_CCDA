//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoInformation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NoInformation">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="NI"/>
 *     <enumeration value="INV"/>
 *     <enumeration value="DER"/>
 *     <enumeration value="OTH"/>
 *     <enumeration value="NINF"/>
 *     <enumeration value="PINF"/>
 *     <enumeration value="UNC"/>
 *     <enumeration value="MSK"/>
 *     <enumeration value="NA"/>
 *     <enumeration value="UNK"/>
 *     <enumeration value="ASKU"/>
 *     <enumeration value="NAV"/>
 *     <enumeration value="NASK"/>
 *     <enumeration value="QS"/>
 *     <enumeration value="TRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NoInformation")
@XmlEnum
public enum NoInformation {

    NI,
    INV,
    DER,
    OTH,
    NINF,
    PINF,
    UNC,
    MSK,
    NA,
    UNK,
    ASKU,
    NAV,
    NASK,
    QS,
    TRC;

    public String value() {
        return name();
    }

    public static NoInformation fromValue(String v) {
        return valueOf(v);
    }

}

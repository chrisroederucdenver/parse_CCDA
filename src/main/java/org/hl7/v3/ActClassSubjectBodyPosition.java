//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClassSubjectBodyPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActClassSubjectBodyPosition">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="LLD"/>
 *     <enumeration value="PRN"/>
 *     <enumeration value="RLD"/>
 *     <enumeration value="SFWL"/>
 *     <enumeration value="SIT"/>
 *     <enumeration value="STN"/>
 *     <enumeration value="SUP"/>
 *     <enumeration value="RTRD"/>
 *     <enumeration value="TRD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActClassSubjectBodyPosition")
@XmlEnum
public enum ActClassSubjectBodyPosition {

    LLD,
    PRN,
    RLD,
    SFWL,
    SIT,
    STN,
    SUP,
    RTRD,
    TRD;

    public String value() {
        return name();
    }

    public static ActClassSubjectBodyPosition fromValue(String v) {
        return valueOf(v);
    }

}

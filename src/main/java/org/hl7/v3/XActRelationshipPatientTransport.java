//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActRelationshipPatientTransport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ActRelationshipPatientTransport">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ARR"/>
 *     <enumeration value="DEP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPatientTransport")
@XmlEnum
public enum XActRelationshipPatientTransport {

    ARR,
    DEP;

    public String value() {
        return name();
    }

    public static XActRelationshipPatientTransport fromValue(String v) {
        return valueOf(v);
    }

}

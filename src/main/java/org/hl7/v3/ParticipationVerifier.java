//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationVerifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ParticipationVerifier">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="VRF"/>
 *     <enumeration value="AUTHEN"/>
 *     <enumeration value="LA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParticipationVerifier")
@XmlEnum
public enum ParticipationVerifier {

    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationVerifier fromValue(String v) {
        return valueOf(v);
    }

}
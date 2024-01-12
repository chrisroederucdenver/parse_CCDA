//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_OrganizationNamePartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_OrganizationNamePartType">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="DEL"/>
 *     <enumeration value="PFX"/>
 *     <enumeration value="SFX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_OrganizationNamePartType")
@XmlEnum
public enum XOrganizationNamePartType {

    DEL,
    PFX,
    SFX;

    public String value() {
        return name();
    }

    public static XOrganizationNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
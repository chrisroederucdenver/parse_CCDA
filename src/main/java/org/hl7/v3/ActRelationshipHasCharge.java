//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipHasCharge.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActRelationshipHasCharge">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="CHRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActRelationshipHasCharge")
@XmlEnum
public enum ActRelationshipHasCharge {

    CHRG;

    public String value() {
        return name();
    }

    public static ActRelationshipHasCharge fromValue(String v) {
        return valueOf(v);
    }

}
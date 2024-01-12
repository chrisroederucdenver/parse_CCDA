//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipAdjunctMitigation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActRelationshipAdjunctMitigation">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="MTGT.ADJ"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActRelationshipAdjunctMitigation")
@XmlEnum
public enum ActRelationshipAdjunctMitigation {

    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ");
    private final String value;

    ActRelationshipAdjunctMitigation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipAdjunctMitigation fromValue(String v) {
        for (ActRelationshipAdjunctMitigation c: ActRelationshipAdjunctMitigation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

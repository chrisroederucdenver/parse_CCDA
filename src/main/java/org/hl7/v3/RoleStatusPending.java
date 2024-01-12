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
 * <p>Java class for RoleStatusPending.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoleStatusPending">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="pending"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoleStatusPending")
@XmlEnum
public enum RoleStatusPending {

    @XmlEnumValue("pending")
    PENDING("pending");
    private final String value;

    RoleStatusPending(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleStatusPending fromValue(String v) {
        for (RoleStatusPending c: RoleStatusPending.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

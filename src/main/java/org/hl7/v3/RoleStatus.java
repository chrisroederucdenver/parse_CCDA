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
 * <p>Java class for RoleStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoleStatus">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="active"/>
 *     <enumeration value="cancelled"/>
 *     <enumeration value="normal"/>
 *     <enumeration value="nullified"/>
 *     <enumeration value="pending"/>
 *     <enumeration value="suspended"/>
 *     <enumeration value="terminated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoleStatus")
@XmlEnum
public enum RoleStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("nullified")
    NULLIFIED("nullified"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("terminated")
    TERMINATED("terminated");
    private final String value;

    RoleStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleStatus fromValue(String v) {
        for (RoleStatus c: RoleStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
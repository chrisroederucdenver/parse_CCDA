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
 * <p>Java class for x_ActStatusActiveSuspended.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ActStatusActiveSuspended">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="active"/>
 *     <enumeration value="suspended"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ActStatusActiveSuspended")
@XmlEnum
public enum XActStatusActiveSuspended {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    XActStatusActiveSuspended(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XActStatusActiveSuspended fromValue(String v) {
        for (XActStatusActiveSuspended c: XActStatusActiveSuspended.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

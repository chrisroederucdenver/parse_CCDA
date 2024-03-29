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
 * <p>Java class for ActStatusAbortedCancelledCompleted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActStatusAbortedCancelledCompleted">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="aborted"/>
 *     <enumeration value="cancelled"/>
 *     <enumeration value="completed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActStatusAbortedCancelledCompleted")
@XmlEnum
public enum ActStatusAbortedCancelledCompleted {

    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    ActStatusAbortedCancelledCompleted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActStatusAbortedCancelledCompleted fromValue(String v) {
        for (ActStatusAbortedCancelledCompleted c: ActStatusAbortedCancelledCompleted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

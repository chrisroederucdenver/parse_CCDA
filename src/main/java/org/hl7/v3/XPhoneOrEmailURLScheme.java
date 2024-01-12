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
 * <p>Java class for x_PhoneOrEmailURLScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_PhoneOrEmailURLScheme">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="mailto"/>
 *     <enumeration value="tel"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_PhoneOrEmailURLScheme")
@XmlEnum
public enum XPhoneOrEmailURLScheme {

    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    @XmlEnumValue("tel")
    TEL("tel");
    private final String value;

    XPhoneOrEmailURLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPhoneOrEmailURLScheme fromValue(String v) {
        for (XPhoneOrEmailURLScheme c: XPhoneOrEmailURLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
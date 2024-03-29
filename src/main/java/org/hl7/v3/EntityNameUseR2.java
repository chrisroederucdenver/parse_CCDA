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
 * <p>Java class for EntityNameUseR2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EntityNameUseR2">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="A"/>
 *     <enumeration value="ABC"/>
 *     <enumeration value="ANON"/>
 *     <enumeration value="Assumed"/>
 *     <enumeration value="DN"/>
 *     <enumeration value="I"/>
 *     <enumeration value="IDE"/>
 *     <enumeration value="M"/>
 *     <enumeration value="N"/>
 *     <enumeration value="NameRepresentationUse"/>
 *     <enumeration value="OLD"/>
 *     <enumeration value="OR"/>
 *     <enumeration value="P"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="R"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="SYL"/>
 *     <enumeration value="T"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntityNameUseR2")
@XmlEnum
public enum EntityNameUseR2 {

    A("A"),
    ABC("ABC"),
    ANON("ANON"),
    @XmlEnumValue("Assumed")
    ASSUMED("Assumed"),
    DN("DN"),
    I("I"),
    IDE("IDE"),
    M("M"),
    N("N"),
    @XmlEnumValue("NameRepresentationUse")
    NAME_REPRESENTATION_USE("NameRepresentationUse"),
    OLD("OLD"),
    OR("OR"),
    P("P"),
    PHON("PHON"),
    R("R"),
    SRCH("SRCH"),
    SYL("SYL"),
    T("T");
    private final String value;

    EntityNameUseR2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityNameUseR2 fromValue(String v) {
        for (EntityNameUseR2 c: EntityNameUseR2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityClassAnimal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EntityClassAnimal">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ANM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntityClassAnimal")
@XmlEnum
public enum EntityClassAnimal {

    ANM;

    public String value() {
        return name();
    }

    public static EntityClassAnimal fromValue(String v) {
        return valueOf(v);
    }

}

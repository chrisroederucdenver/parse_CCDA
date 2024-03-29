//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityClassMaterial.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EntityClassMaterial">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="MAT"/>
 *     <enumeration value="CHEM"/>
 *     <enumeration value="FOOD"/>
 *     <enumeration value="MMAT"/>
 *     <enumeration value="CONT"/>
 *     <enumeration value="HOLD"/>
 *     <enumeration value="DEV"/>
 *     <enumeration value="CER"/>
 *     <enumeration value="MODDV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntityClassMaterial")
@XmlEnum
public enum EntityClassMaterial {

    MAT,
    CHEM,
    FOOD,
    MMAT,
    CONT,
    HOLD,
    DEV,
    CER,
    MODDV;

    public String value() {
        return name();
    }

    public static EntityClassMaterial fromValue(String v) {
        return valueOf(v);
    }

}

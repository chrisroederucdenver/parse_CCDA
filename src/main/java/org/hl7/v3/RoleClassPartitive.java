//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassPartitive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoleClassPartitive">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="CONT"/>
 *     <enumeration value="EXPAGTCAR"/>
 *     <enumeration value="EXPVECTOR"/>
 *     <enumeration value="FOMITE"/>
 *     <enumeration value="INGR"/>
 *     <enumeration value="ACTI"/>
 *     <enumeration value="ACTIB"/>
 *     <enumeration value="ACTIM"/>
 *     <enumeration value="ACTIR"/>
 *     <enumeration value="ADJV"/>
 *     <enumeration value="ADTV"/>
 *     <enumeration value="BASE"/>
 *     <enumeration value="IACT"/>
 *     <enumeration value="COLR"/>
 *     <enumeration value="FLVR"/>
 *     <enumeration value="PRSV"/>
 *     <enumeration value="STBL"/>
 *     <enumeration value="MECH"/>
 *     <enumeration value="LOCE"/>
 *     <enumeration value="STOR"/>
 *     <enumeration value="MBR"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="ACTM"/>
 *     <enumeration value="SPEC"/>
 *     <enumeration value="ALQT"/>
 *     <enumeration value="ISLT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoleClassPartitive")
@XmlEnum
public enum RoleClassPartitive {

    CONT,
    EXPAGTCAR,
    EXPVECTOR,
    FOMITE,
    INGR,
    ACTI,
    ACTIB,
    ACTIM,
    ACTIR,
    ADJV,
    ADTV,
    BASE,
    IACT,
    COLR,
    FLVR,
    PRSV,
    STBL,
    MECH,
    LOCE,
    STOR,
    MBR,
    PART,
    ACTM,
    SPEC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClassPartitive fromValue(String v) {
        return valueOf(v);
    }

}

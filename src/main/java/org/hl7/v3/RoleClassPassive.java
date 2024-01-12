//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassPassive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RoleClassPassive">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ACCESS"/>
 *     <enumeration value="ADJY"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="CONY"/>
 *     <enumeration value="ADMM"/>
 *     <enumeration value="BIRTHPL"/>
 *     <enumeration value="DEATHPLC"/>
 *     <enumeration value="DST"/>
 *     <enumeration value="RET"/>
 *     <enumeration value="EXPR"/>
 *     <enumeration value="HLD"/>
 *     <enumeration value="HLTHCHRT"/>
 *     <enumeration value="IDENT"/>
 *     <enumeration value="MANU"/>
 *     <enumeration value="THER"/>
 *     <enumeration value="MNT"/>
 *     <enumeration value="OWN"/>
 *     <enumeration value="RGPR"/>
 *     <enumeration value="SDLOC"/>
 *     <enumeration value="DSDLOC"/>
 *     <enumeration value="ISDLOC"/>
 *     <enumeration value="TERR"/>
 *     <enumeration value="USED"/>
 *     <enumeration value="WRTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoleClassPassive")
@XmlEnum
public enum RoleClassPassive {

    ACCESS,
    ADJY,
    CONC,
    BOND,
    CONY,
    ADMM,
    BIRTHPL,
    DEATHPLC,
    DST,
    RET,
    EXPR,
    HLD,
    HLTHCHRT,
    IDENT,
    MANU,
    THER,
    MNT,
    OWN,
    RGPR,
    SDLOC,
    DSDLOC,
    ISDLOC,
    TERR,
    USED,
    WRTE;

    public String value() {
        return name();
    }

    public static RoleClassPassive fromValue(String v) {
        return valueOf(v);
    }

}

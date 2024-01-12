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
 * <p>Java class for x_ClinicalStatementProcedureMood.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ClinicalStatementProcedureMood">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="APT"/>
 *     <enumeration value="ARQ"/>
 *     <enumeration value="CRT"/>
 *     <enumeration value="DEF"/>
 *     <enumeration value="EVN"/>
 *     <enumeration value="EVN.CRT"/>
 *     <enumeration value="INT"/>
 *     <enumeration value="PRMS"/>
 *     <enumeration value="PRP"/>
 *     <enumeration value="RQO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ClinicalStatementProcedureMood")
@XmlEnum
public enum XClinicalStatementProcedureMood {

    APT("APT"),
    ARQ("ARQ"),
    CRT("CRT"),
    DEF("DEF"),
    EVN("EVN"),
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    INT("INT"),
    PRMS("PRMS"),
    PRP("PRP"),
    RQO("RQO");
    private final String value;

    XClinicalStatementProcedureMood(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XClinicalStatementProcedureMood fromValue(String v) {
        for (XClinicalStatementProcedureMood c: XClinicalStatementProcedureMood.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ClinicalStatementActMood.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ClinicalStatementActMood">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="APT"/>
 *     <enumeration value="ARQ"/>
 *     <enumeration value="DEF"/>
 *     <enumeration value="EVN"/>
 *     <enumeration value="INT"/>
 *     <enumeration value="PRMS"/>
 *     <enumeration value="PRP"/>
 *     <enumeration value="RQO"/>
 *     <enumeration value="RSK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ClinicalStatementActMood")
@XmlEnum
public enum XClinicalStatementActMood {

    APT,
    ARQ,
    DEF,
    EVN,
    INT,
    PRMS,
    PRP,
    RQO,
    RSK;

    public String value() {
        return name();
    }

    public static XClinicalStatementActMood fromValue(String v) {
        return valueOf(v);
    }

}

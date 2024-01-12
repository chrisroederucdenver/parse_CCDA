//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AddressPartType">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ADL"/>
 *     <enumeration value="AL"/>
 *     <enumeration value="BNN"/>
 *     <enumeration value="BNR"/>
 *     <enumeration value="BNS"/>
 *     <enumeration value="CAR"/>
 *     <enumeration value="CEN"/>
 *     <enumeration value="CNT"/>
 *     <enumeration value="CPA"/>
 *     <enumeration value="CTY"/>
 *     <enumeration value="DAL"/>
 *     <enumeration value="DEL"/>
 *     <enumeration value="DINST"/>
 *     <enumeration value="DINSTA"/>
 *     <enumeration value="DINSTQ"/>
 *     <enumeration value="DIR"/>
 *     <enumeration value="DMOD"/>
 *     <enumeration value="DMODID"/>
 *     <enumeration value="INT"/>
 *     <enumeration value="POB"/>
 *     <enumeration value="PRE"/>
 *     <enumeration value="SAL"/>
 *     <enumeration value="STA"/>
 *     <enumeration value="STB"/>
 *     <enumeration value="STR"/>
 *     <enumeration value="STTYP"/>
 *     <enumeration value="UNID"/>
 *     <enumeration value="UNIT"/>
 *     <enumeration value="ZIP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AddressPartType")
@XmlEnum
public enum AddressPartType {

    ADL,
    AL,
    BNN,
    BNR,
    BNS,
    CAR,
    CEN,
    CNT,
    CPA,
    CTY,
    DAL,
    DEL,
    DINST,
    DINSTA,
    DINSTQ,
    DIR,
    DMOD,
    DMODID,
    INT,
    POB,
    PRE,
    SAL,
    STA,
    STB,
    STR,
    STTYP,
    UNID,
    UNIT,
    ZIP;

    public String value() {
        return name();
    }

    public static AddressPartType fromValue(String v) {
        return valueOf(v);
    }

}

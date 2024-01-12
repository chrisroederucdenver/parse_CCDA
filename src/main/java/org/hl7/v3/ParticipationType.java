//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ParticipationType">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ADM"/>
 *     <enumeration value="ALY"/>
 *     <enumeration value="ATND"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="AUTHEN"/>
 *     <enumeration value="BBY"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="CAGNT"/>
 *     <enumeration value="CALLBCK"/>
 *     <enumeration value="CAT"/>
 *     <enumeration value="CON"/>
 *     <enumeration value="COV"/>
 *     <enumeration value="CSM"/>
 *     <enumeration value="CST"/>
 *     <enumeration value="DEV"/>
 *     <enumeration value="DIR"/>
 *     <enumeration value="DIS"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="DON"/>
 *     <enumeration value="DST"/>
 *     <enumeration value="ELOC"/>
 *     <enumeration value="ENT"/>
 *     <enumeration value="ESC"/>
 *     <enumeration value="EXPAGNT"/>
 *     <enumeration value="EXPART"/>
 *     <enumeration value="EXPTRGT"/>
 *     <enumeration value="EXSRC"/>
 *     <enumeration value="GUAR"/>
 *     <enumeration value="HLD"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="INF"/>
 *     <enumeration value="IRCP"/>
 *     <enumeration value="LA"/>
 *     <enumeration value="LOC"/>
 *     <enumeration value="NOT"/>
 *     <enumeration value="NRD"/>
 *     <enumeration value="ORG"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PPRF"/>
 *     <enumeration value="PRCP"/>
 *     <enumeration value="PRD"/>
 *     <enumeration value="PRF"/>
 *     <enumeration value="RCT"/>
 *     <enumeration value="RCV"/>
 *     <enumeration value="RDV"/>
 *     <enumeration value="REF"/>
 *     <enumeration value="REFB"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="RESP"/>
 *     <enumeration value="RML"/>
 *     <enumeration value="SBJ"/>
 *     <enumeration value="SPC"/>
 *     <enumeration value="SPRF"/>
 *     <enumeration value="TRANS"/>
 *     <enumeration value="TRC"/>
 *     <enumeration value="VIA"/>
 *     <enumeration value="VRF"/>
 *     <enumeration value="WIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParticipationType")
@XmlEnum
public enum ParticipationType {

    ADM,
    ALY,
    ATND,
    AUT,
    AUTHEN,
    BBY,
    BEN,
    CAGNT,
    CALLBCK,
    CAT,
    CON,
    COV,
    CSM,
    CST,
    DEV,
    DIR,
    DIS,
    DIST,
    DON,
    DST,
    ELOC,
    ENT,
    ESC,
    EXPAGNT,
    EXPART,
    EXPTRGT,
    EXSRC,
    GUAR,
    HLD,
    IND,
    INF,
    IRCP,
    LA,
    LOC,
    NOT,
    NRD,
    ORG,
    PART,
    PPRF,
    PRCP,
    PRD,
    PRF,
    RCT,
    RCV,
    RDV,
    REF,
    REFB,
    REFT,
    RESP,
    RML,
    SBJ,
    SPC,
    SPRF,
    TRANS,
    TRC,
    VIA,
    VRF,
    WIT;

    public String value() {
        return name();
    }

    public static ParticipationType fromValue(String v) {
        return valueOf(v);
    }

}

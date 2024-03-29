//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationParticipation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ParticipationParticipation">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="PART"/>
 *     <enumeration value="ADM"/>
 *     <enumeration value="ATND"/>
 *     <enumeration value="CALLBCK"/>
 *     <enumeration value="CON"/>
 *     <enumeration value="DIS"/>
 *     <enumeration value="ESC"/>
 *     <enumeration value="REF"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="INF"/>
 *     <enumeration value="TRANS"/>
 *     <enumeration value="ENT"/>
 *     <enumeration value="WIT"/>
 *     <enumeration value="CST"/>
 *     <enumeration value="DIR"/>
 *     <enumeration value="ALY"/>
 *     <enumeration value="BBY"/>
 *     <enumeration value="CAT"/>
 *     <enumeration value="CSM"/>
 *     <enumeration value="DEV"/>
 *     <enumeration value="NRD"/>
 *     <enumeration value="RDV"/>
 *     <enumeration value="DON"/>
 *     <enumeration value="EXPAGNT"/>
 *     <enumeration value="EXPART"/>
 *     <enumeration value="EXPTRGT"/>
 *     <enumeration value="EXSRC"/>
 *     <enumeration value="PRD"/>
 *     <enumeration value="SBJ"/>
 *     <enumeration value="SPC"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="CAGNT"/>
 *     <enumeration value="COV"/>
 *     <enumeration value="GUAR"/>
 *     <enumeration value="HLD"/>
 *     <enumeration value="RCT"/>
 *     <enumeration value="RCV"/>
 *     <enumeration value="IRCP"/>
 *     <enumeration value="NOT"/>
 *     <enumeration value="PRCP"/>
 *     <enumeration value="REFB"/>
 *     <enumeration value="REFT"/>
 *     <enumeration value="TRC"/>
 *     <enumeration value="LOC"/>
 *     <enumeration value="DST"/>
 *     <enumeration value="ELOC"/>
 *     <enumeration value="ORG"/>
 *     <enumeration value="RML"/>
 *     <enumeration value="VIA"/>
 *     <enumeration value="PRF"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="PPRF"/>
 *     <enumeration value="SPRF"/>
 *     <enumeration value="RESP"/>
 *     <enumeration value="VRF"/>
 *     <enumeration value="AUTHEN"/>
 *     <enumeration value="LA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParticipationParticipation")
@XmlEnum
public enum ParticipationParticipation {

    PART,
    ADM,
    ATND,
    CALLBCK,
    CON,
    DIS,
    ESC,
    REF,
    AUT,
    INF,
    TRANS,
    ENT,
    WIT,
    CST,
    DIR,
    ALY,
    BBY,
    CAT,
    CSM,
    DEV,
    NRD,
    RDV,
    DON,
    EXPAGNT,
    EXPART,
    EXPTRGT,
    EXSRC,
    PRD,
    SBJ,
    SPC,
    IND,
    BEN,
    CAGNT,
    COV,
    GUAR,
    HLD,
    RCT,
    RCV,
    IRCP,
    NOT,
    PRCP,
    REFB,
    REFT,
    TRC,
    LOC,
    DST,
    ELOC,
    ORG,
    RML,
    VIA,
    PRF,
    DIST,
    PPRF,
    SPRF,
    RESP,
    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationParticipation fromValue(String v) {
        return valueOf(v);
    }

}

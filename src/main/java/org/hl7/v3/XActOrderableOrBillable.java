//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActOrderableOrBillable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ActOrderableOrBillable">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ACCM"/>
 *     <enumeration value="ALRT"/>
 *     <enumeration value="BATTERY"/>
 *     <enumeration value="CASE"/>
 *     <enumeration value="CLNTRL"/>
 *     <enumeration value="CNOD"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DETPOL"/>
 *     <enumeration value="DGIMG"/>
 *     <enumeration value="ENC"/>
 *     <enumeration value="EXP"/>
 *     <enumeration value="GEN"/>
 *     <enumeration value="INVSTG"/>
 *     <enumeration value="LLD"/>
 *     <enumeration value="LOC"/>
 *     <enumeration value="OBS"/>
 *     <enumeration value="OBSCOR"/>
 *     <enumeration value="OBSSER"/>
 *     <enumeration value="OUTB"/>
 *     <enumeration value="PCPR"/>
 *     <enumeration value="PHN"/>
 *     <enumeration value="POL"/>
 *     <enumeration value="POS"/>
 *     <enumeration value="POSACC"/>
 *     <enumeration value="POSCOORD"/>
 *     <enumeration value="PRN"/>
 *     <enumeration value="PROC"/>
 *     <enumeration value="RLD"/>
 *     <enumeration value="ROIBND"/>
 *     <enumeration value="ROIOVL"/>
 *     <enumeration value="RTRD"/>
 *     <enumeration value="SBADM"/>
 *     <enumeration value="SBEXT"/>
 *     <enumeration value="SEQ"/>
 *     <enumeration value="SEQVAR"/>
 *     <enumeration value="SFWL"/>
 *     <enumeration value="SIT"/>
 *     <enumeration value="SPCOBS"/>
 *     <enumeration value="SPECCOLLECT"/>
 *     <enumeration value="STN"/>
 *     <enumeration value="SUP"/>
 *     <enumeration value="TRD"/>
 *     <enumeration value="TRNS"/>
 *     <enumeration value="VERIF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ActOrderableOrBillable")
@XmlEnum
public enum XActOrderableOrBillable {

    ACCM,
    ALRT,
    BATTERY,
    CASE,
    CLNTRL,
    CNOD,
    CONC,
    COND,
    DETPOL,
    DGIMG,
    ENC,
    EXP,
    GEN,
    INVSTG,
    LLD,
    LOC,
    OBS,
    OBSCOR,
    OBSSER,
    OUTB,
    PCPR,
    PHN,
    POL,
    POS,
    POSACC,
    POSCOORD,
    PRN,
    PROC,
    RLD,
    ROIBND,
    ROIOVL,
    RTRD,
    SBADM,
    SBEXT,
    SEQ,
    SEQVAR,
    SFWL,
    SIT,
    SPCOBS,
    SPECCOLLECT,
    STN,
    SUP,
    TRD,
    TRNS,
    VERIF;

    public String value() {
        return name();
    }

    public static XActOrderableOrBillable fromValue(String v) {
        return valueOf(v);
    }

}
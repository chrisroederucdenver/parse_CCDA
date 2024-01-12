//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActClassDocumentEntryAct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="x_ActClassDocumentEntryAct">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="ACCM"/>
 *     <enumeration value="ACSN"/>
 *     <enumeration value="ACT"/>
 *     <enumeration value="AEXPOS"/>
 *     <enumeration value="CONS"/>
 *     <enumeration value="CONTREG"/>
 *     <enumeration value="CTTEVENT"/>
 *     <enumeration value="DISPACT"/>
 *     <enumeration value="EXPOS"/>
 *     <enumeration value="INC"/>
 *     <enumeration value="INFRM"/>
 *     <enumeration value="LIST"/>
 *     <enumeration value="MPROT"/>
 *     <enumeration value="PCPR"/>
 *     <enumeration value="REG"/>
 *     <enumeration value="REV"/>
 *     <enumeration value="SPCTRT"/>
 *     <enumeration value="STORE"/>
 *     <enumeration value="TEXPOS"/>
 *     <enumeration value="TRFR"/>
 *     <enumeration value="TRNS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryAct")
@XmlEnum
public enum XActClassDocumentEntryAct {

    ACCM,
    ACSN,
    ACT,
    AEXPOS,
    CONS,
    CONTREG,
    CTTEVENT,
    DISPACT,
    EXPOS,
    INC,
    INFRM,
    LIST,
    MPROT,
    PCPR,
    REG,
    REV,
    SPCTRT,
    STORE,
    TEXPOS,
    TRFR,
    TRNS;

    public String value() {
        return name();
    }

    public static XActClassDocumentEntryAct fromValue(String v) {
        return valueOf(v);
    }

}
//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimingEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TimingEvent">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="AC"/>
 *     <enumeration value="ACD"/>
 *     <enumeration value="ACM"/>
 *     <enumeration value="ACV"/>
 *     <enumeration value="C"/>
 *     <enumeration value="CD"/>
 *     <enumeration value="CM"/>
 *     <enumeration value="CV"/>
 *     <enumeration value="HS"/>
 *     <enumeration value="IC"/>
 *     <enumeration value="ICD"/>
 *     <enumeration value="ICM"/>
 *     <enumeration value="ICV"/>
 *     <enumeration value="PC"/>
 *     <enumeration value="PCD"/>
 *     <enumeration value="PCM"/>
 *     <enumeration value="PCV"/>
 *     <enumeration value="WAKE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TimingEvent")
@XmlEnum
public enum TimingEvent {

    AC,
    ACD,
    ACM,
    ACV,
    C,
    CD,
    CM,
    CV,
    HS,
    IC,
    ICD,
    ICM,
    ICV,
    PC,
    PCD,
    PCM,
    PCV,
    WAKE;

    public String value() {
        return name();
    }

    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}
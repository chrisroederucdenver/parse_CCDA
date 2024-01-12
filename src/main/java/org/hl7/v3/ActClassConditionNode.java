//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClassConditionNode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActClassConditionNode">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="CNOD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActClassConditionNode")
@XmlEnum
public enum ActClassConditionNode {

    CNOD;

    public String value() {
        return name();
    }

    public static ActClassConditionNode fromValue(String v) {
        return valueOf(v);
    }

}
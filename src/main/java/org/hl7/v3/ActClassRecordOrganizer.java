//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClassRecordOrganizer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ActClassRecordOrganizer">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="COMPOSITION"/>
 *     <enumeration value="DOC"/>
 *     <enumeration value="DOCCLIN"/>
 *     <enumeration value="CDALVLONE"/>
 *     <enumeration value="CONTAINER"/>
 *     <enumeration value="CATEGORY"/>
 *     <enumeration value="DOCBODY"/>
 *     <enumeration value="DOCSECT"/>
 *     <enumeration value="TOPIC"/>
 *     <enumeration value="EXTRACT"/>
 *     <enumeration value="EHR"/>
 *     <enumeration value="FOLDER"/>
 *     <enumeration value="GROUPER"/>
 *     <enumeration value="CLUSTER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActClassRecordOrganizer")
@XmlEnum
public enum ActClassRecordOrganizer {

    COMPOSITION,
    DOC,
    DOCCLIN,
    CDALVLONE,
    CONTAINER,
    CATEGORY,
    DOCBODY,
    DOCSECT,
    TOPIC,
    EXTRACT,
    EHR,
    FOLDER,
    GROUPER,
    CLUSTER;

    public String value() {
        return name();
    }

    public static ActClassRecordOrganizer fromValue(String v) {
        return valueOf(v);
    }

}
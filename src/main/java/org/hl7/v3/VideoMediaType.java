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
 * <p>Java class for VideoMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="VideoMediaType">
 *   <restriction base="{urn:hl7-org:v3}cs">
 *     <enumeration value="video/mpeg"/>
 *     <enumeration value="video/x-avi"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VideoMediaType")
@XmlEnum
public enum VideoMediaType {

    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),
    @XmlEnumValue("video/x-avi")
    VIDEO_X_AVI("video/x-avi");
    private final String value;

    VideoMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoMediaType fromValue(String v) {
        for (VideoMediaType c: VideoMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

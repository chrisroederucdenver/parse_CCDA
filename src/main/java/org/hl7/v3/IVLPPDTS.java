//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_PPD_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IVL_PPD_TS">
 *   <complexContent>
 *     <extension base="{urn:hl7-org:v3}SXCM_PPD_TS">
 *       <choice minOccurs="0">
 *         <sequence>
 *           <element name="low" type="{urn:hl7-org:v3}IVXB_PPD_TS"/>
 *           <choice minOccurs="0">
 *             <element name="width" type="{urn:hl7-org:v3}PPD_PQ" minOccurs="0"/>
 *             <element name="high" type="{urn:hl7-org:v3}IVXB_PPD_TS" minOccurs="0"/>
 *           </choice>
 *         </sequence>
 *         <element name="high" type="{urn:hl7-org:v3}IVXB_PPD_TS"/>
 *         <sequence>
 *           <element name="width" type="{urn:hl7-org:v3}PPD_PQ"/>
 *           <element name="high" type="{urn:hl7-org:v3}IVXB_PPD_TS" minOccurs="0"/>
 *         </sequence>
 *         <sequence>
 *           <element name="center" type="{urn:hl7-org:v3}PPD_TS"/>
 *           <element name="width" type="{urn:hl7-org:v3}PPD_PQ" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_PPD_TS", propOrder = {
    "rest"
})
public class IVLPPDTS
    extends SXCMPPDTS
{

    @XmlElementRefs({
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends QTY>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "High" is used by two different parts of a schema. See: 
     * line 519 of file:/Users/roederc/work/git_clad/parse_CCDA/src/main/resources/coreschemas/datatypes.xsd
     * line 510 of file:/Users/roederc/work/git_clad/parse_CCDA/src/main/resources/coreschemas/datatypes.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names:Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}
     * {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}
     * {@link JAXBElement }{@code <}{@link PPDTS }{@code >}
     * 
     * 
     * @return
     *     The value of the rest property.
     */
    public List<JAXBElement<? extends QTY>> getRest() {
        if (rest == null) {
            rest = new ArrayList<>();
        }
        return this.rest;
    }

}

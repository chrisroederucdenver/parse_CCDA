//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SXPR_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SXPR_TS">
 *   <complexContent>
 *     <extension base="{urn:hl7-org:v3}SXCM_TS">
 *       <sequence>
 *         <element name="comp" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="2"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXPR_TS", propOrder = {
    "comp"
})
public class SXPRTS
    extends SXCMTS
{

    @XmlElement(required = true)
    protected List<SXCMTS> comp;

    /**
     * Gets the value of the comp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     * @return
     *     The value of the comp property.
     */
    public List<SXCMTS> getComp() {
        if (comp == null) {
            comp = new ArrayList<>();
        }
        return this.comp;
    }

}

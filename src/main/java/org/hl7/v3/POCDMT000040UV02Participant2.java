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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040UV02.Participant2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="POCD_MT000040UV02.Participant2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040UV02.InfrastructureRoot.typeId" minOccurs="0"/>
 *         <element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="functionCode" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *         <element name="time" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         <element name="associatedEntity" type="{urn:hl7-org:v3}POCD_MT000040UV02.AssociatedEntity"/>
 *       </sequence>
 *       <attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       <attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       <attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationType" />
 *       <attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" fixed="OP" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040UV02.Participant2", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "functionCode",
    "time",
    "associatedEntity"
})
public class POCDMT000040UV02Participant2 {

    protected List<CS> realmCode;
    protected POCDMT000040UV02InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    protected CD functionCode;
    protected IVLTS time;
    @XmlElement(required = true)
    protected POCDMT000040UV02AssociatedEntity associatedEntity;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected ParticipationType typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected ContextControl contextControlCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     * @return
     *     The value of the realmCode property.
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02InfrastructureRootTypeId }
     *     
     */
    public POCDMT000040UV02InfrastructureRootTypeId getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02InfrastructureRootTypeId }
     *     
     */
    public void setTypeId(POCDMT000040UV02InfrastructureRootTypeId value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     * @return
     *     The value of the templateId property.
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the functionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getFunctionCode() {
        return functionCode;
    }

    /**
     * Sets the value of the functionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setFunctionCode(CD value) {
        this.functionCode = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setTime(IVLTS value) {
        this.time = value;
    }

    /**
     * Gets the value of the associatedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02AssociatedEntity }
     *     
     */
    public POCDMT000040UV02AssociatedEntity getAssociatedEntity() {
        return associatedEntity;
    }

    /**
     * Sets the value of the associatedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02AssociatedEntity }
     *     
     */
    public void setAssociatedEntity(POCDMT000040UV02AssociatedEntity value) {
        this.associatedEntity = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavor }
     *     
     */
    public NullFlavor getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavor }
     *     
     */
    public void setNullFlavor(NullFlavor value) {
        this.nullFlavor = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationType }
     *     
     */
    public ParticipationType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationType }
     *     
     */
    public void setTypeCode(ParticipationType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the contextControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContextControl }
     *     
     */
    public ContextControl getContextControlCode() {
        if (contextControlCode == null) {
            return ContextControl.OP;
        } else {
            return contextControlCode;
        }
    }

    /**
     * Sets the value of the contextControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextControl }
     *     
     */
    public void setContextControlCode(ContextControl value) {
        this.contextControlCode = value;
    }

}

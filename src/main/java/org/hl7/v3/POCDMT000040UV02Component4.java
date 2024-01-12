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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040UV02.Component4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="POCD_MT000040UV02.Component4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040UV02.InfrastructureRoot.typeId" minOccurs="0"/>
 *         <element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         <element name="seperatableInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         <choice>
 *           <element name="act" type="{urn:hl7-org:v3}POCD_MT000040UV02.Act"/>
 *           <element name="encounter" type="{urn:hl7-org:v3}POCD_MT000040UV02.Encounter"/>
 *           <element name="observation" type="{urn:hl7-org:v3}POCD_MT000040UV02.Observation"/>
 *           <element name="observationMedia" type="{urn:hl7-org:v3}POCD_MT000040UV02.ObservationMedia"/>
 *           <element name="organizer" type="{urn:hl7-org:v3}POCD_MT000040UV02.Organizer"/>
 *           <element name="procedure" type="{urn:hl7-org:v3}POCD_MT000040UV02.Procedure"/>
 *           <element name="regionOfInterest" type="{urn:hl7-org:v3}POCD_MT000040UV02.RegionOfInterest"/>
 *           <element name="substanceAdministration" type="{urn:hl7-org:v3}POCD_MT000040UV02.SubstanceAdministration"/>
 *           <element name="supply" type="{urn:hl7-org:v3}POCD_MT000040UV02.Supply"/>
 *         </choice>
 *       </sequence>
 *       <attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       <attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       <attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipType" fixed="COMP" />
 *       <attribute name="contextConductionInd" type="{urn:hl7-org:v3}bl" fixed="true" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040UV02.Component4", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "sequenceNumber",
    "seperatableInd",
    "act",
    "encounter",
    "observation",
    "observationMedia",
    "organizer",
    "procedure",
    "regionOfInterest",
    "substanceAdministration",
    "supply"
})
public class POCDMT000040UV02Component4 {

    protected List<CS> realmCode;
    protected POCDMT000040UV02InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    protected INT sequenceNumber;
    protected BL seperatableInd;
    protected POCDMT000040UV02Act act;
    protected POCDMT000040UV02Encounter encounter;
    protected POCDMT000040UV02Observation observation;
    protected POCDMT000040UV02ObservationMedia observationMedia;
    protected POCDMT000040UV02Organizer organizer;
    protected POCDMT000040UV02Procedure procedure;
    protected POCDMT000040UV02RegionOfInterest regionOfInterest;
    protected POCDMT000040UV02SubstanceAdministration substanceAdministration;
    protected POCDMT000040UV02Supply supply;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected ActRelationshipType typeCode;
    @XmlAttribute(name = "contextConductionInd")
    protected Boolean contextConductionInd;

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
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the seperatableInd property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getSeperatableInd() {
        return seperatableInd;
    }

    /**
     * Sets the value of the seperatableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setSeperatableInd(BL value) {
        this.seperatableInd = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Act }
     *     
     */
    public POCDMT000040UV02Act getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Act }
     *     
     */
    public void setAct(POCDMT000040UV02Act value) {
        this.act = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Encounter }
     *     
     */
    public POCDMT000040UV02Encounter getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Encounter }
     *     
     */
    public void setEncounter(POCDMT000040UV02Encounter value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Observation }
     *     
     */
    public POCDMT000040UV02Observation getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Observation }
     *     
     */
    public void setObservation(POCDMT000040UV02Observation value) {
        this.observation = value;
    }

    /**
     * Gets the value of the observationMedia property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02ObservationMedia }
     *     
     */
    public POCDMT000040UV02ObservationMedia getObservationMedia() {
        return observationMedia;
    }

    /**
     * Sets the value of the observationMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02ObservationMedia }
     *     
     */
    public void setObservationMedia(POCDMT000040UV02ObservationMedia value) {
        this.observationMedia = value;
    }

    /**
     * Gets the value of the organizer property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Organizer }
     *     
     */
    public POCDMT000040UV02Organizer getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Organizer }
     *     
     */
    public void setOrganizer(POCDMT000040UV02Organizer value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Procedure }
     *     
     */
    public POCDMT000040UV02Procedure getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Procedure }
     *     
     */
    public void setProcedure(POCDMT000040UV02Procedure value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the regionOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02RegionOfInterest }
     *     
     */
    public POCDMT000040UV02RegionOfInterest getRegionOfInterest() {
        return regionOfInterest;
    }

    /**
     * Sets the value of the regionOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02RegionOfInterest }
     *     
     */
    public void setRegionOfInterest(POCDMT000040UV02RegionOfInterest value) {
        this.regionOfInterest = value;
    }

    /**
     * Gets the value of the substanceAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02SubstanceAdministration }
     *     
     */
    public POCDMT000040UV02SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Sets the value of the substanceAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02SubstanceAdministration }
     *     
     */
    public void setSubstanceAdministration(POCDMT000040UV02SubstanceAdministration value) {
        this.substanceAdministration = value;
    }

    /**
     * Gets the value of the supply property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Supply }
     *     
     */
    public POCDMT000040UV02Supply getSupply() {
        return supply;
    }

    /**
     * Sets the value of the supply property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Supply }
     *     
     */
    public void setSupply(POCDMT000040UV02Supply value) {
        this.supply = value;
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
     *     {@link ActRelationshipType }
     *     
     */
    public ActRelationshipType getTypeCode() {
        if (typeCode == null) {
            return ActRelationshipType.COMP;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipType }
     *     
     */
    public void setTypeCode(ActRelationshipType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the contextConductionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContextConductionInd() {
        if (contextConductionInd == null) {
            return true;
        } else {
            return contextConductionInd;
        }
    }

    /**
     * Sets the value of the contextConductionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextConductionInd(Boolean value) {
        this.contextConductionInd = value;
    }

}

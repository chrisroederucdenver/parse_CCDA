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
 * <p>Java class for POCD_MT000040UV02.ClinicalDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="POCD_MT000040UV02.ClinicalDocument">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040UV02.InfrastructureRoot.typeId"/>
 *         <element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="id" type="{urn:hl7-org:v3}II"/>
 *         <element name="code" type="{urn:hl7-org:v3}CE"/>
 *         <element name="title" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *         <element name="effectiveTime" type="{urn:hl7-org:v3}TS"/>
 *         <element name="confidentialityCode" type="{urn:hl7-org:v3}CE"/>
 *         <element name="languageCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         <element name="setId" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         <element name="versionNumber" type="{urn:hl7-org:v3}ST.r2b" minOccurs="0"/>
 *         <element name="copyTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         <element name="recordTarget" type="{urn:hl7-org:v3}POCD_MT000040UV02.RecordTarget" maxOccurs="unbounded"/>
 *         <element name="author" type="{urn:hl7-org:v3}POCD_MT000040UV02.Author" maxOccurs="unbounded"/>
 *         <element name="dataEnterer" type="{urn:hl7-org:v3}POCD_MT000040UV02.DataEnterer" minOccurs="0"/>
 *         <element name="informant" type="{urn:hl7-org:v3}POCD_MT000040UV02.Informant12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="custodian" type="{urn:hl7-org:v3}POCD_MT000040UV02.Custodian"/>
 *         <element name="informationRecipient" type="{urn:hl7-org:v3}POCD_MT000040UV02.Participant" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="legalAuthenticator" type="{urn:hl7-org:v3}POCD_MT000040UV02.LegalAuthenticator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="authenticator" type="{urn:hl7-org:v3}POCD_MT000040UV02.Authenticator" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="participant" type="{urn:hl7-org:v3}POCD_MT000040UV02.Participant2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="inFulfillmentOf" type="{urn:hl7-org:v3}POCD_MT000040UV02.InFulfillmentOf" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="documentationOf" type="{urn:hl7-org:v3}POCD_MT000040UV02.DocumentationOf" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="relatedDocument" type="{urn:hl7-org:v3}POCD_MT000040UV02.RelatedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="authorization" type="{urn:hl7-org:v3}POCD_MT000040UV02.Authorization" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="componentOf" type="{urn:hl7-org:v3}POCD_MT000040UV02.Component1" minOccurs="0"/>
 *         <element name="component" type="{urn:hl7-org:v3}POCD_MT000040UV02.Component2"/>
 *       </sequence>
 *       <attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       <attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       <attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="DOCCLIN" />
 *       <attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040UV02.ClinicalDocument", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "setId",
    "versionNumber",
    "copyTime",
    "recordTarget",
    "author",
    "dataEnterer",
    "informant",
    "custodian",
    "informationRecipient",
    "legalAuthenticator",
    "authenticator",
    "participant",
    "inFulfillmentOf",
    "documentationOf",
    "relatedDocument",
    "authorization",
    "componentOf",
    "component"
})
public class POCDMT000040UV02ClinicalDocument {

    protected List<CS> realmCode;
    @XmlElement(required = true)
    protected POCDMT000040UV02InfrastructureRootTypeId typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CE code;
    protected ST title;
    @XmlElement(required = true)
    protected TS effectiveTime;
    @XmlElement(required = true)
    protected CE confidentialityCode;
    protected CS languageCode;
    protected II setId;
    protected STR2B versionNumber;
    protected TS copyTime;
    @XmlElement(required = true)
    protected List<POCDMT000040UV02RecordTarget> recordTarget;
    @XmlElement(required = true)
    protected List<POCDMT000040UV02Author> author;
    protected POCDMT000040UV02DataEnterer dataEnterer;
    protected List<POCDMT000040UV02Informant12> informant;
    @XmlElement(required = true)
    protected POCDMT000040UV02Custodian custodian;
    protected List<POCDMT000040UV02Participant> informationRecipient;
    protected List<POCDMT000040UV02LegalAuthenticator> legalAuthenticator;
    protected List<POCDMT000040UV02Authenticator> authenticator;
    protected List<POCDMT000040UV02Participant2> participant;
    protected List<POCDMT000040UV02InFulfillmentOf> inFulfillmentOf;
    protected List<POCDMT000040UV02DocumentationOf> documentationOf;
    protected List<POCDMT000040UV02RelatedDocument> relatedDocument;
    protected List<POCDMT000040UV02Authorization> authorization;
    protected POCDMT000040UV02Component1 componentOf;
    @XmlElement(required = true)
    protected POCDMT000040UV02Component2 component;
    @XmlAttribute(name = "nullFlavor")
    protected NullFlavor nullFlavor;
    @XmlAttribute(name = "classCode")
    protected ActClass classCode;
    @XmlAttribute(name = "moodCode")
    protected ActMood moodCode;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTitle(ST value) {
        this.title = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setEffectiveTime(TS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Sets the value of the confidentialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setConfidentialityCode(CE value) {
        this.confidentialityCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setLanguageCode(CS value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setSetId(II value) {
        this.setId = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link STR2B }
     *     
     */
    public STR2B getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link STR2B }
     *     
     */
    public void setVersionNumber(STR2B value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the copyTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCopyTime() {
        return copyTime;
    }

    /**
     * Sets the value of the copyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCopyTime(TS value) {
        this.copyTime = value;
    }

    /**
     * Gets the value of the recordTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recordTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02RecordTarget }
     * 
     * 
     * @return
     *     The value of the recordTarget property.
     */
    public List<POCDMT000040UV02RecordTarget> getRecordTarget() {
        if (recordTarget == null) {
            recordTarget = new ArrayList<>();
        }
        return this.recordTarget;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Author }
     * 
     * 
     * @return
     *     The value of the author property.
     */
    public List<POCDMT000040UV02Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<>();
        }
        return this.author;
    }

    /**
     * Gets the value of the dataEnterer property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02DataEnterer }
     *     
     */
    public POCDMT000040UV02DataEnterer getDataEnterer() {
        return dataEnterer;
    }

    /**
     * Sets the value of the dataEnterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02DataEnterer }
     *     
     */
    public void setDataEnterer(POCDMT000040UV02DataEnterer value) {
        this.dataEnterer = value;
    }

    /**
     * Gets the value of the informant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the informant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Informant12 }
     * 
     * 
     * @return
     *     The value of the informant property.
     */
    public List<POCDMT000040UV02Informant12> getInformant() {
        if (informant == null) {
            informant = new ArrayList<>();
        }
        return this.informant;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Custodian }
     *     
     */
    public POCDMT000040UV02Custodian getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Custodian }
     *     
     */
    public void setCustodian(POCDMT000040UV02Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the informationRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the informationRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Participant }
     * 
     * 
     * @return
     *     The value of the informationRecipient property.
     */
    public List<POCDMT000040UV02Participant> getInformationRecipient() {
        if (informationRecipient == null) {
            informationRecipient = new ArrayList<>();
        }
        return this.informationRecipient;
    }

    /**
     * Gets the value of the legalAuthenticator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the legalAuthenticator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalAuthenticator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02LegalAuthenticator }
     * 
     * 
     * @return
     *     The value of the legalAuthenticator property.
     */
    public List<POCDMT000040UV02LegalAuthenticator> getLegalAuthenticator() {
        if (legalAuthenticator == null) {
            legalAuthenticator = new ArrayList<>();
        }
        return this.legalAuthenticator;
    }

    /**
     * Gets the value of the authenticator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authenticator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Authenticator }
     * 
     * 
     * @return
     *     The value of the authenticator property.
     */
    public List<POCDMT000040UV02Authenticator> getAuthenticator() {
        if (authenticator == null) {
            authenticator = new ArrayList<>();
        }
        return this.authenticator;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Participant2 }
     * 
     * 
     * @return
     *     The value of the participant property.
     */
    public List<POCDMT000040UV02Participant2> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the inFulfillmentOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inFulfillmentOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFulfillmentOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02InFulfillmentOf }
     * 
     * 
     * @return
     *     The value of the inFulfillmentOf property.
     */
    public List<POCDMT000040UV02InFulfillmentOf> getInFulfillmentOf() {
        if (inFulfillmentOf == null) {
            inFulfillmentOf = new ArrayList<>();
        }
        return this.inFulfillmentOf;
    }

    /**
     * Gets the value of the documentationOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documentationOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02DocumentationOf }
     * 
     * 
     * @return
     *     The value of the documentationOf property.
     */
    public List<POCDMT000040UV02DocumentationOf> getDocumentationOf() {
        if (documentationOf == null) {
            documentationOf = new ArrayList<>();
        }
        return this.documentationOf;
    }

    /**
     * Gets the value of the relatedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the relatedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02RelatedDocument }
     * 
     * 
     * @return
     *     The value of the relatedDocument property.
     */
    public List<POCDMT000040UV02RelatedDocument> getRelatedDocument() {
        if (relatedDocument == null) {
            relatedDocument = new ArrayList<>();
        }
        return this.relatedDocument;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040UV02Authorization }
     * 
     * 
     * @return
     *     The value of the authorization property.
     */
    public List<POCDMT000040UV02Authorization> getAuthorization() {
        if (authorization == null) {
            authorization = new ArrayList<>();
        }
        return this.authorization;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Component1 }
     *     
     */
    public POCDMT000040UV02Component1 getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Component1 }
     *     
     */
    public void setComponentOf(POCDMT000040UV02Component1 value) {
        this.componentOf = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040UV02Component2 }
     *     
     */
    public POCDMT000040UV02Component2 getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040UV02Component2 }
     *     
     */
    public void setComponent(POCDMT000040UV02Component2 value) {
        this.component = value;
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
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActClass }
     *     
     */
    public ActClass getClassCode() {
        if (classCode == null) {
            return ActClass.DOCCLIN;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClass }
     *     
     */
    public void setClassCode(ActClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActMood }
     *     
     */
    public ActMood getMoodCode() {
        if (moodCode == null) {
            return ActMood.EVN;
        } else {
            return moodCode;
        }
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActMood }
     *     
     */
    public void setMoodCode(ActMood value) {
        this.moodCode = value;
    }

}

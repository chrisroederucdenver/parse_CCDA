# Explorations of the HL7 2.1 C-CDA 
Creating java classes with JAXB to represent what is parsed out of a CCDA file. The generation is basd on XSD description/schema of CCDA.
Look at these scripts:
 - src/main/resources/profile.sh
 - src/main/resources/run_xjc.sh

## Data
   src/main/resources/Inpatient_Encounter_Discharged_to_Rehab_Location(C-CDA2.1).xml

## C-CDA links

https://hl7.org/cda/stds/ccda/draft1/
https://github.com/HL7/CDA-core-2.1/tree/master/schemas/normative

https://github.com/HL7/cda-core-2.1


## JAXB
./src/main/java/org/tislab/parse_CCDA/ProjectMain.java
./src/main/java/org/tislab/parse_CCDA/package-info.java
./src/main/java/org/hl7/v3/*.java // generated code

"trying to create the same field twice: id"
https://www.igorkromin.net/index.php/2015/11/13/fixing-the-cda-schema-compilation-with-xjc-using-a-bindings-file/

and where to put the jaxb.bindings file in eclipse
https://stackoverflow.com/questions/12497535/jaxb-custom-binding-with-eclipse:wq

XSD files required on stack overflow: https://stackoverflow.com/questions/21835607/identifying-hl7-v3-schemas-for-cda-r2/21838668

- a validator https://github.com/usnistgov/hit-xml-validation/blob/master/src/test/resources/Schemas/infrastructure/cda/SDTC.xsd
  - this is where I got some xsd that may or may not be right?
  - makes reference to schematron from healthcare.nist.gov
- a code generator ? Apparently JAXB can do that!!
  - https://stackoverflow.com/questions/686453/generate-java-classes-from-xsd-files


Scripts to run jaxb/xjc in src/main/resources, including use of a jaxb.bindings file to fix that "id" problem.


## SAX
./src/main/java/BrowseXmlWithSax.java


//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.04 à 11:04:45 AM GMT 
//


package com.ngis.civairs.model.statics;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VL1015_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1015_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accident"/>
 *     &lt;enumeration value="Serious incident"/>
 *     &lt;enumeration value="Major incident"/>
 *     &lt;enumeration value="Occurrence without safety effect"/>
 *     &lt;enumeration value="Not determined"/>
 *     &lt;enumeration value="Significant incident"/>
 *     &lt;enumeration value="Incident"/>
 *     &lt;enumeration value="Observation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1015_5_0_1_2")
@XmlEnum
public enum VL10155012 {


    /**
     * An occurrence associated with the operation of an aircraft which takes place between the time any person boards the aircraft with the intention of flight until such time as all such persons have disembarked, in which: 
     * a) a person is fatally or seriously injured as a result of: - being in the aircraft, or - direct contact with any part of the aircraft, including parts which have become detached from the aircraft, or - direct exposure to jet blast, except when the injuries are from natural causes, self-inflicted or inflicted by other persons, or when the injuries are to stowaways hiding outside the areas normally available to the passengers and crew;
     * b) the aircraft sustains damage or structural failure which: - adversely affects the structural strength, performance or flight characteristics of the aircraft, and - would normally require major repair or replacement of the affected component,except for engine failure or damage, when the damage is limited to the engine, its cowlings or accessories; or for damage limited to propellers, wing tips, antennas, tires, brakes, fairings, small dents or puncture holes in the aircraft skin;
     * c) the aircraft is missing or is completely inaccessible.
     * 
     */
    @XmlEnumValue("Accident")
    ACCIDENT("Accident"),

    /**
     * An incident involving circumstances indicating that an accident nearly occurred.
     * N.B. Examples of serious incidents can be found in Attachment D of ICAO Annex 13 and in the ICAO Accident/Incident Reporting Manual (ICAO Doc 9156).
     * 
     */
    @XmlEnumValue("Serious incident")
    SERIOUS_INCIDENT("Serious incident"),

    /**
     * An incident in which:
     * - Safety may have been compromised either having lead to a near collision between aircrafts, with the ground or obstacles  (i.e. safety margins not respected which is not the result of an ATC instruction).
     * - Assessment of the incident using a risk classification process has identified that this incident could have deteriorated into more serious situation.
     * 
     */
    @XmlEnumValue("Major incident")
    MAJOR_INCIDENT("Major incident"),

    /**
     * Eurocontrol: An incident which has no safety significance. 
     * N.B. This appears to be a contradiction with the ICAO definition of an incident: An occurrence, other than an accident, associated with the operation of an aircraft which affects or could affect the safety of operation.
     * 
     * A possibly safety related occurrence not meeting the reporting requirements. This could be e.g. the result of downgrading the incident after review.
     * 
     */
    @XmlEnumValue("Occurrence without safety effect")
    OCCURRENCE_WITHOUT_SAFETY_EFFECT("Occurrence without safety effect"),

    /**
     * The class of the occurrence has not been determined. 
     * 
     */
    @XmlEnumValue("Not determined")
    NOT_DETERMINED("Not determined"),

    /**
     * An incident in which:
     * - An accident, serious or major incident could have occurred if the risk had not been managed within safety margins (one or more safety barriers remaining).
     * - or if another aircraft or vehicle had been in the vicinity during the incident.
     * 
     */
    @XmlEnumValue("Significant incident")
    SIGNIFICANT_INCIDENT("Significant incident"),

    /**
     * An occurrence, other than an accident, associated with the operation of an aircraft which affects or could affect the safety of operation.
     * N.B. The type of incidents which are of main interest to the International Civil Aviation Organization for accident prevention studies are listed in the ICAO Accident/Incident Reporting Manual (ICAO Doc 9156) and ICAO Annex 13.
     * 
     */
    @XmlEnumValue("Incident")
    INCIDENT("Incident"),

    /**
     * The observation of a potential safety issue or hazard that, if not rectified could cause or have caused an incident.  The date and time of occurrence for an observation is that when it was first observed for the purposes of reporting and not an assessment of how long the safety issue might have been present. 
     * 
     */
    @XmlEnumValue("Observation")
    OBSERVATION("Observation");
    private final String value;

    VL10155012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL10155012 fromValue(String v) {
        for (VL10155012 c: VL10155012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

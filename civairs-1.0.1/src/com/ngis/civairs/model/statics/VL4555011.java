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
 * <p>Classe Java pour VL455_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL455_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Initial notification"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Preliminary"/>
 *     &lt;enumeration value="Factual"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL455_5_0_1_1")
@XmlEnum
public enum VL4555011 {


    /**
     * The record is based on, or contains information corresponding to the level of information in the initial notification of an accident or incident provided in accordance with ICAO Annex 13, Chapter 4. 
     * Format and content: 
     * The notification shall be in plain language and contain as much of the following information as is readily available, but its dispatch shall not be delayed due to the lack of complete information:
     *  
     *  	a)	for accidents the identifying abbreviation ACCID, for serious incidents INCID; 
     *  	b)	manufacturer, model, nationality and registration marks, and serial number of the aircraft; 
     *  	c)	name of owner, operator and hirer, if any, of the aircraft; 
     *  	d)	name of the pilot-in-command, and nationality of crew and passengers; 
     *  	e)	date and time (local time or UTC) of the accident or serious incident; 
     *  	f)	last point of departure and point of intended landing of the aircraft; 
     *  	g)	position of the aircraft with reference to some easily defined geographical point and latitude and longitude; 
     *  	h)	number of crew and passengers; aboard, killed and seriously injured; others, killed and seriously injured; 
     *  	i)	description of the accident or serious incident and the extent of damage to the aircraft so far as is known; 
     *  	j)	an indication to what extent the investigation will be conducted or is proposed to be delegated by the State of Occurrence; 
     *  	k)	physical characteristics of the accident or serious incident area, as well as an indication of access difficulties or special requirements to reach the site; 
     *  	l)	identification of the originating authority and means to contact the investigator-in-charge and the accident investigation authority of the State of Occurrence at any time; and 
     *  	m)	presence and description of dangerous goods on board the aircraft.
     * 
     */
    @XmlEnumValue("Initial notification")
    INITIAL_NOTIFICATION("Initial notification"),

    /**
     * Some information was received, but the level of information received was not corresponding to the level expected in a notification or similar. It is expected that more information will be received in due course that may enhance the information and upgrade the status.
     * 
     * Note: for ICAO this status indicates an unofficial occurrence report.
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Preliminary Report: the communication used for the prompt dissemination of data obtained in the early stages of the investigation. ICAO Annex 13. At the level of a State this status would indicate that sufficient information at hand to complete a preliminary report. More data is expected in due course, once an investigation has been completed. 
     * 
     */
    @XmlEnumValue("Preliminary")
    PRELIMINARY("Preliminary"),

    /**
     * The handling of the occurrence by the competent authority has not yet been completed, but there is sufficient information at hand to analyse and code the occurrence.
     * 
     */
    @XmlEnumValue("Factual")
    FACTUAL("Factual"),

    /**
     * No further information is expected to be received for the occurrence and no further action in respect to the occurrence is being contemplated.
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * A report containing the factual information obtained in the investigation as well as the factors derived from the analysis and the safety recommendations, if any. This is the report required to be completed under Annex 13, Standard 7.5. At the national level this status would imply that the investigation has been completed and all relevant data have been transcribed into the database. No further action is contemplated.
     * 
     */
    @XmlEnumValue("Data")
    DATA("Data");
    private final String value;

    VL4555011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4555011 fromValue(String v) {
        for (VL4555011 c: VL4555011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Classe Java pour VL1021_12_0_1_3.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1021_12_0_1_3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="ATM - ACAS"/>
 *     &lt;enumeration value="ATM - ACAS - National"/>
 *     &lt;enumeration value="ATM - ACAS - SRC / JAR"/>
 *     &lt;enumeration value="ATM - AIRPROX"/>
 *     &lt;enumeration value="ATM - AIRPROX - National"/>
 *     &lt;enumeration value="ATM - AIRPROX - SRC / JAR"/>
 *     &lt;enumeration value="ATM - APDSG"/>
 *     &lt;enumeration value="ATM - APDSG - National"/>
 *     &lt;enumeration value="ATM - APDSG - SRC / JAR"/>
 *     &lt;enumeration value="ATM - ATIR"/>
 *     &lt;enumeration value="ATM - ATIR - National"/>
 *     &lt;enumeration value="ATM - ATIR - SRC / JAR"/>
 *     &lt;enumeration value="ATM - Other"/>
 *     &lt;enumeration value="ATM - Other - National"/>
 *     &lt;enumeration value="ATM - Other - SRC / JAR"/>
 *     &lt;enumeration value="EASA"/>
 *     &lt;enumeration value="EASA - Form 44"/>
 *     &lt;enumeration value="EASA - Other"/>
 *     &lt;enumeration value="ICAO "/>
 *     &lt;enumeration value="ICAO  - Initial notification"/>
 *     &lt;enumeration value="ICAO  - Preliminary Report"/>
 *     &lt;enumeration value="ICAO  - Data Report"/>
 *     &lt;enumeration value="ICAO  - Final Report"/>
 *     &lt;enumeration value="ICAO  - IBIS (Bird strike) reporting form"/>
 *     &lt;enumeration value="ICAO  - Wake-Vortex Report"/>
 *     &lt;enumeration value="ICAO  - Runway Incursion Report"/>
 *     &lt;enumeration value="ICAO  - Runway Incursion Report - Initial Report"/>
 *     &lt;enumeration value="ICAO  - Runway Incursion Report - Final Report"/>
 *     &lt;enumeration value="ICAO  - Other"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Other - ASR - Air Safety Report"/>
 *     &lt;enumeration value="Other - GHR - Ground Handling Report"/>
 *     &lt;enumeration value="Other - CSR - Cabin Safety Report"/>
 *     &lt;enumeration value="Other - Aerodrome Report"/>
 *     &lt;enumeration value="Other - Maintenance Report"/>
 *     &lt;enumeration value="Other - Bird Strike Report"/>
 *     &lt;enumeration value="Other - Police Report"/>
 *     &lt;enumeration value="Other - Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1021_12_0_1_3")
@XmlEnum
public enum VL102112013 {

    ATM("ATM"),

    /**
     * Eurocontrol: Notification and report by the aircraft commander to the air traffic services unit concerned, and the subsequent controller report, whenever an aircraft has manoeuvred in response to an ACAS advisory.
     * 
     */
    @XmlEnumValue("ATM - ACAS")
    ATM_ACAS("ATM - ACAS"),

    /**
     * Eurocontrol: A formal incident reporting system forming part of any National Mandatory ATM Safety Occurrence requirement for collection of information on actual or potential safety deficiencies.
     * 
     */
    @XmlEnumValue("ATM - ACAS - National")
    ATM_ACAS_NATIONAL("ATM - ACAS - National"),

    /**
     * Reporting based on requirements of the Safety Regulation Group (SRG) or the Joint Aviation Requirements (JAR).
     * 
     */
    @XmlEnumValue("ATM - ACAS - SRC / JAR")
    ATM_ACAS_SRC_JAR("ATM - ACAS - SRC / JAR"),

    /**
     * The code word used in an air traffic incident report to designate unacceptable aircraft proximity. ICAO Doc 9713. A situation in which, in the opinion of a pilot or air traffic services personnel, the distance between aircraft as well as their relative positions and speed have been such that the safety of the aircraft involved may have been compromised. An aircraft proximity is classified as follows:- Risk of collision. The risk classification of an aircraft proximity in which a serious risk of collision has existed.- Safety not assured. The risk classification of an aircraft proximity in which the safety of an aircraft may have been compromised.- No risk of collision. The risk classification of an aircraft proximity in which no risk of collision has existed.- Risk not determined. The risk classification of an aircraft proximity in which insufficient information was available to determine the risk involved, or inconclusive or conflicting evidence precluded such determination
     * 
     */
    @XmlEnumValue("ATM - AIRPROX")
    ATM_AIRPROX("ATM - AIRPROX"),

    /**
     * Eurocontrol: A formal incident reporting system forming part of any National Mandatory ATM Safety Occurrence requirement for collection of information on actual or potential safety deficiencies.
     * 
     */
    @XmlEnumValue("ATM - AIRPROX - National")
    ATM_AIRPROX_NATIONAL("ATM - AIRPROX - National"),

    /**
     * Reporting based on requirements of the Safety Regulation Group (SRG) or the Joint Aviation Requirements (JAR).
     * 
     */
    @XmlEnumValue("ATM - AIRPROX - SRC / JAR")
    ATM_AIRPROX_SRC_JAR("ATM - AIRPROX - SRC / JAR"),

    /**
     * A standardized form or procedure of reporting an ATM incident.
     * 
     */
    @XmlEnumValue("ATM - APDSG")
    ATM_APDSG("ATM - APDSG"),

    /**
     * Eurocontrol: A formal incident reporting system forming part of any National Mandatory ATM Safety Occurrence requirement for collection of information on actual or potential safety deficiencies.
     * 
     */
    @XmlEnumValue("ATM - APDSG - National")
    ATM_APDSG_NATIONAL("ATM - APDSG - National"),

    /**
     * Reporting based on requirements of the Safety Regulation Group (SRG) or the Joint Aviation Requirements (JAR).
     * 
     */
    @XmlEnumValue("ATM - APDSG - SRC / JAR")
    ATM_APDSG_SRC_JAR("ATM - APDSG - SRC / JAR"),

    /**
     * A standardized form or procedure of reporting an incident e.g. ICAO Doc 4444, Appendix 4, Air Traffic Incident Report.
     * 
     */
    @XmlEnumValue("ATM - ATIR")
    ATM_ATIR("ATM - ATIR"),

    /**
     * Eurocontrol: A formal incident reporting system forming part of any National Mandatory ATM Safety Occurrence requirement for collection of information on actual or potential safety deficiencies.
     * 
     */
    @XmlEnumValue("ATM - ATIR - National")
    ATM_ATIR_NATIONAL("ATM - ATIR - National"),

    /**
     * Reporting based on requirements of the Safety Regulation Group (SRG) or the Joint Aviation Requirements (JAR).
     * 
     */
    @XmlEnumValue("ATM - ATIR - SRC / JAR")
    ATM_ATIR_SRC_JAR("ATM - ATIR - SRC / JAR"),
    @XmlEnumValue("ATM - Other")
    ATM_OTHER("ATM - Other"),

    /**
     * Eurocontrol: A formal incident reporting system forming part of any National Mandatory ATM Safety Occurrence requirement for collection of information on actual or potential safety deficiencies.
     * 
     */
    @XmlEnumValue("ATM - Other - National")
    ATM_OTHER_NATIONAL("ATM - Other - National"),

    /**
     * Reporting based on requirements of the Safety Regulation Group (SRG) or the Joint Aviation Requirements (JAR).
     * 
     */
    @XmlEnumValue("ATM - Other - SRC / JAR")
    ATM_OTHER_SRC_JAR("ATM - Other - SRC / JAR"),

    /**
     * Forms provided by the European Aviation Safety Agency.
     * 
     */
    EASA("EASA"),

    /**
     * Reporting form for reporting technical occurrences.
     * 
     */
    @XmlEnumValue("EASA - Form 44")
    EASA_FORM_44("EASA - Form 44"),

    /**
     * Other EASA Form
     * 
     */
    @XmlEnumValue("EASA - Other")
    EASA_OTHER("EASA - Other"),

    /**
     * ICAO - International Civil Aviation Organisation (ADREP forms, IBIS, Runway Incursion, Wake-vortex, etc.)
     * 
     */
    @XmlEnumValue("ICAO ")
    ICAO("ICAO "),

    /**
     * Annex 13, Chapter 4, Standard 4.2: Format and content of the initial notification:
     * 
     * 	4.2    The notification shall be in plain language and contain as much of the following information as is readily available, but its dispatch shall not be delayed due to the lack of complete information:
     * 
     * 	a)	for accidents the identifying abbreviation ACCID, for serious incidents INCID;
     * 	b)	manufacturer, model, nationality and registration marks, and serial number of the aircraft;
     * 
     * 	c)	name of owner, operator and hirer, if any, of the aircraft;
     * 
     * 	d)	name of the pilot-in-command, and nationality of crew and passengers;
     * 
     * 	e)	date and time (local time or UTC) of the accident or serious incident;
     * 
     * 	f)	last point of departure and point of intended landing of the aircraft;
     * 
     * 	g)	position of the aircraft with reference to some easily defined geographical point and latitude and longitude;
     * 
     * 	h)	number of crew and passengers; aboard, killed and seriously injured; others, killed and seriously injured;
     * 
     * 	i)	description of the accident or serious incident and the extent of damage to the aircraft so far as is known;
     * 
     * 	j)	an indication to what extent the investigation will be conducted or is proposed to be delegated by the State of Occurrence;
     * 
     * 	k)	physical characteristics of the accident or serious incident area, as well as an indication of access difficulties or special requirements to reach the site;
     * 
     * 	l)	identification of the originating authority and means to contact the investigator-in-charge and the accident investigation authority of the State of Occurrence at any time; and
     * 
     * 	m)	presence and description of dangerous goods on board the aircraft.
     * 
     * 	Note 1.- The 4-letter designator 'YLYX' in association with an ICAO 4-letter location indicator forms the 8-letter addressee indicator for messages sent over the AFTN to authorities responsible for aircraft accident and serious incident investigations. For messages sent over the public telecommunication service the addressee indicator cannot be used and a postal or telegraphic address must be substituted.
     * 
     * 	The 8-letter addressee indicators and the corresponding postal and telegraphic addresses, when notified to ICAO, are published in the Designators for Aircraft Operating Agencies, Aeronautical Authorities and Services (Doc 8585).
     * 
     * 	Note 2.- The Manual of Aircraft Accident and Incident Investigation, Part I - Organization and Planning (Doc 9756) contains guidance material concerning the preparation of notification messages and the arrangements to be made for their prompt delivery to the addressee.
     * 
     */
    @XmlEnumValue("ICAO  - Initial notification")
    ICAO_INITIAL_NOTIFICATION("ICAO  - Initial notification"),

    /**
     * Preliminary factual information on the occurrence, including an initial sequence of events, a short narrative as well as factual information on the time, location of the occurence and details on the aircraft and their operation involved. 
     * 
     */
    @XmlEnumValue("ICAO  - Preliminary Report")
    ICAO_PRELIMINARY_REPORT("ICAO  - Preliminary Report"),

    /**
     * The complete information on the occurrence, including the relevant background information, the sequence of events with factors, the narrative and information on safety recommendation made in conjunction with the occurrence. 
     * 
     */
    @XmlEnumValue("ICAO  - Data Report")
    ICAO_DATA_REPORT("ICAO  - Data Report"),

    /**
     * See format of the Final report in Annex 13.  Note: This would be entered if such a Final report is at hand.
     * 
     */
    @XmlEnumValue("ICAO  - Final Report")
    ICAO_FINAL_REPORT("ICAO  - Final Report"),

    /**
     * The ICAO form to report bird strikes.
     * 
     */
    @XmlEnumValue("ICAO  - IBIS (Bird strike) reporting form")
    ICAO_IBIS_BIRD_STRIKE_REPORTING_FORM("ICAO  - IBIS (Bird strike) reporting form"),

    /**
     * Wake-Vortex reporting form.
     * 
     */
    @XmlEnumValue("ICAO  - Wake-Vortex Report")
    ICAO_WAKE_VORTEX_REPORT("ICAO  - Wake-Vortex Report"),
    @XmlEnumValue("ICAO  - Runway Incursion Report")
    ICAO_RUNWAY_INCURSION_REPORT("ICAO  - Runway Incursion Report"),
    @XmlEnumValue("ICAO  - Runway Incursion Report - Initial Report")
    ICAO_RUNWAY_INCURSION_REPORT_INITIAL_REPORT("ICAO  - Runway Incursion Report - Initial Report"),
    @XmlEnumValue("ICAO  - Runway Incursion Report - Final Report")
    ICAO_RUNWAY_INCURSION_REPORT_FINAL_REPORT("ICAO  - Runway Incursion Report - Final Report"),

    /**
     * Other ICAO Form
     * 
     */
    @XmlEnumValue("ICAO  - Other")
    ICAO_OTHER("ICAO  - Other"),

    /**
     * Other national notification forms.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Other - ASR - Air Safety Report")
    OTHER_ASR_AIR_SAFETY_REPORT("Other - ASR - Air Safety Report"),
    @XmlEnumValue("Other - GHR - Ground Handling Report")
    OTHER_GHR_GROUND_HANDLING_REPORT("Other - GHR - Ground Handling Report"),
    @XmlEnumValue("Other - CSR - Cabin Safety Report")
    OTHER_CSR_CABIN_SAFETY_REPORT("Other - CSR - Cabin Safety Report"),

    /**
     * National Form to report aerodrome occurrences.
     * 
     */
    @XmlEnumValue("Other - Aerodrome Report")
    OTHER_AERODROME_REPORT("Other - Aerodrome Report"),

    /**
     * National Form to report maintenance occurrences.
     * 
     */
    @XmlEnumValue("Other - Maintenance Report")
    OTHER_MAINTENANCE_REPORT("Other - Maintenance Report"),

    /**
     * National Form to report bird strike occurrences.
     * 
     */
    @XmlEnumValue("Other - Bird Strike Report")
    OTHER_BIRD_STRIKE_REPORT("Other - Bird Strike Report"),
    @XmlEnumValue("Other - Police Report")
    OTHER_POLICE_REPORT("Other - Police Report"),

    /**
     * National notification form other than the ones listed above.
     * 
     */
    @XmlEnumValue("Other - Other")
    OTHER_OTHER("Other - Other");
    private final String value;

    VL102112013(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL102112013 fromValue(String v) {
        for (VL102112013 c: VL102112013 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

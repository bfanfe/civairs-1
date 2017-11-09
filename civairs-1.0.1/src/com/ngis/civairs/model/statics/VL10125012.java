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
 * <p>Classe Java pour VL1012_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1012_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aeroplane pilot"/>
 *     &lt;enumeration value="Aeroplane pilot - Airline transport pilot"/>
 *     &lt;enumeration value="Aeroplane pilot - Commercial pilot"/>
 *     &lt;enumeration value="Aeroplane pilot - Private pilot"/>
 *     &lt;enumeration value="Aeroplane pilot - Student pilot"/>
 *     &lt;enumeration value="Aeroplane pilot - None"/>
 *     &lt;enumeration value="Aeroplane pilot - Other"/>
 *     &lt;enumeration value="Aeroplane pilot - Unknown"/>
 *     &lt;enumeration value="Helicopter pilots"/>
 *     &lt;enumeration value="Helicopter pilots - Airline transport pilot"/>
 *     &lt;enumeration value="Helicopter pilots - Commercial pilot"/>
 *     &lt;enumeration value="Helicopter pilots - Private pilot"/>
 *     &lt;enumeration value="Helicopter pilots - Student pilot"/>
 *     &lt;enumeration value="Helicopter pilots - None"/>
 *     &lt;enumeration value="Helicopter pilots - Other"/>
 *     &lt;enumeration value="Helicopter pilots - Unknown"/>
 *     &lt;enumeration value="Glider pilots"/>
 *     &lt;enumeration value="Glider pilots - Airline transport pilot"/>
 *     &lt;enumeration value="Glider pilots - Commercial pilot"/>
 *     &lt;enumeration value="Glider pilots - Private pilot"/>
 *     &lt;enumeration value="Glider pilots - Student pilot"/>
 *     &lt;enumeration value="Glider pilots - None"/>
 *     &lt;enumeration value="Glider pilots - Other"/>
 *     &lt;enumeration value="Glider pilots - Unknown"/>
 *     &lt;enumeration value="Balloon pilots"/>
 *     &lt;enumeration value="Balloon pilots - Airline transport pilot"/>
 *     &lt;enumeration value="Balloon pilots - Commercial pilot"/>
 *     &lt;enumeration value="Balloon pilots - Private pilot"/>
 *     &lt;enumeration value="Balloon pilots - Student pilot"/>
 *     &lt;enumeration value="Balloon pilots - None"/>
 *     &lt;enumeration value="Balloon pilots - Other"/>
 *     &lt;enumeration value="Balloon pilots - Unknown"/>
 *     &lt;enumeration value="Dirigible pilots"/>
 *     &lt;enumeration value="Dirigible pilots - Airline transport pilot"/>
 *     &lt;enumeration value="Dirigible pilots - Commercial pilot"/>
 *     &lt;enumeration value="Dirigible pilots - Private pilot"/>
 *     &lt;enumeration value="Dirigible pilots - Student pilot"/>
 *     &lt;enumeration value="Dirigible pilots - None"/>
 *     &lt;enumeration value="Dirigible pilots - Other"/>
 *     &lt;enumeration value="Dirigible pilots - Unknown"/>
 *     &lt;enumeration value="Microlight pilots"/>
 *     &lt;enumeration value="Microlight pilots - Airline transport pilot"/>
 *     &lt;enumeration value="Microlight pilots - Commercial pilot"/>
 *     &lt;enumeration value="Microlight pilots - Private pilot"/>
 *     &lt;enumeration value="Microlight pilots - Student pilot"/>
 *     &lt;enumeration value="Microlight pilots - None"/>
 *     &lt;enumeration value="Microlight pilots - Other"/>
 *     &lt;enumeration value="Microlight pilots - Unknown"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Other - Airline transport pilot"/>
 *     &lt;enumeration value="Other - Commercial pilot"/>
 *     &lt;enumeration value="Other - Private pilot"/>
 *     &lt;enumeration value="Other - Student pilot"/>
 *     &lt;enumeration value="Other - None"/>
 *     &lt;enumeration value="Other - Other"/>
 *     &lt;enumeration value="Other - Unknown"/>
 *     &lt;enumeration value="Unknown types of pilot licenses."/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Airline transport pilot"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Commercial pilot"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Private pilot"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Student pilot"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - None"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Other"/>
 *     &lt;enumeration value="Unknown types of pilot licenses. - Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1012_5_0_1_2")
@XmlEnum
public enum VL10125012 {


    /**
     * Licenses relating to aeroplane pilot operation.
     * 
     */
    @XmlEnumValue("Aeroplane pilot")
    AEROPLANE_PILOT("Aeroplane pilot"),

    /**
     * The holder of an airline transport pilot license - aeroplane may exercise all the privileges of the holder of a PPL and CPL - aeroplane and act as pilot-in-command and co-pilot in aeroplanes in air transport. ICAO Annex 1 
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Airline transport pilot")
    AEROPLANE_PILOT_AIRLINE_TRANSPORT_PILOT("Aeroplane pilot - Airline transport pilot"),

    /**
     * The holder of a commercial pilot license - aeroplane may exercise all the privileges of the holder of a PPL - aeroplane, act as the pilot-in-command in any aeroplane engaged in operations other than commercial air transport; act as pilot-in-command in commercial air transport in any aeroplane certificated for single pilot operation and act as co-pilot in commercial air transport in aeroplanes required to be operated with a co-pilot. ICAO Annex 1
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Commercial pilot")
    AEROPLANE_PILOT_COMMERCIAL_PILOT("Aeroplane pilot - Commercial pilot"),

    /**
     * The holder of a private pilot license - aeroplane may act, but not for remuneration, as the pilot-in-command or co-pilot of any aeroplane engaged in non-revenue flights.
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Private pilot")
    AEROPLANE_PILOT_PRIVATE_PILOT("Aeroplane pilot - Private pilot"),

    /**
     * A student pilot license is not defined by ICAO although such a license is issued by member States.
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Student pilot")
    AEROPLANE_PILOT_STUDENT_PILOT("Aeroplane pilot - Student pilot"),

    /**
     * The person involved was not licensed for the particular activity in which he/she was involved.
     * 
     */
    @XmlEnumValue("Aeroplane pilot - None")
    AEROPLANE_PILOT_NONE("Aeroplane pilot - None"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Other")
    AEROPLANE_PILOT_OTHER("Aeroplane pilot - Other"),

    /**
     * The type of license held by the person involved for the particular activity in which he/she was involved is not known.
     * 
     */
    @XmlEnumValue("Aeroplane pilot - Unknown")
    AEROPLANE_PILOT_UNKNOWN("Aeroplane pilot - Unknown"),

    /**
     * Licenses relating to helicopter pilot operation.
     * 
     */
    @XmlEnumValue("Helicopter pilots")
    HELICOPTER_PILOTS("Helicopter pilots"),

    /**
     * The holder of an airline transport pilot license - helicopter may exercise all the privileges of the holder of a PPL-H and CPL-H and act as pilot-in-command and co-pilot in helicopters in air transport. ICAO Annex 1 
     * 
     */
    @XmlEnumValue("Helicopter pilots - Airline transport pilot")
    HELICOPTER_PILOTS_AIRLINE_TRANSPORT_PILOT("Helicopter pilots - Airline transport pilot"),

    /**
     * The holder of a commercial pilot license - aeroplane may exercise all the privileges of the holder of a PPL-H, act as the pilot-in-command in any helicopter engaged in operations other than commercial air transport; act as pilot-in-command in commercial air transport in any helicopter certificated for single pilot operation and act as co-pilot in commercial air transport in helicopters required to be operated with a co-pilot.ICAO Annex 1
     * 
     */
    @XmlEnumValue("Helicopter pilots - Commercial pilot")
    HELICOPTER_PILOTS_COMMERCIAL_PILOT("Helicopter pilots - Commercial pilot"),

    /**
     * The holder of a private pilot license - helicopter may act, but not for remuneration, as the pilot-in-command or co-pilot of any helicopter engaged in non-revenue flights. ICAO Annex 1 
     * 
     */
    @XmlEnumValue("Helicopter pilots - Private pilot")
    HELICOPTER_PILOTS_PRIVATE_PILOT("Helicopter pilots - Private pilot"),

    /**
     * A student pilot license - helicopter is not defined by ICAO although such a license is issued by member States.
     * 
     */
    @XmlEnumValue("Helicopter pilots - Student pilot")
    HELICOPTER_PILOTS_STUDENT_PILOT("Helicopter pilots - Student pilot"),
    @XmlEnumValue("Helicopter pilots - None")
    HELICOPTER_PILOTS_NONE("Helicopter pilots - None"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Helicopter pilots - Other")
    HELICOPTER_PILOTS_OTHER("Helicopter pilots - Other"),

    /**
     * The type of license held by the person involved for the particular activity in which he/she was involved is not known.
     * 
     */
    @XmlEnumValue("Helicopter pilots - Unknown")
    HELICOPTER_PILOTS_UNKNOWN("Helicopter pilots - Unknown"),
    @XmlEnumValue("Glider pilots")
    GLIDER_PILOTS("Glider pilots"),
    @XmlEnumValue("Glider pilots - Airline transport pilot")
    GLIDER_PILOTS_AIRLINE_TRANSPORT_PILOT("Glider pilots - Airline transport pilot"),
    @XmlEnumValue("Glider pilots - Commercial pilot")
    GLIDER_PILOTS_COMMERCIAL_PILOT("Glider pilots - Commercial pilot"),
    @XmlEnumValue("Glider pilots - Private pilot")
    GLIDER_PILOTS_PRIVATE_PILOT("Glider pilots - Private pilot"),
    @XmlEnumValue("Glider pilots - Student pilot")
    GLIDER_PILOTS_STUDENT_PILOT("Glider pilots - Student pilot"),
    @XmlEnumValue("Glider pilots - None")
    GLIDER_PILOTS_NONE("Glider pilots - None"),
    @XmlEnumValue("Glider pilots - Other")
    GLIDER_PILOTS_OTHER("Glider pilots - Other"),
    @XmlEnumValue("Glider pilots - Unknown")
    GLIDER_PILOTS_UNKNOWN("Glider pilots - Unknown"),

    /**
     * This data record does not include occurrences involving balloons so this section is not in use.
     * 
     */
    @XmlEnumValue("Balloon pilots")
    BALLOON_PILOTS("Balloon pilots"),
    @XmlEnumValue("Balloon pilots - Airline transport pilot")
    BALLOON_PILOTS_AIRLINE_TRANSPORT_PILOT("Balloon pilots - Airline transport pilot"),

    /**
     * T
     * 
     */
    @XmlEnumValue("Balloon pilots - Commercial pilot")
    BALLOON_PILOTS_COMMERCIAL_PILOT("Balloon pilots - Commercial pilot"),
    @XmlEnumValue("Balloon pilots - Private pilot")
    BALLOON_PILOTS_PRIVATE_PILOT("Balloon pilots - Private pilot"),

    /**
     * T
     * 
     */
    @XmlEnumValue("Balloon pilots - Student pilot")
    BALLOON_PILOTS_STUDENT_PILOT("Balloon pilots - Student pilot"),

    /**
     * This data record does not include occurrences involving balloons so this section is not in use.
     * 
     */
    @XmlEnumValue("Balloon pilots - None")
    BALLOON_PILOTS_NONE("Balloon pilots - None"),

    /**
     * This data record does not include occurrences involving balloons so this section is not in use.
     * 
     */
    @XmlEnumValue("Balloon pilots - Other")
    BALLOON_PILOTS_OTHER("Balloon pilots - Other"),

    /**
     * This data record does not include occurrences involving balloons so this section is not in use.
     * 
     */
    @XmlEnumValue("Balloon pilots - Unknown")
    BALLOON_PILOTS_UNKNOWN("Balloon pilots - Unknown"),

    /**
     * This data record does not include occurrences involving dirigibles so this section is not in use.
     * 
     */
    @XmlEnumValue("Dirigible pilots")
    DIRIGIBLE_PILOTS("Dirigible pilots"),
    @XmlEnumValue("Dirigible pilots - Airline transport pilot")
    DIRIGIBLE_PILOTS_AIRLINE_TRANSPORT_PILOT("Dirigible pilots - Airline transport pilot"),
    @XmlEnumValue("Dirigible pilots - Commercial pilot")
    DIRIGIBLE_PILOTS_COMMERCIAL_PILOT("Dirigible pilots - Commercial pilot"),
    @XmlEnumValue("Dirigible pilots - Private pilot")
    DIRIGIBLE_PILOTS_PRIVATE_PILOT("Dirigible pilots - Private pilot"),
    @XmlEnumValue("Dirigible pilots - Student pilot")
    DIRIGIBLE_PILOTS_STUDENT_PILOT("Dirigible pilots - Student pilot"),
    @XmlEnumValue("Dirigible pilots - None")
    DIRIGIBLE_PILOTS_NONE("Dirigible pilots - None"),
    @XmlEnumValue("Dirigible pilots - Other")
    DIRIGIBLE_PILOTS_OTHER("Dirigible pilots - Other"),
    @XmlEnumValue("Dirigible pilots - Unknown")
    DIRIGIBLE_PILOTS_UNKNOWN("Dirigible pilots - Unknown"),

    /**
     * Micro-light operations are not regulated by ICAO and no ICAO definitions are available.
     * 
     */
    @XmlEnumValue("Microlight pilots")
    MICROLIGHT_PILOTS("Microlight pilots"),
    @XmlEnumValue("Microlight pilots - Airline transport pilot")
    MICROLIGHT_PILOTS_AIRLINE_TRANSPORT_PILOT("Microlight pilots - Airline transport pilot"),
    @XmlEnumValue("Microlight pilots - Commercial pilot")
    MICROLIGHT_PILOTS_COMMERCIAL_PILOT("Microlight pilots - Commercial pilot"),
    @XmlEnumValue("Microlight pilots - Private pilot")
    MICROLIGHT_PILOTS_PRIVATE_PILOT("Microlight pilots - Private pilot"),
    @XmlEnumValue("Microlight pilots - Student pilot")
    MICROLIGHT_PILOTS_STUDENT_PILOT("Microlight pilots - Student pilot"),
    @XmlEnumValue("Microlight pilots - None")
    MICROLIGHT_PILOTS_NONE("Microlight pilots - None"),
    @XmlEnumValue("Microlight pilots - Other")
    MICROLIGHT_PILOTS_OTHER("Microlight pilots - Other"),

    /**
     * This data record does not include occurrences involving microlight aircraft so this section is not in use.
     * 
     */
    @XmlEnumValue("Microlight pilots - Unknown")
    MICROLIGHT_PILOTS_UNKNOWN("Microlight pilots - Unknown"),

    /**
     * This data record does not include occurrences involving microlight aircraft so this section is not in use.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The person involved had a type of ATPL for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other - Airline transport pilot")
    OTHER_AIRLINE_TRANSPORT_PILOT("Other - Airline transport pilot"),

    /**
     * The person involved had a type of CPL for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other - Commercial pilot")
    OTHER_COMMERCIAL_PILOT("Other - Commercial pilot"),

    /**
     * The person involved had a type of PPL for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other - Private pilot")
    OTHER_PRIVATE_PILOT("Other - Private pilot"),

    /**
     * The person involved had a type of SPL for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other - Student pilot")
    OTHER_STUDENT_PILOT("Other - Student pilot"),

    /**
     * The person involved had no type of license for the particular activity in which he/she was involved.
     * 
     */
    @XmlEnumValue("Other - None")
    OTHER_NONE("Other - None"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved other than one of those listed above.
     * 
     */
    @XmlEnumValue("Other - Other")
    OTHER_OTHER("Other - Other"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Other - Unknown")
    OTHER_UNKNOWN("Other - Unknown"),

    /**
     * The person involved had a type of license for the particular activity in which he/she was involved but it is not known what type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses.")
    UNKNOWN_TYPES_OF_PILOT_LICENSES("Unknown types of pilot licenses."),

    /**
     * The person involved had a type of ATPL for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Airline transport pilot")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_AIRLINE_TRANSPORT_PILOT("Unknown types of pilot licenses. - Airline transport pilot"),

    /**
     * The person involved had a type of CPL for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Commercial pilot")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_COMMERCIAL_PILOT("Unknown types of pilot licenses. - Commercial pilot"),

    /**
     * The person involved had a type of PPL for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Private pilot")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_PRIVATE_PILOT("Unknown types of pilot licenses. - Private pilot"),

    /**
     * The person involved had a type of SPL for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Student pilot")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_STUDENT_PILOT("Unknown types of pilot licenses. - Student pilot"),

    /**
     * The person involved had no type of license for the particular activity in which he/she was involved.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - None")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_NONE("Unknown types of pilot licenses. - None"),

    /**
     * The person involved had a type of license, other than those listed above, for the particular activity in which he/she was involved but it is not known what other type of license this was.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Other")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_OTHER("Unknown types of pilot licenses. - Other"),

    /**
     * The person involved had an unknown type of license for the particular activity in which he/she was involved.
     * 
     */
    @XmlEnumValue("Unknown types of pilot licenses. - Unknown")
    UNKNOWN_TYPES_OF_PILOT_LICENSES_UNKNOWN("Unknown types of pilot licenses. - Unknown");
    private final String value;

    VL10125012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL10125012 fromValue(String v) {
        for (VL10125012 c: VL10125012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

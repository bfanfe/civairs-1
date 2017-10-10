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
 * <p>Classe Java pour VL15_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL15_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airway - ATS Route"/>
 *     &lt;enumeration value="ATZ"/>
 *     &lt;enumeration value="CBA"/>
 *     &lt;enumeration value="CTA"/>
 *     &lt;enumeration value="CTR"/>
 *     &lt;enumeration value="CVSM"/>
 *     &lt;enumeration value="Danger area"/>
 *     &lt;enumeration value="FAB"/>
 *     &lt;enumeration value="FIR / UIR"/>
 *     &lt;enumeration value="Lower Control Area (LTA)"/>
 *     &lt;enumeration value="Prohibited area"/>
 *     &lt;enumeration value="TMA"/>
 *     &lt;enumeration value="RVSM"/>
 *     &lt;enumeration value="Restricted area"/>
 *     &lt;enumeration value="Transitional area"/>
 *     &lt;enumeration value="TSA"/>
 *     &lt;enumeration value="Upper Control Area (UTA)"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL15_5_0_1_1")
@XmlEnum
public enum VL155011 {


    /**
     * An airway or ATS route is a control area or portion theirof established in the form of a corridor.  ICAO Annex 2.
     * 
     */
    @XmlEnumValue("Airway - ATS Route")
    AIRWAY_ATS_ROUTE("Airway - ATS Route"),

    /**
     * An aerodrome traffic zone is an airspace of defined dimensions established around as aerodrome for the protection of aerodrome traffic. ICAO Annex 2
     * 
     */
    ATZ("ATZ"),

    /**
     * A cross border area is a temporary segregated area established over international boundaries for specific operational requirements.
     * 
     */
    CBA("CBA"),

    /**
     * A control area is a controlled airspace extending upwards from a specified limit above the earth. ICAO Annex 2.
     * 
     */
    CTA("CTA"),

    /**
     * A control zone is a controlled airspace extending upwards from the surface of the earth to a specified upper limit. ICAO Annex 2.
     * 
     */
    CTR("CTR"),

    /**
     * CVSM : An airspace of defined dimensions within which CVSM (Conventional Vertical Separation Minima) is applied
     * 
     */
    CVSM("CVSM"),

    /**
     * A danger area is an airspace of defined dimensions within which activities dangerous to the flight may exist at specified times. ICAO Annex 15.
     * 
     */
    @XmlEnumValue("Danger area")
    DANGER_AREA("Danger area"),

    /**
     * An airspace block based on operational requirements and established regardless of State boundaries, where the provision of air navigation services and related functions is performance driven and optimised through enhances cooperation among air navigation service providers or, when appropriate, an integrated provider.  Regulation (EC) 1070/2009.
     * 
     */
    FAB("FAB"),

    /**
     * A flight information region (FIR) is an airspace of defined dimensions within which flight information service and alerting service are provided.  An upper information region (UIR) is an FIR in upper airspace. ICAO Annex 2.
     * 
     */
    @XmlEnumValue("FIR / UIR")
    FIR_UIR("FIR / UIR"),

    /**
     * A control area (TA) in lower airspace. ICAO Annex 2.
     * 
     */
    @XmlEnumValue("Lower Control Area (LTA)")
    LOWER_CONTROL_AREA_LTA("Lower Control Area (LTA)"),

    /**
     * A prohibited area is an airspace of defined dimensions, above the land or territorial waters of a State, within which the flight of an aircraft is prohibited. ICAO Annex 11.
     * 
     */
    @XmlEnumValue("Prohibited area")
    PROHIBITED_AREA("Prohibited area"),

    /**
     * A terminal control area is an area normally established at the confluence of ATS routes in the vicinity of one or more major aerodromes. ICAO Annex 2.
     * 
     */
    TMA("TMA"),

    /**
     * RVSM: An airspace of defined dimensions within which RVSM (Reduced Vertical Separation Minima) is applied
     *  
     *  RVSM: The approval that is issued by the appropriate authority of the State in which the Operator is based or of the State in which the aircraft is registered. To obtain such RVSM approval, Operators shall satisfy the said State : a) That aircraft for which the RVSM Approval is sought have the vertical navigation performance capability required for RVSM operations through compliance with the criteria of the RVSM Minimum Aircraft Systems Performance Specification ; b) That they have instituted procedures in respect of continued airworthiness (maintenance and repair) practices and programmes ; c) that they have instituted flight crew procedures for operations in the RVSM airspace.
     * 
     */
    RVSM("RVSM"),

    /**
     * A restricted area is an airspace of defined dimensions, above the land or territorial waters of a State, within which the flight of an aircraft is restricted in accordance with certain specified conditions. ICAO Annex 11
     * 
     */
    @XmlEnumValue("Restricted area")
    RESTRICTED_AREA("Restricted area"),

    /**
     * Transitional area: An area of defined dimensions designed for the purpose of ensuring the re-arrangement of aircraft flights levels when passing from a CVSM area to an RVSM area or vice versa
     * 
     */
    @XmlEnumValue("Transitional area")
    TRANSITIONAL_AREA("Transitional area"),

    /**
     * A temporary segregated area is an airspace of defined dimensions, within which activities require the reservation of airspace for the exclusive use of specific users during determined period of time.
     * 
     */
    TSA("TSA"),

    /**
     * A control area (TA) in upper airspace. ICAO Annex 2.
     * 
     */
    @XmlEnumValue("Upper Control Area (UTA)")
    UPPER_CONTROL_AREA_UTA("Upper Control Area (UTA)"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL155011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL155011 fromValue(String v) {
        for (VL155011 c: VL155011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

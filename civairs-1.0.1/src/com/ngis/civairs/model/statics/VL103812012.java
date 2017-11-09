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
 * <p>Classe Java pour VL1038_12_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1038_12_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aircraft stand"/>
 *     &lt;enumeration value="Baggage handling area"/>
 *     &lt;enumeration value="Cargo shed"/>
 *     &lt;enumeration value="De-icing/anti-icing pad"/>
 *     &lt;enumeration value="Engine run-up pad"/>
 *     &lt;enumeration value="Fuel farm"/>
 *     &lt;enumeration value="Intersection between taxiways"/>
 *     &lt;enumeration value="Near the aerodrome"/>
 *     &lt;enumeration value="Off aerodrome"/>
 *     &lt;enumeration value="Off movement area"/>
 *     &lt;enumeration value="On apron"/>
 *     &lt;enumeration value="On clearway"/>
 *     &lt;enumeration value="On rapid exit taxiway"/>
 *     &lt;enumeration value="On runway"/>
 *     &lt;enumeration value="On runway - 1st Part"/>
 *     &lt;enumeration value="On runway - 2nd Part"/>
 *     &lt;enumeration value="On runway - 3rd Part"/>
 *     &lt;enumeration value="On runway end safety area"/>
 *     &lt;enumeration value="On stopway"/>
 *     &lt;enumeration value="On taxiway"/>
 *     &lt;enumeration value="Passenger terminal"/>
 *     &lt;enumeration value="Runway turn pad"/>
 *     &lt;enumeration value="Runway/vehicle lane intersection"/>
 *     &lt;enumeration value="Vehicle lane"/>
 *     &lt;enumeration value="Vehicle movement area"/>
 *     &lt;enumeration value="Not applicable"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1038_12_0_1_2")
@XmlEnum
public enum VL103812012 {


    /**
     * Aircraft stand. A designated area on an apron intended to be used for parking an aircraft (ICAO Annex 14)
     * 
     */
    @XmlEnumValue("Aircraft stand")
    AIRCRAFT_STAND("Aircraft stand"),

    /**
     * Baggage handling area e.g. the baggage handling area in the terminal building
     * 
     */
    @XmlEnumValue("Baggage handling area")
    BAGGAGE_HANDLING_AREA("Baggage handling area"),

    /**
     * Cargo shed
     * 
     */
    @XmlEnumValue("Cargo shed")
    CARGO_SHED("Cargo shed"),

    /**
     * De-icing/anti-icing pad. An area comprising an inner area for the parking of an aeroplane to receive de-icing/anti-icing treatment and an outer area for the manoeuvring of two or more mobile de-icing/anti-icing equipment. ICAO Annex 14
     * 
     */
    @XmlEnumValue("De-icing/anti-icing pad")
    DE_ICING_ANTI_ICING_PAD("De-icing/anti-icing pad"),

    /**
     * Engine run-up pad
     * 
     */
    @XmlEnumValue("Engine run-up pad")
    ENGINE_RUN_UP_PAD("Engine run-up pad"),

    /**
     * Fuel farm: the fuel storage area
     * 
     */
    @XmlEnumValue("Fuel farm")
    FUEL_FARM("Fuel farm"),

    /**
     * Intersection between taxiways: A junction of two or more taxiways.
     * 
     */
    @XmlEnumValue("Intersection between taxiways")
    INTERSECTION_BETWEEN_TAXIWAYS("Intersection between taxiways"),

    /**
     * The occurrence occurred off the aerodrome but within 10 km from the aerodrome reference point. Aerodrome reference point: The designate geographical location of an aerodrome.
     * 
     */
    @XmlEnumValue("Near the aerodrome")
    NEAR_THE_AERODROME("Near the aerodrome"),
    @XmlEnumValue("Off aerodrome")
    OFF_AERODROME("Off aerodrome"),

    /**
     * Off movement area, e.g. off that part of a movement area intended for the landing or take-off of aircraft.
     * 
     */
    @XmlEnumValue("Off movement area")
    OFF_MOVEMENT_AREA("Off movement area"),

    /**
     * Apron. A defined area, on a land aerodrome, intended to accommodate aircraft for purposes of loading or unloading passengers, mail or cargo, fuelling, parking or maintenance (ICAO Annex 14)
     * 
     */
    @XmlEnumValue("On apron")
    ON_APRON("On apron"),

    /**
     * Clearway. A defined rectangular area on the ground or water under the control of the appropriate authority, selected or prepared as a suitable area over which an aeroplane may make a portion of its initial climb to a specified height. ICAO Annex 14
     * 
     */
    @XmlEnumValue("On clearway")
    ON_CLEARWAY("On clearway"),

    /**
     * Rapid exit taxiway. A taxiway connected to a runway at an acute angle and designed to allow landing aeroplanes to turn off at higher speeds than are achieved on other exit taxiways thereby minimizing runway occupancy times. ICAO Annex 14
     * 
     */
    @XmlEnumValue("On rapid exit taxiway")
    ON_RAPID_EXIT_TAXIWAY("On rapid exit taxiway"),

    /**
     * Runway. A defined rectangular area on a land aerodrome prepared for the landing and take-off of aircraft. ICAO Annex 14
     * 
     */
    @XmlEnumValue("On runway")
    ON_RUNWAY("On runway"),

    /**
     * The first part always means the first third of the runway as seen in the direction of landing.
     * 
     */
    @XmlEnumValue("On runway - 1st Part")
    ON_RUNWAY_1_ST_PART("On runway - 1st Part"),

    /**
     * The second part always means the second third of the runway as seen in the direction of landing.
     * 
     */
    @XmlEnumValue("On runway - 2nd Part")
    ON_RUNWAY_2_ND_PART("On runway - 2nd Part"),

    /**
     * The third part always means the last third of the runway as seen in the direction of landing.
     * 
     */
    @XmlEnumValue("On runway - 3rd Part")
    ON_RUNWAY_3_RD_PART("On runway - 3rd Part"),

    /**
     * Runway end safety area (RESA). An area symmetrical about the extended runway centre line and adjacent to the end of the strip primarily intended to reduce the risk of damage to an aeroplane undershooting or overrunning the runway.
     * ICAO Annex 14
     * 
     */
    @XmlEnumValue("On runway end safety area")
    ON_RUNWAY_END_SAFETY_AREA("On runway end safety area"),

    /**
     * Stopway. A defined rectangular area on the ground at the end of take-off run available prepared as a suitable area in which an aircraft can be stopped in the case of an abandoned take-off.  ICAO Annex 14
     * 
     */
    @XmlEnumValue("On stopway")
    ON_STOPWAY("On stopway"),

    /**
     * Taxiway. A defined path on a land aerodrome established or the taxiing of aircraft and intended to provide a link between one part of the aerodrome and another, including:
     * a) Aircraft stand taxilane. A portion of an apron designated as a taxiway and intended to provide access to aircraft stands only.
     * b) Apron taxiway. A portion of a taxiway system located on an apron and intended to provide a through taxi route across the apron. ICAO Annex 14.
     * 
     * Note: see separate entry for rapid exit taxiway.
     * 
     */
    @XmlEnumValue("On taxiway")
    ON_TAXIWAY("On taxiway"),

    /**
     * Passenger terminal
     * 
     */
    @XmlEnumValue("Passenger terminal")
    PASSENGER_TERMINAL("Passenger terminal"),

    /**
     * Runway turn pad
     * 
     */
    @XmlEnumValue("Runway turn pad")
    RUNWAY_TURN_PAD("Runway turn pad"),

    /**
     * Runway/vehicle lane intersection
     * 
     */
    @XmlEnumValue("Runway/vehicle lane intersection")
    RUNWAY_VEHICLE_LANE_INTERSECTION("Runway/vehicle lane intersection"),

    /**
     * Vehicle lane
     * 
     */
    @XmlEnumValue("Vehicle lane")
    VEHICLE_LANE("Vehicle lane"),

    /**
     * Vehicle movement area
     * 
     */
    @XmlEnumValue("Vehicle movement area")
    VEHICLE_MOVEMENT_AREA("Vehicle movement area"),
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable"),

    /**
     * The location of the occurrence on the aerodrome was other than those listed above.
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * The location of the occurrence on the aerodrome is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL103812012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL103812012 fromValue(String v) {
        for (VL103812012 c: VL103812012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

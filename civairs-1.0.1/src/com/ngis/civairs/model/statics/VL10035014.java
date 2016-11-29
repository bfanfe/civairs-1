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
 * <p>Classe Java pour VL1003_5_0_1_4.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1003_5_0_1_4">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aeronautical Information Services (AIS)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Advisory service"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Advisory service - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Advisory service - Radar"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Procedural control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar service"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Procedural control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Procedural control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar service"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other surveilance means"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Procedural control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar control"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar service"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Air Traffic Flow Management service (ATFMS)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Airspace Management service (ASMS)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Alerting service (ALRS)"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Flight Information Service"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Flight Information Service - Operator ground station"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Flight Information Service - Broadcast"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Flight Information Service - Other"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - Flight Information Service - Radar"/>
 *     &lt;enumeration value="Air Traffic Management (ATM) - No service"/>
 *     &lt;enumeration value="Communications, Navigation and Surveillance (CNS)"/>
 *     &lt;enumeration value="Meteorological services (MET)"/>
 *     &lt;enumeration value="Search and Rescue services (SAR)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1003_5_0_1_4")
@XmlEnum
public enum VL10035014 {


    /**
     * A service established within the defined area of coverage responsible for the provision of aeronautical information/data necessary for the safety, regularity and efficiency of air navigation. (An 15)
     *  (Definition added to An 15 as per Amdt 30, 2000/11/02.)
     *  Other Def.: Personnel and facilities employed to provide information pertaining to the availability of air navigation services and their associated procedures necessary for the safety, regularity and efficiency of air navigation (i.e. AIP, AIC, NOTAM, etc.).
     * 
     */
    @XmlEnumValue("Aeronautical Information Services (AIS)")
    AERONAUTICAL_INFORMATION_SERVICES_AIS("Aeronautical Information Services (AIS)"),

    /**
     * The primary component of Ground-Based ATM is Air Traffic Services (ATS), and the adjunct components are Airspace Management (ASM) and Air Traffic Flow Management (ATFM)
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM)")
    AIR_TRAFFIC_MANAGEMENT_ATM("Air Traffic Management (ATM)"),

    /**
     * A service provided within advisory airspace to ensure separation, in so far as practical, between aircraft which are operating on IFR flight plans.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Advisory service")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_ADVISORY_SERVICE("Air Traffic Management (ATM) - Air Traffic Advisory service"),
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Advisory service - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_ADVISORY_SERVICE_OTHER("Air Traffic Management (ATM) - Air Traffic Advisory service - Other"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Advisory service - Radar")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_ADVISORY_SERVICE_RADAR("Air Traffic Management (ATM) - Air Traffic Advisory service - Radar"),

    /**
     * Air traffic control service
     *  A service provided for the purpose of:
     *  a) preventing collisions:#between aircraft and on the manoeuvring area between aircraft and obstructions and
     *  b) expediting and maintaining an orderly flow of traffic
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC)")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC("Air Traffic Management (ATM) - Air Traffic Control service (ATC)"),

    /**
     * Air traffic control service for aerodrome traffic: All traffic on the manoeuvring area of an aerodrome and all aircraft flying in the vicinity of an aerodrome.#Note.- An aircraft is in the vicinity of an aerodrome when it is in, entering or leaving an aerodrome traffic circuit. (ICAO 9713-Aerodrome traffic)
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AERODROME("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome"),
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AERODROME_OTHER("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Other"),

    /**
     * Non-radar separation; procedural control.
     *  The type of separation used when aircraft position information is derived from sources other than radar.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Procedural control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AERODROME_PROCEDURAL_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Procedural control"),

    /**
     * Term used to indicate that radar derived information is employed directly in the provision of an air traffic control service.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AERODROME_RADAR_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar control"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar service")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AERODROME_RADAR_SERVICE("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Aerodrome - Radar service"),

    /**
     * Air traffic control service for arriving or departing controlled flights. A unit established to provide air traffic control service to controlled flights arriving at, or departing from, one or more aerodromes. (ICAO 9713- Approach control office)
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_APPROACH("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach"),
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_APPROACH_OTHER("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Other"),

    /**
     * Non-radar separation; procedural control.
     *  The separation used when aircraft position information is derived from sources other than radar.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Procedural control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_APPROACH_PROCEDURAL_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Procedural control"),

    /**
     * Term used to indicate that radar derived information is employed directly in the provision of an air traffic control service.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_APPROACH_RADAR_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar control"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_APPROACH_RADAR("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Approach - Radar"),

    /**
     * Air traffic control service for controlled flights in control areas. Area control centre; ACC#A unit established to provide air traffic control service to controlled flights in control areas under its jurisdiction.(ICAO 9713)
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area"),
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA_OTHER("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other"),

    /**
     * Non-radar separation; procedural control.
     *  The separation used when aircraft position information is derived from sources other than radar.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Procedural control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA_PROCEDURAL_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Procedural control"),

    /**
     * Term used to indicate that radar derived information is employed directly in the provision of an air traffic control service.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA_RADAR_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar control"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar service")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA_RADAR_SERVICE("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Radar service"),

    /**
     * Means involving other means than radar or procedural service
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other surveilance means")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_AREA_OTHER_SURVEILANCE_MEANS("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Area - Other surveilance means"),

    /**
     * Air traffic Control Service for controlled flights in areas over oceans
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_OCEANIC_AREA("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area"),
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_OCEANIC_AREA_OTHER("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Other"),

    /**
     * Non-radar separation; procedural control.
     *  The separation used when aircraft position information is derived from sources other than radar.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Procedural control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_OCEANIC_AREA_PROCEDURAL_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Procedural control"),

    /**
     * Term used to indicate that radar derived information is employed directly in the provision of an air traffic control service.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar control")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_OCEANIC_AREA_RADAR_CONTROL("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar control"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar service")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_CONTROL_SERVICE_ATC_OCEANIC_AREA_RADAR_SERVICE("Air Traffic Management (ATM) - Air Traffic Control service (ATC) - Oceanic area - Radar service"),

    /**
     * Is a generic term covering any management activity provided for the purpose of ensuring an optimum flow of traffic to or through areas during times when demand exceeds the available capacity of ATC system.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Air Traffic Flow Management service (ATFMS)")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIR_TRAFFIC_FLOW_MANAGEMENT_SERVICE_ATFMS("Air Traffic Management (ATM) - Air Traffic Flow Management service (ATFMS)"),

    /**
     * Is a generic term covering any management activity provided for the purpose of achieving the most efficient use of airspace based on actual needs and, where possible, avoiding permanent airspace segregation.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Airspace Management service (ASMS)")
    AIR_TRAFFIC_MANAGEMENT_ATM_AIRSPACE_MANAGEMENT_SERVICE_ASMS("Air Traffic Management (ATM) - Airspace Management service (ASMS)"),

    /**
     * A service provided to notify appropriate organisations regarding aircraft in need of search and rescue aid, and assist such organisations as required.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Alerting service (ALRS)")
    AIR_TRAFFIC_MANAGEMENT_ATM_ALERTING_SERVICE_ALRS("Air Traffic Management (ATM) - Alerting service (ALRS)"),

    /**
     * A service provided for the purpose of giving advice and information useful for the safe and efficient conduct of flights.
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Flight Information Service")
    AIR_TRAFFIC_MANAGEMENT_ATM_FLIGHT_INFORMATION_SERVICE("Air Traffic Management (ATM) - Flight Information Service"),

    /**
     * Flight Information Service via an operator ground station
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Flight Information Service - Operator ground station")
    AIR_TRAFFIC_MANAGEMENT_ATM_FLIGHT_INFORMATION_SERVICE_OPERATOR_GROUND_STATION("Air Traffic Management (ATM) - Flight Information Service - Operator ground station"),

    /**
     * A transmission of information relating to air navigation that is not addressed to a specific station or stations
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Flight Information Service - Broadcast")
    AIR_TRAFFIC_MANAGEMENT_ATM_FLIGHT_INFORMATION_SERVICE_BROADCAST("Air Traffic Management (ATM) - Flight Information Service - Broadcast"),
    @XmlEnumValue("Air Traffic Management (ATM) - Flight Information Service - Other")
    AIR_TRAFFIC_MANAGEMENT_ATM_FLIGHT_INFORMATION_SERVICE_OTHER("Air Traffic Management (ATM) - Flight Information Service - Other"),

    /**
     * Term used to indicate a service provided directly by means of radar
     * 
     */
    @XmlEnumValue("Air Traffic Management (ATM) - Flight Information Service - Radar")
    AIR_TRAFFIC_MANAGEMENT_ATM_FLIGHT_INFORMATION_SERVICE_RADAR("Air Traffic Management (ATM) - Flight Information Service - Radar"),
    @XmlEnumValue("Air Traffic Management (ATM) - No service")
    AIR_TRAFFIC_MANAGEMENT_ATM_NO_SERVICE("Air Traffic Management (ATM) - No service"),

    /**
     * Communications, navigation and surveillance (CNS) includes communication facilities, navigation services and surveillance systems. Communication facilities may be broadly classified under two main categories: aeronautical fixed service and aeronautical mobile service.
     * 
     */
    @XmlEnumValue("Communications, Navigation and Surveillance (CNS)")
    COMMUNICATIONS_NAVIGATION_AND_SURVEILLANCE_CNS("Communications, Navigation and Surveillance (CNS)"),

    /**
     * Meteorological services: those facilities and services that furnish aviation with meteorological forecasts, briefs and observations as well as SIGMET information, VOLMET broadcasting material and any other meteorological data provided by States for aeronautical use.
     * 
     */
    @XmlEnumValue("Meteorological services (MET)")
    METEOROLOGICAL_SERVICES_MET("Meteorological services (MET)"),

    /**
     * Any permanent civil establishment of equipment and personnel maintained for the purposes of providing search and rescue services.
     * 
     */
    @XmlEnumValue("Search and Rescue services (SAR)")
    SEARCH_AND_RESCUE_SERVICES_SAR("Search and Rescue services (SAR)");
    private final String value;

    VL10035014(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL10035014 fromValue(String v) {
        for (VL10035014 c: VL10035014 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

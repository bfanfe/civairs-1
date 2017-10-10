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
 * <p>Classe Java pour VL165_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL165_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Not applicable"/>
 *     &lt;enumeration value="NDB"/>
 *     &lt;enumeration value="NDB/DME"/>
 *     &lt;enumeration value="ILS - back course"/>
 *     &lt;enumeration value="ILS-complete"/>
 *     &lt;enumeration value="ILS-localizer"/>
 *     &lt;enumeration value="MLS"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="R-nav"/>
 *     &lt;enumeration value="TACAN"/>
 *     &lt;enumeration value="VOR/DME"/>
 *     &lt;enumeration value="VOR/TVOR"/>
 *     &lt;enumeration value="VORTAC"/>
 *     &lt;enumeration value="SRA"/>
 *     &lt;enumeration value="GNSS"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL165_5_0_1_1")
@XmlEnum
public enum VL1655011 {


    /**
     * i.e. there was no instrument approach
     * 
     */
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable"),

    /**
     * NDBs are used as fixes for instrument approaches but not primary sources of navigation; except for sparsely populated areas.
     * 
     */
    NDB("NDB"),
    @XmlEnumValue("NDB/DME")
    NDB_DME("NDB/DME"),

    /**
     * Under conventional ILS a back course ILS refers to a type of approach where an aircraft follows a localiser which provides lateral (left or right) guidance along a straight track to the runway when weather conditions prohibit a pilot from relying solely on visual cues. Since a back course approach does not provide precision or glide slope (vertical) guidance, this type of approach is referred to as a "non-precision" approach. The difference between a localizer 'front course' and a back course is that on a back course the signal from the localizer transmitter is reversed with reference to aircraft position."
     * 
     */
    @XmlEnumValue("ILS - back course")
    ILS_BACK_COURSE("ILS - back course"),

    /**
     * An ILS is an approach aid that employs two radio beams to provide pilots with vertical and horizontal guidance during the landing approach. The localizer provides azimuth guidance, while the glide-slope defines the correct vertical descent profile. Marker beacons and high intensity runways lights are also part of the ILS.
     * 
     */
    @XmlEnumValue("ILS-complete")
    ILS_COMPLETE("ILS-complete"),

    /**
     * An ILS is an approach aid employing two radio beams to provide pilots with vertical and horizontal guidance during the landing approach. The localizer provides azimuth guidance, while the glide-slope defines the correct vertical descent profile.
     * Under conventional ILS localizer only ILS refers to a type of approach where an aircraft follows a localizer which provides lateral (left or right) guidance along a straight track to the runway when weather conditions prohibit a pilot from relying solely on visual cues."
     * 
     */
    @XmlEnumValue("ILS-localizer")
    ILS_LOCALIZER("ILS-localizer"),

    /**
     * An instrument approach using a microwave-based instrument approach system that offers a number of advantages such as the ability to fly segmented and curved precision approaches.
     * 
     */
    MLS("MLS"),
    PAR("PAR"),

    /**
     * An instrument approach using R-nav which is a method of navigation that permits aircraft operation on any desired flight path within the coverage of station-referenced navigation aids or within the limits of the capability of self-contained aids, or a combination of these.
     * 
     */
    @XmlEnumValue("R-nav")
    R_NAV("R-nav"),

    /**
     * An instrument approach using a TACAN which is a UHF radio navigation system that provides a pilot with relative bearing and distance to a beacon on the ground, a ship, or to specially equipped aircraft. TACAN is the primary tactical air navigation system for the military services ashore and afloat.
     * 
     */
    TACAN("TACAN"),

    /**
     * An instrument approach using a DME which is a combination of ground and airborne equipment which gives a continuous slant range distance-from-station readout by measuring time-lapse of a signal transmitted by the aircraft to the station and responded back coupled with a VOR beacon to enable aircraft flight crew to measure their position relative to that beacon.
     * 
     */
    @XmlEnumValue("VOR/DME")
    VOR_DME("VOR/DME"),

    /**
     * A VOR is a radio navigation aid operating in the 108-118 MHz band. A VOR ground station transmits a two-phase directional signal through 360 deg. The aircraft's VOR receiver enables a pilot to identify his radial or bearing from/to the ground station.
     * 
     */
    @XmlEnumValue("VOR/TVOR")
    VOR_TVOR("VOR/TVOR"),

    /**
     * An instrument approach using a combined VOR and TACAN.
     * 
     */
    VORTAC("VORTAC"),

    /**
     * Surveillance Radar Approach
     * 
     */
    SRA("SRA"),

    /**
     * GNSS (Global Navigation Satellite System) is a satellite system that is used to pinpoint the geographic location of a user's receiver anywhere in the world. Two GNSS systems are currently in operation: the United States' Global Positioning System (GPS) and the Russian Federation's Global Orbiting Navigation Satellite System (GLONASS). A third, Europe's Galileo, is slated to reach full operational capacity in 2008. Each of the GNSS systems employs a constellation of orbiting satellites working in conjunction with a network of ground stations.
     * 
     * GNSS approach procedures: 7.2.3.1 Usually, flying a basic GNSS non-precision instrument approach procedure is very similar to a traditional approach. The differences include the navigational information displayed on the GNSS equipment control and display unit and the terminology used to describe some of  the features. Flying a basic GNSS approach is normally point-to-point navigation and independent of any ground based navaids, or as it is otherwise known, area navigation. 7.2.3.2 GNSS procedures utilize a straight line (TOTO) flight from waypoint to waypoint, as sequenced in the database., Slight differences between the published track and the track presented may occur. These differences are usually due to rounding of the track bearing and/or the application of magnetic variation.(ICAO PANS-OPS, Part I)
     * 
     * 
     * 
     */
    GNSS("GNSS"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL1655011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL1655011 fromValue(String v) {
        for (VL1655011 c: VL1655011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

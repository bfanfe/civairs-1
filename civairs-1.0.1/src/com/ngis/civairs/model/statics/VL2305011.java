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
 * <p>Classe Java pour VL230_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL230_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="Moderate"/>
 *     &lt;enumeration value="Heavy"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL230_5_0_1_1")
@XmlEnum
public enum VL2305011 {


    /**
     * Precipitation is moisture released from the atmosphere especially in large enough particles to fall sensibly except fog and mist. e.g. hail, snow, rain sleet and drizzle.
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Precipitation is moisture released from the atmosphere especially in large enough particles to fall sensibly except fog and mist. e.g. hail, snow, rain sleet and drizzle.
     *  
     *  Light:
     *  Rain: Individual drops easily identified, puddles form slowly, small streams may flow in gutters. 
     *  Drizzle: Can be felt on the face but is not visible. Produces little run off from roads or roofs. Generally visibility is reduced, but not less than 1000 m. 
     *  Snow: Small sparse flakes. Visibility generally reduced but not less than 1000 m. 
     *  Hail: Sparse hailstones of small size, often mixed with rain.
     * 
     */
    @XmlEnumValue("Light")
    LIGHT("Light"),

    /**
     * Precipitation is moisture released from the atmosphere especially in large enough particles to fall sensibly except fog and mist. e.g. hail, snow, rain sleet and drizzle.
     *  
     *  Moderate:
     *  Rain: Rapidly forming puddles, down pipes flowing freely, some spray visible over hard surfaces. 
     *  Drizzle: Window and road surfaces streaming with moisture. Visibility generally between 400 and 1000 m. 
     *  Snow: Large numerous flakes and visibility generally between 400-1000 m. 
     *  Hail: Particles numerous enough to whiten the ground.
     * 
     */
    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),

    /**
     * Precipitation is moisture released from the atmosphere especially in large enough particles to fall sensibly except fog and mist. e.g. hail, snow, rain sleet and drizzle.
     *  
     *  Heavy:
     *  Rain: Falls in sheets, misty spray over hard surfaces, may cause roaring noise on roof. 
     *  Drizzle: Visibility reduced to less than 400 m. 
     *  Snow: Numerous flakes of all sizes. Visibility generally reduced below 400 m. 
     *  Hail: A proportion of the hailstones exceed 6 mm diameter.
     * 
     */
    @XmlEnumValue("Heavy")
    HEAVY("Heavy"),

    /**
     * Precipitation is moisture released from the atmosphere especially in large enough particles to fall sensibly except fog and mist. e.g. hail, snow, rain sleet and drizzle.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2305011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2305011 fromValue(String v) {
        for (VL2305011 c: VL2305011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

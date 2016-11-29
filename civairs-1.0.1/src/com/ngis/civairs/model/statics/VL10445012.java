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
 * <p>Classe Java pour VL1044_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1044_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fire"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="Shutdown - Shutdown - fire warning"/>
 *     &lt;enumeration value="Shutdown - Shutdown - temperature"/>
 *     &lt;enumeration value="Shutdown - Shutdown - vibration"/>
 *     &lt;enumeration value="Shutdown - Shutdown - other"/>
 *     &lt;enumeration value="Uncontained failure"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1044_5_0_1_2")
@XmlEnum
public enum VL10445012 {


    /**
     * Uncontrolled fire: An uncontrolled fire should be interpreted in this
     * context as an extensive or persistent nacelle fire which is not effectively
     * confined to a designated fire zone or which cannot be extinguished by using
     * the aircraft means identified in the assumptions. Provision for flammable
     * fluid drainage, fire containment, fire detection, and fire extinguishing may
     * be taken into account when assessing the severity of the effects of a fire.
     * 
     */
    @XmlEnumValue("Fire")
    FIRE("Fire"),
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),
    @XmlEnumValue("Shutdown - Shutdown - fire warning")
    SHUTDOWN_SHUTDOWN_FIRE_WARNING("Shutdown - Shutdown - fire warning"),
    @XmlEnumValue("Shutdown - Shutdown - temperature")
    SHUTDOWN_SHUTDOWN_TEMPERATURE("Shutdown - Shutdown - temperature"),
    @XmlEnumValue("Shutdown - Shutdown - vibration")
    SHUTDOWN_SHUTDOWN_VIBRATION("Shutdown - Shutdown - vibration"),
    @XmlEnumValue("Shutdown - Shutdown - other")
    SHUTDOWN_SHUTDOWN_OTHER("Shutdown - Shutdown - other"),

    /**
     * Non-containment of high-energy debris: Cases where the engine casing was
     * unable to contain engine parts within the engine containment structure.
     * Uncontained debris cover a large spectrum of energy levels due to the
     * various sizes and velocities of parts released in an Engine Failure. The
     * Engine has a containment structure which is designed to withstand the consequences of the release of a single blade, and which is often adequate to contain additional released blades and static parts. The Engine containment structure is not expected to contain major rotating parts should they fracture. Discs, hubs, impellers, large
     * rotating seals, and other similar large rotating components should therefore
     * always be considered to represent potential high-energy debris. Service
     * experience has shown that, depending on their size and the internal
     * pressures, the rupture of the high-pressure casings can generate high-energy
     * debris. Casings may therefore need to be considered as a potential for
     * high-energy debris.
     * 
     */
    @XmlEnumValue("Uncontained failure")
    UNCONTAINED_FAILURE("Uncontained failure"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL10445012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL10445012 fromValue(String v) {
        for (VL10445012 c: VL10445012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

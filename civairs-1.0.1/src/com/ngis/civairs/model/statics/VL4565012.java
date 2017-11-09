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
 * <p>Classe Java pour VL456_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL456_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="Yes - Yes - by rotor / propeller wash / jet blast"/>
 *     &lt;enumeration value="Yes - Yes - by vortex"/>
 *     &lt;enumeration value="Yes - Yes - by fire"/>
 *     &lt;enumeration value="Yes - Yes - by impact"/>
 *     &lt;enumeration value="Yes - Yes - by fuel / fluid leak"/>
 *     &lt;enumeration value="Yes - Yes - by dispersed cargo"/>
 *     &lt;enumeration value="Yes - Yes - by other"/>
 *     &lt;enumeration value="Yes - Yes - by unknown"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL456_5_0_1_2")
@XmlEnum
public enum VL4565012 {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("Yes - Yes - by rotor / propeller wash / jet blast")
    YES_YES_BY_ROTOR_PROPELLER_WASH_JET_BLAST("Yes - Yes - by rotor / propeller wash / jet blast"),
    @XmlEnumValue("Yes - Yes - by vortex")
    YES_YES_BY_VORTEX("Yes - Yes - by vortex"),
    @XmlEnumValue("Yes - Yes - by fire")
    YES_YES_BY_FIRE("Yes - Yes - by fire"),
    @XmlEnumValue("Yes - Yes - by impact")
    YES_YES_BY_IMPACT("Yes - Yes - by impact"),
    @XmlEnumValue("Yes - Yes - by fuel / fluid leak")
    YES_YES_BY_FUEL_FLUID_LEAK("Yes - Yes - by fuel / fluid leak"),
    @XmlEnumValue("Yes - Yes - by dispersed cargo")
    YES_YES_BY_DISPERSED_CARGO("Yes - Yes - by dispersed cargo"),
    @XmlEnumValue("Yes - Yes - by other")
    YES_YES_BY_OTHER("Yes - Yes - by other"),
    @XmlEnumValue("Yes - Yes - by unknown")
    YES_YES_BY_UNKNOWN("Yes - Yes - by unknown"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL4565012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4565012 fromValue(String v) {
        for (VL4565012 c: VL4565012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

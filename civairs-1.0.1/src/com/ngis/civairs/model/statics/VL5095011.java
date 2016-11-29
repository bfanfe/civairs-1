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
 * <p>Classe Java pour VL509_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL509_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asphalt"/>
 *     &lt;enumeration value="Concrete"/>
 *     &lt;enumeration value="Grass"/>
 *     &lt;enumeration value="Gravel/dirt"/>
 *     &lt;enumeration value="Ice"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL509_5_0_1_1")
@XmlEnum
public enum VL5095011 {

    @XmlEnumValue("Asphalt")
    ASPHALT("Asphalt"),
    @XmlEnumValue("Concrete")
    CONCRETE("Concrete"),
    @XmlEnumValue("Grass")
    GRASS("Grass"),
    @XmlEnumValue("Gravel/dirt")
    GRAVEL_DIRT("Gravel/dirt"),
    @XmlEnumValue("Ice")
    ICE("Ice"),

    /**
     * Snow is precipitation in the form of feathery ice crystals or large agglomerations in the form of flakes. Snow is composed of millions of star-shaped hexagonal ice crystals. 
     * Snow (on the ground): Dry snow can be blown if loose or, if compacted by hand, will fall apart again upon release. Wet snow if compacted by hand, will stick together and tend to or form a snowball. Compacted snow has been compressed into a solid mass that resists further compression and will hold together or break up into lumps if picked up.
     * Snow should be differentiated from ice.
     * 
     */
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL5095011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL5095011 fromValue(String v) {
        for (VL5095011 c: VL5095011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

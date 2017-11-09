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
 * <p>Classe Java pour VL1160_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL1160_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fibre Can or Box"/>
 *     &lt;enumeration value="Glass"/>
 *     &lt;enumeration value="Metal Can, Tin or Tube"/>
 *     &lt;enumeration value="Metal Aerosol"/>
 *     &lt;enumeration value="Paper Bag"/>
 *     &lt;enumeration value="Plastic"/>
 *     &lt;enumeration value="Plastic Aerosol"/>
 *     &lt;enumeration value="Plastic Bag"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL1160_5_0_1_1")
@XmlEnum
public enum VL11605011 {

    @XmlEnumValue("Fibre Can or Box")
    FIBRE_CAN_OR_BOX("Fibre Can or Box"),
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    @XmlEnumValue("Metal Can, Tin or Tube")
    METAL_CAN_TIN_OR_TUBE("Metal Can, Tin or Tube"),
    @XmlEnumValue("Metal Aerosol")
    METAL_AEROSOL("Metal Aerosol"),
    @XmlEnumValue("Paper Bag")
    PAPER_BAG("Paper Bag"),
    @XmlEnumValue("Plastic")
    PLASTIC("Plastic"),
    @XmlEnumValue("Plastic Aerosol")
    PLASTIC_AEROSOL("Plastic Aerosol"),
    @XmlEnumValue("Plastic Bag")
    PLASTIC_BAG("Plastic Bag"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL11605011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL11605011 fromValue(String v) {
        for (VL11605011 c: VL11605011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

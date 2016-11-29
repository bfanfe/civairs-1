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
 * <p>Classe Java pour VL613_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL613_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Useful"/>
 *     &lt;enumeration value="False"/>
 *     &lt;enumeration value="Phantom"/>
 *     &lt;enumeration value="Unnecessary"/>
 *     &lt;enumeration value="Unclassifiable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL613_5_0_1_1")
@XmlEnum
public enum VL6135011 {


    /**
     * Useful:The ACAS system generated an advisory in accordance with its technical specifications in a situation where there was or would have been a risk of collision between the aircraft.
     * 
     */
    @XmlEnumValue("Useful")
    USEFUL("Useful"),

    /**
     * False:The ACAS II system generated an advisory in accordance with its technical specifications in a situation where there was not or would not have been a risk of collision between the aircraft.
     * 
     * 
     */
    @XmlEnumValue("False")
    FALSE("False"),

    /**
     * Phantom: A form of a false RA in which the ACAS system generated an advisory against a non existing threat aircraft.
     * 
     */
    @XmlEnumValue("Phantom")
    PHANTOM("Phantom"),

    /**
     * Unnecessary: The ACAS system generated an advisory in accordance with its technical specifications in a situation where there was not or would not have been a risk of collision between the aircraft.
     * 
     */
    @XmlEnumValue("Unnecessary")
    UNNECESSARY("Unnecessary"),

    /**
     * The ACAS system generated an advisory that cannot be classified because of insufficient data
     * 
     */
    @XmlEnumValue("Unclassifiable")
    UNCLASSIFIABLE("Unclassifiable");
    private final String value;

    VL6135011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL6135011 fromValue(String v) {
        for (VL6135011 c: VL6135011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

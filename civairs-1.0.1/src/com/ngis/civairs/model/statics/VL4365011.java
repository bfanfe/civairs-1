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
 * <p>Classe Java pour VL436_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL436_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Degraded ATM service"/>
 *     &lt;enumeration value="Service affect/partial"/>
 *     &lt;enumeration value="Service affect/serious"/>
 *     &lt;enumeration value="Inability to prov serv"/>
 *     &lt;enumeration value="No effect"/>
 *     &lt;enumeration value="Not determined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL436_5_0_1_1")
@XmlEnum
public enum VL4365011 {


    /**
     * An occurrence involving circumstances indicating that a total, serious or partial major inability to provide safe and non degraded ATM Services could have occurred, if the risk had not been managed/controlled by ATS personnel within safety regulatory requirements, even if this implied limitations in the provisions of ATM services.
     * 
     */
    @XmlEnumValue("Degraded ATM service")
    DEGRADED_ATM_SERVICE("Degraded ATM service"),

    /**
     *  An occurrence associated with the sudden and partial inability to provide ATM Services in compliance with applicable safety regulatory requirements. Example: Inability to maintain a safe ATM service within one or more airspace sectors without warning and for a significant period of time. The ATCO's workload increased significantly and he was provided with less information than required for normal operations. Limitations to ATM services were imposed and/or contingency Separation Measures weer applied to compensate for the loss or corrupted function(s) but the risk of infringing safe separation was high and multiple losses of separation did/could have occurred until traffic levels were reduced.
     * 
     */
    @XmlEnumValue("Service affect/partial")
    SERVICE_AFFECT_PARTIAL("Service affect/partial"),

    /**
     *  An occurrence associated with the total and sudden inability to provide ATM Services in compliance with applicable safety regulatory requirements. It involves circumstances indicating that the ability to provide ATM services is severely compromised and has the potential to impact many aircraft safe operations over a significant period of time.
     * 
     */
    @XmlEnumValue("Service affect/serious")
    SERVICE_AFFECT_SERIOUS("Service affect/serious"),

    /**
     *  An occurrence associated with the total inability to provide ATM Services in compliance with applicable safety regulatory requirements, where: - There is a sudden and non managed total loss of ATM service or situation awareness - There is a totally corrupted ATM service or corrupted information provided to ATS personnel. Example: Sudden inability to provide any degree of safe ATM service within several airspace sectors without warning and for a significant period of time. No contingency measure could be applied. ATCO loosing totally its ability to control the situation. Situation has every chance to lead to many accidents/serious incidents
     * 
     */
    @XmlEnumValue("Inability to prov serv")
    INABILITY_TO_PROV_SERV("Inability to prov serv"),
    @XmlEnumValue("No effect")
    NO_EFFECT("No effect"),
    @XmlEnumValue("Not determined")
    NOT_DETERMINED("Not determined");
    private final String value;

    VL4365011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4365011 fromValue(String v) {
        for (VL4365011 c: VL4365011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

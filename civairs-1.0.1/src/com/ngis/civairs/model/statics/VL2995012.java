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
 * <p>Classe Java pour VL299_5_0_1_2.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL299_5_0_1_2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Precipitations"/>
 *     &lt;enumeration value="Precipitations - Rain"/>
 *     &lt;enumeration value="Precipitations - Drizzle"/>
 *     &lt;enumeration value="Precipitations - Snow"/>
 *     &lt;enumeration value="Precipitations - Snow grains"/>
 *     &lt;enumeration value="Precipitations - Ice pellets"/>
 *     &lt;enumeration value="Precipitations - Hail"/>
 *     &lt;enumeration value="Precipitations - Small hail/snow pellets"/>
 *     &lt;enumeration value="Precipitations - Ice crystals"/>
 *     &lt;enumeration value="Obscurations"/>
 *     &lt;enumeration value="Obscurations - Mist"/>
 *     &lt;enumeration value="Obscurations - Smoke"/>
 *     &lt;enumeration value="Obscurations - Fog"/>
 *     &lt;enumeration value="Obscurations - Haze"/>
 *     &lt;enumeration value="Obscurations - Sand"/>
 *     &lt;enumeration value="Obscurations - Dust"/>
 *     &lt;enumeration value="Obscurations - Volcanic ash"/>
 *     &lt;enumeration value="Other phenomena"/>
 *     &lt;enumeration value="Other phenomena - Dust/sand whirls"/>
 *     &lt;enumeration value="Other phenomena - Squall"/>
 *     &lt;enumeration value="Other phenomena - Sandstorm"/>
 *     &lt;enumeration value="Other phenomena - Duststorm"/>
 *     &lt;enumeration value="Other phenomena - Funnel cloud"/>
 *     &lt;enumeration value="Other phenomena - Tornado or waterspout"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL299_5_0_1_2")
@XmlEnum
public enum VL2995012 {


    /**
     * Precipitations
     * 
     */
    @XmlEnumValue("Precipitations")
    PRECIPITATIONS("Precipitations"),

    /**
     * Rain is precipitation in the form of water droplets making a noticeable impact. Ranges in size from 1 to 5.5 mm.
     * 
     * Rain shower: Liquid precipitation that stops and starts  suddenly and varies widely in intensity, and is gone in less than an hour.
     * 
     * Freezing rain is the precipitation of supercooled raindrops.Freezing rain freezes on impact and forms a coat of ice on the ground and on the objects they strike. They occur when the air temperature is below zero Celsius near the ground but above zero Celsius higher up.
     * 
     */
    @XmlEnumValue("Precipitations - Rain")
    PRECIPITATIONS_RAIN("Precipitations - Rain"),

    /**
     * Fairly uniform precipitation (rain) composed exclusively of very small water droplets (less than 0.5 mm in diameter) very close to one another.
     * 
     * In drizzle, the water droplets are fine and minute--much smaller than in rain--and appear to float in the air.
     * 
     * Freezing drizzle is the precipitation of supercooled raindrops.Freezing drizzle freezes on impact and forms a coat of ice on the ground and on the objects they strike. They occur when the air temperature is below zero Celsius near the ground but above zero Celsius higher up.
     * 
     */
    @XmlEnumValue("Precipitations - Drizzle")
    PRECIPITATIONS_DRIZZLE("Precipitations - Drizzle"),

    /**
     * Snow is precipitation in the form of feathery ice crystals or large agglomerations in the form of flakes. Snow is composed of millions of star-shaped hexagonal ice crystals. 
     * 
     * When the term snow is used without qualification, it means precipitation of significant duration and extent. A flurry or snow shower is a snowfall that suddenly stops and starts and changes rapidly in intensity; the accumulation and extent of the snow are limited. A snow squall brings strong winds, flurries and poor visibility.
     * 
     * Blowing snow is lifted by the wind from the earth's surface to a height of 2 m or more, whereas drifting snow is blown to a height of less than 2 m. A blizzard is a severe storm that lasts three or more hours, and brings low temperatures, strong winds and poor visibility due to blowing snow.
     * 
     * Snow shower: Frozen precipitation in the form of snow, characterized by its sudden beginning and ending. It is reported as "SHSN" in an observation and on the METAR.
     * 
     */
    @XmlEnumValue("Precipitations - Snow")
    PRECIPITATIONS_SNOW("Precipitations - Snow"),

    /**
     * Snow grains are minute, white and opaque grains of ice. When they hit hard ground, they do not bounce or shatter. They usually fall in very small quantities, and never in the form of a shower.
     * 
     * Snow is precipitation in the form of feathery ice crystals or large agglomerations in the form of flakes. Snow is composed of millions of star-shaped hexagonal ice crystals.
     * 
     */
    @XmlEnumValue("Precipitations - Snow grains")
    PRECIPITATIONS_SNOW_GRAINS("Precipitations - Snow grains"),

    /**
     * Ice pellets are tiny, translucent frozen raindrops or snowflakes, or snow encased in ice, which bounce and make a sound on contact with the ground. 
     * 
     */
    @XmlEnumValue("Precipitations - Ice pellets")
    PRECIPITATIONS_ICE_PELLETS("Precipitations - Ice pellets"),

    /**
     * Hail is precipitation in the form of lumps of ice, larger than ice pellets, usually the size of peas or cherries but sometimes as large as oranges. Often associated with thunderstorms, hail forms when drafts carry raindrops upward into extremely cold regions of the atmosphere. There, the drops freeze and merge into lumps of ice. When the lumps become too heavy to be supported by the updraft, they fall to the ground at high speeds. 
     * 
     */
    @XmlEnumValue("Precipitations - Hail")
    PRECIPITATIONS_HAIL("Precipitations - Hail"),

    /**
     * Snow pellets are brittle and easily crushed; when they fall on hard ground, they bounce and often break up. They always occur in showers and are often accompanied by snow flakes or rain drops, when the surface temperature is around zero Celsius.
     * 
     */
    @XmlEnumValue("Precipitations - Small hail/snow pellets")
    PRECIPITATIONS_SMALL_HAIL_SNOW_PELLETS("Precipitations - Small hail/snow pellets"),

    /**
     * Ice crystals are tiny sprinkles that sparkle in the sunshine like diamond dust and hang in the air.
     * 
     */
    @XmlEnumValue("Precipitations - Ice crystals")
    PRECIPITATIONS_ICE_CRYSTALS("Precipitations - Ice crystals"),

    /**
     * Obscurations
     * 
     */
    @XmlEnumValue("Obscurations")
    OBSCURATIONS("Obscurations"),

    /**
     * Mist is microscopic water droplets suspended in the air. It casts a thin greyish veil over the landscape but reduces visibility to a lesser extent than fog. Visibility is over 1000m but do not exceed 5000m (ICAO Annex 3).
     * 
     */
    @XmlEnumValue("Obscurations - Mist")
    OBSCURATIONS_MIST("Obscurations - Mist"),
    @XmlEnumValue("Obscurations - Smoke")
    OBSCURATIONS_SMOKE("Obscurations - Smoke"),

    /**
     * Fog: cloud at ground level, and occurs when air is cooled to its dew point and below, or when atmosperic moisture increases through evaporation from water that is warmer than the air. Visibility is below 1000m (ICAO Annex 3).
     * 
     */
    @XmlEnumValue("Obscurations - Fog")
    OBSCURATIONS_FOG("Obscurations - Fog"),

    /**
     * Haze consists of fine particles of dust and pollution suspended in the atmosphere, and is distinguished from fog by its bluish or yellowish tinge.
     * 
     */
    @XmlEnumValue("Obscurations - Haze")
    OBSCURATIONS_HAZE("Obscurations - Haze"),
    @XmlEnumValue("Obscurations - Sand")
    OBSCURATIONS_SAND("Obscurations - Sand"),
    @XmlEnumValue("Obscurations - Dust")
    OBSCURATIONS_DUST("Obscurations - Dust"),
    @XmlEnumValue("Obscurations - Volcanic ash")
    OBSCURATIONS_VOLCANIC_ASH("Obscurations - Volcanic ash"),

    /**
     * Other phenomena
     * 
     */
    @XmlEnumValue("Other phenomena")
    OTHER_PHENOMENA("Other phenomena"),
    @XmlEnumValue("Other phenomena - Dust/sand whirls")
    OTHER_PHENOMENA_DUST_SAND_WHIRLS("Other phenomena - Dust/sand whirls"),

    /**
     * A line squall is a violent cold front characterized by a sudden drop in temperature, a rise in pressure, thunderstorms and especially severe vertical and other gusts.
     * 
     * A squall comprises a rather sudden increase of the mean wind speed which lasts for several minutes at least before the mean wind returns to near its previous value. A squall may include many gusts.
     * 
     */
    @XmlEnumValue("Other phenomena - Squall")
    OTHER_PHENOMENA_SQUALL("Other phenomena - Squall"),

    /**
     * A storm which carries large amounts of sand into the atmosphere. Ensemble of particles of sand energetically lifted to great heights by a strong and turbulent wind.
     * 
     */
    @XmlEnumValue("Other phenomena - Sandstorm")
    OTHER_PHENOMENA_SANDSTORM("Other phenomena - Sandstorm"),

    /**
     * Dust storm: A severe weather condition characterized by strong winds and dust-filled air over a large area.V Visibility is reduced to between 5/8ths and 5/16ths statute mile. It is reported as "DS" in an observation and on the METAR. 
     * 
     */
    @XmlEnumValue("Other phenomena - Duststorm")
    OTHER_PHENOMENA_DUSTSTORM("Other phenomena - Duststorm"),
    @XmlEnumValue("Other phenomena - Funnel cloud")
    OTHER_PHENOMENA_FUNNEL_CLOUD("Other phenomena - Funnel cloud"),

    /**
     * A tornado is a localized violent wind with such low pressure in the core as to explode structures in its path. The tornado is usually pendant beneath a cumulonimbus cloud. A tornado appears as a violent funnel-shaped wind vortex in the lower atmosphere with upward spiralling winds of high speeds. The tornado usually appears from a bulge in the base of a thunderstorm cloud. It has a typical width of tens to hundreds of metres and a lifespan of minutes to hours. In extent, it is one of the smallest of all storms, but in violence, it is among the world's most severe.
     * 
     * Waterspout: A violently rotating column of air, usually a pendant to a cumulus or cumulonimbus cloud, over a body of water with its circulation reaching the water. In the summer and spring, these phenomena are usually "tornadoes over water" that have been generated by thunderstorms. In the fall months, these most often begin as "cold air funnels", being generated by a cold air mass passing over much warmer waters. Such waterspouts are generally much less intense than tornadoes and usually dissipate upon approaching shore. Waterspouts are most common over tropical or subtropical waters. The exact definition of waterspout is debatable. In most cases the term is reserved for small vortices over water that are not associated with storm-scale rotation (i.e., they are the water-based equivalent of landspouts). But there is sufficient justification for calling virtually any rotating column of air a waterspout if it is in contact with a water surface. 
     * 
     */
    @XmlEnumValue("Other phenomena - Tornado or waterspout")
    OTHER_PHENOMENA_TORNADO_OR_WATERSPOUT("Other phenomena - Tornado or waterspout"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    VL2995012(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL2995012 fromValue(String v) {
        for (VL2995012 c: VL2995012 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

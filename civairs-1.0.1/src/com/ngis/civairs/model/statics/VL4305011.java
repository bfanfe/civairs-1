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
 * <p>Classe Java pour VL430_5_0_1_1.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VL430_5_0_1_1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADRM: Aerodrome"/>
 *     &lt;enumeration value="AMAN: Abrupt maneuvre"/>
 *     &lt;enumeration value="ARC: Abnormal runway contact"/>
 *     &lt;enumeration value="ATM: ATM/CNS"/>
 *     &lt;enumeration value="BIRD: Birdstrike"/>
 *     &lt;enumeration value="CABIN: Cabin safety events"/>
 *     &lt;enumeration value="CFIT: Controlled flight into or toward terrain"/>
 *     &lt;enumeration value="CTOL: Collision with obstacle(s) during take-off and landing"/>
 *     &lt;enumeration value="EVAC: Evacuation"/>
 *     &lt;enumeration value="EXTL: External load related occurrences"/>
 *     &lt;enumeration value="F-NI: Fire/smoke (non-impact)"/>
 *     &lt;enumeration value="F-POST: Fire/smoke (post-impact)"/>
 *     &lt;enumeration value="FUEL: Fuel related"/>
 *     &lt;enumeration value="GCOL: Ground Collision"/>
 *     &lt;enumeration value="GTOW: Glider towing related events"/>
 *     &lt;enumeration value="ICE: Icing"/>
 *     &lt;enumeration value="LALT: Low altitude operations"/>
 *     &lt;enumeration value="LOC-G: Loss of control - ground"/>
 *     &lt;enumeration value="LOC-I: Loss of control - inflight"/>
 *     &lt;enumeration value="LOLI: Loss of lifting conditions en-route"/>
 *     &lt;enumeration value="MAC: Airprox/ ACAS alert/ loss of separation/ (near) midair collisions"/>
 *     &lt;enumeration value="MED: Medical"/>
 *     &lt;enumeration value="NAV: Navigation error"/>
 *     &lt;enumeration value="OTHR: Other"/>
 *     &lt;enumeration value="RAMP: Ground Handling"/>
 *     &lt;enumeration value="RE: Runway excursion"/>
 *     &lt;enumeration value="RI: Runway incursion - vehicle, aircraft or person"/>
 *     &lt;enumeration value="SCF-NP: System/component failure or malfunction [non-powerplant]"/>
 *     &lt;enumeration value="SCF-PP: powerplant failure or malfunction"/>
 *     &lt;enumeration value="SEC: Security related"/>
 *     &lt;enumeration value="TURB: Turbulence encounter"/>
 *     &lt;enumeration value="UIMC: Unintended flight in IMC"/>
 *     &lt;enumeration value="UNK: Unknown or undetermined"/>
 *     &lt;enumeration value="USOS: Undershoot/overshoot"/>
 *     &lt;enumeration value="WILD: Collision Wildlife"/>
 *     &lt;enumeration value="WSTRW: Windshear or thunderstorm."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VL430_5_0_1_1")
@XmlEnum
public enum VL4305011 {


    /**
     * Usage Notes: Occurrences do not necessarily involve an aircraft. 
     * 
     * Includes: 
     * - Deficiencies/issues associated with State-approved Aerodromes and Heliports, including: 
     * o Runways and Taxiways 
     * o Buildings and structures 
     * o Crash/Fire/Rescue (CFR) services 
     * o Obstacles on the Aerodrome property 
     * o Lighting, markings, and signage 
     * o Procedures, policies, and standards 
     * - Deficiencies with snow, frost, or ice removal from aerodrome surfaces 
     * - Closed runways, improperly marked runways, construction interference, lighting failures, signage limitations, etc. 
     * -Effects of Aerodrome Design (See crossovers below) 
     * - Loose foreign objects on aerodromes and heliports (See exceptions below) 
     * - Failures of glider winch launch equipment (See crossovers below) 
     * 
     * Does NOT include: 
     * - Deficiencies or loose foreign objects at unprepared or natural landing sites, which are coded as OTHR. 
     * - Occurrences related to snow, frost, or ice removal from aircraft, which are coded as RAMP. 
     * 
     * Crossover to/from other occurrence categories: 
     * - For effects of aerodrome design, code both ADRM and the phenomenon encountered. For example, building layout and architecture leading to surface wind disruptions would be coded as both ADRM and WSTRW or TURB, as appropriate. 
     * - If a glider winch launch equipment failure causes an event meeting the criteria for the GTOW category, code both ADRM and GTOW. 
     * 
     * 
     */
    @XmlEnumValue("ADRM: Aerodrome")
    ADRM_AERODROME("ADRM: Aerodrome"),

    /**
     * Usage Notes:
     * • This category includes the intentional maneuvering of the aircraft to avoid a collision with terrain, objects/obstacles, weather or other aircraft (Note: The effect of intentional maneuvering is the key consideration).
     * • Abrupt maneuvering may also result in a loss of control or system/component failure or malfunction. In this case, the event is coded under both categories (e.g., AMAN and Loss of Control–Inflight (LOC–I), AMAN and System/Component Failure or Malfunction (Non- Powerplant) (SCF–NP), or AMAN and System/Component Failure or Malfunction
     * (Powerplant) (SCF–PP)).
     * • Abrupt maneuvering may also occur on ground; examples include hard braking maneuver, rapid change of direction to avoid collisions, etc.
     * 
     * 
     */
    @XmlEnumValue("AMAN: Abrupt maneuvre")
    AMAN_ABRUPT_MANEUVRE("AMAN: Abrupt maneuvre"),

    /**
     * ABNORMAL RUNWAY CONTACT (ARC)
     * Any landing or takeoff involving abnormal runway or landing surface contact.
     * Usage Notes:
     * • Events such as hard/heavy landings, long/fast landings, off center landings, crabbed landings, nose wheel first touchdown, tail strikes, and wingtip/nacelle strikes are included in this category.
     * • Gear-up landings are also recorded here. However, if a system/component failure or malfunction occurred, which led to the gear up landing, the event is also coded under the appropriate system/component failure or malfunction category.
     * • Do not use this category for runway contacts after losing control, e.g., runway contact after takeoff.
     * • Occurrences in which the gear collapses during the takeoff run or the landing roll are not included here except if a condition in the usage notes above has been met.
     * NOTE: Throughout this document the term runway or landing area is taken in its broadest sense and includes runways, landing strips, waterways, unimproved landing areas, and landing pads (which may include offshore platforms, building roofs, roads, ships, and fields), or other landing areas.
     * NOTE: Does not include helicopter hard/heavy landings after an off-field emergency
     * autorotation when there was no intention to land before the autorotation was entered.
     * NOTE: Includes (tail) rotor striking the intended landing surface during takeoff and landing. However, collisions with obstacles during takeoff and landing, such as trees or walls, should be coded under Collision With Obstacle(s) During Takeoff and Landing (CTOL).
     * NOTE: Does not include off-field landing by gliders.
     * 
     * 
     */
    @XmlEnumValue("ARC: Abnormal runway contact")
    ARC_ABNORMAL_RUNWAY_CONTACT("ARC: Abnormal runway contact"),

    /**
     * Usage Notes:
     * • Includes ATC facility/personnel failure/degradation, CNS service failure/degradation, procedures, policies, and standards
     * • Examples include, NAVAID outage, NAVAID service error, controller error, Supervisor error, ATC computer failure, Radar failure, and navigation satellite failure
     * • Occurrences do not necessarily involve an aircraft.
     * 
     * NOTE: ATM includes all of the facilities, equipment, personnel, and procedures involved in the provision of state-approved Air Traffic Services.
     * 
     * 
     * 
     */
    @XmlEnumValue("ATM: ATM/CNS")
    ATM_ATM_CNS("ATM: ATM/CNS"),

    /**
     * A collision / near collision with or ingestion of one or several birds.
     * 
     * Usage Notes:
     * • May occur in any phase of flight
     * 
     * NOTE: Bird strikes were previously categorized as "other". Users may wish to update their historic data by replacing "other" with "BIRD" where the occurrence involved a bird strike.
     * 
     */
    @XmlEnumValue("BIRD: Birdstrike")
    BIRD_BIRDSTRIKE("BIRD: Birdstrike"),

    /**
     * Usage Notes: 
     * 
     * Includes: 
     * - Events related to carry-on baggage, supplemental oxygen, or missing/non-operational cabin emergency equipment. 
     * - Inadvertent deployment of emergency equipment. 
     * - Injuries of persons while in the passenger cabin of an aircraft (see below for exceptions). 
     * 
     * Does NOT include: 
     * - Injuries sustained as a result of— 
     * o Thunderstorms and/or wind shear, which are coded as WSTRW; 
     * o Turbulence (excluding turbulence caused by wind shear and/or thunderstorms), which is coded as TURB; 
     * o Intentional acts (suicide, homicide, acts of violence, self-inflicted injury, or laser attacks), which are coded as SEC; 
     * o Icing events, which are coded as ICE. 
     * -Illnesses or non-injury medical emergencies, which are coded as Medical (MED). 
     * 
     * Crossover to/from other occurrence categories: 
     * - Medical emergencies involving persons other than crew members or a medical evacuation patient were coded as CABIN before October 2013. All medical emergencies are now coded as MED. 
     * 
     * 
     */
    @XmlEnumValue("CABIN: Cabin safety events")
    CABIN_CABIN_SAFETY_EVENTS("CABIN: Cabin safety events"),

    /**
     * Usage Notes:
     * • Use only for occurrences during airborne phases of flight.
     * • Includes collisions with those objects extending above the surface (for example, towers, trees, power lines, cable car support, transport wires, power cables, telephone lines and aerial masts).
     * • Can occur during either Instrument Meteorological Conditions (IMC) or Visual Meteorological Conditions (VMC).
     * • Includes instances when the cockpit crew is affected by visual illusions or degraded visual environment (e.g., black hole approaches and helicopter operations in brownout or whiteout conditions) that result in the aircraft being flown under control into terrain, water, or obstacles.
     * • If control of the aircraft is lost (induced by crew, weather or equipment failure), do not use this category, use Loss of Control–Inflight (LOC–I) instead.
     * • For an occurrence involving intentional low altitude operations (e.g., crop dusting, aerial work operations close to obstacles, and Search and Rescue (SAR) operations close to water or ground surface) use the Low Altitude Operations (LALT) code instead of CFIT.
     * • Do not use this category for occurrences involving intentional flight into/toward terrain in manned aircraft or intentional ground impact of unmanned aircraft. Code all collisions with obstacles during takeoff and landing under Collision With Obstacle(s) During Takeoff and Landing (CTOL). Code all suicides under Security Related (SEC) events. Code system, equipment, or command and control failures involving unmanned aircraft under System/Component Failure or Malfunction (Non-Powerplant) (SCF–NP) or LOC–I as applicable.
     * • Do not use this category for occurrences involving runway undershoot/overshoot, which are classified as Undershoot/Overshoot (USOS).
     * • Includes flying into terrain during transition into forward flight.
     * • For helicopter operations, not to be used for takeoff and landing phases, except when the occurrence involves flying into terrain without indication of loss of control during transition into forward flight.
     * 
     * 
     */
    @XmlEnumValue("CFIT: Controlled flight into or toward terrain")
    CFIT_CONTROLLED_FLIGHT_INTO_OR_TOWARD_TERRAIN("CFIT: Controlled flight into or toward terrain"),

    /**
     * Usage Notes:
     * • For all aircraft (excluding rotorcraft), to be used only in cases where the crew was aware of the true location of the obstacle, but its clearance from the aircraft flightpath was inadequate.
     * • Includes contact with obstacles, such as vegetation, trees and walls, snow drifts, power cables, telegraph wires and antennae, offshore platforms, maritime vessels and structures, land structures and buildings.
     * • Includes collisions during take-off to and landing from the hover.
     * • Includes water obstacles during take-off from water (e.g. waves, dead-heads, ships, swimmers). 
     * • Not to be used for occurrences classified under Controlled Flight Into or Toward Terrain (CFIT), Loss of Control–Inflight (LOC–I) or System/Component Failure or Malfunction (Powerplant)(SCF–PP).
     * 
     */
    @XmlEnumValue("CTOL: Collision with obstacle(s) during take-off and landing")
    CTOL_COLLISION_WITH_OBSTACLE_S_DURING_TAKE_OFF_AND_LANDING("CTOL: Collision with obstacle(s) during take-off and landing"),

    /**
     * Usage Notes:
     * • Includes cases where an injury(ies) was(were) sustained during the evacuation through an emergency exit or main cabin door.
     * • Includes cases where the evacuation itself is the accident (in essence, had there not been an evacuation there would not have been an accident).
     * • An unnecessary evacuation is one that was either erroneously commanded by the crew or uncommanded.
     * • Only used for passenger carrying operations involving transport category aircraft.
     * • Includes evacuation following a ditching or survivable crash landing in water provided one of the conditions above are met.
     * 
     */
    @XmlEnumValue("EVAC: Evacuation")
    EVAC_EVACUATION("EVAC: Evacuation"),

    /**
     * Usage Notes:
     * • Includes cases where external load or the load lifting equipment used (e.g. long line, cable) contacts terrain, water surface or objects.
     * • Includes cases where the load or, in the absence of a load, the load lifting equipment strikes or becomes entangled with the main rotor, tail rotor, or the helicopter fuselage.
     * • Includes injuries to ground crew handling external loads as result of contact with/dropping/inadvertent release of external load.
     * • Includes ground injuries to ground crew handling external loads due to the downwash effect or falling branch, trees etc.
     * • Includes external hoist, human external cargo, long lines.
     * • If the preparation of the external load by ground crew played a role, also code under RAMP.
     * • Failures or malfunctions of the onboard external load handling lifting equipment or release systems should be coded under SCF-NP, as these are considered to be aircraft systems.
     * 
     */
    @XmlEnumValue("EXTL: External load related occurrences")
    EXTL_EXTERNAL_LOAD_RELATED_OCCURRENCES("EXTL: External load related occurrences"),

    /**
     * Usage Notes:
     * • Includes fire due to a combustive explosion from an accidental ignition source.
     * • Includes fire and smoke from system/component failures/malfunctions in the cockpit, passenger cabin, or cargo area.
     * • Non-combustive explosions such as tire burst and pressure bulkhead failures are coded under System/Component Failure - Non-Powerplant (SCF-NP).
     * • Fire/Smoke resulting from an accident impact is coded under Fire/Smoke (post-impact) (F-POST).	
     * 
     * 
     */
    @XmlEnumValue("F-NI: Fire/smoke (non-impact)")
    F_NI_FIRE_SMOKE_NON_IMPACT("F-NI: Fire/smoke (non-impact)"),

    /**
     * Usage Notes:
     * • This category is only used for occurrences where post impact fire was a factor in the outcome.
     * • This category is only used in conjunction with another category. For example: a system/component failure that also results in a post-impact fire will be coded as SCF-PP and F-POST or SCF-NP and F-POST.
     * 
     * 
     * 
     */
    @XmlEnumValue("F-POST: Fire/smoke (post-impact)")
    F_POST_FIRE_SMOKE_POST_IMPACT("F-POST: Fire/smoke (post-impact)"),

    /**
     * Usage Notes:
     * • The following fuel related definitions are provided for clarity:
     * - Exhaustion: No usable fuel remains on the aircraft.
     * - Starvation/mismanagement: Usable fuel remains on the aircraft, but it is not available to the engines.
     * - Contamination: Any foreign substance (for example: water, oil, ice, dirt, sand, bugs) in the correct type of fuel for the given powerplant(s).
     * - Wrong fuel: Fuel supplied to the powerplant(s) is incorrect, for example: Jet A into a piston powerplant, 80 octane into a powerplant requiring 100 octane.
     * 
     * • Includes cockpit crew or ground crew-induced fuel-related problems that are not the result of mechanical failures. Interruptions of the fuel supply caused by mechanical failures are coded elsewhere as non-powerplant or powerplant system/component failures (SCF-NP or SCF-PP), as appropriate.
     * 
     * • Also used when the wrong fuel causes a powerplant failure (e.g., through detonation). In this case it should be coded as FUEL, not as a system/component failure or malfunction- powerplant (SCF-PP).
     * 
     * • Includes cases where there was a high risk of fuel exhaustion but there was no actual loss of power.
     * 
     */
    @XmlEnumValue("FUEL: Fuel related")
    FUEL_FUEL_RELATED("FUEL: Fuel related"),

    /**
     * Usage Notes:
     * • Includes collisions with an aircraft, person, ground vehicle, obstacle, building, structure, etc. while on a surface other than the runway used for landing or intended for takeoff.
     * • Ground collisions resulting from events categorized under Runway Incursion (RI), Wildlife (WILD) or Ground Handling (RAMP) are excluded from this category.
     * 
     * NOTE: Taxiing includes ground and air taxiing for rotorcraft on designated taxiways.
     * 
     * 
     * 
     */
    @XmlEnumValue("GCOL: Ground Collision")
    GCOL_GROUND_COLLISION("GCOL: Ground Collision"),

    /**
     * Usage Notes:
     * • Applicable both to aircraft under tow by winch or by another aircraft or to aircraft executing towing.
     * • To be used in events only after reaching airborne phase.
     * • Includes loss of control because of entering the towing aircraft's wake turbulence and events where of airspeed is out of limits during tow.
     * 
     */
    @XmlEnumValue("GTOW: Glider towing related events")
    GTOW_GLIDER_TOWING_RELATED_EVENTS("GTOW: Glider towing related events"),

    /**
     * Usage Notes:
     * • Includes accumulations that occur inflight or on the ground (i.e., deicing-related).
     * • Carburetor and induction icing events are coded in the FUEL Related (FUEL) category.
     * • Windscreen icing which restricts visibility is also covered here.
     * • Includes ice accumulation on sensors, antennae, and other external surfaces.
     * • Includes ice accumulation on external surfaces including those directly in front of the engine intakes.
     * 
     * 
     * 
     */
    @XmlEnumValue("ICE: Icing")
    ICE_ICING("ICE: Icing"),

    /**
     * Usage Notes:
     * • ‘Terrain’ includes: water, vegetation, rocks, and other natural elements laying, on or growing out of, the earth.
     * • Includes ostentatious display, manoeuvring at low height, aerobatics, sight seeing, demonstration flights, aerial inspection, avalanche mining, human hoist or human cargo sling, search and rescue operations, aerial application, intentional helicopter operations close to obstacles during aerial work and scud running (ducking under low visibility conditions).
     * • Also includes intentional manoeuvring in close proximity to cliffs, mountains, into box canyons, and similar flights where the aircraft aerodynamic capability is not sufficient to avoid impact.
     * • If there is a loss of control during low altitude operations, both loss of control – inflight (LOC-I) and LALT are coded.
     * • NOTE: excluding rotorcraft air taxi phase of flight.
     * • NOTE: includes maneuvering at low height while searching for an off-aerodrome landing location.	
     * 
     * Do not use LALT in conjunction with CFIT.
     * 
     * 
     */
    @XmlEnumValue("LALT: Low altitude operations")
    LALT_LOW_ALTITUDE_OPERATIONS("LALT: Low altitude operations"),

    /**
     * Usage Notes:
     * • Used only for non-airborne phases of flight, i.e., ground/surface operations.
     * • The loss of control may result from a contaminated runway or taxiway (e.g., rain, snow, ice, slush).
     * • The loss of control during ground operations can occur as the result of other occurrence categories as well. For example, LOC-G may result from a system/component failure or malfunction to the powerplant (SCF-PP) or non-powerplant (SCF-NP), or from evasive action taken during a Runway Incursion (RI-VAP) or Wildlife (WILD) encounter. For these occurrences, the event is coded under both categories (e.g., LOC-G and SCF-PP, LOC-G and SCF-NP, or LOC-G and RI-VAP or LOC-G and WILD).
     * • Do not use when a mechanical failure rendered the aircraft uncontrollable.
     * • Rotorcraft (losses of control) during sloping ground or moving helideck operations, dynamic rollover and ground resonance events are also included here.
     * 
     * 
     */
    @XmlEnumValue("LOC-G: Loss of control - ground")
    LOC_G_LOSS_OF_CONTROL_GROUND("LOC-G: Loss of control - ground"),

    /**
     * Loss of control inflight is an extreme manifestation of a deviation from intended flightpath. The phrase “loss of control” may cover only some of the cases during which an unintended deviation occurred.
     * 
     * Community comments:  It is  suggested that the occurrence title is reviewed and changed accordingly. For example: Deviation from Intended Flightpath- DEV.
     * 
     * Usage Notes:
     * • Used only for airborne phases of flight in which aircraft control was lost.
     * • Loss of control can occur during either Instrument Meteorological Conditions (IMC) or Visual Meteorological Conditions (VMC).
     * • The loss of control during flight may occur as a result of a deliberate maneuver (e.g., stall/spin practice).
     * • Occurrences involving configuring the aircraft (e.g., flaps, slats, onboard systems, etc.) are included as well as rotorcraft retreating blade stall.
     * • Stalls are considered loss of control and are included here.
     * • Rotorcraft occurrences which involve power settling (vortex ring), or settling with power to ground contact are coded here and as Abnormal Runway Contact (ARC) if during normal landing or takeoff.
     * • Rotorcraft External Load operations involving loss of control related to the external load should be coded as LOC–I as well as External Load Related Occurrences (EXTL).
     * • Includes Rotorcraft “Loss of Tail Rotor Effectiveness.”
     * • Includes loss of control during practice or emergency autorotation.
     * • Includes pilot-induced or assisted oscillations.
     * • For unmanned aircraft events, includes hazardous outcomes involving deviation from intended flightpath associated with anticipated or unanticipated loss of datalink. However, if loss of datalink is the direct result of a system/component failure or malfunction, code the occurrence as System/Component Failure or Malfunction (Non-Powerplant) (SCF–NP) only. 
     * • For icing-related events, which are also loss of control, code both LOC–I and Icing (ICE)).
     * • If the loss of control is a direct result of a system/component failure or malfunction (SCF), code the occurrence as an System/Component Failure or Malfunction (Non-Powerplant) (SCF–NP), or System/Component Failure or Malfunction (Powerplant) (SCF–PP) only. However, loss of control may follow less severe system/component failures, and in this case, code both categories.
     * • Cockpit crew vision-related events and flight in degraded visual environments (for example, obscuration, black hole approach events, brownouts, or whiteout events), in which the aircraft is flown under control into terrain, water, or obstacles, are coded under Controlled Flight Into or Toward Terrain (CFIT), not LOC–I.
     * 
     * 
     */
    @XmlEnumValue("LOC-I: Loss of control - inflight")
    LOC_I_LOSS_OF_CONTROL_INFLIGHT("LOC-I: Loss of control - inflight"),

    /**
     * Usage Notes:
     * • Applicable only to aircraft that rely on static lift to maintain or increase flight altitude, namely sailplanes, gliders, hang gliders and paragliders, balloons and airships.
     * • All static lift forms to be considered, including atmospheric lift, namely from Orographic, Thermal, Mountain Wave and Convergence Zone, and buoyancy lift namely from lighter than air gas or hot air.
     * • Also include motorglider and paramotor aircraft if operating under static atmospheric lift conditions and the engine could not be started.
     * • If the aircraft was flying intentionally at low height above the terrain, use LALT instead (typical cases occur with gliders in competition flying).
     * 
     */
    @XmlEnumValue("LOLI: Loss of lifting conditions en-route")
    LOLI_LOSS_OF_LIFTING_CONDITIONS_EN_ROUTE("LOLI: Loss of lifting conditions en-route"),

    /**
     * Usage Notes: 
     * 
     * Includes: 
     * - All collisions between aircraft while both aircraft are airborne. 
     * - Separation-related occurrences caused by either air traffic control or cockpit crew. 
     * - AIRPROX reports 
     * - Genuine TCAS/ACAS alerts. 
     * 
     * Does NOT include: 
     * - False TCAS/ACAS alerts caused by equipment malfunctions, which are coded as SCF-NP. 
     * - Loss of separation with at least one aircraft on the ground, which may be coded as ATM, GCOL, NAV, and/or RI if the occurrence meets the criteria and usage notes for those categories. 
     * 
     * Crossover to/from other occurrence categories: 
     * - Code both MAC and NAV if the event was caused by a navigation error and the event meets the usage notes of both categories. 
     * - Code both MAC and ATM if the event was caused by an ATC/ATM error and the event meets the usage notes of both categories. 
     * 
     * 
     */
    @XmlEnumValue("MAC: Airprox/ ACAS alert/ loss of separation/ (near) midair collisions")
    MAC_AIRPROX_ACAS_ALERT_LOSS_OF_SEPARATION_NEAR_MIDAIR_COLLISIONS("MAC: Airprox/ ACAS alert/ loss of separation/ (near) midair collisions"),

    /**
     * Usage notes:  
     * 
     * Includes: 
     * - Crewmembers unable to perform duties due to illness. 
     * - Medical emergencies due to illness involving any person on board an aircraft, including passengers and crew. 
     * 
     * Does NOT include: 
     * - Injuries sustained during flight operations. Injuries are coded as— 
     * o WSTRW for injuries sustained as a result of thunderstorms or wind shear, 
     * o TURB for injuries sustained as a result of turbulence (excluding turbulence caused by wind shear and/or thunderstorms), 
     * o SEC for injuries resulting from intentional acts (suicide, homicide, acts of violence, or self-inflicted injury), 
     * o CABIN for any injury sustained on an aircraft not occurring as a result of any events above, such as sprains, cuts, or burns resulting from normal cabin operations (handling bags, operating galley equipment, etc.) 
     * - Injuries, temporary blindness, or other incapacitation resulting from laser attacks, which are coded as SEC. 
     * 
     * 
     * Crossover to/from other occurrence categories: 
     * - Medical emergencies involving persons other than crew members or a medical evacuation patient were coded as CABIN before October 2013. All medical emergencies are now coded as MED. 
     * 
     * 
     */
    @XmlEnumValue("MED: Medical")
    MED_MEDICAL("MED: Medical"),

    /**
     * Usage notes:
     * Includes: 
     * - Lateral navigation errors caused by navigating using the improper navaid or improper programming of aircraft navigation systems
     * - Airspace incursions resulting from improper navigation, uncertainty of position, improper planning, or failure to follow procedures prior to entering airspace
     * - Failure to accurately track navigation signals (lateral or vertical), 
     * - Altitude/level busts (see below for exceptions)
     * - Deviating from ATC/ATM clearances or published procedures (SID/DP, STAR, approach procedures, charted visual procedures), 
     * - Failure to follow clearances or restrictions while operating on the surface of an aerodrome, including— 
     * o Taxiing or towing an aircraft on an unassigned taxiway or runway (see crossover section below), 
     * o Taxiing or otherwise operating an aircraft on a restricted portion of an aerodrome (cargo ramp, air carrier ramp, general aviation ramp, military ramp, wingspan- or weight-restricted taxiways or runways, etc.) 
     * o Take-offs, aborted take-offs, or landings on a taxiway, unassigned runway, or closed runway (see below for exceptions), 
     * o Approaches or landings to/on unassigned runways or to/at the wrong aerodrome. 
     * - Taxiway excursions (except following a loss of control on the ground or intentionally steering an aircraft off a taxiway to avoid a collision). 
     * 
     *  
     * Does NOT include: 
     * - Intentional deviations resulting from a PIC exercising emergency authority. 
     * - Deviations from assigned altitude or course to avoid other aircraft as a result of visual detection or complying with a TCAS RA, which are coded as MAC. 
     * - Deviations from assigned altitude or electronic navigation path as a result of wind shear or turbulence, which are coded as WSTRW or TURB. 
     * - Lateral or vertical deviations resulting from extreme manifestations of loss of aircraft control in flight, which is coded as LOC-I. 
     * - Taxiway excursions due to a loss of control on the ground, which is coded as LOC-G. 
     * - Taxiway excursions to avoid a ground collision, which are coded as AMAN. 
     * - Takeoffs, aborted takeoffs, landings, or approaches to engaged runways due to ATC/ATM error, which are coded as ATM (and MAC if it resulted in a loss of separation). 
     * - Navigation errors at an aerodrome made by vehicles or pedestrians. Code RI if the navigation error results in the vehicle or pedestrian incorrectly entering a runway. Code RAMP if the error meets the usage notes for the RAMP category. 
     * 
     * 
     * Crossover to/from other occurrence categories: 
     * - Code both NAV and MAC if a navigation error causes an AIRPROX/loss of separation. 
     * - Code both NAV and RI for any navigation error that also meets the RI usage notes, including takeoffs/landings without a clearance, wrong runway takeoffs/landings, and wrong aerodrome landings. 
     * - Code both NAV and RAMP if a navigation error occurs during pushback or towing operations. 
     * 
     * 
     */
    @XmlEnumValue("NAV: Navigation error")
    NAV_NAVIGATION_ERROR("NAV: Navigation error"),

    /**
     * This category includes any occurrence type that is not covered by any other category.
     * 
     */
    @XmlEnumValue("OTHR: Other")
    OTHR_OTHER("OTHR: Other"),

    /**
     * Usage Notes: 
     * 
     * Includes: 
     * - Occurrences that occur while servicing, boarding, loading, and deplaning the aircraft 
     * - Occurrences involving boarding and disembarking while a helicopter is hovering 
     * - Deficiencies or issues related to snow, frost, and/or ice removal from aircraft 
     * - Injuries to people from propeller/main rotor/tail rotor/fan blade strikes 
     * - Pushback/powerback/towing events 
     * - Jet Blast and Prop/rotor downwash ground handling occurrences 
     * - Aircraft external preflight configuration errors (e.g., improper loading and improperly secured doors and latches) that lead to subsequent events. 
     * - All parking areas (ramp, gate, tiedowns). 
     * - Operations at aerodromes, heliports, helidecks, and unprepared operating sites 
     * 
     * 
     * Does NOT include: 
     * - Collisions while the aircraft is moving under its own power in the gate, ramp, or tiedown area, which are coded as GCOL (except during powerback, which is coded here) 
     * 
     * Crossover to/from other occurrence categories:
     * - If an external load is involved with an event during ground handling operations, code both RAMP and EXTL. 
     * 
     * 
     */
    @XmlEnumValue("RAMP: Ground Handling")
    RAMP_GROUND_HANDLING("RAMP: Ground Handling"),

    /**
     * Usage Notes:
     * • Only applicable during either the takeoff or landing phase
     * • The excursion may be intentional or unintentional. For example, the deliberate veer off to avoid a collision, brought about by a Runway Incursion. In this case, code both categories
     * • Use RE in all cases where the aircraft left the runway/helipad/helideck regardless of whether the excursion was the consequence of another event or not.	
     * 
     */
    @XmlEnumValue("RE: Runway excursion")
    RE_RUNWAY_EXCURSION("RE: Runway excursion"),

    /**
     * Usage notes:
     * ·  Definition from Procedures for Air Navigation Services–Air Traffic Management (ICAO DOC 4444) and Manual on the Prevention of Runway Incursions (ICAO DOC 9870), first included in April 2004. 
     * 
     * Does NOT include: 
     * - Events at unprepared/natural landing sites. 
     * - Occurrences involving animals or birds on the runway which are coded as Wildlife (WILD) or Bird (BIRD). 
     * 
     * 
     * Crossover to/from other occurrence categories: 
     * - Code both RI and NAV for runway incursions resulting from the improper navigation of an aircraft at an aerodrome, or takeoffs, aborted takeoffs, or landings on an unassigned runway. 
     * - Code both RI and ATM for runway incursions resulting from an ATC/ATM error. 
     * - Code both RI and MAC if a runway incursion event causes an AIRPROX/loss of separation while airborne. 
     * 
     * 
     */
    @XmlEnumValue("RI: Runway incursion - vehicle, aircraft or person")
    RI_RUNWAY_INCURSION_VEHICLE_AIRCRAFT_OR_PERSON("RI: Runway incursion - vehicle, aircraft or person"),

    /**
     * Usage Notes:
     * • If the failure renders the aircraft uncontrollable it is coded as SCF–NP only, not as loss of control (Loss of Control–Inflight (LOC–I) or Loss of Control–Ground (LOC–G)). However, if the failure does not render the aircraft uncontrollable, but leads to a loss of control, code the event under both SCF–NP and LOC–I or LOC–G, as appropriate.
     * • Rotorcraft main rotor and tail rotor system, drive system and flight control failures or malfunctions are also coded here.
     * • Includes errors or failures in software and database systems.
     * • Includes non-powerplant parts or pieces separating from an aircraft.
     * • For unmanned aircraft, includes failure or malfunction of ground-based, transmission, or aircraft-based communication systems or components or datalink systems or components.
     * • Includes failures/malfunctions of ground-based launch or recovery systems equipment.
     * • Includes all failures/malfunctions, including those related to or caused by
     * maintenance issues.
     * 
     */
    @XmlEnumValue("SCF-NP: System/component failure or malfunction [non-powerplant]")
    SCF_NP_SYSTEM_COMPONENT_FAILURE_OR_MALFUNCTION_NON_POWERPLANT("SCF-NP: System/component failure or malfunction [non-powerplant]"),

    /**
     * Usage Notes:
     * • If the failure renders the aircraft uncontrollable it is coded as SCF-PP only, not as loss of control (LOC-I or LOC-G). However, if the failure does not render the aircraft uncontrollable, but leads to a loss of control, code the event under both SCF-PP and LOC-I or LOC-G, as appropriate.
     * • Includes failures or malfunctions of any of the following: propellers, rotors, propeller/main rotor drive train (gearbox, transmission), reversers, and powerplant controls.
     * • Includes powerplant parts or pieces separating from a powerplant.
     * • Includes all failures/malfunctions, including those related to or caused by maintenance issues.
     * • Rotorcraft cyclic, collective and tail rotor drive and control failures or malfunctions are coded as non-powerplant failures (SCF-NP), not SCF-PP.
     * • The following fuel-related powerplant problems are coded under the category FUEL, not under the category SCF-PP: fuel exhaustion; fuel starvation/mismanagement; fuel contamination; wrong fuel; carburetor and induction icing.
     * 
     * NOTE: For sub-categorization of SCF-PP, a separate taxonomy has been developed and can be found on the CICTT website http://intlaviationstandards.org.
     * 
     * 
     */
    @XmlEnumValue("SCF-PP: powerplant failure or malfunction")
    SCF_PP_POWERPLANT_FAILURE_OR_MALFUNCTION("SCF-PP: powerplant failure or malfunction"),

    /**
     * Usage Notes:
     * • While security related acts can lead to accidents as defined as by ICAO Annex 13, they are not considered accidents by some organizations. Regardless, these events have similar consequences in that they result in serious injury or death to person(s) and/or substantial damage to the aircraft. For these reasons, they are categorized as security-related occurrences for prevention purposes only.
     * • Examples include: a) hijacking and/or aircraft theft; b) interference with a crewmember (e.g., unruly passengers); c) flight control interference; d) ramp/runway/taxiway security; e) sabotage; f) suicide; and g) acts of war.
     * 
     * 
     * 
     */
    @XmlEnumValue("SEC: Security related")
    SEC_SECURITY_RELATED("SEC: Security related"),

    /**
     * Usage Notes:
     * • Includes encounters with turbulence in clear air, mountain wave, mechanical, and/or cloud associated turbulence.
     * • Wake vortex encounters are also included here.
     * • Flights into windshear or thunderstorm related turbulence are coded as WSTRW.
     * • Includes turbulence encountered by aircraft when operating around or at buildings, structures and objects.
     * 
     * 
     */
    @XmlEnumValue("TURB: Turbulence encounter")
    TURB_TURBULENCE_ENCOUNTER("TURB: Turbulence encounter"),

    /**
     * Usage Notes:
     * • May be used as a precursor to CFIT, LOC-I or LALT.
     * • Applicable if the pilot was flying according to Visual Flight Rules (VFR), as defined in Annex 2 – Rules of the Air – to the Convention on International Civil Aviation and by any reason found oneself inadvertently in IMC
     * • Only to be used when loss of visual references is encountered,
     * • Only to be used if pilot not qualified to fly in IMC and/or aircraft not equipped to fly in IMC
     * 
     */
    @XmlEnumValue("UIMC: Unintended flight in IMC")
    UIMC_UNINTENDED_FLIGHT_IN_IMC("UIMC: Unintended flight in IMC"),

    /**
     * Usage Notes:
     * • Includes cases where the aircraft is missing.
     * • Includes those occurrences where there is not enough information at hand to classify the occurrence or where additional information is expected in due course to better classify the occurrence.
     * 
     */
    @XmlEnumValue("UNK: Unknown or undetermined")
    UNK_UNKNOWN_OR_UNDETERMINED("UNK: Unknown or undetermined"),

    /**
     * Usage Notes:
     * • An undershoot/overshoot of a runway/helipad/helideck occurs in close proximity to the runway/helipad/helideck and also includes offside touchdowns and any occurrence where the landing gear touches off the runway/helipad/helideck surface.
     * • Off-airport emergency landings are excluded from this category.
     * • To be used for occurrences during the landing phase.
     * • Includes offside touchdowns on heliports, helidecks and other defined areas to be used wholly or in part for the arrival, departure and surface movement of helicopters (does not include helicopter unprepared or natural landing sites).
     * 
     * Do not use ARC in conjunction with USOS.
     * 
     */
    @XmlEnumValue("USOS: Undershoot/overshoot")
    USOS_UNDERSHOOT_OVERSHOOT("USOS: Undershoot/overshoot"),

    /**
     * Usage Notes:
     * Includes encounters with wildlife on a runway in use or on any other movement area of
     * the aerodrome.
     * • Includes instances where evasive action is taken by the flight crew that leads to a collision off the movement area of the aerodrome or to consequences other than a collision (e.g., gear collapsing).
     * • Wildlife encounters may occur at controlled or uncontrolled airports, or on unprepared/natural landing sites.
     * • Excludes bird strikes, which are coded as Bird (BIRD).
     * 
     * Note: Was previously described as RI-A.
     * 
     */
    @XmlEnumValue("WILD: Collision Wildlife")
    WILD_COLLISION_WILDLIFE("WILD: Collision Wildlife"),

    /**
     * Usage Notes:
     * • Includes flight into wind shear and/or thunderstorm-related weather.
     * • Includes in-flight events related to hail.
     * • Includes events related to lightning strikes.
     * • Includes events related to heavy rain (not just in a thunderstorm).
     * • Icing and turbulence encounters are coded separately (see Icing (ICE) and TurbulenceEncounter (TURB)).
     * 
     */
    @XmlEnumValue("WSTRW: Windshear or thunderstorm.")
    WSTRW_WINDSHEAR_OR_THUNDERSTORM("WSTRW: Windshear or thunderstorm.");
    private final String value;

    VL4305011(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VL4305011 fromValue(String v) {
        for (VL4305011 c: VL4305011 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

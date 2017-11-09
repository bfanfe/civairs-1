package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


import java.util.List;


/**
 * The persistent class for the Aircraft database table.
 * 
 */
@Entity
@Table(name="Aircraft")
@NamedQuery(name="Aircraft.findAll", query="SELECT a FROM Aircraft a")
public class Aircraft implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="A_C_Flight_Level", length=60)
	private String a_C_Flight_Level;

	@Column(name="Aircraft_Altitude", length=60)
	private String aircraft_Altitude;

	@Column(name="Aircraft_Category", length=60)
	private String aircraft_Category;
	
	@Column(name="Aircraft_Index")
	private int aircraft_Index;

	@Column(name="Aircraft_Registration", length=60)
	private String aircraft_Registration;

	@Column(name="Aircraft_Total_Time", length=60)
	private String aircraft_Total_Time;

	@Column(name="Airworthiness_Cert", length=60)
	private String airworthiness_Cert;

	@Column(length=60)
	private String ATS_Route_Name;

	@Column(name="Bird_Size", length=60)
	private String bird_Size;

	@Column(name="Birds_Wildlife_Seen", length=60)
	private String birds_Wildlife_Seen;

	@Column(name="Birds_Wildlife_Struck", length=60)
	private String birds_Wildlife_Struck;

	@Column(name="Call_Sign", length=60)
	private String call_Sign;

	@Column(name="Clearance_Validity", length=60)
	private String clearance_Validity;

	@Column(name="Cleared_Altitude", length=60)
	private String cleared_Altitude;

	@Column(name="Cleared_FL_After", length=60)
	private String cleared_FL_After;

	@Column(name="Cleared_Flight_Level", length=60)
	private String cleared_Flight_Level;

	@Column(name="Controlling_Agency", length=60)
	private String controlling_Agency;

	@Column(name="Current_Flight_Rules", length=60)
	private String current_Flight_Rules;

	@Column(name="Current_Traffic_Type", length=60)
	private String current_Traffic_Type;

	@Column(name="Filed_Flight_Rules", length=60)
	private String filed_Flight_Rules;

	@Column(name="Filed_Traffic_Type", length=60)
	private String filed_Traffic_Type;

	@Column(name="Flight_Number", length=60)
	private String flight_Number;

	@Column(name="Flight_Phase", length=60)
	private String flight_Phase;

	@Column(name="Flight_Plan_Type", length=60)
	private String flight_Plan_Type;

	@Column(name="Instrument_Appr_Type", length=60)
	private String instrument_Appr_Type;

	@Column(name="Landing_Gear_Type", length=60)
	private String landing_Gear_Type;

	@Column(name="Last_Departure_Point", length=60)
	private String last_Departure_Point;

	@Column(name="Maintenance_Docs", length=60)
	private String maintenance_Docs;

	@Column(name="Manufacturer_Model", length=60)
	private String manufacturer_Model;

	@Column(name="Mass_Group", length=60)
	private String mass_Group;

	@Column(name="Maximum_T_O_Mass", length=60)
	private String maximum_T_O_Mass;

	@Column(name="Number_Of_Engines", length=60)
	private String number_Of_Engines;

	@Column(name="Occ_On_Ground", length=60)
	private String occ_On_Ground;

	@Column(name="Operation_Type", length=60)
	private String operation_Type;

	@Column(name="Operator", length=60)
	private String operator;

	@Column(name="Parts_Damaged", length=60)
	private String parts_Damaged;

	@Column(name="Parts_Struck", length=60)
	private String parts_Struck;

	@Column(name="Pilot_Advised_Of_Birds", length=60)
	private String pilot_Advised_Of_Birds;

	@Column(name="Planned_Destination", length=60)
	private String planned_Destination;

	@Column(name="Propulsion_Type", length=60)
	private String propulsion_Type;

	@Column(name="Rel_Wind_Direction", length=60)
	private String rel_Wind_Direction;

	@Column(name="Serial_Number", length=60)
	private String serial_Number;

	@Column(length=60)
	private String SID_Route;

	@Column(name="Species_Description", length=60)
	private String species_Description;

	@Column(name="Speed_First_Event", length=60)
	private String speed_First_Event;

	@Column(length=60)
	private String SSR_Mode;

	@Column(name="State_Of_Registry", length=60)
	private String state_Of_Registry;

	@Column(name="Time_Deviating_FL", length=60)
	private String time_Deviating_FL;

	@Column(name="Total_Cycles_A_C", length=60)
	private String total_Cycles_A_C;

	@Column(name="Turbulence_Intensity", length=60)
	private String turbulence_Intensity;

	@Column(name="Type_Of_Airspeed", length=60)
	private String type_Of_Airspeed;

	@Column(name="Visib_Restrictions", length=60)
	private String visib_Restrictions;

	@Column(name="Wake_Turb_Category", length=60)
	private String wake_Turb_Category;

	@Column(name="Year_Built", length=60)
	private String year_Built;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID")
	private Occurence occurence;

	//bi-directional many-to-one association to Engine
	@OneToMany(mappedBy="aircraft")
	private List<Engine> engines;

	//bi-directional many-to-one association to FlightCrewMember
	@OneToMany(mappedBy="aircraft")
	private List<FlightCrewMember> flightCrewMembers;

	//bi-directional many-to-one association to Incapacitation
	@OneToMany(mappedBy="aircraft")
	private List<Incapacitation> incapacitations;

	//bi-directional many-to-many association to Narrative
	@ManyToMany(mappedBy="aircrafts")
	private List<Narrative> narratives;

	//bi-directional many-to-one association to PartInformation
	@OneToMany(mappedBy="aircraft")
	private List<PartInformation> partInformations;

	//bi-directional many-to-one association to Propeller
	@OneToMany(mappedBy="aircraft")
	private List<Propeller> propellers;
	
	//bi-directional many-to-one association to Notification
	@ManyToOne
	@JoinColumn(name="Notification_ID")
	private Notification notification;
	
	//bi-directional many-to-one association to StaticManufacturerModel
	@ManyToOne
	@JoinColumn(name="Static_Manufacturer_Model_ValueID")
	private StaticManufacturerModel staticManufacturerModel;
	
	//bi-directional many-to-one association to StaticFlightPhase
	@ManyToOne
	@JoinColumn(name="Static_Flight_Phase_ValueID")
	private StaticFlightPhase staticFlightPhase;
	
	//bi-directional many-to-one association to StaticFlightPhase
	@ManyToOne
	@JoinColumn(name="Static_Operation_Type_valueID")
	private StaticOperationType staticOperationType;

	public Aircraft() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getA_C_Flight_Level() {
		return this.a_C_Flight_Level;
	}

	public void setA_C_Flight_Level(String a_C_Flight_Level) {
		this.a_C_Flight_Level = a_C_Flight_Level;
	}

	public String getAircraft_Altitude() {
		return this.aircraft_Altitude;
	}

	public void setAircraft_Altitude(String aircraft_Altitude) {
		this.aircraft_Altitude = aircraft_Altitude;
	}

	public String getAircraft_Category() {
		return this.aircraft_Category;
	}

	public void setAircraft_Category(String aircraft_Category) {
		this.aircraft_Category = aircraft_Category;
	}
	
	public int getAircraft_Index() {
		return this.aircraft_Index;
	}

	public void setAircraft_Index(int aircraft_Index) {
		this.aircraft_Index = aircraft_Index;
	}

	public String getAircraft_Registration() {
		return this.aircraft_Registration;
	}

	public void setAircraft_Registration(String aircraft_Registration) {
		this.aircraft_Registration = aircraft_Registration;
	}

	public String getAircraft_Total_Time() {
		return this.aircraft_Total_Time;
	}

	public void setAircraft_Total_Time(String aircraft_Total_Time) {
		this.aircraft_Total_Time = aircraft_Total_Time;
	}

	public String getAirworthiness_Cert() {
		return this.airworthiness_Cert;
	}

	public void setAirworthiness_Cert(String airworthiness_Cert) {
		this.airworthiness_Cert = airworthiness_Cert;
	}

	public String getATS_Route_Name() {
		return this.ATS_Route_Name;
	}

	public void setATS_Route_Name(String ATS_Route_Name) {
		this.ATS_Route_Name = ATS_Route_Name;
	}

	public String getBird_Size() {
		return this.bird_Size;
	}

	public void setBird_Size(String bird_Size) {
		this.bird_Size = bird_Size;
	}

	public String getBirds_Wildlife_Seen() {
		return this.birds_Wildlife_Seen;
	}

	public void setBirds_Wildlife_Seen(String birds_Wildlife_Seen) {
		this.birds_Wildlife_Seen = birds_Wildlife_Seen;
	}

	public String getBirds_Wildlife_Struck() {
		return this.birds_Wildlife_Struck;
	}

	public void setBirds_Wildlife_Struck(String birds_Wildlife_Struck) {
		this.birds_Wildlife_Struck = birds_Wildlife_Struck;
	}

	public String getCall_Sign() {
		return this.call_Sign;
	}

	public void setCall_Sign(String call_Sign) {
		this.call_Sign = call_Sign;
	}

	public String getClearance_Validity() {
		return this.clearance_Validity;
	}

	public void setClearance_Validity(String clearance_Validity) {
		this.clearance_Validity = clearance_Validity;
	}

	public String getCleared_Altitude() {
		return this.cleared_Altitude;
	}

	public void setCleared_Altitude(String cleared_Altitude) {
		this.cleared_Altitude = cleared_Altitude;
	}

	public String getCleared_FL_After() {
		return this.cleared_FL_After;
	}

	public void setCleared_FL_After(String cleared_FL_After) {
		this.cleared_FL_After = cleared_FL_After;
	}

	public String getCleared_Flight_Level() {
		return this.cleared_Flight_Level;
	}

	public void setCleared_Flight_Level(String cleared_Flight_Level) {
		this.cleared_Flight_Level = cleared_Flight_Level;
	}

	public String getControlling_Agency() {
		return this.controlling_Agency;
	}

	public void setControlling_Agency(String controlling_Agency) {
		this.controlling_Agency = controlling_Agency;
	}

	public String getCurrent_Flight_Rules() {
		return this.current_Flight_Rules;
	}

	public void setCurrent_Flight_Rules(String current_Flight_Rules) {
		this.current_Flight_Rules = current_Flight_Rules;
	}

	public String getCurrent_Traffic_Type() {
		return this.current_Traffic_Type;
	}

	public void setCurrent_Traffic_Type(String current_Traffic_Type) {
		this.current_Traffic_Type = current_Traffic_Type;
	}

	public String getFiled_Flight_Rules() {
		return this.filed_Flight_Rules;
	}

	public void setFiled_Flight_Rules(String filed_Flight_Rules) {
		this.filed_Flight_Rules = filed_Flight_Rules;
	}

	public String getFiled_Traffic_Type() {
		return this.filed_Traffic_Type;
	}

	public void setFiled_Traffic_Type(String filed_Traffic_Type) {
		this.filed_Traffic_Type = filed_Traffic_Type;
	}

	public String getFlight_Number() {
		return this.flight_Number;
	}

	public void setFlight_Number(String flight_Number) {
		this.flight_Number = flight_Number;
	}

	public String getFlight_Phase() {
		return this.flight_Phase;
	}

	public void setFlight_Phase(String flight_Phase) {
		this.flight_Phase = flight_Phase;
	}

	public String getFlight_Plan_Type() {
		return this.flight_Plan_Type;
	}

	public void setFlight_Plan_Type(String flight_Plan_Type) {
		this.flight_Plan_Type = flight_Plan_Type;
	}

	public String getInstrument_Appr_Type() {
		return this.instrument_Appr_Type;
	}

	public void setInstrument_Appr_Type(String instrument_Appr_Type) {
		this.instrument_Appr_Type = instrument_Appr_Type;
	}

	public String getLanding_Gear_Type() {
		return this.landing_Gear_Type;
	}

	public void setLanding_Gear_Type(String landing_Gear_Type) {
		this.landing_Gear_Type = landing_Gear_Type;
	}

	public String getLast_Departure_Point() {
		return this.last_Departure_Point;
	}

	public void setLast_Departure_Point(String last_Departure_Point) {
		this.last_Departure_Point = last_Departure_Point;
	}

	public String getMaintenance_Docs() {
		return this.maintenance_Docs;
	}

	public void setMaintenance_Docs(String maintenance_Docs) {
		this.maintenance_Docs = maintenance_Docs;
	}

	public String getManufacturer_Model() {
		return this.manufacturer_Model;
	}

	public void setManufacturer_Model(String manufacturer_Model) {
		this.manufacturer_Model = manufacturer_Model;
	}

	public String getMass_Group() {
		return this.mass_Group;
	}

	public void setMass_Group(String mass_Group) {
		this.mass_Group = mass_Group;
	}

	public String getMaximum_T_O_Mass() {
		return this.maximum_T_O_Mass;
	}

	public void setMaximum_T_O_Mass(String maximum_T_O_Mass) {
		this.maximum_T_O_Mass = maximum_T_O_Mass;
	}

	public String getNumber_Of_Engines() {
		return this.number_Of_Engines;
	}

	public void setNumber_Of_Engines(String number_Of_Engines) {
		this.number_Of_Engines = number_Of_Engines;
	}

	public String getOcc_On_Ground() {
		return this.occ_On_Ground;
	}

	public void setOcc_On_Ground(String occ_On_Ground) {
		this.occ_On_Ground = occ_On_Ground;
	}

	public String getOperation_Type() {
		return this.operation_Type;
	}

	public void setOperation_Type(String operation_Type) {
		this.operation_Type = operation_Type;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getParts_Damaged() {
		return this.parts_Damaged;
	}

	public void setParts_Damaged(String parts_Damaged) {
		this.parts_Damaged = parts_Damaged;
	}

	public String getParts_Struck() {
		return this.parts_Struck;
	}

	public void setParts_Struck(String parts_Struck) {
		this.parts_Struck = parts_Struck;
	}

	public String getPilot_Advised_Of_Birds() {
		return this.pilot_Advised_Of_Birds;
	}

	public void setPilot_Advised_Of_Birds(String pilot_Advised_Of_Birds) {
		this.pilot_Advised_Of_Birds = pilot_Advised_Of_Birds;
	}

	public String getPlanned_Destination() {
		return this.planned_Destination;
	}

	public void setPlanned_Destination(String planned_Destination) {
		this.planned_Destination = planned_Destination;
	}

	public String getPropulsion_Type() {
		return this.propulsion_Type;
	}

	public void setPropulsion_Type(String propulsion_Type) {
		this.propulsion_Type = propulsion_Type;
	}

	public String getRel_Wind_Direction() {
		return this.rel_Wind_Direction;
	}

	public void setRel_Wind_Direction(String rel_Wind_Direction) {
		this.rel_Wind_Direction = rel_Wind_Direction;
	}

	public String getSerial_Number() {
		return this.serial_Number;
	}

	public void setSerial_Number(String serial_Number) {
		this.serial_Number = serial_Number;
	}

	public String getSID_Route() {
		return this.SID_Route;
	}

	public void setSID_Route(String SID_Route) {
		this.SID_Route = SID_Route;
	}

	public String getSpecies_Description() {
		return this.species_Description;
	}

	public void setSpecies_Description(String species_Description) {
		this.species_Description = species_Description;
	}

	public String getSpeed_First_Event() {
		return this.speed_First_Event;
	}

	public void setSpeed_First_Event(String speed_First_Event) {
		this.speed_First_Event = speed_First_Event;
	}

	public String getSSR_Mode() {
		return this.SSR_Mode;
	}

	public void setSSR_Mode(String SSR_Mode) {
		this.SSR_Mode = SSR_Mode;
	}

	public String getState_Of_Registry() {
		return this.state_Of_Registry;
	}

	public void setState_Of_Registry(String state_Of_Registry) {
		this.state_Of_Registry = state_Of_Registry;
	}

	public String getTime_Deviating_FL() {
		return this.time_Deviating_FL;
	}

	public void setTime_Deviating_FL(String time_Deviating_FL) {
		this.time_Deviating_FL = time_Deviating_FL;
	}

	public String getTotal_Cycles_A_C() {
		return this.total_Cycles_A_C;
	}

	public void setTotal_Cycles_A_C(String total_Cycles_A_C) {
		this.total_Cycles_A_C = total_Cycles_A_C;
	}

	public String getTurbulence_Intensity() {
		return this.turbulence_Intensity;
	}

	public void setTurbulence_Intensity(String turbulence_Intensity) {
		this.turbulence_Intensity = turbulence_Intensity;
	}

	public String getType_Of_Airspeed() {
		return this.type_Of_Airspeed;
	}

	public void setType_Of_Airspeed(String type_Of_Airspeed) {
		this.type_Of_Airspeed = type_Of_Airspeed;
	}

	public String getVisib_Restrictions() {
		return this.visib_Restrictions;
	}

	public void setVisib_Restrictions(String visib_Restrictions) {
		this.visib_Restrictions = visib_Restrictions;
	}

	public String getWake_Turb_Category() {
		return this.wake_Turb_Category;
	}

	public void setWake_Turb_Category(String wake_Turb_Category) {
		this.wake_Turb_Category = wake_Turb_Category;
	}

	public String getYear_Built() {
		return this.year_Built;
	}

	public void setYear_Built(String year_Built) {
		this.year_Built = year_Built;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

	public List<Engine> getEngines() {
		return this.engines;
	}

	public void setEngines(List<Engine> engines) {
		this.engines = engines;
	}

	public Engine addEngine(Engine engine) {
		getEngines().add(engine);
		engine.setAircraft(this);

		return engine;
	}

	public Engine removeEngine(Engine engine) {
		getEngines().remove(engine);
		engine.setAircraft(null);

		return engine;
	}

	public List<FlightCrewMember> getFlightCrewMembers() {
		return this.flightCrewMembers;
	}

	public void setFlightCrewMembers(List<FlightCrewMember> flightCrewMembers) {
		this.flightCrewMembers = flightCrewMembers;
	}

	public FlightCrewMember addFlightCrewMember(FlightCrewMember flightCrewMember) {
		getFlightCrewMembers().add(flightCrewMember);
		flightCrewMember.setAircraft(this);

		return flightCrewMember;
	}

	public FlightCrewMember removeFlightCrewMember(FlightCrewMember flightCrewMember) {
		getFlightCrewMembers().remove(flightCrewMember);
		flightCrewMember.setAircraft(null);

		return flightCrewMember;
	}

	public List<Incapacitation> getIncapacitations() {
		return this.incapacitations;
	}

	public void setIncapacitations(List<Incapacitation> incapacitations) {
		this.incapacitations = incapacitations;
	}

	public Incapacitation addIncapacitation(Incapacitation incapacitation) {
		getIncapacitations().add(incapacitation);
		incapacitation.setAircraft(this);

		return incapacitation;
	}

	public Incapacitation removeIncapacitation(Incapacitation incapacitation) {
		getIncapacitations().remove(incapacitation);
		incapacitation.setAircraft(null);

		return incapacitation;
	}

	public List<Narrative> getNarratives() {
		return this.narratives;
	}

	public void setNarratives(List<Narrative> narratives) {
		this.narratives = narratives;
	}

	public List<PartInformation> getPartInformations() {
		return this.partInformations;
	}

	public void setPartInformations(List<PartInformation> partInformations) {
		this.partInformations = partInformations;
	}

	public PartInformation addPartInformation(PartInformation partInformation) {
		getPartInformations().add(partInformation);
		partInformation.setAircraft(this);

		return partInformation;
	}

	public PartInformation removePartInformation(PartInformation partInformation) {
		getPartInformations().remove(partInformation);
		partInformation.setAircraft(null);

		return partInformation;
	}

	public List<Propeller> getPropellers() {
		return this.propellers;
	}

	public void setPropellers(List<Propeller> propellers) {
		this.propellers = propellers;
	}

	public Propeller addPropeller(Propeller propeller) {
		getPropellers().add(propeller);
		propeller.setAircraft(this);

		return propeller;
	}

	public Propeller removePropeller(Propeller propeller) {
		getPropellers().remove(propeller);
		propeller.setAircraft(null);

		return propeller;
	}
	
	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	
	public StaticManufacturerModel getStaticManufacturerModel() {
		return this.staticManufacturerModel;
	}

	public void setStaticManufacturerModel(StaticManufacturerModel staticManufacturerModel) {
		this.staticManufacturerModel = staticManufacturerModel;
	}
	
	public StaticFlightPhase getStaticFlightPhase() {
		return this.staticFlightPhase;
	}

	public void setStaticFlightPhase(StaticFlightPhase staticFlightPhase) {
		this.staticFlightPhase = staticFlightPhase;
	}
	
	public StaticOperationType getStaticOperationType() {
		return this.staticOperationType;
	}

	public void setStaticOperationType(StaticOperationType staticOperationType) {
		this.staticOperationType = staticOperationType;
	}

}
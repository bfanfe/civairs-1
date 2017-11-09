package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AerodromeGeneral database table.
 * 
 */
@Entity
@Table(name="AerodromeGeneral")
@NamedQuery(name="AerodromeGeneral.findAll", query="SELECT a FROM AerodromeGeneral a")
public class AerodromeGeneral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Aerodrome_Latitude", length=60)
	private String aerodrome_Latitude;

	@Column(name="Aerodrome_Longitude", length=60)
	private String aerodrome_Longitude;

	@Column(name="Aerodrome_Status", length=60)
	private String aerodrome_Status;

	@Column(name="Aerodrome_Type", length=60)
	private String aerodrome_Type;

	@Column(name="Area_Configuration", length=60)
	private String area_Configuration;

	@Column(name="Elevation_Above_MSL", length=60)
	private String elevation_Above_MSL;

	@Column(name="Landing_Area_Type", length=60)
	private String landing_Area_Type;

	@Column(name="Location_Indicator", length=60)
	private String location_Indicator;

	@Column(name="Location_On_Near_Aerodrome", length=20)
	private String location_On_Near_Aerodrome;

	@Column(name="Surface_Type", length=60)
	private String surface_Type;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	//bi-directional many-to-many association to Narrative
	@ManyToMany(mappedBy="aerodromeGenerals")
	private List<Narrative> narratives;

	//bi-directional many-to-one association to Runway
	@OneToMany(mappedBy="aerodromeGeneral")
	private List<Runway> runways;

	//bi-directional many-to-one association to Vehicle
	@OneToMany(mappedBy="aerodromeGeneral")
	private List<Vehicle> vehicles;

	public AerodromeGeneral() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAerodrome_Latitude() {
		return this.aerodrome_Latitude;
	}

	public void setAerodrome_Latitude(String aerodrome_Latitude) {
		this.aerodrome_Latitude = aerodrome_Latitude;
	}

	public String getAerodrome_Longitude() {
		return this.aerodrome_Longitude;
	}

	public void setAerodrome_Longitude(String aerodrome_Longitude) {
		this.aerodrome_Longitude = aerodrome_Longitude;
	}

	public String getAerodrome_Status() {
		return this.aerodrome_Status;
	}

	public void setAerodrome_Status(String aerodrome_Status) {
		this.aerodrome_Status = aerodrome_Status;
	}

	public String getAerodrome_Type() {
		return this.aerodrome_Type;
	}

	public void setAerodrome_Type(String aerodrome_Type) {
		this.aerodrome_Type = aerodrome_Type;
	}

	public String getArea_Configuration() {
		return this.area_Configuration;
	}

	public void setArea_Configuration(String area_Configuration) {
		this.area_Configuration = area_Configuration;
	}

	public String getElevation_Above_MSL() {
		return this.elevation_Above_MSL;
	}

	public void setElevation_Above_MSL(String elevation_Above_MSL) {
		this.elevation_Above_MSL = elevation_Above_MSL;
	}

	public String getLanding_Area_Type() {
		return this.landing_Area_Type;
	}

	public void setLanding_Area_Type(String landing_Area_Type) {
		this.landing_Area_Type = landing_Area_Type;
	}

	public String getLocation_Indicator() {
		return this.location_Indicator;
	}

	public void setLocation_Indicator(String location_Indicator) {
		this.location_Indicator = location_Indicator;
	}

	public String getLocation_On_Near_Aerodrome() {
		return this.location_On_Near_Aerodrome;
	}

	public void setLocation_On_Near_Aerodrome(String location_On_Near_Aerodrome) {
		this.location_On_Near_Aerodrome = location_On_Near_Aerodrome;
	}

	public String getSurface_Type() {
		return this.surface_Type;
	}

	public void setSurface_Type(String surface_Type) {
		this.surface_Type = surface_Type;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

	public List<Narrative> getNarratives() {
		return this.narratives;
	}

	public void setNarratives(List<Narrative> narratives) {
		this.narratives = narratives;
	}

	public List<Runway> getRunways() {
		return this.runways;
	}

	public void setRunways(List<Runway> runways) {
		this.runways = runways;
	}

	public Runway addRunway(Runway runway) {
		getRunways().add(runway);
		runway.setAerodromeGeneral(this);

		return runway;
	}

	public Runway removeRunway(Runway runway) {
		getRunways().remove(runway);
		runway.setAerodromeGeneral(null);

		return runway;
	}

	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		getVehicles().add(vehicle);
		vehicle.setAerodromeGeneral(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setAerodromeGeneral(null);

		return vehicle;
	}

}
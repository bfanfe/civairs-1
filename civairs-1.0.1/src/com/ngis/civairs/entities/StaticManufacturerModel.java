package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the Static_Manufacturer_Model database table.
 * 
 */
@Entity
@Table(name="Static_Manufacturer_Model")
@NamedQuery(name="StaticManufacturerModel.findAll", query="SELECT s FROM StaticManufacturerModel s ORDER BY s.description")
public class StaticManufacturerModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ValueID", unique=true, nullable=false, length=60)
	private String valueID;

	@Column(name="Aircraft_Category", length=60)
	private String aircraft_Category;

	@Column(name="Alias_ICAO_TYPE", length=60)
	private String alias_ICAO_TYPE;

	@Column(name="Description", length=60)
	private String description;

	@Column(name="Engine_Type", length=60)
	private String engine_Type;

	@Column(name="Number_of_Engines")
	private int number_of_Engines;

	@Column(name="Wake_Turbulence_Category", length=60)
	private String wake_Turbulence_Category;
	
	//bi-directional many-to-one association to Aircraft
	@OneToMany(mappedBy="staticManufacturerModel")
	private List<Aircraft> aircrafts;

	public StaticManufacturerModel() {
	}

	public String getValueID() {
		return this.valueID;
	}

	public void setValueID(String valueID) {
		this.valueID = valueID;
	}

	public String getAircraft_Category() {
		return this.aircraft_Category;
	}

	public void setAircraft_Category(String aircraft_Category) {
		this.aircraft_Category = aircraft_Category;
	}

	public String getAlias_ICAO_TYPE() {
		return this.alias_ICAO_TYPE;
	}

	public void setAlias_ICAO_TYPE(String alias_ICAO_TYPE) {
		this.alias_ICAO_TYPE = alias_ICAO_TYPE;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEngine_Type() {
		return this.engine_Type;
	}

	public void setEngine_Type(String engine_Type) {
		this.engine_Type = engine_Type;
	}

	public int getNumber_of_Engines() {
		return this.number_of_Engines;
	}

	public void setNumber_of_Engines(int number_of_Engines) {
		this.number_of_Engines = number_of_Engines;
	}

	public String getWake_Turbulence_Category() {
		return this.wake_Turbulence_Category;
	}

	public void setWake_Turbulence_Category(String wake_Turbulence_Category) {
		this.wake_Turbulence_Category = wake_Turbulence_Category;
	}
	
	public List<Aircraft> getAircrafts() {
		return this.aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	public Aircraft addAircraft(Aircraft aircraft) {
		getAircrafts().add(aircraft);
		aircraft.setStaticManufacturerModel(this);

		return aircraft;
	}

	public Aircraft removeAircraft(Aircraft aircraft) {
		getAircrafts().remove(aircraft);
		aircraft.setStaticManufacturerModel(null);

		return aircraft;
	}

}
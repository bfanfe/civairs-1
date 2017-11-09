package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Flight_Phase database table.
 * 
 */
@Entity
@Table(name="Static_Flight_Phase")
@NamedQuery(name="StaticFlightPhase.findAll", query="SELECT s FROM StaticFlightPhase s")
public class StaticFlightPhase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ValueID", unique=true, nullable=false, length=60)
	private String valueID;

	@Column(name="Description", nullable=false, length=60)
	private String description;

	@Lob
	@Column(name="DetailedDescription")
	private String detailedDescription;

	@Lob
	@Column(name="Explanation")
	private String explanation;

	//bi-directional many-to-one association to Aircraft
	@OneToMany(mappedBy="staticFlightPhase")
	private List<Aircraft> aircrafts;

	public StaticFlightPhase() {
	}

	public String getValueID() {
		return this.valueID;
	}

	public void setValueID(String valueID) {
		this.valueID = valueID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailedDescription() {
		return this.detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	public String getExplanation() {
		return this.explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public List<Aircraft> getAircrafts() {
		return this.aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	public Aircraft addAircraft(Aircraft aircraft) {
		getAircrafts().add(aircraft);
		aircraft.setStaticFlightPhase(this);

		return aircraft;
	}

	public Aircraft removeAircraft(Aircraft aircraft) {
		getAircrafts().remove(aircraft);
		aircraft.setStaticFlightPhase(null);

		return aircraft;
	}

}
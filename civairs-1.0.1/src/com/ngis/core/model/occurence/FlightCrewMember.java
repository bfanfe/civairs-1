package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FlightCrewMember database table.
 * 
 */
@Entity
@Table(name="FlightCrewMember")
@NamedQuery(name="FlightCrewMember.findAll", query="SELECT f FROM FlightCrewMember f")
public class FlightCrewMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Category", length=60)
	private String category;

	@Column(name="Duty_Last_24_Hours", precision=10, scale=2)
	private BigDecimal duty_Last_24_Hours;

	@Column(name="Experience_All_A_C", precision=10, scale=2)
	private BigDecimal experience_All_A_C;

	@Column(name="Experience_This_A_C", precision=10, scale=2)
	private BigDecimal experience_This_A_C;

	@Column(name="Rest_Before_Duty", precision=10, scale=2)
	private BigDecimal rest_Before_Duty;

	//bi-directional many-to-one association to FlightCrewLicence
	@OneToMany(mappedBy="flightCrewMember")
	private List<FlightCrewLicence> flightCrewLicences;

	//bi-directional many-to-one association to Aircraft
	@ManyToOne
	@JoinColumn(name="Aircraft_ID", nullable=false)
	private Aircraft aircraft;

	public FlightCrewMember() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getDuty_Last_24_Hours() {
		return this.duty_Last_24_Hours;
	}

	public void setDuty_Last_24_Hours(BigDecimal duty_Last_24_Hours) {
		this.duty_Last_24_Hours = duty_Last_24_Hours;
	}

	public BigDecimal getExperience_All_A_C() {
		return this.experience_All_A_C;
	}

	public void setExperience_All_A_C(BigDecimal experience_All_A_C) {
		this.experience_All_A_C = experience_All_A_C;
	}

	public BigDecimal getExperience_This_A_C() {
		return this.experience_This_A_C;
	}

	public void setExperience_This_A_C(BigDecimal experience_This_A_C) {
		this.experience_This_A_C = experience_This_A_C;
	}

	public BigDecimal getRest_Before_Duty() {
		return this.rest_Before_Duty;
	}

	public void setRest_Before_Duty(BigDecimal rest_Before_Duty) {
		this.rest_Before_Duty = rest_Before_Duty;
	}

	public List<FlightCrewLicence> getFlightCrewLicences() {
		return this.flightCrewLicences;
	}

	public void setFlightCrewLicences(List<FlightCrewLicence> flightCrewLicences) {
		this.flightCrewLicences = flightCrewLicences;
	}

	public FlightCrewLicence addFlightCrewLicence(FlightCrewLicence flightCrewLicence) {
		getFlightCrewLicences().add(flightCrewLicence);
		flightCrewLicence.setFlightCrewMember(this);

		return flightCrewLicence;
	}

	public FlightCrewLicence removeFlightCrewLicence(FlightCrewLicence flightCrewLicence) {
		getFlightCrewLicences().remove(flightCrewLicence);
		flightCrewLicence.setFlightCrewMember(null);

		return flightCrewLicence;
	}

	public Aircraft getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

}
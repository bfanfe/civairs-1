package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FlightCrewLicences database table.
 * 
 */
@Entity
@Table(name="FlightCrewLicences")
@NamedQuery(name="FlightCrewLicence.findAll", query="SELECT f FROM FlightCrewLicence f")
public class FlightCrewLicence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_License")
	private Date date_Of_License;

	@Column(name="License_Issued_By", length=60)
	private String license_Issued_By;

	@Column(name="License_Type", length=60)
	private String license_Type;

	@Column(name="Ratings", length=60)
	private String ratings;

	@Temporal(TemporalType.DATE)
	@Column(name="Validity")
	private Date validity;

	//bi-directional many-to-one association to FlightCrewMember
	@ManyToOne
	@JoinColumn(name="FlightCrewMember_ID", nullable=false)
	private FlightCrewMember flightCrewMember;

	public FlightCrewLicence() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate_Of_License() {
		return this.date_Of_License;
	}

	public void setDate_Of_License(Date date_Of_License) {
		this.date_Of_License = date_Of_License;
	}

	public String getLicense_Issued_By() {
		return this.license_Issued_By;
	}

	public void setLicense_Issued_By(String license_Issued_By) {
		this.license_Issued_By = license_Issued_By;
	}

	public String getLicense_Type() {
		return this.license_Type;
	}

	public void setLicense_Type(String license_Type) {
		this.license_Type = license_Type;
	}

	public String getRatings() {
		return this.ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public Date getValidity() {
		return this.validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	public FlightCrewMember getFlightCrewMember() {
		return this.flightCrewMember;
	}

	public void setFlightCrewMember(FlightCrewMember flightCrewMember) {
		this.flightCrewMember = flightCrewMember;
	}

}
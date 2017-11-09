package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SeparationAircraft database table.
 * 
 */
@Entity
@Table(name="SeparationAircraft")
@NamedQuery(name="SeparationAircraft.findAll", query="SELECT s FROM SeparationAircraft s")
public class SeparationAircraft implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="A_C_Avoiding_Action", length=60)
	private String a_C_Avoiding_Action;

	@Column(length=60)
	private String ATM_Action;

	@Column(name="Height_Altitude", length=60)
	private String height_Altitude;

	@Column(name="Other_Aircraft_Seen", length=60)
	private String other_Aircraft_Seen;

	@Column(name="Pilot_Response_To_RA", length=60)
	private String pilot_Response_To_RA;

	@Column(length=60)
	private String RA_Classification;

	@Column(length=60)
	private String RA_Type;

	@Column(name="Risk_Reduction_A_C", length=60)
	private String risk_Reduction_A_C;

	@Column(name="Vertical_Profile_Of_Separation", length=60)
	private String vertical_Profile_Of_Separation;

	//bi-directional many-to-one association to Separation
	@ManyToOne
	@JoinColumn(name="Separation_ID", nullable=false)
	private Separation separation;

	//bi-directional many-to-one association to SeparationTrafficInfoTypeQuality
	@OneToMany(mappedBy="separationAircraft")
	private List<SeparationTrafficInfoTypeQuality> separationTrafficInfoTypeQualities;

	public SeparationAircraft() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getA_C_Avoiding_Action() {
		return this.a_C_Avoiding_Action;
	}

	public void setA_C_Avoiding_Action(String a_C_Avoiding_Action) {
		this.a_C_Avoiding_Action = a_C_Avoiding_Action;
	}

	public String getATM_Action() {
		return this.ATM_Action;
	}

	public void setATM_Action(String ATM_Action) {
		this.ATM_Action = ATM_Action;
	}

	public String getHeight_Altitude() {
		return this.height_Altitude;
	}

	public void setHeight_Altitude(String height_Altitude) {
		this.height_Altitude = height_Altitude;
	}

	public String getOther_Aircraft_Seen() {
		return this.other_Aircraft_Seen;
	}

	public void setOther_Aircraft_Seen(String other_Aircraft_Seen) {
		this.other_Aircraft_Seen = other_Aircraft_Seen;
	}

	public String getPilot_Response_To_RA() {
		return this.pilot_Response_To_RA;
	}

	public void setPilot_Response_To_RA(String pilot_Response_To_RA) {
		this.pilot_Response_To_RA = pilot_Response_To_RA;
	}

	public String getRA_Classification() {
		return this.RA_Classification;
	}

	public void setRA_Classification(String RA_Classification) {
		this.RA_Classification = RA_Classification;
	}

	public String getRA_Type() {
		return this.RA_Type;
	}

	public void setRA_Type(String RA_Type) {
		this.RA_Type = RA_Type;
	}

	public String getRisk_Reduction_A_C() {
		return this.risk_Reduction_A_C;
	}

	public void setRisk_Reduction_A_C(String risk_Reduction_A_C) {
		this.risk_Reduction_A_C = risk_Reduction_A_C;
	}

	public String getVertical_Profile_Of_Separation() {
		return this.vertical_Profile_Of_Separation;
	}

	public void setVertical_Profile_Of_Separation(String vertical_Profile_Of_Separation) {
		this.vertical_Profile_Of_Separation = vertical_Profile_Of_Separation;
	}

	public Separation getSeparation() {
		return this.separation;
	}

	public void setSeparation(Separation separation) {
		this.separation = separation;
	}

	public List<SeparationTrafficInfoTypeQuality> getSeparationTrafficInfoTypeQualities() {
		return this.separationTrafficInfoTypeQualities;
	}

	public void setSeparationTrafficInfoTypeQualities(List<SeparationTrafficInfoTypeQuality> separationTrafficInfoTypeQualities) {
		this.separationTrafficInfoTypeQualities = separationTrafficInfoTypeQualities;
	}

	public SeparationTrafficInfoTypeQuality addSeparationTrafficInfoTypeQuality(SeparationTrafficInfoTypeQuality separationTrafficInfoTypeQuality) {
		getSeparationTrafficInfoTypeQualities().add(separationTrafficInfoTypeQuality);
		separationTrafficInfoTypeQuality.setSeparationAircraft(this);

		return separationTrafficInfoTypeQuality;
	}

	public SeparationTrafficInfoTypeQuality removeSeparationTrafficInfoTypeQuality(SeparationTrafficInfoTypeQuality separationTrafficInfoTypeQuality) {
		getSeparationTrafficInfoTypeQualities().remove(separationTrafficInfoTypeQuality);
		separationTrafficInfoTypeQuality.setSeparationAircraft(null);

		return separationTrafficInfoTypeQuality;
	}

}
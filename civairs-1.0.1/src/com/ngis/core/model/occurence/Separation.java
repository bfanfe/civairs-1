package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Separation database table.
 * 
 */
@Entity
@Table(name="Separation")
@NamedQuery(name="Separation.findAll", query="SELECT s FROM Separation s")
public class Separation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Est_Minimum_Horiz_Sep", length=60)
	private String est_Minimum_Horiz_Sep;

	@Column(name="Est_Vert_Separation", length=60)
	private String est_Vert_Separation;

	@Column(name="Horizontal_Rel_Mvmt", length=60)
	private String horizontal_Rel_Mvmt;

	@Column(name="Military_A_C_Involved", length=60)
	private String military_A_C_Involved;

	@Column(name="Min_Horiz_Sep_Rec", length=60)
	private String min_Horiz_Sep_Rec;

	@Column(name="Rate_Of_Closure", length=60)
	private String rate_Of_Closure;

	@Column(name="Req_Minimum_Horiz_Sep", length=60)
	private String req_Minimum_Horiz_Sep;

	@Column(name="Req_Vert_Separation", length=60)
	private String req_Vert_Separation;

	@Column(name="Vertical_Sep_Recorded", length=60)
	private String vertical_Sep_Recorded;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	//bi-directional many-to-one association to SeparationAircraft
	@OneToMany(mappedBy="separation")
	private List<SeparationAircraft> separationAircrafts;

	public Separation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEst_Minimum_Horiz_Sep() {
		return this.est_Minimum_Horiz_Sep;
	}

	public void setEst_Minimum_Horiz_Sep(String est_Minimum_Horiz_Sep) {
		this.est_Minimum_Horiz_Sep = est_Minimum_Horiz_Sep;
	}

	public String getEst_Vert_Separation() {
		return this.est_Vert_Separation;
	}

	public void setEst_Vert_Separation(String est_Vert_Separation) {
		this.est_Vert_Separation = est_Vert_Separation;
	}

	public String getHorizontal_Rel_Mvmt() {
		return this.horizontal_Rel_Mvmt;
	}

	public void setHorizontal_Rel_Mvmt(String horizontal_Rel_Mvmt) {
		this.horizontal_Rel_Mvmt = horizontal_Rel_Mvmt;
	}

	public String getMilitary_A_C_Involved() {
		return this.military_A_C_Involved;
	}

	public void setMilitary_A_C_Involved(String military_A_C_Involved) {
		this.military_A_C_Involved = military_A_C_Involved;
	}

	public String getMin_Horiz_Sep_Rec() {
		return this.min_Horiz_Sep_Rec;
	}

	public void setMin_Horiz_Sep_Rec(String min_Horiz_Sep_Rec) {
		this.min_Horiz_Sep_Rec = min_Horiz_Sep_Rec;
	}

	public String getRate_Of_Closure() {
		return this.rate_Of_Closure;
	}

	public void setRate_Of_Closure(String rate_Of_Closure) {
		this.rate_Of_Closure = rate_Of_Closure;
	}

	public String getReq_Minimum_Horiz_Sep() {
		return this.req_Minimum_Horiz_Sep;
	}

	public void setReq_Minimum_Horiz_Sep(String req_Minimum_Horiz_Sep) {
		this.req_Minimum_Horiz_Sep = req_Minimum_Horiz_Sep;
	}

	public String getReq_Vert_Separation() {
		return this.req_Vert_Separation;
	}

	public void setReq_Vert_Separation(String req_Vert_Separation) {
		this.req_Vert_Separation = req_Vert_Separation;
	}

	public String getVertical_Sep_Recorded() {
		return this.vertical_Sep_Recorded;
	}

	public void setVertical_Sep_Recorded(String vertical_Sep_Recorded) {
		this.vertical_Sep_Recorded = vertical_Sep_Recorded;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

	public List<SeparationAircraft> getSeparationAircrafts() {
		return this.separationAircrafts;
	}

	public void setSeparationAircrafts(List<SeparationAircraft> separationAircrafts) {
		this.separationAircrafts = separationAircrafts;
	}

	public SeparationAircraft addSeparationAircraft(SeparationAircraft separationAircraft) {
		getSeparationAircrafts().add(separationAircraft);
		separationAircraft.setSeparation(this);

		return separationAircraft;
	}

	public SeparationAircraft removeSeparationAircraft(SeparationAircraft separationAircraft) {
		getSeparationAircrafts().remove(separationAircraft);
		separationAircraft.setSeparation(null);

		return separationAircraft;
	}

}
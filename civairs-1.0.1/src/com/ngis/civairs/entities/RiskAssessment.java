package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RiskAssessment database table.
 * 
 */
@Entity
@Table(name="RiskAssessment")
@NamedQuery(name="RiskAssessment.findAll", query="SELECT r FROM RiskAssessment r")
public class RiskAssessment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Risk_Grade", length=60)
	private String risk_Grade;

	@Column(name="Risk_Level", length=60)
	private String risk_Level;

	@Column(name="Risk_Method", length=60)
	private String risk_Method;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public RiskAssessment() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRisk_Grade() {
		return this.risk_Grade;
	}

	public void setRisk_Grade(String risk_Grade) {
		this.risk_Grade = risk_Grade;
	}

	public String getRisk_Level() {
		return this.risk_Level;
	}

	public void setRisk_Level(String risk_Level) {
		this.risk_Level = risk_Level;
	}

	public String getRisk_Method() {
		return this.risk_Method;
	}

	public void setRisk_Method(String risk_Method) {
		this.risk_Method = risk_Method;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}
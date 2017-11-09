package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Operation_Type database table.
 * 
 */
@Entity
@Table(name="Static_Operation_Type")
@NamedQuery(name="StaticOperationType.findAll", query="SELECT s FROM StaticOperationType s")
public class StaticOperationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String valueID;

	@Column(nullable=false, length=256)
	private String description;

	@Lob
	private String detailedDescription;

	@Lob
	private String explanation;

	//bi-directional many-to-one association to Aircraft
	@OneToMany(mappedBy="staticOperationType")
	private List<Aircraft> aircrafts;

	public StaticOperationType() {
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
		aircraft.setStaticOperationType(this);

		return aircraft;
	}

	public Aircraft removeAircraft(Aircraft aircraft) {
		getAircrafts().remove(aircraft);
		aircraft.setStaticOperationType(null);

		return aircraft;
	}

}
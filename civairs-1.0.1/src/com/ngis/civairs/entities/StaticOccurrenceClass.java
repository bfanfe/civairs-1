package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Occurrence_Class database table.
 * 
 */
@Entity
@Table(name="Static_Occurrence_Class")
@NamedQuery(name="StaticOccurrenceClass.findAll", query="SELECT s FROM StaticOccurrenceClass s")
public class StaticOccurrenceClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String valueID;

	@Lob
	private String description;

	@Lob
	private String detailedDescription;

	@Lob
	private String explanation;

	//bi-directional many-to-one association to Analyse
	@OneToMany(mappedBy="staticOccurrenceClass")
	private List<Analyse> analyses;

	public StaticOccurrenceClass() {
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

	public List<Analyse> getAnalyses() {
		return this.analyses;
	}

	public void setAnalyses(List<Analyse> analyses) {
		this.analyses = analyses;
	}

	public Analyse addAnalys(Analyse analys) {
		getAnalyses().add(analys);
		analys.setStaticOccurrenceClass(this);

		return analys;
	}

	public Analyse removeAnalys(Analyse analys) {
		getAnalyses().remove(analys);
		analys.setStaticOccurrenceClass(null);

		return analys;
	}

}
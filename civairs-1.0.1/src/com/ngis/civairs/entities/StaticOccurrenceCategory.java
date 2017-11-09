package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Occurrence_Category database table.
 * 
 */
@Entity
@Table(name="Static_Occurrence_Category")
@NamedQuery(name="StaticOccurrenceCategory.findAll", query="SELECT s FROM StaticOccurrenceCategory s")
public class StaticOccurrenceCategory implements Serializable {
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

	//bi-directional many-to-many association to Analyse
	@ManyToMany
	@JoinTable(
		name="Analyse_has_Static_Occurrence_Category"
		, joinColumns={
			@JoinColumn(name="Static_Occurrence_Category_valueID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Analyse_ID", nullable=false)
			}
		)
	private List<Analyse> analyses;

	public StaticOccurrenceCategory() {
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

}
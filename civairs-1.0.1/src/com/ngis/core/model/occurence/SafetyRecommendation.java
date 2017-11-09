package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SafetyRecommendation database table.
 * 
 */
@Entity
@Table(name="SafetyRecommendation")
@NamedQuery(name="SafetyRecommendation.findAll", query="SELECT s FROM SafetyRecommendation s")
public class SafetyRecommendation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Recommendation_Data_Link", length=256)
	private String recommendation_Data_Link;

	@Column(name="Safety_Recommendation", length=60)
	private String safety_Recommendation;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public SafetyRecommendation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRecommendation_Data_Link() {
		return this.recommendation_Data_Link;
	}

	public void setRecommendation_Data_Link(String recommendation_Data_Link) {
		this.recommendation_Data_Link = recommendation_Data_Link;
	}

	public String getSafety_Recommendation() {
		return this.safety_Recommendation;
	}

	public void setSafety_Recommendation(String safety_Recommendation) {
		this.safety_Recommendation = safety_Recommendation;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}
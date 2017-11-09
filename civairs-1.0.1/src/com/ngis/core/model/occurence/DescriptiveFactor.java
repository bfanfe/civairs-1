package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DescriptiveFactor database table.
 * 
 */
@Entity
@Table(name="DescriptiveFactor")
@NamedQuery(name="DescriptiveFactor.findAll", query="SELECT d FROM DescriptiveFactor d")
public class DescriptiveFactor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Descriptive_Factor_Justification", length=60)
	private String descriptive_Factor_Justification;

	@Column(name="Descriptive_Factor_Modifier", length=60)
	private String descriptive_Factor_Modifier;

	@Column(name="Descriptive_Factor_Subject", length=60)
	private String descriptive_Factor_Subject;

	//bi-directional many-to-one association to Event
	@ManyToOne
	@JoinColumn(name="Events_ID", nullable=false)
	private Event event;

	//bi-directional many-to-one association to ExplanatoryFactor
	@OneToMany(mappedBy="descriptiveFactor")
	private List<ExplanatoryFactor> explanatoryFactors;

	public DescriptiveFactor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescriptive_Factor_Justification() {
		return this.descriptive_Factor_Justification;
	}

	public void setDescriptive_Factor_Justification(String descriptive_Factor_Justification) {
		this.descriptive_Factor_Justification = descriptive_Factor_Justification;
	}

	public String getDescriptive_Factor_Modifier() {
		return this.descriptive_Factor_Modifier;
	}

	public void setDescriptive_Factor_Modifier(String descriptive_Factor_Modifier) {
		this.descriptive_Factor_Modifier = descriptive_Factor_Modifier;
	}

	public String getDescriptive_Factor_Subject() {
		return this.descriptive_Factor_Subject;
	}

	public void setDescriptive_Factor_Subject(String descriptive_Factor_Subject) {
		this.descriptive_Factor_Subject = descriptive_Factor_Subject;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<ExplanatoryFactor> getExplanatoryFactors() {
		return this.explanatoryFactors;
	}

	public void setExplanatoryFactors(List<ExplanatoryFactor> explanatoryFactors) {
		this.explanatoryFactors = explanatoryFactors;
	}

	public ExplanatoryFactor addExplanatoryFactor(ExplanatoryFactor explanatoryFactor) {
		getExplanatoryFactors().add(explanatoryFactor);
		explanatoryFactor.setDescriptiveFactor(this);

		return explanatoryFactor;
	}

	public ExplanatoryFactor removeExplanatoryFactor(ExplanatoryFactor explanatoryFactor) {
		getExplanatoryFactors().remove(explanatoryFactor);
		explanatoryFactor.setDescriptiveFactor(null);

		return explanatoryFactor;
	}

}
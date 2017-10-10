package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ExplanatoryFactor database table.
 * 
 */
@Entity
@Table(name="ExplanatoryFactor")
@NamedQuery(name="ExplanatoryFactor.findAll", query="SELECT e FROM ExplanatoryFactor e")
public class ExplanatoryFactor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Lob
	@Column(name="Explanatory_Factor_Justification")
	private String explanatory_Factor_Justification;

	@Column(name="Explanatory_Factor_Modifier", length=60)
	private String explanatory_Factor_Modifier;

	@Column(name="Explanatory_Factor_Subject", length=60)
	private String explanatory_Factor_Subject;

	@Column(name="The_Person_Or_Organization", length=60)
	private String the_Person_Or_Organization;

	//bi-directional many-to-one association to DescriptiveFactor
	@ManyToOne
	@JoinColumn(name="DescriptiveFactor_ID", nullable=false)
	private DescriptiveFactor descriptiveFactor;

	public ExplanatoryFactor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExplanatory_Factor_Justification() {
		return this.explanatory_Factor_Justification;
	}

	public void setExplanatory_Factor_Justification(String explanatory_Factor_Justification) {
		this.explanatory_Factor_Justification = explanatory_Factor_Justification;
	}

	public String getExplanatory_Factor_Modifier() {
		return this.explanatory_Factor_Modifier;
	}

	public void setExplanatory_Factor_Modifier(String explanatory_Factor_Modifier) {
		this.explanatory_Factor_Modifier = explanatory_Factor_Modifier;
	}

	public String getExplanatory_Factor_Subject() {
		return this.explanatory_Factor_Subject;
	}

	public void setExplanatory_Factor_Subject(String explanatory_Factor_Subject) {
		this.explanatory_Factor_Subject = explanatory_Factor_Subject;
	}

	public String getThe_Person_Or_Organization() {
		return this.the_Person_Or_Organization;
	}

	public void setThe_Person_Or_Organization(String the_Person_Or_Organization) {
		this.the_Person_Or_Organization = the_Person_Or_Organization;
	}

	public DescriptiveFactor getDescriptiveFactor() {
		return this.descriptiveFactor;
	}

	public void setDescriptiveFactor(DescriptiveFactor descriptiveFactor) {
		this.descriptiveFactor = descriptiveFactor;
	}

}
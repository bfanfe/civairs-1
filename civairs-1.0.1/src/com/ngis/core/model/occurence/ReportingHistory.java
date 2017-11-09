package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ReportingHistory database table.
 * 
 */
@Entity
@Table(name="ReportingHistory")
@NamedQuery(name="ReportingHistory.findAll", query="SELECT r FROM ReportingHistory r")
public class ReportingHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Lob
	@Column(name="Conclusions")
	private String conclusions;

	@Lob
	@Column(name="Corrective_Actions")
	private String corrective_Actions;

	@Column(name="Description_Investigation", length=60)
	private String description_Investigation;

	@Column(name="Parties_Informed", length=60)
	private String parties_Informed;

	@Column(name="Report", length=60)
	private String report;

	@Column(name="Report_Identification", length=60)
	private String report_Identification;

	@Column(name="Report_Status", length=60)
	private String report_Status;

	@Temporal(TemporalType.DATE)
	@Column(name="Reporting_Date")
	private Date reporting_Date;

	@Column(name="Reporting_Entity", length=60)
	private String reporting_Entity;

	@Column(name="Reporting_Form_Type", length=60)
	private String reporting_Form_Type;

	@Column(name="Risk_Assessment", length=60)
	private String risk_Assessment;

	@Column(name="Risk_Classification", length=60)
	private String risk_Classification;

	@Column(name="Risk_Methodology", length=60)
	private String risk_Methodology;

	@Column(name="Tracking_Sheet_Number", length=60)
	private String tracking_Sheet_Number;

	//bi-directional many-to-many association to Narrative
	@ManyToMany
	@JoinTable(
		name="ReportingHistory_has_Narrative"
		, joinColumns={
			@JoinColumn(name="ReportingHistory_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Narrative_ID", nullable=false)
			}
		)
	private List<Narrative> narratives;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public ReportingHistory() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConclusions() {
		return this.conclusions;
	}

	public void setConclusions(String conclusions) {
		this.conclusions = conclusions;
	}

	public String getCorrective_Actions() {
		return this.corrective_Actions;
	}

	public void setCorrective_Actions(String corrective_Actions) {
		this.corrective_Actions = corrective_Actions;
	}

	public String getDescription_Investigation() {
		return this.description_Investigation;
	}

	public void setDescription_Investigation(String description_Investigation) {
		this.description_Investigation = description_Investigation;
	}

	public String getParties_Informed() {
		return this.parties_Informed;
	}

	public void setParties_Informed(String parties_Informed) {
		this.parties_Informed = parties_Informed;
	}

	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getReport_Identification() {
		return this.report_Identification;
	}

	public void setReport_Identification(String report_Identification) {
		this.report_Identification = report_Identification;
	}

	public String getReport_Status() {
		return this.report_Status;
	}

	public void setReport_Status(String report_Status) {
		this.report_Status = report_Status;
	}

	public Date getReporting_Date() {
		return this.reporting_Date;
	}

	public void setReporting_Date(Date reporting_Date) {
		this.reporting_Date = reporting_Date;
	}

	public String getReporting_Entity() {
		return this.reporting_Entity;
	}

	public void setReporting_Entity(String reporting_Entity) {
		this.reporting_Entity = reporting_Entity;
	}

	public String getReporting_Form_Type() {
		return this.reporting_Form_Type;
	}

	public void setReporting_Form_Type(String reporting_Form_Type) {
		this.reporting_Form_Type = reporting_Form_Type;
	}

	public String getRisk_Assessment() {
		return this.risk_Assessment;
	}

	public void setRisk_Assessment(String risk_Assessment) {
		this.risk_Assessment = risk_Assessment;
	}

	public String getRisk_Classification() {
		return this.risk_Classification;
	}

	public void setRisk_Classification(String risk_Classification) {
		this.risk_Classification = risk_Classification;
	}

	public String getRisk_Methodology() {
		return this.risk_Methodology;
	}

	public void setRisk_Methodology(String risk_Methodology) {
		this.risk_Methodology = risk_Methodology;
	}

	public String getTracking_Sheet_Number() {
		return this.tracking_Sheet_Number;
	}

	public void setTracking_Sheet_Number(String tracking_Sheet_Number) {
		this.tracking_Sheet_Number = tracking_Sheet_Number;
	}

	public List<Narrative> getNarratives() {
		return this.narratives;
	}

	public void setNarratives(List<Narrative> narratives) {
		this.narratives = narratives;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}
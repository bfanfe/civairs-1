package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AerodromeWeatherReports database table.
 * 
 */
@Entity
@Table(name="AerodromeWeatherReports")
@NamedQuery(name="AerodromeWeatherReport.findAll", query="SELECT a FROM AerodromeWeatherReport a")
public class AerodromeWeatherReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Wx_Report", length=60)
	private String wx_Report;

	@Column(name="Wx_Report_Type", length=60)
	private String wx_Report_Type;

	@Column(name="Wx_Report_Validity", length=60)
	private String wx_Report_Validity;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public AerodromeWeatherReport() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWx_Report() {
		return this.wx_Report;
	}

	public void setWx_Report(String wx_Report) {
		this.wx_Report = wx_Report;
	}

	public String getWx_Report_Type() {
		return this.wx_Report_Type;
	}

	public void setWx_Report_Type(String wx_Report_Type) {
		this.wx_Report_Type = wx_Report_Type;
	}

	public String getWx_Report_Validity() {
		return this.wx_Report_Validity;
	}

	public void setWx_Report_Validity(String wx_Report_Validity) {
		this.wx_Report_Validity = wx_Report_Validity;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}
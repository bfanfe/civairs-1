package com.ngis.civairs.model.entities.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Events database table.
 * 
 */
@Entity
@Table(name="Events")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="Event_Type", length=60)
	private String event_Type;

	@Column(name="Phase", length=60)
	private String phase;

	//bi-directional many-to-one association to DescriptiveFactor
	@OneToMany(mappedBy="event")
	private List<DescriptiveFactor> descriptiveFactors;

	//bi-directional many-to-one association to Occurence
	@ManyToOne
	@JoinColumn(name="Occurence_ID", nullable=false)
	private Occurence occurence;

	public Event() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEvent_Type() {
		return this.event_Type;
	}

	public void setEvent_Type(String event_Type) {
		this.event_Type = event_Type;
	}

	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public List<DescriptiveFactor> getDescriptiveFactors() {
		return this.descriptiveFactors;
	}

	public void setDescriptiveFactors(List<DescriptiveFactor> descriptiveFactors) {
		this.descriptiveFactors = descriptiveFactors;
	}

	public DescriptiveFactor addDescriptiveFactor(DescriptiveFactor descriptiveFactor) {
		getDescriptiveFactors().add(descriptiveFactor);
		descriptiveFactor.setEvent(this);

		return descriptiveFactor;
	}

	public DescriptiveFactor removeDescriptiveFactor(DescriptiveFactor descriptiveFactor) {
		getDescriptiveFactors().remove(descriptiveFactor);
		descriptiveFactor.setEvent(null);

		return descriptiveFactor;
	}

	public Occurence getOccurence() {
		return this.occurence;
	}

	public void setOccurence(Occurence occurence) {
		this.occurence = occurence;
	}

}
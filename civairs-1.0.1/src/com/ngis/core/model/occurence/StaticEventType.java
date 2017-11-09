package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Event_Type database table.
 * 
 */
@Entity
@Table(name="Static_Event_Type")
@NamedQuery(name="StaticEventType.findAll", query="SELECT s FROM StaticEventType s")
public class StaticEventType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String valueID;

	@Column(length=60)
	private String aliasICAO;

	@Lob
	private String description;

	@Lob
	private String detailedDescription;

	@Lob
	private String explanation;

	//bi-directional many-to-many association to Analyse
	@ManyToMany
	@JoinTable(
		name="Analyse_has_Static_Event_Type"
		, joinColumns={
			@JoinColumn(name="Static_Event_Type_valueID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="Analyse_ID", nullable=false)
			}
		)
	private List<Analyse> analyses;

	//bi-directional many-to-one association to StaticEventType
	@ManyToOne
	@JoinColumn(name="parentID")
	private StaticEventType eventTypeParent;

	//bi-directional many-to-one association to StaticEventType
	@OneToMany(mappedBy="eventTypeParent", cascade=CascadeType.ALL)
	private List<StaticEventType> eventTypeChildren;

	public StaticEventType() {
	}

	public String getValueID() {
		return this.valueID;
	}

	public void setValueID(String valueID) {
		this.valueID = valueID;
	}

	public String getAliasICAO() {
		return this.aliasICAO;
	}

	public void setAliasICAO(String aliasICAO) {
		this.aliasICAO = aliasICAO;
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

	public StaticEventType getEventTypeParent() {
		return this.eventTypeParent;
	}

	public void setEventTypeParent(StaticEventType eventTypeParent) {
		this.eventTypeParent = eventTypeParent;
	}

	public List<StaticEventType> getEventTypeChildren() {
		return this.eventTypeChildren;
	}

	public void setEventTypeChildren(List<StaticEventType> eventTypeChildren) {
		this.eventTypeChildren = eventTypeChildren;
	}

	public StaticEventType addEventTypeChild(StaticEventType eventTypeChild) {
		getEventTypeChildren().add(eventTypeChild);
		eventTypeChild.setEventTypeParent(this);

		return eventTypeChild;
	}

	public StaticEventType removeEventTypeChild(StaticEventType eventTypeChild) {
		getEventTypeChildren().remove(eventTypeChild);
		eventTypeChild.setEventTypeParent(null);

		return eventTypeChild;
	}

}
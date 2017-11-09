package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the Analyse database table.
 * 
 */
@Entity
@Table(name = "Analyse")
@NamedQueries(value = { @NamedQuery(name = "Analyse.findAll", query = "SELECT a FROM Analyse a"),
		@NamedQuery(name = "Analyse.findAllByEntity", query = "SELECT n.analyse FROM Notification n WHERE n.identifier.responsibleEntity.id=:entityId") })
public class Analyse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 256)
	private String id;

	@Column(length = 60)
	private String ATM_Contribution;

	@Column(name = "Effect_On_ATM_Service", length = 60)
	private String effect_On_ATM_Service;

	@Column(name = "Event_Frequency", length = 60)
	private String event_Frequency;

	@Column(name = "Event_Type", length = 60)
	private String event_Type;

	@Column(name = "Occurrence_Category", length = 60)
	private String occurrence_Category;

	@Column(name = "Occurrence_Class", length = 60)
	private String occurrence_Class;

	@Column(name = "Occurrence_Status", length = 60)
	private String occurrence_Status;

	@Lob
	@Column(name = "Result_And_Actions")
	private String result_And_Actions;

	// bi-directional many-to-one association to Notification
	@OneToMany(mappedBy = "analyse", cascade=CascadeType.MERGE)
	private List<Notification> notifications;

	// bi-directional many-to-one association to StaticOccurrenceClass
	@ManyToOne
	@JoinColumn(name = "Static_Occurrence_Class_valueID")
	private StaticOccurrenceClass staticOccurrenceClass;

	// bi-directional many-to-one association to StaticOccurrenceStatus
	@ManyToOne
	@JoinColumn(name = "Static_Occurrence_Status_valueID")
	private StaticOccurrenceStatus staticOccurrenceStatus;

	// bi-directional many-to-one association to StaticATMContribution
	@ManyToOne
	@JoinColumn(name = "Static_ATM_Contribution_valueID")
	private StaticATMContribution staticAtmContribution;

	// bi-directional many-to-one association to StaticEventFrequency
	@ManyToOne
	@JoinColumn(name = "Static_Event_Frequency_valueID")
	private StaticEventFrequency staticEventFrequency;

	// bi-directional many-to-one association to StaticEffectOnATMService
	@ManyToOne
	@JoinColumn(name = "Static_Effect_On_ATM_Service_valueID")
	private StaticEffectOnATMService staticEffectOnAtmService;

	// bi-directional many-to-many association to StaticOccurrenceCategory
	@ManyToMany
	@JoinTable(name = "Analyse_has_Static_Occurrence_Category", 
	joinColumns = {@JoinColumn(name = "Analyse_ID", nullable = false) }, 
	inverseJoinColumns = {@JoinColumn(name = "Static_Occurrence_Category_valueID", nullable = false) })
	private List<StaticOccurrenceCategory> staticOccurrenceCategories;

	public Analyse() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getATM_Contribution() {
		return this.ATM_Contribution;
	}

	public void setATM_Contribution(String ATM_Contribution) {
		this.ATM_Contribution = ATM_Contribution;
	}

	public String getEffect_On_ATM_Service() {
		return this.effect_On_ATM_Service;
	}

	public void setEffect_On_ATM_Service(String effect_On_ATM_Service) {
		this.effect_On_ATM_Service = effect_On_ATM_Service;
	}

	public String getEvent_Frequency() {
		return this.event_Frequency;
	}

	public void setEvent_Frequency(String event_Frequency) {
		this.event_Frequency = event_Frequency;
	}

	public String getEvent_Type() {
		return this.event_Type;
	}

	public void setEvent_Type(String event_Type) {
		this.event_Type = event_Type;
	}

	public String getOccurrence_Category() {
		return this.occurrence_Category;
	}

	public void setOccurrence_Category(String occurrence_Category) {
		this.occurrence_Category = occurrence_Category;
	}

	public String getOccurrence_Class() {
		return this.occurrence_Class;
	}

	public void setOccurrence_Class(String occurrence_Class) {
		this.occurrence_Class = occurrence_Class;
	}

	public String getOccurrence_Status() {
		return this.occurrence_Status;
	}

	public void setOccurrence_Status(String occurrence_Status) {
		this.occurrence_Status = occurrence_Status;
	}

	public String getResult_And_Actions() {
		return this.result_And_Actions;
	}

	public void setResult_And_Actions(String result_And_Actions) {
		this.result_And_Actions = result_And_Actions;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setAnalyse(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setAnalyse(null);

		return notification;
	}

	public StaticOccurrenceClass getStaticOccurrenceClass() {
		return this.staticOccurrenceClass;
	}

	public void setStaticOccurrenceClass(StaticOccurrenceClass staticOccurrenceClass) {
		this.staticOccurrenceClass = staticOccurrenceClass;
	}

	public StaticOccurrenceStatus getStaticOccurrenceStatus() {
		return this.staticOccurrenceStatus;
	}

	public void setStaticOccurrenceStatus(StaticOccurrenceStatus staticOccurrenceStatus) {
		this.staticOccurrenceStatus = staticOccurrenceStatus;
	}

	public StaticATMContribution getStaticAtmContribution() {
		return this.staticAtmContribution;
	}

	public void setStaticAtmContribution(StaticATMContribution staticAtmContribution) {
		this.staticAtmContribution = staticAtmContribution;
	}

	public StaticEventFrequency getStaticEventFrequency() {
		return this.staticEventFrequency;
	}

	public void setStaticEventFrequency(StaticEventFrequency staticEventFrequency) {
		this.staticEventFrequency = staticEventFrequency;
	}

	public StaticEffectOnATMService getStaticEffectOnAtmService() {
		return this.staticEffectOnAtmService;
	}

	public void setStaticEffectOnAtmService(StaticEffectOnATMService staticEffectOnAtmService) {
		this.staticEffectOnAtmService = staticEffectOnAtmService;
	}

	public List<StaticOccurrenceCategory> getStaticOccurrenceCategories() {
		return this.staticOccurrenceCategories;
	}

	public void setStaticOccurrenceCategories(List<StaticOccurrenceCategory> staticOccurrenceCategories) {
		this.staticOccurrenceCategories = staticOccurrenceCategories;
	}

}
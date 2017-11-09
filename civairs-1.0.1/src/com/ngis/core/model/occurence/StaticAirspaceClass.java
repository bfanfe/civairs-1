package com.ngis.core.model.occurence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Static_Airspace_Class database table.
 * 
 */
@Entity
@Table(name="Static_Airspace_Class")
@NamedQuery(name="StaticAirspaceClass.findAll", query="SELECT s FROM StaticAirspaceClass s")
public class StaticAirspaceClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String valueID;

	@Column(nullable=false, length=60)
	private String description;

	@Lob
	private String detailedDescription;

	@Lob
	private String explanation;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="staticAirspaceClass")
	private List<Notification> notifications;

	public StaticAirspaceClass() {
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

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setStaticAirspaceClass(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setStaticAirspaceClass(null);

		return notification;
	}

}
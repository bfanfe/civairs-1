package com.ngis.civairs.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.ngis.core.model.ResponsibleEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the Identifiers database table.
 * 
 */
@Entity
@Table(name="Identifiers")
@NamedQuery(name="Identifier.findAll", query="SELECT i FROM Identifier i")
public class Identifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=256)
	private String id;

	@Column(name="File_Number", nullable=false, length=60)
	private String file_Number;

	//bi-directional many-to-one association to ResponsibleEntity
	@ManyToOne
	@JoinColumn(name="Responsible_Entity", nullable=false)
	private ResponsibleEntity responsibleEntity;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="identifier", cascade=CascadeType.PERSIST)
	private List<Notification> notifications;

	//bi-directional many-to-one association to Occurence
	@OneToMany(mappedBy="identifier", cascade=CascadeType.PERSIST)
	private List<Occurence> occurences;

	public Identifier() {
		notifications = new ArrayList<Notification>();
		occurences = new ArrayList<>();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile_Number() {
		return this.file_Number;
	}

	public void setFile_Number(String file_Number) {
		this.file_Number = file_Number;
	}

	public ResponsibleEntity getResponsibleEntity() {
		return this.responsibleEntity;
	}

	public void setResponsibleEntity(ResponsibleEntity responsibleEntity) {
		this.responsibleEntity = responsibleEntity;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setIdentifier(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setIdentifier(null);

		return notification;
	}

	public List<Occurence> getOccurences() {
		return this.occurences;
	}

	public void setOccurences(List<Occurence> occurences) {
		this.occurences = occurences;
	}

	public Occurence addOccurence(Occurence occurence) {
		getOccurences().add(occurence);
		occurence.setIdentifier(this);

		return occurence;
	}

	public Occurence removeOccurence(Occurence occurence) {
		getOccurences().remove(occurence);
		occurence.setIdentifier(null);

		return occurence;
	}

}
package com.ngis.core.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ng_user database table.
 * 
 */
@Entity
@Table(name="ng_user")
@NamedQuery(name="NGUser.findAll", query="SELECT n FROM User n")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String login;

	private String adress;

	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String password;

	@Column(name="phone_number")
	private String phoneNumber;
	
	//bi-directional many-to-one association to ResponsibleEntity
	@ManyToOne
	@JoinColumn(name="Responsible_Entity_ID")
	private ResponsibleEntity responsibleEntity;

	//bi-directional many-to-many association to NGRole
	@ManyToMany
	@JoinTable(name="role_user",
	joinColumns=@JoinColumn(name="login"),
	inverseJoinColumns=@JoinColumn(name="role_id"))
	private List<Role> roles;

	public User() {
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public ResponsibleEntity getResponsibleEntity() {
		return responsibleEntity;
	}

	public void setResponsibleEntity(ResponsibleEntity responsibleEntity) {
		this.responsibleEntity = responsibleEntity;
	}

	
}
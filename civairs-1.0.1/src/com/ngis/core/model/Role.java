package com.ngis.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ng_role database table.
 * 
 */
@Entity
@Table(name="ng_role")
@NamedQuery(name="Role.findAll", query="SELECT n FROM Role n")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="role_id")
	private String roleId;

	@Column(name="role_description")
	private String roleDescription;

	//bi-directional many-to-many association to Permission
	@ManyToMany
	@JoinTable(name="role_permission",
	joinColumns=@JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="permission_id"))
	private List<Permission> ngPermissions;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(name="role_user",
	joinColumns=@JoinColumn(name="role_id"),
	inverseJoinColumns=@JoinColumn(name="login"))
	private List<User> ngUsers;

	public Role() {
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public List<Permission> getNgPermissions() {
		return this.ngPermissions;
	}

	public void setNgPermissions(List<Permission> ngPermissions) {
		this.ngPermissions = ngPermissions;
	}

	public List<User> getNgUsers() {
		return this.ngUsers;
	}

	public void setNgUsers(List<User> ngUsers) {
		this.ngUsers = ngUsers;
	}

}
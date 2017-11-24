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
	@ManyToMany(mappedBy="roles")
	private List<User> users;

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

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	@Override
    public int hashCode() {
        return (getRoleId() != null) 
            ? (getClass().getSimpleName().hashCode() + getRoleId().hashCode())
            : super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getRoleId() != null
                && other.getClass().isAssignableFrom(getClass()) 
                && getClass().isAssignableFrom(other.getClass())) 
            ? getRoleId().equals(((Role) other).getRoleId())
            : (other == this);
    }


	@Override
	public String toString() {
		return String.format("%s-%s", getClass().getSimpleName(), getRoleId());
	}

}
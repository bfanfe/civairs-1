package com.ngis.core.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import com.ngis.civairs.applicationException.CRUDException;
import com.ngis.civairs.model.dao.NGRoleDAO;
import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@ManagedBean
@SessionScoped
@Stateless
public class RoleService implements IRole{
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	private Role role;

	private List<Role> roles;
	private Map<String, Role> rolesMap;

	@EJB
	private NGRoleDAO dao;

	@PostConstruct
	private void init() {
		roles = dao.getList();
		loadRolesMap();
	}

	public Role getRole(String roleId) {
		return rolesMap.get(roleId);
	}

	public List<Role> reloadRoles() {
		roles = dao.getList();
		loadRolesMap();
		return roles;
	}

	public String saveRole(Role roleToSave) {
		if (dao.findById(roleToSave.getRoleId()) == null)
			return dao.insert(roleToSave);
		else
			return dao.update(roleToSave);
	}
	
	public String deleteRole(Role roleToDelete){
		return dao.remove(roleToDelete);
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Map<String, Role> getRolesMap() {
		return rolesMap;
	}

	public void setRolesMap(Map<String, Role> rolesMap) {
		this.rolesMap = rolesMap;
	}
	
	public void loadRolesMap(){
		rolesMap = new HashMap<String, Role>();
		for (Role role : roles) {
			rolesMap.put(role.getRoleId(), role);
		}
	}

	public static Role copy(Role role) {
		Role copy = null;
		if (role != null) {
			copy = new Role();
			copy.setRoleId(role.getRoleId());
			copy.setPermissions(role.getPermissions());
			copy.setRoleDescription(role.getRoleDescription());
			copy.setUsers(role.getUsers());
			
		}
		return copy;
		
	}
	
	public static List<Role> copyList(List<Role> list){
		List<Role> copy = null;
		if(list != null){
			copy = new ArrayList<Role>();
			copy.addAll(list);
		}
		return copy;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public void createRole(Role role, List<Permission> permissions, List<User> users) {
		// TODO Auto-generated method stub
		role.setPermissions(permissions);
		role.setUsers(users);
		em.persist(role);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème d'insertion du role");
			
		}
		
	}

	@Override
	public void updateRole(Role role, List<Permission> permissions, List<User> users) {
		// TODO Auto-generated method stub
		role.getPermissions().clear();
		role.getPermissions().addAll(permissions);
		role.getUsers().clear();
		role.getUsers().addAll(users);
		em.merge(role);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème de mise à jour du role");
			
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT r FROM Role r").getResultList();
	}

	@Override
	public void deleteRole(String roleId) {
		// TODO Auto-generated method stub
		
	}

}

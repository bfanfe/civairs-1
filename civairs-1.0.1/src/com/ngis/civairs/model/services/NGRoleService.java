package com.ngis.civairs.model.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.civairs.model.dao.NGRoleDAO;
import com.ngis.core.model.Role;

@ManagedBean
@SessionScoped
public class NGRoleService {

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
			copy.setNgPermissions(role.getNgPermissions());
			copy.setRoleDescription(role.getRoleDescription());
			copy.setNgUsers(role.getNgUsers());
			
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

}

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
import com.ngis.civairs.model.entities.NGRole;

@ManagedBean
@SessionScoped
public class NGRoleService {

	private List<NGRole> roles;
	private Map<String, NGRole> rolesMap;

	@EJB
	private NGRoleDAO dao;

	@PostConstruct
	private void init() {
		roles = dao.getList();
		loadRolesMap();
	}

	public NGRole getRole(String roleId) {
		return rolesMap.get(roleId);
	}

	public List<NGRole> reloadRoles() {
		roles = dao.getList();
		loadRolesMap();
		return roles;
	}

	public String saveRole(NGRole roleToSave) {
		if (dao.findById(roleToSave.getRoleId()) == null)
			return dao.insert(roleToSave);
		else
			return dao.update(roleToSave);
	}
	
	public String deleteRole(NGRole roleToDelete){
		return dao.remove(roleToDelete);
	}

	public List<NGRole> getRoles() {
		return roles;
	}

	public void setRoles(List<NGRole> roles) {
		this.roles = roles;
	}

	public Map<String, NGRole> getRolesMap() {
		return rolesMap;
	}

	public void setRolesMap(Map<String, NGRole> rolesMap) {
		this.rolesMap = rolesMap;
	}
	
	public void loadRolesMap(){
		rolesMap = new HashMap<String, NGRole>();
		for (NGRole role : roles) {
			rolesMap.put(role.getRoleId(), role);
		}
	}

	public static NGRole copy(NGRole role) {
		NGRole copy = null;
		if (role != null) {
			copy = new NGRole();
			copy.setRoleId(role.getRoleId());
			copy.setNgPermissions(role.getNgPermissions());
			copy.setRoleDescription(role.getRoleDescription());
			copy.setNgUsers(role.getNgUsers());
			
		}
		return copy;
		
	}
	
	public static List<NGRole> copyList(List<NGRole> list){
		List<NGRole> copy = null;
		if(list != null){
			copy = new ArrayList<NGRole>();
			copy.addAll(list);
		}
		return copy;
	}

}

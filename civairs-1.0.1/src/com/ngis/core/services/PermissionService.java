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
import com.ngis.civairs.model.dao.NGPermissionDAO;
import com.ngis.core.model.Permission;
import com.ngis.core.model.Role;

@ManagedBean
@SessionScoped
@Stateless
public class PermissionService implements IPermission{
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;
	
	private Permission permission;
	
	private List<Permission> permissions;
	private Map<String, Permission> permissionsMap;
	
	@EJB
	private NGPermissionDAO dao;
	
	@PostConstruct
	private void init(){
		permissions = dao.getList();
		permissionsMap = new HashMap<String, Permission>();
		for(Permission permission : permissions){
			permissionsMap.put(permission.getPermissionId(), permission);
		}
	}

	public List<Permission> reloadPermissions(){
		permissions = dao.getList();
		return permissions;
	}
	
	public String savePermission(Permission permissionToSave){
		if(dao.findById(permissionToSave.getPermissionId()) == null) return dao.insert(permissionToSave);
		else return dao.update(permissionToSave);
	}
	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Map<String, Permission> getPermissionsMap() {
		return permissionsMap;
	}

	public void setPermissionsMap(Map<String, Permission> permissionsMap) {
		this.permissionsMap = permissionsMap;
	}	
	
	public static Permission copy(Permission permission) {
		Permission copy = null;
		if (permission != null) {
			copy = new Permission();
			copy.setPermissionDescription(permission.getPermissionDescription());
			copy.setPermissionId(permission.getPermissionId());
			copy.setRoles(permission.getRoles());
			
		}
		return copy;
		
	}
	
	public static List<Permission> copyList(List<Permission> list){
		List<Permission> copy = null;
		if(list != null){
			copy = new ArrayList<Permission>();
			copy.addAll(list);
		}
		return copy;
	}

	/**
	 * @return the permission
	 */
	public Permission getPermission() {
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	@Override
	public void createPermission(Permission permission, List<Role> roles) {
		// TODO Auto-generated method stub
		permission.setRoles(roles);
		em.persist(permission);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème d'insertion de la permission");
			
		}
		
	}

	@Override
	public void updatePermission(Permission permission, List<Role> roles) {
		// TODO Auto-generated method stub
		permission.getRoles().clear();
		permission.getRoles().addAll(roles);
		em.merge(permission);
		try{
			em.flush();
			
		} catch (PersistenceException e) {
			// TODO: handle exception
			throw new CRUDException("Problème de mise à jour de la permission");
			
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Permission> findAllPermission() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT p FROM Permission p").getResultList();
	}

	@Override
	public void deletePermission(String permissionId) {
		// TODO Auto-generated method stub
		
	}

}

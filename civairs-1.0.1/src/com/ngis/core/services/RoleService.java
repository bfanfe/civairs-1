package com.ngis.core.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@Stateless
public class RoleService extends Service {

	private static final String CREATE_EXCEPTION_MESSAGE = "ROLE_CREATE_EXCEPTION_MESSAGE";
	private static final String UPDATE_EXCEPTION_MESSAGE = "ROLE_UPDATE_EXCEPTION_MESSAGE";
	private static final String DELETE_EXCEPTION_MESSAGE = "ROLE_DELETE_EXCEPTION_MESSAGE";
		
	
	public void create(Role toCreate) {
		// TODO Auto-generated method stub
		super.create(toCreate);
	}

	
	public void update(Role toUpdate) {
		// TODO Auto-generated method stub
		super.update(toUpdate);
	}

	
	public void delete(Role toDelete) {
		// TODO Auto-generated method stub
		super.delete(toDelete);
	}

	@Override
	public Role findById(String iD) {
		// TODO Auto-generated method stub
		return em.find(Role.class, iD);
	}


	
	@SuppressWarnings("unchecked")
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM Role p");
		return query.getResultList();
	}
	
	
	public List<Role> findByAttributes(HashMap<String, Object> attributes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Role> copyRoleList(List<Role> list){
		List<Role> copy = new ArrayList<Role>();
		if(list != null) copy.addAll(list); 
		return copy;
	}
	
	public List<Role> copyRolesOfUser(User user){
		List<Role> copy = new ArrayList<Role>();
		if(user != null)
			if(user.getRoles() != null) copy.addAll(user.getRoles());
		
		return copy;
	}
	
	public List<Role> removeRolesFromList(List<Role> list, List<Role> roles){
		
		if(list != null && roles != null){
			for (Role role : roles) {
				Role r;
				for (int i = 0; i < list.size(); i++) {
					r = list.get(i);
					if (r.getRoleId().equals(role.getRoleId())) {
						list.remove(r);
					}
				}
			}
		}
		
		return list;
	}
}

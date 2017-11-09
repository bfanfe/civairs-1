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
import com.ngis.civairs.model.dao.NGUserDAO;
import com.ngis.civairs.model.entities.NGRole;
import com.ngis.civairs.model.entities.NGUser;

@ManagedBean
@SessionScoped
public class NGUserService {

	private List<NGUser> users;
	private List<NGRole> roles;
	private Map<String, NGUser> usersMap;

	@EJB
	private NGUserDAO dao;
	
	@EJB
	private NGRoleDAO roleDao;

	@PostConstruct
	private void init() {
		users = dao.getList();
		loadRoles();
		usersMap = new HashMap<String, NGUser>();
		for (NGUser user : users) {
			usersMap.put(user.getLogin(), user);
		}
	}

	public NGUser getUser(String userId) {
		return usersMap.get(userId);
	}

	/**
	 * reloadUsers fills the users list from the persistence context and builds the users map
	 * */
	public List<NGUser> reloadUsers() {
		users = dao.getList();
		usersMap = new HashMap<String, NGUser>();
		for (NGUser user : users) {
			usersMap.put(user.getLogin(), user);
		}
		return users;
	}
	
	/**
	 * loadRoles fills the roles list from the persistence context
	 * */
	public void loadRoles(){
		roles = roleDao.getList();
	}
	
	/**
	 * Some users may not be asigned any role. 
	 * loadEmptyRoleUsers will return such users
	 * @return
	 */
	public List<NGUser> loadEmptyRoleUsers(){
		users = dao.getList();
		List<NGUser> emptyRolesUsers = new ArrayList<NGUser>();
		for(NGUser user: users){
			if(user.getNgRoles() == null){
				emptyRolesUsers.add(user);
			}else if(user.getNgRoles().isEmpty()){
				emptyRolesUsers.add(user);
			}
		}
		return emptyRolesUsers;
		
	}
	
	public void loadRolesFromeUsers(){
		roles = new ArrayList<NGRole>();
		// fill roles list from users
		if (users != null) {
			for (NGUser user : users) {
				List<NGRole> userRoles = user.getNgRoles();
				for (NGRole userRole : userRoles) {
					// check userRole is in roles list
					boolean isRoleinList = false;
					for (NGRole role : roles) {
						if (userRole.getRoleId().equals(role.getRoleId()))
							isRoleinList = true;
					}
					if (!isRoleinList)
						roles.add(userRole);
				}
			}
		}

		/* add users to granted roles and remove from revoked ones */
		for (NGRole role : roles) {
			for (NGUser user : users) {
				// check user is granted role
				List<NGRole> userRoles = user.getNgRoles();

				boolean isUserGrantedRole = false;
				for (NGRole userRole : userRoles) {
					// check role is in userRole
					if (userRole.getRoleId().equals(role.getRoleId())) {
						isUserGrantedRole = true;
					}
				}

				if (isUserGrantedRole) {
					// add user to role if not exists
					boolean isUserinList = false;
					for (NGUser roleUser : role.getNgUsers()) {
						if (roleUser.getLogin().equals(user.getLogin()))
							isUserinList = true;
					}
					if (!isUserinList) {
						role.getNgUsers().add(user);
					}
				}else{
					//remove user from role if exists
					NGUser removeUser = null;
					for (int r = 0; r < role.getNgUsers().size(); r++) {
						if (role.getNgUsers().get(r).getLogin().equals(user.getLogin())) {
							removeUser = role.getNgUsers().get(r);

						}
					}
					if (removeUser != null){
						role.getNgUsers().remove(removeUser);
					}
				}
			}
		}
	}

	public List<NGRole> reloadRoles() {
		return roleDao.getList();
	}

	public String updateUser(NGUser userToSave) {
		return dao.update(userToSave);
	}

	public String insertUser(NGUser userToSave) {
		return dao.insert(userToSave);
	}
	
	public String deleteUser(NGUser userToRemove){
		return dao.remove(userToRemove);
	}

	public List<NGUser> getUsers() {
		return users;
	}

	public void setUsers(List<NGUser> users) {
		this.users = users;
	}

	public Map<String, NGUser> getUsersMap() {
		return usersMap;
	}

	public void setUsersMap(Map<String, NGUser> usersMap) {
		this.usersMap = usersMap;
	}

	public List<NGRole> getRoles() {
		return roles;
	}

	public void setRoles(List<NGRole> roles) {
		this.roles = roles;
	}

	public static NGUser copy(NGUser user) {
		NGUser copy = null;
		if (user != null) {
			copy = new NGUser();
			copy.setLogin(user.getLogin());
			copy.setAdress(user.getAdress());
			copy.setBirthDate(user.getBirthDate());
			copy.setEmail(user.getEmail());
			copy.setFirstName(user.getFirstName());
			copy.setLastName(user.getLastName());
			copy.setPassword(user.getPassword());
			copy.setPhoneNumber(user.getPhoneNumber());
			copy.setNgRoles(user.getNgRoles());

		}
		return copy;

	}

	public static List<NGUser> copyList(List<NGUser> list) {
		List<NGUser> copy = null;
		if (list != null) {
			copy = new ArrayList<NGUser>();
			copy.addAll(list);
		}
		return copy;
	}

}

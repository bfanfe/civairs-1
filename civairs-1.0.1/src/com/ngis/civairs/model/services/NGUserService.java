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
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@ManagedBean
@SessionScoped
public class NGUserService {

	private List<User> users;
	private List<Role> roles;
	private Map<String, User> usersMap;

	@EJB
	private NGUserDAO dao;
	
	@EJB
	private NGRoleDAO roleDao;

	@PostConstruct
	private void init() {
		users = dao.getList();
		loadRoles();
		usersMap = new HashMap<String, User>();
		for (User user : users) {
			usersMap.put(user.getLogin(), user);
		}
	}

	public User getUser(String userId) {
		return usersMap.get(userId);
	}

	/**
	 * reloadUsers fills the users list from the persistence context and builds the users map
	 * */
	public List<User> reloadUsers() {
		users = dao.getList();
		usersMap = new HashMap<String, User>();
		for (User user : users) {
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
	public List<User> loadEmptyRoleUsers(){
		users = dao.getList();
		List<User> emptyRolesUsers = new ArrayList<User>();
		for(User user: users){
			if(user.getNgRoles() == null){
				emptyRolesUsers.add(user);
			}else if(user.getNgRoles().isEmpty()){
				emptyRolesUsers.add(user);
			}
		}
		return emptyRolesUsers;
		
	}
	
	public void loadRolesFromeUsers(){
		roles = new ArrayList<Role>();
		// fill roles list from users
		if (users != null) {
			for (User user : users) {
				List<Role> userRoles = user.getNgRoles();
				for (Role userRole : userRoles) {
					// check userRole is in roles list
					boolean isRoleinList = false;
					for (Role role : roles) {
						if (userRole.getRoleId().equals(role.getRoleId()))
							isRoleinList = true;
					}
					if (!isRoleinList)
						roles.add(userRole);
				}
			}
		}

		/* add users to granted roles and remove from revoked ones */
		for (Role role : roles) {
			for (User user : users) {
				// check user is granted role
				List<Role> userRoles = user.getNgRoles();

				boolean isUserGrantedRole = false;
				for (Role userRole : userRoles) {
					// check role is in userRole
					if (userRole.getRoleId().equals(role.getRoleId())) {
						isUserGrantedRole = true;
					}
				}

				if (isUserGrantedRole) {
					// add user to role if not exists
					boolean isUserinList = false;
					for (User roleUser : role.getNgUsers()) {
						if (roleUser.getLogin().equals(user.getLogin()))
							isUserinList = true;
					}
					if (!isUserinList) {
						role.getNgUsers().add(user);
					}
				}else{
					//remove user from role if exists
					User removeUser = null;
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

	public List<Role> reloadRoles() {
		return roleDao.getList();
	}

	public String updateUser(User userToSave) {
		return dao.update(userToSave);
	}

	public String insertUser(User userToSave) {
		return dao.insert(userToSave);
	}
	
	public String deleteUser(User userToRemove){
		return dao.remove(userToRemove);
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Map<String, User> getUsersMap() {
		return usersMap;
	}

	public void setUsersMap(Map<String, User> usersMap) {
		this.usersMap = usersMap;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public static User copy(User user) {
		User copy = null;
		if (user != null) {
			copy = new User();
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

	public static List<User> copyList(List<User> list) {
		List<User> copy = null;
		if (list != null) {
			copy = new ArrayList<User>();
			copy.addAll(list);
		}
		return copy;
	}

}

package com.ngis.core.services;

import java.util.List;

import javax.ejb.Local;

import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@Local
public interface IUser {
	
	public void createUser(User user, List<Role> roles, ResponsibleEntity responsibleEntity);
	public void updateUser(User user, List<Role> roles, ResponsibleEntity responsibleEntity);
	public List<User> findAllUser();
	public void deleteUser(String userId);

}

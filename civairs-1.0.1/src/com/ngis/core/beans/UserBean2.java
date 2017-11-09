package com.ngis.core.beans;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ngis.core.model.User;
import com.ngis.core.services.UserService;

@ManagedBean
@SessionScoped
public class UserBean2 {

	
	private User user;
	private User selectedUser;
	private List<User> userList;
	
	@EJB
	UserService userService;
	
	@PostConstruct
	private void init() {
		userList = userService.findAll();
	}
	
	
}

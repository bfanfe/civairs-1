package com.ngis.core.services;

import java.util.HashMap;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import com.ngis.core.model.User;

@Stateless
@LocalBean
public class UserService extends Service {

		
	
	public void create(User toCreate) {
		// TODO Auto-generated method stub
		super.create(toCreate);
	}

	
	public void update(User toUpdate) {
		// TODO Auto-generated method stub
		super.update(toUpdate);
	}

	
	public void delete(User toDelete) {
		// TODO Auto-generated method stub
		super.delete(toDelete);
	}

	@Override
	public User findById(String iD) {
		// TODO Auto-generated method stub
		return em.find(User.class, iD);
	}


	
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM User p");
		return query.getResultList();
	}
	
	
	public List<User> findByAttributes(HashMap<String, Object> attributes) {
		// TODO Auto-generated method stub
		return null;
	}
}

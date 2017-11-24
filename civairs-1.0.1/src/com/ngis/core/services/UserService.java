package com.ngis.core.services;

import java.util.HashMap;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.Query;

import com.ngis.core.exceptions.CRUDException;
import com.ngis.core.interceptors.DettachedEntityInterceptor;
import com.ngis.core.interceptors.PasswordInterceptor;
import com.ngis.core.interceptors.UserInterceptor;
import com.ngis.core.model.Role;
import com.ngis.core.model.User;

@Stateless
public class UserService extends Service {

	private static final String USER_CREATE_EXCEPTION_MESSAGE = "USER_CREATE_EXCEPTION_MESSAGE";
	private static final String USER_UPDATE_EXCEPTION_MESSAGE = "USER_UPDATE_EXCEPTION_MESSAGE";
	private static final String USER_DELETE_EXCEPTION_MESSAGE = "USER_DELETE_EXCEPTION_MESSAGE";

	@Interceptors(PasswordInterceptor.class)
	public void setUserPassword(User user, String password) {
		user.setPassword(password);
	}

	@Interceptors(UserInterceptor.class)
	public void create(User toCreate) throws CRUDException {
		// TODO Auto-generated method stub
		try {
			em.persist(toCreate);
			em.flush();
		} catch (CRUDException ce) {
			throw new CRUDException(USER_CREATE_EXCEPTION_MESSAGE);
		}

	}

	public void createWithRoles(User toCreate, List<Role> roles) {
		toCreate.setRoles(roles);
		try {
			em.persist(toCreate);
			em.flush();
		} catch (CRUDException ce) {
			throw new CRUDException(USER_CREATE_EXCEPTION_MESSAGE);
		}

	}

	public void update(User toUpdate) throws CRUDException {
		// TODO Auto-generated method stub

		try {
			em.merge(toUpdate);
			em.flush();
		} catch (CRUDException ce) {
			throw new CRUDException(USER_UPDATE_EXCEPTION_MESSAGE);
		}
	}

	@Interceptors(DettachedEntityInterceptor.class)
	public void delete(User toDelete) throws CRUDException {
		// TODO Auto-generated method stub
		try {
			em.remove(toDelete);
			em.flush();
		} catch (CRUDException ce) {
			throw new CRUDException(USER_DELETE_EXCEPTION_MESSAGE);
		}

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

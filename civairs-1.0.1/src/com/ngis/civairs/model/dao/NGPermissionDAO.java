package com.ngis.civairs.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.NGPermission;

@Stateless
public class NGPermissionDAO {
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;

	public String insert(NGPermission entity) {
		if (entity != null && entity.getPermissionId() != null && !entity.getPermissionId().isEmpty()) {
			if (findById(entity.getPermissionId()) == null) {
				try {
					em.persist(entity);
				} catch (Exception e) {
					return NGConstants.DB_INSERT_FAILED;
				}

				return NGConstants.DB_INSERT_OK;
			} else {
				return NGConstants.DB_INSERT_EXIST;
			}
		} else {
			return NGConstants.DB_INSERT_FAILED;
		}

	}

	public String update(NGPermission entity) {
		if (entity != null && entity.getPermissionId() != null && !entity.getPermissionId().isEmpty()) {
			try {
				em.merge(entity);
				return NGConstants.DB_UPDATE_OK;
			} catch (Exception e) {
				e.printStackTrace();
				return NGConstants.DB_UPDATE_FAILED;
			}
		} else {
			return NGConstants.DB_UPDATE_FAILED;
		}
	}

	@SuppressWarnings("unchecked")
	public List<NGPermission> getList() {
		Query query = em.createQuery("SELECT p FROM NGPermission p");
		return (List<NGPermission>) query.getResultList();
	}

	public NGPermission findById(String id) {
		try {
			return em.find(NGPermission.class, id);
		} catch (Exception e) {
			return null;
		}

	}

}

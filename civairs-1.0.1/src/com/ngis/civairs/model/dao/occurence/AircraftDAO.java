package com.ngis.civairs.model.dao.occurence;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ngis.civairs.model.constants.NGConstants;
import com.ngis.civairs.model.entities.occurence.Aircraft;

@Stateless
public class AircraftDAO {
	
	@PersistenceContext(unitName = "civairs_db_pu")
	private EntityManager em;

	public String insert(Aircraft toInsert) {
		// TODO Auto-generated method stub
		if (toInsert != null && toInsert.getId() != null && !toInsert.getId().isEmpty()) {
			if (selectById(toInsert.getId()) == null) {
				try {
					em.persist(toInsert);
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

	public String update(Aircraft toUpdate) {
		// TODO Auto-generated method stub
		if (toUpdate != null && toUpdate.getId() != null && !toUpdate.getId().isEmpty()) {

			try {
				// update role
				em.merge(toUpdate);
				return NGConstants.DB_UPDATE_OK;
			} catch (Exception e) {
				return NGConstants.DB_UPDATE_FAILED;
			}

		} else {
			return NGConstants.DB_UPDATE_FAILED;
		}
	}

	public String delete(Aircraft toDelete) {
		// TODO Auto-generated method stub
		if (toDelete != null && toDelete.getId() != null && !toDelete.getId().isEmpty()) {
			try {
				Aircraft dbEntity = selectById(toDelete.getId());
				if(dbEntity != null) {
					em.remove(dbEntity);
				}
				toDelete = null;
				return NGConstants.DB_DELETE_OK;
			} catch (Exception e) {
				e.printStackTrace();
				return NGConstants.DB_DELETE_FAILED;
			}
		} else {
			return NGConstants.DB_DELETE_FAILED;
		}
	}

	@SuppressWarnings("unchecked")

	public List<Aircraft> selectAll() {
		// TODO Auto-generated method stub Notification.findAll
		return em.createNamedQuery("Aircraft.findAll").getResultList();
	}
	
	/*
	@SuppressWarnings("unchecked")
	public List<Aircraft> selectAllByEntity(String status, String entityId) {
		// TODO Auto-generated method stub Notification.findAll
		return em.createNamedQuery("Notification.findAllByEntity").setParameter("status", status).setParameter("entityId", entityId).getResultList();
	}*/

	public Aircraft selectById(String iD) {
		// TODO Auto-generated method stub
		try {
			return em.find(Aircraft.class, iD);
		} catch (Exception e) {
			return null;
		}
	}

	public List<Aircraft> customSelect() {
		// TODO Auto-generated method stub
		return null;
	}

}

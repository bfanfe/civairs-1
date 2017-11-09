/**
 * 
 */
package com.ngis.core.services;

import java.util.List;

import com.ngis.core.model.ResponsibleEntity;

/**
 * @author boussoukd
 *
 */
public interface IResponsibleEntity {
	
	public void createResponsibleEntity(ResponsibleEntity responsibleEntity);
	public void updateResponsibleEntity(ResponsibleEntity responsibleEntity);
	public List<ResponsibleEntity> findAllResponsibleEntity();
	public void deleteResponsibleEntity(String responsibleEntityId);

}

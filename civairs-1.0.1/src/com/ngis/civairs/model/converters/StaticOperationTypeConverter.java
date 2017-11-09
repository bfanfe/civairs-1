package com.ngis.civairs.model.converters;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.entities.StaticOperationType;
import com.ngis.civairs.services.OperationTypeService;

@FacesConverter("staticOperationTypeConverter")
public class StaticOperationTypeConverter implements Converter{

	@EJB
	private OperationTypeService operationTypeServices;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if(value != null && value != "" && !value.trim().isEmpty()) {
			StaticOperationType operationType = operationTypeServices.findOperationTypeById(String.valueOf(value));
			if(operationType != null){
            	return operationType;
            }else{
            	FacesContext.getCurrentInstance().addMessage("Select operation type",new FacesMessage("Problème de conversion : "+value));
				return null;
            }
        }else{
        	return null;
        }
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticOperationType) value).getValueID());            
        }
        return str;
	}

}

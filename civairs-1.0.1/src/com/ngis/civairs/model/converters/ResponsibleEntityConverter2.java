package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.ResponsibleEntityService2;
import com.ngis.core.model.ResponsibleEntity;

@FacesConverter("responsibleEntityConverter2")
public class ResponsibleEntityConverter2 implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		ResponsibleEntity obj = null;
		if(value != null && value.trim().length() > 0) {
			ResponsibleEntityService2 service = (ResponsibleEntityService2) context.getExternalContext().getSessionMap().get("responsibleEntityService2");   		
            if(service.getResponsibleEntitiesMap() != null){
            	obj = service.getResponsibleEntitiesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
            str= String.valueOf(((ResponsibleEntity) value).getId());
        }
        return str;
	}

}

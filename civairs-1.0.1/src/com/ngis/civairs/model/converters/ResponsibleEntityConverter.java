package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.core.model.ResponsibleEntity;
import com.ngis.core.services.ResponsibleEntityService;

@FacesConverter("responsibleEntityConverter")
public class ResponsibleEntityConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		ResponsibleEntity obj = null;
		if(value != null && value.trim().length() > 0) {
			ResponsibleEntityService service = (ResponsibleEntityService) context.getExternalContext().getSessionMap().get("responsibleEntityService");   		
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

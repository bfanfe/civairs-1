package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.entities.NGRole;
import com.ngis.civairs.model.services.NGRoleService;

@FacesConverter("nGRoleConverter")
public class NGRoleConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		NGRole obj = null;
		if(value != null && value.trim().length() > 0) {
			NGRoleService service = (NGRoleService) context.getExternalContext().getSessionMap().get("nGRoleService");   		
            if(service.getRolesMap() != null){
            	obj = service.getRolesMap().get(value);
            }
        }
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
            str= String.valueOf(((NGRole) value).getRoleId());
        }
        return str;
	}

}

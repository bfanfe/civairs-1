package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.core.model.Role;
import com.ngis.core.services.RoleService;

@FacesConverter("nGRoleConverter")
public class NGRoleConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Role obj = null;
		if(value != null && value.trim().length() > 0) {
			RoleService service = (RoleService) context.getExternalContext().getSessionMap().get("nGRoleService");   		
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
            str= String.valueOf(((Role) value).getRoleId());
        }
        return str;
	}

}

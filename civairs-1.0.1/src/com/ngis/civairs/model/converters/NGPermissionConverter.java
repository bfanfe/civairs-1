package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.entities.NGPermission;
import com.ngis.civairs.model.services.NGPermissionService;

@FacesConverter("nGPermissionConverter")
public class NGPermissionConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		NGPermission obj = null;
		if(value != null && value.trim().length() > 0) {
			NGPermissionService service = (NGPermissionService) context.getExternalContext().getSessionMap().get("nGPermissionService");   		
            if(service.getPermissionsMap() != null){
            	obj = service.getPermissionsMap().get(value);
            }
        }
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
            str= String.valueOf(((NGPermission) value).getPermissionId());
        }
        return str;
	}

}

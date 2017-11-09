package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.NotificationService;
import com.ngis.core.model.occurence.StaticAirspaceClass;

@FacesConverter("staticAirspaceClassConverter")
public class StaticAirspaceClassConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticAirspaceClass obj = null;
		if(value != null && value.trim().length() > 0) {
			NotificationService service = (NotificationService) context.getExternalContext().getSessionMap().get("notificationService");   		
            if(service.getStaticAirspaceClassesMap()!= null){
            	obj = service.getStaticAirspaceClassesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticAirspaceClass) value).getValueID());            
        }
        return str;
	}

}

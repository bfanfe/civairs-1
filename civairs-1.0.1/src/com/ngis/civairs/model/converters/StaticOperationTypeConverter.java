package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.entities.occurence.StaticOperationType;
import com.ngis.civairs.model.services.occurence.AircraftService;

@FacesConverter("staticOperationTypeConverter")
public class StaticOperationTypeConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticOperationType obj = null;
		if(value != null && value.trim().length() > 0) {
			AircraftService service = (AircraftService) context.getExternalContext().getSessionMap().get("aircraftService");   		
            if(service.getStaticOperationTypesMap()!= null){
            	obj = service.getStaticOperationTypesMap().get(value);
            }
        }
		
		return obj;
		
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

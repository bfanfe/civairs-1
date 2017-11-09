package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.entities.StaticFlightPhase;
import com.ngis.civairs.model.services.occurence.AircraftService;

@FacesConverter("staticFlightPhaseConverter")
public class StaticFlightPhaseConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticFlightPhase obj = null;
		if(value != null && value.trim().length() > 0 && value != "") {
			AircraftService service = (AircraftService) context.getExternalContext().getSessionMap().get("aircraftService");   		
            if(service.getStaticFlightPhasesMap()!= null){
            	obj = service.getStaticFlightPhasesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticFlightPhase) value).getValueID());            
        }
        return str;
	}

}

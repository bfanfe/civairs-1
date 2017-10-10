package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.entities.occurence.StaticOccurrenceStatus;
import com.ngis.civairs.model.services.occurence.AnalyseService;

@FacesConverter("staticOccurrenceStatusConverter")
public class StaticOccurrenceStatusConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticOccurrenceStatus obj = null;
		if(value != null && value.trim().length() > 0) {
			AnalyseService service = (AnalyseService) context.getExternalContext().getSessionMap().get("analyseService");   		
            if(service.getStaticOccurrenceStatusMap()!= null){
            	obj = service.getStaticOccurrenceStatusMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticOccurrenceStatus) value).getValueID());            
        }
        return str;
	}

}

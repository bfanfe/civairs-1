package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.core.model.occurence.StaticEventFrequency;

@FacesConverter("staticEventFrequencyConverter")
public class StaticEventFrequencyConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticEventFrequency obj = null;
		if(value != null && value.trim().length() > 0) {
			AnalyseService service = (AnalyseService) context.getExternalContext().getSessionMap().get("analyseService");   		
            if(service.getStaticEventFrequenciesMap()!= null){
            	obj = service.getStaticEventFrequenciesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticEventFrequency) value).getValueID());            
        }
        return str;
	}

}

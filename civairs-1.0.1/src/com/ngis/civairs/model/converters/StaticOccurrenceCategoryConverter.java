package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.core.model.occurence.StaticOccurrenceCategory;

@FacesConverter("staticOccurrenceCategoryConverter")
public class StaticOccurrenceCategoryConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticOccurrenceCategory obj = null;
		if(value != null && value.trim().length() > 0) {
			AnalyseService service = (AnalyseService) context.getExternalContext().getSessionMap().get("analyseService");   		
            if(service.getStaticOccurrenceCategoriesMap()!= null){
            	obj = service.getStaticOccurrenceCategoriesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticOccurrenceCategory) value).getValueID());            
        }
        return str;
	}

}

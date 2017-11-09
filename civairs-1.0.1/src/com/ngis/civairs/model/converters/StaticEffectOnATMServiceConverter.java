package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.core.model.occurence.StaticEffectOnATMService;

@FacesConverter("staticEffectOnATMServiceConverter")
public class StaticEffectOnATMServiceConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticEffectOnATMService obj = null;
		if(value != null && value.trim().length() > 0) {
			AnalyseService service = (AnalyseService) context.getExternalContext().getSessionMap().get("analyseService");   		
            if(service.getStaticEffectOnATMServicesMap()!= null){
            	obj = service.getStaticEffectOnATMServicesMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticEffectOnATMService) value).getValueID());            
        }
        return str;
	}

}

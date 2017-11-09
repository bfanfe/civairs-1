package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.model.services.occurence.AnalyseService;
import com.ngis.core.model.occurence.StaticATMContribution;

@FacesConverter("staticATMContributionConverter")
public class StaticATMContributionConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticATMContribution obj = null;
		if(value != null && value.trim().length() > 0) {
			AnalyseService service = (AnalyseService) context.getExternalContext().getSessionMap().get("analyseService");   		
            if(service.getStaticATMContributionsMap()!= null){
            	obj = service.getStaticATMContributionsMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticATMContribution) value).getValueID());            
        }
        return str;
	}

}

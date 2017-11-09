package com.ngis.civairs.model.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ngis.civairs.entities.StaticManufacturerModel;
import com.ngis.civairs.model.services.occurence.AircraftService;

@FacesConverter("staticManufacturerModelConverter")
public class StaticManufacturerModelConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StaticManufacturerModel obj = null;
		if(value != null && value.trim().length() > 0) {
			AircraftService service = (AircraftService) context.getExternalContext().getSessionMap().get("aircraftService");   		
            if(service.getStaticManufacturerModelsMap()!= null){
            	obj = service.getStaticManufacturerModelsMap().get(value);
            }
        }
		
		return obj;
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String str = null;
		if(value != null) {
			str= String.valueOf(((StaticManufacturerModel) value).getValueID());
			/*
			try{
				str= String.valueOf(((StaticManufacturerModel) value).getValueID());
			}catch(Exception e){
				if(str == null) {
					StaticManufacturerModel obj = null;
					if(value != null && value.toString().trim().length() > 0) {
						AircraftService service = (AircraftService) context.getExternalContext().getSessionMap().get("aircraftService");   		
			            if(service.getStaticManufacturerModelsMap()!= null){
			            	obj = service.getStaticManufacturerModelsMap().get(value);
			            }
			        }
					if(obj != null) str = obj.getValueID();
				}
			}*/
            
        }
        return str;
	}

}

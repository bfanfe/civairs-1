package com.ngis.core.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

@FacesConverter("pickListConverter")
public class PickListConverter implements Converter{
	
	@Override
	  public Object getAsObject(FacesContext fc, UIComponent comp, String value) {
	      @SuppressWarnings("unchecked")
		DualListModel<Object> model = (DualListModel<Object>) ((PickList) comp).getValue();
	      for (Object obj : model.getSource()) {
	          if (obj.toString().equals(value)) {
	              return obj;
	          }
	      }
	      for (Object obj : model.getTarget()) {
	    	  if (obj.toString().equals(value)) {
	              return obj;
	          }
	      }
	      return null;
	  }

	  @Override
	  public String getAsString(FacesContext fc, UIComponent comp, Object value) {
		  if (value == null) {
				return null;
			}

			return value.toString();
	  }

}

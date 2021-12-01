package br.edu.ifpe.loja.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("br.edu.ifpe.loja.converter.UrlConverter")
public class UrlConverter implements Converter<Object> {
	   
	@Override
	   public Object getAsObject(FacesContext facesContext, 
	      UIComponent component, String value) {
		if(!ehURLvalida(value)) {
//			FacesMessage msg =
//		            new FacesMessage("Formato de URL inválido.");
//		         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//		         throw new ConverterException(msg);
			return new DadosURL("http://"+value.toString()+".com");
		}

		FacesMessage msg =
        new FacesMessage("Formato de URL inválido.");
     msg.setSeverity(FacesMessage.SEVERITY_ERROR);
     throw new ConverterException(msg);
	   }

	   @Override
	   public String getAsString(FacesContext facesContext,
	      UIComponent component, Object value) {
	         return value.toString();
	   }
	   
	   private boolean ehURLvalida(String url) {
			return url.startsWith("http://", 0) && url.contains(".com");
		}
	}

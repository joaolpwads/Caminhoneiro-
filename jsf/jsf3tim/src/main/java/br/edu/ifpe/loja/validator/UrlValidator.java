package br.edu.ifpe.loja.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("br.edu.ifpe.loja.validator.UrlValidator")
public class UrlValidator implements Validator<Object> {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		System.out.println("URL "+value.toString());
		String url = value.toString();
		 
		if(!ehURLValida(url)) {
			FacesMessage mensagem = new FacesMessage("Formato da URL inválido!");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(mensagem);
		}
		
		
	}

	private boolean ehURLValida(String url) {
		return url.startsWith("http://",0) && url.contains(".com");
	}

}

package br.edu.ifpe.loja.eventlistener;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import br.edu.ifpe.loja.controller.HomeController;

public class AutomovelEventListener implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
			
			FacesContext context = FacesContext.getCurrentInstance();
			HomeController controller = context.getApplication().evaluateExpressionGet(context, "#{homeController}", HomeController.class);
			controller.setMarcaSelecionada(event.getNewValue().toString());
	}

}

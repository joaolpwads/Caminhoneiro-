package br.edu.ifpe.loja.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.ifpe.loja.converter.DadosURL;
import br.edu.ifpe.loja.entity.RedeSocial;

@Named
@RequestScoped
public class RedeSocialController {
	
		private RedeSocial redeSocial = new RedeSocial("Instagram");
		
		private DadosURL dadosURL = new DadosURL();
		
		public RedeSocial getRedeSocial() {
			return redeSocial;
		}
		
		public DadosURL getDadosURL() {
			return dadosURL;
		}
		
		public void setDadosURL(DadosURL dadosURL) {
			this.dadosURL = dadosURL;
		}
		
		
}

package br.edu.ifpe.loja.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import br.edu.ifpe.loja.entity.Automovel;


@Named
@RequestScoped
public class HomeController implements Serializable{

	private Automovel automovel = new Automovel();
	private String[] fabricantes = {"VW","GM","Volvo"};
	private String marcaSelecionada;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String showHello() {
		return "hello from managed bean.";
	}
	
	public void salvar() {
		System.out.print("Salvando automóvel: ");
		System.out.print(automovel);
	}
	
	public Automovel getAutomovel() {
		return this.automovel;
	}
	
	public String[] getFabricantes() {
		return fabricantes;
	}
	
	public void fabricanteChanged(ValueChangeEvent e) {
		marcaSelecionada = e.getNewValue().toString();
		automovel.setMarca(marcaSelecionada);
		
	}
	
	
	public String getMarcaSelecionada() {
		return marcaSelecionada;
	}
	
	public void setMarcaSelecionada(String marcaSelecionada) {
		this.marcaSelecionada = marcaSelecionada;
	}
	
}

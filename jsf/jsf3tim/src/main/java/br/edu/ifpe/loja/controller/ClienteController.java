package br.edu.ifpe.loja.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.ifpe.loja.entity.Cliente;

@Named
@RequestScoped
public class ClienteController {

	private Cliente cliente = new Cliente("Maria");
	
	public Cliente getCliente() {
		return cliente;
	}
	
}

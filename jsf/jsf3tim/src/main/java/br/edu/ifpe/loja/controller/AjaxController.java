package br.edu.ifpe.loja.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AjaxController {
	
	private String turma;
	
	public String getTurma() {
		return turma;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public String getSaudacao() {
		return "Olá, "+turma+"!";
	}
}

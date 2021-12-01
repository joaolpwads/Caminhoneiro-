package br.edu.ifpe.loja.entity;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private Date dataNascimento;
	
	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;}
	
	public String getNome() {
		return nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

package br.edu.ifpe.loja.entity;

public class RedeSocial {

	private String nome;
	private String url;

	public RedeSocial() {
	}

	public RedeSocial(String nome) {
		this.nome = nome;

	}
	
	public String getNome() {
		return nome;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}

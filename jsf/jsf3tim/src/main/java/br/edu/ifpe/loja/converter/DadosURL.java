package br.edu.ifpe.loja.converter;

public class DadosURL {
	private String url;
	   
	   public DadosURL(String url) {
	      this.url = url;
	   }
	   
	   public DadosURL() {
	}
	   
	   public String getUrl() {
	      return url;
	   }

	   public void setUrl(String url) {
	      this.url = url;
	   }
	   
	   public String toString() {
	      return url;
	   }
	   
	}
package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Topico {

	private String titulo;
	private String mensagem;
	private String nomeAutor;
	private String dataCriacao;
	
	public Topico() {
	
	}
	
	public Topico(String titulo, String mensagem, String nomeAutor,
			String dataCriacao) {
		super();
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.nomeAutor = nomeAutor;
		this.dataCriacao = dataCriacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}

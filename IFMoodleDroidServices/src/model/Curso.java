package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Curso {

	private long id;
	private String nome;
	
	public Curso(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Postagem {
	
	private Integer id;
	private Integer idDiscussao;
	private Integer idForum;
	private Integer idCurso;
	private String titulo;
	private String autor;
	private String mensagem;
	private String dataPostagem;
	
	
	public Postagem() {

	}



	public Postagem(Integer id, Integer idDiscussao, Integer idForum,
			Integer idCurso, String titulo, String autor, String mensagem, long ultimaModificacao) {
		super();
		this.id = id;
		this.idDiscussao = idDiscussao;
		this.idForum = idForum;
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.autor = autor;
		this.mensagem = mensagem;
		
		Date data = new Date(ultimaModificacao);
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		dataPostagem = spf.format(data).toString(); 
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getIdDiscussao() {
		return idDiscussao;
	}


	public void setIdDiscussao(Integer idDiscussao) {
		this.idDiscussao = idDiscussao;
	}


	public Integer getIdForum() {
		return idForum;
	}


	public void setIdForum(Integer idForum) {
		this.idForum = idForum;
	}


	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String data) {
		this.dataPostagem = data;
	}
	
}

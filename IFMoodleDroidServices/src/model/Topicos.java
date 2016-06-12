package model;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement

public class Topicos {
	

	private int idTopico;
	private int idCurso;
	private int idForum;
	private String nomeTopico;
	
	
	public Topicos(int idTopico, int idCurso, int idForum, String nomeTopico){
		this.idTopico= idTopico;
		this.idCurso = idCurso;
		this.idForum = idForum;
		this.nomeTopico = nomeTopico;
	}
	
	public Topicos(){
		
	}
	
	public int getIdTopico() {
		return idTopico;
	}

	public void setIdTopico(int idTopico) {
		this.idTopico = idTopico;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdForum() {
		return idForum;
	}

	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}

	public String getNomeTopico() {
		return nomeTopico;
	}

	public void setNomeTopico(String nomeTopico) {
		this.nomeTopico = nomeTopico;
	}
	
}

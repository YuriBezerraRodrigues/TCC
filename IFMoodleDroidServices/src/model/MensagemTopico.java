package model;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class MensagemTopico {
	

	private int idMensagem ;
	private int idTopico;
	private int idDeQuemPostou;
	private String mensagem;
	
	

	public MensagemTopico(){
		
	}
	
	public int getIdMensagem() {
		return idMensagem;
	}



	public void setIdMensagem(int idMensagem) {
		this.idMensagem = idMensagem;
	}



	public int getIdTopico() {
		return idTopico;
	}



	public void setIdTopico(int idTopico) {
		this.idTopico = idTopico;
	}



	public int getIdDeQuemPostou() {
		return idDeQuemPostou;
	}



	public void setIdDeQuemPostou(int idDeQuemPostou) {
		this.idDeQuemPostou = idDeQuemPostou;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}

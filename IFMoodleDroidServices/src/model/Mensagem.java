package model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Mensagem {
	private long Iddestinatario;//quem recebe
	private long Idremetente; //quem envia
	private String mensagem;
	private String hora;
	private String data;
	
	public Mensagem(){}
	
	public Mensagem(long Iddestinatario, long Idremetente, String mensagem){
		this.Iddestinatario=Iddestinatario;
		this.Idremetente =Idremetente;
		this.mensagem = mensagem;
		
		
	}
	
	public long getIdestinatario() {
		return Iddestinatario;
	}
	public void setIdestinatario(long idestinatario) {
		Iddestinatario = idestinatario;
	}
	public long getIdremetente() {
		return Idremetente;
	}
	public void setIdremetente(long idremetente) {
		Idremetente = idremetente;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}

package model;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Uma mensagem no moodle e composta por
 * id, que e o id da mensagem
 * userIdFrom, quem esta enviando a mensagem
 * userIdTo, quem esta recebendo a mensagem
 * fullmessage e smallmessage, mesmos dados repetidos em banco, aqui vai ser substituido por message
 * */
@XmlRootElement
public class Mensagem {
	private long id;
	private long userIdFrom;
	private long userIdTo;
	private String message;
	
	public Mensagem() {
	}

	public Mensagem(long userIdFrom, long userIdTo, String message) {
		this.userIdFrom = userIdFrom;
		this.userIdTo = userIdTo;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserIdFrom() {
		return userIdFrom;
	}

	public void setUserIdFrom(long userIdFrom) {
		this.userIdFrom = userIdFrom;
	}

	public long getUserIdTo() {
		return userIdTo;
	}

	public void setUserIdTo(long userIdTo) {
		this.userIdTo = userIdTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}

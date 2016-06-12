package controller;

import java.util.ArrayList;



import model.Mensagem;
import dao.MensagemDAOFactory;

public class ControladorMensagens {
	
	public ControladorMensagens(){
		
	}
	
	public ArrayList<Mensagem> mensagensEnviadasNaoLidas(Long idUsuario) throws Exception {
		return MensagemDAOFactory.getInstance().getDAO().mensagensEnviadasNaoLidas(idUsuario);
	}
	
	public ArrayList<Mensagem> mensagensEnviadasLidas(Long idUsuario) throws Exception {
		return MensagemDAOFactory.getInstance().getDAO().mensagensEnviadasLidas(idUsuario);
	}
	
	public Mensagem enviarMensagem(Long idUsuario,String contatoId, String mensagem) throws Exception {
		return MensagemDAOFactory.getInstance().getDAO().enviarMensagem(idUsuario,contatoId, mensagem);
	}
	
	

}

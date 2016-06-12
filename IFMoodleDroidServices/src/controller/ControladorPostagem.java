package controller;

import java.util.ArrayList;

import model.Postagem;
import dao.PostagemDAOFactory;

public class ControladorPostagem {

	public ControladorPostagem() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Postagem> retornaUltimasNoticias() throws Exception{
		return PostagemDAOFactory.getInstance().getDAO()
		.retornaUltimasNoticias();
	}
	
}

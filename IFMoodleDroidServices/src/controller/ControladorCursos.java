package controller;

import java.util.ArrayList;

import model.Curso;
import model.Link;
import model.Semanas;
import dao.CursoDAOFactory;

public class ControladorCursos {

	public ControladorCursos() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Curso> retornaRelacaoCursos(long idUsuario) throws Exception{
		return CursoDAOFactory.getInstance().getDao()
		.retornaRelacaoCursos(idUsuario);
	}

	public ArrayList<Semanas> retornaRelacaoSemanas(long idCurso) throws Exception {
		return CursoDAOFactory.getInstance().getDao()
				.retornaRelacaoSemanas(idCurso);
	}

	public ArrayList<Link> retornaRelacaoLinksSemana(long idSection) throws Exception {
		return CursoDAOFactory.getInstance().getDao()
				.retornaRelacaoLinksSemana(idSection);
	}
	
}

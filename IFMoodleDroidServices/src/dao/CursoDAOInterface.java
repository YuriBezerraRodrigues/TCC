package dao;

import java.util.ArrayList;

import model.Curso;

public interface CursoDAOInterface {
	
	public ArrayList<Curso> retornaRelacaoCursos(long idUsuario) throws Exception;

}

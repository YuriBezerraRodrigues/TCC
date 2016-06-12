package dao;

public class CursoDAOFactory {

	public static CursoDAOFactory cursoDAOFactory;
	private CursoDAO cursoDAO;
	
	public static CursoDAOFactory getInstance(){
		if(cursoDAOFactory == null){
			cursoDAOFactory = new CursoDAOFactory();
		}
		return cursoDAOFactory;
	}
	
	public CursoDAO getDao(){
		if(cursoDAO == null){
			cursoDAO = new CursoDAO();
		}
		return cursoDAO;
	}
	
}

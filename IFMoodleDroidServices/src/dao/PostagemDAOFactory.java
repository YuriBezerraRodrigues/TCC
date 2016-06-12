package dao;

/**
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */
public class PostagemDAOFactory {

	public static PostagemDAOFactory postagemDAOFactory;
	private PostagemDAO postagemDAO;

	public static PostagemDAOFactory getInstance() {
		if (postagemDAOFactory == null) {
			postagemDAOFactory = new PostagemDAOFactory();
		}
		return postagemDAOFactory;
	}

	public PostagemDAO getDAO() {
		if (postagemDAO == null) {
			postagemDAO = new PostagemDAO();
		}
		return postagemDAO;
	}
}

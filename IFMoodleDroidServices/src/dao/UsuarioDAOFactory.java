package dao;

/**
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */
public class UsuarioDAOFactory {

	public static UsuarioDAOFactory usuarioDAOFactory;
	private UsuarioDAO usuarioDAO;

	public static UsuarioDAOFactory getInstance() {
		if (usuarioDAOFactory == null) {
			usuarioDAOFactory = new UsuarioDAOFactory();
		}
		return usuarioDAOFactory;
	}

	public UsuarioDAO getDAO() {
		if (usuarioDAO == null) {
			usuarioDAO = new UsuarioDAO();
		}
		return usuarioDAO;
	}
}

package dao;

//johnatan
public class MensagemDAOFactory {
	
	public static MensagemDAOFactory mensagemDAOFactory;
	private MensagemDAO mensagemDAO;

	public static MensagemDAOFactory getInstance() {
		if (mensagemDAOFactory == null) {
			mensagemDAOFactory = new MensagemDAOFactory();
		}
		return mensagemDAOFactory;
	}

	public MensagemDAO getDAO() {
		if (mensagemDAO == null) {
			mensagemDAO = new MensagemDAO();
		}
		return mensagemDAO;
	}

}

package controller;

import java.util.ArrayList;

import model.Forum;
import model.MensagemTopico;
import model.Topicos;
import dao.ForumDAOFactory;

public class ControladorForum {

	public ControladorForum() {

	}

	public ArrayList<Forum> retornaForumsCurso(long id) throws Exception {
		return ForumDAOFactory.getInstance().getDAO().retornaForumsCurso(id);
	}

	public ArrayList<Topicos> retornaTopicosForum(Long idForum)
			throws Exception {
		return ForumDAOFactory.getInstance().getDAO()
				.retornaTopicosForum(idForum);
	}

	public ArrayList<MensagemTopico> retornaMensagensTopico(Long idTopico)
			throws Exception {
		return ForumDAOFactory.getInstance().getDAO()
				.retornaMensagensTopico(idTopico);
	}

	public ArrayList<Forum> retornaForunsSemanas(long semanaId)
			throws Exception {
		return ForumDAOFactory.getInstance().getDAO()
				.retornaForunsSemanas(semanaId);
	}
}

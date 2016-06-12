package controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import recursos.ListenerResourcePost;
import util.Encrypter;
import util.EncryptorException;
import dao.UsuarioDAOFactory;
import model.Usuario;

public class ControladorUsuario {

	private static final String FLAG_DECRIPT_ON = "1";

	public ControladorUsuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario retornaUsuario(String login, String senha,
			String flagEncriptacao) throws Exception {
		
		Usuario usuarioTemp = new Usuario();
		usuarioTemp.setLogin(login);

		if (flagEncriptacao.equals(FLAG_DECRIPT_ON)) {

			try {
				usuarioTemp.setSenha(Encrypter
						.decriptar(Encrypter.CHAVE, senha));
			} catch (EncryptorException ex) {
				Logger.getLogger(ListenerResourcePost.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		} else {
			usuarioTemp.setSenha(senha);
		}
		Usuario usuario = UsuarioDAOFactory.getInstance().getDAO()
				.verifyUsuario(usuarioTemp);

		try {
			if(usuario != null){
				if(!flagEncriptacao.equals(FLAG_DECRIPT_ON)){
					usuario.setSenha(Encrypter.encriptar(Encrypter.CHAVE, senha));
				}else{
					usuario.setSenha(senha);
				}
			}
		} catch (EncryptorException ex) {
			Logger.getLogger(ListenerResourcePost.class.getName()).log(
					Level.SEVERE, null, ex);
		}
		
		return usuario;
	}
//johnatan
	public ArrayList<Usuario> consultaUsuariosNome(String nome) throws Exception {
		return UsuarioDAOFactory.getInstance().getDAO().procurarUmaPessoa(nome);
	}

	public ArrayList<Usuario> meusContatos(Long id)throws Exception {
		
			return UsuarioDAOFactory.getInstance().getDAO().meusContatos(id);

	}

	public Usuario excluirContato(long id, String contatoId)throws Exception {
		// TODO Auto-generated method stub
		return UsuarioDAOFactory.getInstance().getDAO().excluirContato(id,contatoId);
	}

	public Usuario bloquearOUDesbloquearContato(long id, String contatoId, String flagBloqueio)throws Exception {
		// TODO Auto-generated method stub
		return UsuarioDAOFactory.getInstance().getDAO().bloquearOUDesbloquearContato(id,contatoId, flagBloqueio);
	}

	public Usuario acrescentarUmContato(long id, String contatoId) throws Exception {
		// TODO Auto-generated method stub
		return UsuarioDAOFactory.getInstance().getDAO().acrescentarUmContato(id,contatoId);
	}
	
	public Usuario desbloquearContato(long id, String contatoId, String flagBloqueio)throws Exception {
		// TODO Auto-generated method stub
		return UsuarioDAOFactory.getInstance().getDAO().desbloquearContato(id,contatoId, flagBloqueio);
	}





}

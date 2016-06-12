package fachada;

import java.util.ArrayList;

import model.Curso;
import model.Forum;
import model.Link;
import model.Mensagem;
import model.MensagemTopico;
import model.Postagem;
import model.Semanas;
import model.Topicos;
import model.Usuario;
import controller.ControladorCursos;
import controller.ControladorForum;
import controller.ControladorPostagem;
import controller.ControladorUsuario;
import controller.ControladorMensagens;

public class Fachada {

	private static Fachada fachada;
	private ControladorUsuario controladorUsuario;
	private ControladorPostagem controladorPostagem;
	private ControladorCursos controladorCursos;
	private ControladorMensagens controladorMensagens;
	private ControladorForum controladorForum;
	public Fachada() {
		controladorUsuario = new ControladorUsuario();
		controladorPostagem = new ControladorPostagem();
		controladorCursos = new ControladorCursos();
		controladorMensagens = new ControladorMensagens();
		controladorForum = new ControladorForum ();
	}
	
	
	public static Fachada getInstance(){
		
		if(fachada == null){
			fachada = new Fachada();
		}
		return fachada;
	}
	
	public Usuario retornaUsuario(String login, String senha,
			String flagEncriptacao) {
		Usuario usuario = null;
		
		try {
			usuario = controladorUsuario.retornaUsuario(login, senha, flagEncriptacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return usuario;
	}
	
	public ArrayList<Postagem> retornaUltimasNoticias(String login, String senha,
			String flagEncriptacao){
		
		ArrayList<Postagem> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorPostagem.retornaUltimasNoticias();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}


	public ArrayList<Curso> verificarCursos(String login, String senha,
			String flagEncriptacao) {
	
		ArrayList<Curso> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorCursos.retornaRelacaoCursos(usuarioLogado.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}
	//johnatan

	public ArrayList<Usuario> consultaUsuariosNome(String login, String senha,
			String flagEncriptacao, String nome) {
		ArrayList<Usuario> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorUsuario.consultaUsuariosNome(nome);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}


	public ArrayList<Usuario> meusContatos(String login, String senha,
			String flagEncriptacao) {
		
		ArrayList<Usuario> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorUsuario.meusContatos(usuarioLogado.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}


	public Usuario excluirContato(String login, String senha,
			String flagEncriptacao, String contatoId) {

		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		Usuario retorno=null;
		if(usuarioLogado!= null){
			try {
				return retorno = controladorUsuario.excluirContato(usuarioLogado.getId(), contatoId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
		
		
	}


	public Usuario bloquearOUDesbloquearContato(String login, String senha,
			String flagEncriptacao, String contatoId, String flagBloqueio) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		Usuario retorno=null;
		if(usuarioLogado!= null){
			try {
				return retorno = controladorUsuario.bloquearOUDesbloquearContato(usuarioLogado.getId(), contatoId, flagBloqueio);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}


	public  ArrayList<Mensagem> mensagensEnviadasNaoLidas(String login, String senha,
			String flagEncriptacao) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<Mensagem> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorMensagens.mensagensEnviadasNaoLidas(usuarioLogado.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	public  ArrayList<Mensagem> mensagensEnviadasLidas(String login, String senha,
			String flagEncriptacao) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<Mensagem> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorMensagens.mensagensEnviadasLidas(usuarioLogado.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	
	public  Mensagem enviarMensagem(String login, String senha,
			String flagEncriptacao, String contatoId, String mensagem) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		Mensagem retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorMensagens.enviarMensagem(usuarioLogado.getId(), contatoId, mensagem);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	

	public  ArrayList<Forum> retornaForumsCurso(String login, String senha,
			String flagEncriptacao, String id) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<Forum> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorForum.retornaForumsCurso(Long.parseLong(id));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	
	public  ArrayList<Topicos> retornaTopicosForum(String login, String senha,
			String flagEncriptacao, String forumId) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<Topicos> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorForum.retornaTopicosForum(Long.parseLong(forumId));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	
	
	public  ArrayList<MensagemTopico> retornaMensagensTopico(String login, String senha,
			String flagEncriptacao, String topicoId) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<MensagemTopico> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorForum.retornaMensagensTopico(Long.parseLong(topicoId));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}
	

	public Usuario acrescentarUmContato(String login, String senha,
			String flagEncriptacao, String contatoId) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		Usuario retorno=null;
		if(usuarioLogado!= null){
			try {
				return retorno = controladorUsuario.acrescentarUmContato(usuarioLogado.getId(), contatoId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

	public Usuario desbloquearContato(String login, String senha,
			String flagEncriptacao, String contatoId, String flagBloqueio) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		Usuario retorno=null;
		if(usuarioLogado!= null){
			try {
				return retorno = controladorUsuario.desbloquearContato(usuarioLogado.getId(), contatoId, flagBloqueio);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}


	public ArrayList<Semanas> verificarSemanas(String login, String senha,
			String flagEncriptacao, String idCurso) {
		ArrayList<Semanas> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorCursos.retornaRelacaoSemanas(Long.parseLong(idCurso));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}


	public ArrayList<Link> verificarLinksSemana(String login, String senha,
			String flagEncriptacao, String idSection) {
		ArrayList<Link> retorno = null;
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		
		if(usuarioLogado!= null){
			try {
				retorno = controladorCursos.retornaRelacaoLinksSemana(Long.parseLong(idSection));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}


	public ArrayList<Forum> retornaForunsSemanas(String login, String senha,
			String flagEncriptacao, String semanaId) {
		Usuario usuarioLogado = retornaUsuario(login, senha, flagEncriptacao);
		ArrayList<Forum> retorno=null;
		if(usuarioLogado!= null){
			try {
				retorno = controladorForum.retornaForunsSemanas(Long.parseLong(semanaId));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retorno;
	}

}

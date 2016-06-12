package recursos;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import model.Curso;
import model.Link;
import model.Mensagem;
import model.MensagemTopico;
import model.Postagem;
import model.Semanas;
import model.Topicos;
import model.Usuario;
import model.Forum;
import fachada.Fachada;

@Path("/listener")
public class ListenerResourcePost {

	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Usuario fazLogin(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaUsuario(login, senha,
				flagEncriptacao);

	}

	@Path("/retornaNoticias")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Postagem> retornaNoticias(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaUltimasNoticias(login, senha,
				flagEncriptacao);

	}

	// retorna forums pelo curso
	@Path("/retornaForumsCurso")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Forum> retornaForumsCurso(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("cursoId") String id,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaForumsCurso(login, senha,
				flagEncriptacao, id);

	}

	// retorna topicos pelo forum
	@Path("/retornaTopicosForum")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Topicos> retornaTopicosForum(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("forumId") String forumId,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaTopicosForum(login, senha,
				flagEncriptacao, forumId);

	}

	// retorna ensagens pelo topico
	@Path("/retornaMensagensTopico")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<MensagemTopico> retornaMensagensTopico(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("topicoId") String topicoId,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaMensagensTopico(login, senha,
				flagEncriptacao, topicoId);

	}

	@Path("/verificarCursos")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Curso> verificarCursos(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().verificarCursos(login, senha,
				flagEncriptacao);

	}

	// algumas funcionalidades (johnatan)
	// consultausuariosnome realiza a busca por nome de usuario e retorna um
	// array de usuarios
	@Path("/consultaUsuariosNome")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Usuario> consultaUsuariosNome(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("nome") String nome,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().consultaUsuariosNome(login, senha,
				flagEncriptacao, nome);

	}

	// meuscontatos, retorna um array de contatos do usuario

	@Path("/meusContatos")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Usuario> meusContatos(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance()
				.meusContatos(login, senha, flagEncriptacao);

	}

	@Path("/mensagensEnviadasNaoLidas")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Mensagem> mensagensEnviadasNaoLidas(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().mensagensEnviadasNaoLidas(login, senha,
				flagEncriptacao);

	}

	@Path("/mensagensEnviadasLidas")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Mensagem> mensagensEnviadasLidas(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().mensagensEnviadasLidas(login, senha,
				flagEncriptacao);

	}

	// enviar mensagem para contato
	@Path("/enviarMensagem")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Mensagem enviarMensagem(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("contatoId") String contatoId,
			@FormParam("mensagem") String mensagem,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().enviarMensagem(login, senha,
				flagEncriptacao, contatoId, mensagem);

	}

	// acrescenta contato, requer id do usuario que queremos adicionar como
	// contato
	@Path("/acrescentarUmContato")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Usuario acrescentarUmContato(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("contatoId") String contatoId,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().acrescentarUmContato(login, senha,
				flagEncriptacao, contatoId);

	}

	// exclui contato, requer id do usuario que queremos excluir
	@Path("/excluirContato")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Usuario excluirContato(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("contatoId") String contatoId,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().excluirContato(login, senha,
				flagEncriptacao, contatoId);

	}

	// bloquear ou desbloquear, requer o id do usuario que queremos bloquear ou
	// desbloquear e a flag
	// de bloqueio ou desbloqueio, retornei um usuario so pra ver se estava
	// funcionando, depois altero
	// para um retorno mais adequado.

	@Path("/bloquearOUDesbloquearContato")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Usuario bloquearOUDesbloquearContato(
			@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("contatoId") String contatoId,
			@FormParam("flagBloqueioOuDesbloqueio") String flagBloqueioOuDesbloqueio,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().bloquearOUDesbloquearContato(login, senha,
				flagEncriptacao, contatoId, flagBloqueioOuDesbloqueio);

	}

	@Path("/desbloquearContato")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Usuario desbloquearContato(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("contatoId") String contatoId,
			@FormParam("flagDesbloqueio") String flagDesbloqueio,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().desbloquearContato(login, senha,
				flagEncriptacao, contatoId, flagDesbloqueio);

	}

	@Path("/verificarSemanas")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Semanas> verificarSemanas(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("idCurso") String idCurso,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().verificarSemanas(login, senha,
				flagEncriptacao, idCurso);

	}

	@Path("/verificarLinksSemana")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Link> verificarLinksSemana(@FormParam("login") String login,
			@FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("idSection") String idSection,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().verificarLinksSemana(login, senha,
				flagEncriptacao, idSection);

	}
	
	// retorna foruns por semanas
	@Path("/retornaForunsSemanas")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public ArrayList<Forum> retornaForunsSemanas(
			@FormParam("login") String login, @FormParam("senha") String senha,
			@FormParam("flagDecriptacao") String flagEncriptacao,
			@FormParam("semanaId") String semanaId,
			@Context HttpServletResponse servletResponse) throws IOException {

		return Fachada.getInstance().retornaForunsSemanas(login, senha,
				flagEncriptacao, semanaId);

	}	
	
	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello Jersey";
	}

}

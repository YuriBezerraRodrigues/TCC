package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Usuario;
import util.ConstantesSistema;

import com.mysql.jdbc.Statement;

import factory.ConnectionFactory;

/**
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */
public class UsuarioDAO implements UsuarioDAOInterface {

	@Override
	public Usuario verifyUsuario(Usuario usuario) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Usuario usuarioTemp = null;
		boolean resultVazio = true;

		try {
			String query = "select * from mdl_user where username = ? and password = md5(?)";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, usuario.getLogin());
			preparedStatement.setString(2, usuario.getSenha()
					+ ConstantesSistema.getCODEPASSWORD());

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				resultVazio = false;
				usuarioTemp = new Usuario(resultSet.getInt("id"),
						resultSet.getString("username"),
						resultSet.getString("password"),
						resultSet.getString("firstname"),
						resultSet.getString("lastname"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
			ex.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return usuarioTemp;
	}

	@Override
	public void updateUsuario(Usuario usuarioSession) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	// johnatan --procurar uma pessoa
	public ArrayList<Usuario> procurarUmaPessoa(String nome) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		ArrayList<Usuario> arrayuser = new ArrayList<Usuario>();
		boolean resultVazio = true;

		try {
			String query = "select * from mdl_user where firstname like ? or lastname like ?";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "%" + nome + "%");
			preparedStatement.setString(2, "%" + nome + "%");
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				resultVazio = false;
				arrayuser.add(new Usuario(resultSet.getInt("id"), resultSet
						.getString("username"),
						resultSet.getString("password"), resultSet
								.getString("firstname"), resultSet
								.getString("lastname")));
			}
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return arrayuser;

	}

	// johnatan --meus contatos
	public ArrayList<Usuario> meusContatos(long id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		ArrayList<Usuario> arrayuser = new ArrayList<Usuario>();
		boolean resultVazio = true;

		try {
			String query = "select * from mdl_user where id in (select contactid from mdl_message_contacts where userid =?)";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "" + id);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				resultVazio = false;
				arrayuser.add(new Usuario(resultSet.getInt("id"), resultSet
						.getString("username"),
						resultSet.getString("password"), resultSet
								.getString("firstname"), resultSet
								.getString("lastname")));
			}
		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		
		if(resultVazio){
			return null;
		}
		
		return arrayuser;
	}

	// fun��o excluir contato
	public Usuario excluirContato(long id, String contatoId) throws Exception {
		Connection connection = null;
		int retorno_statement = 0;
		Statement stmt = null;
		Usuario temp = null;

		try {
			String query = "delete from mdl_message_contacts where mdl_message_contacts.userid = "
					+ id + " and mdl_message_contacts.contactid = " + contatoId;

			connection = ConnectionFactory.getInstance().getConnection();

			stmt = (Statement) connection.createStatement();

			retorno_statement = stmt.executeUpdate(query);

			if (retorno_statement != 0) {// dados excluidos da tabela contatos
											// c/sucesso!

				temp = new Usuario(1, "//dados excluidos c/sucesso!", "1", "1",
						"1");

			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {

				if (retorno_statement != 0) {
					stmt.close();
				}

			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		return temp;

	}

	// desbloquear ou bloquear contato

	public Usuario bloquearOUDesbloquearContato(long id, String contatoId,
			String flagBloqueio) throws Exception {
		Connection connection = null;
		int retorno_statement = 0;
		Statement stmt = null;
		Usuario temp = null;

		try {
			String query = "update mdl_message_contacts set blocked= "
					+ flagBloqueio + " where mdl_message_contacts.userid = "
					+ id + " and mdl_message_contacts.contactid =" + contatoId;

			connection = ConnectionFactory.getInstance().getConnection();

			stmt = (Statement) connection.createStatement();

			retorno_statement = stmt.executeUpdate(query);

			if (retorno_statement != 0) {// dados alterados com sucesso
				if (flagBloqueio.equals("1"))
					temp = new Usuario(1, "bloqueado com sucesso!", "1", "1",
							"1");
				else
					temp = new Usuario(0, "desbloqueado com sucesso!", "0",
							"0", "0");
			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {

				if (retorno_statement != 0) {
					stmt.close();
				}

			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		return temp;

	}
	
	//desbloquear contato
	public Usuario desbloquearContato(long id, String contatoId,
			String flagBloqueio) throws Exception {
		Connection connection = null;
		int retorno_statement = 0;
		Statement stmt = null;
		Usuario temp = null;

		try {
			String query = "update mdl_message_contacts set blocked= "
					+ flagBloqueio + " where mdl_message_contacts.userid = "
					+ id + " and mdl_message_contacts.contactid =" + contatoId;

			connection = ConnectionFactory.getInstance().getConnection();

			stmt = (Statement) connection.createStatement();

			retorno_statement = stmt.executeUpdate(query);

			if (retorno_statement != 0) {// dados alterados com sucesso
				if (flagBloqueio.equals("1"))
					temp = new Usuario(1, "bloqueado com sucesso!", "1", "1",
							"1");
				else
					temp = new Usuario(0, "desbloqueado com sucesso!", "0",
							"0", "0");
			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {

				if (retorno_statement != 0) {
					stmt.close();
				}

			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		return temp;

	}


	public Usuario acrescentarUmContato(long id, String contatoId)
			throws Exception {
		Connection connection = null;
		int retorno_statement = 0;
		Statement stmt = null;

		Usuario temp = null;
		try {
			String query = "INSERT INTO mdl_message_contacts (id,userid,contactid,blocked) VALUES (0,"
					+ id + "," + contatoId + ",0) ";

			connection = ConnectionFactory.getInstance().getConnection();

			stmt = (Statement) connection.createStatement();

			retorno_statement = stmt.executeUpdate(query);

			if (retorno_statement != 0) {// dados inseridos na tabela contatos
											// c/sucesso!

				temp = new Usuario(1, "//dados inseridos c/sucesso!", "1", "1",
						"1");

			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			try {

				if (retorno_statement != 0) {
					stmt.close();
				}

			} catch (SQLException ex) {
				Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}

		}
		return temp;
	}

	// fun��es para a administra��o: tutores, professores, coordenadores

	// <Usuario> buscar alunos(por nome)

	// verificar se usuario esta cadastrado em determinado curso(id aluno, id
	// curso)

	// verificar se usuario esta cadastrado em algum curso do moodle(id aluno)

	// lista de usuarios (alunos) matriculados em determnado curso(id curso);
	// lista de usuarios (alunos) nao matriculados em nenhum curso();
	// quantidade de alunos matriculados ();
	// quantidade de alunos nao matriculados();

	// fun��es estatisticas do aluno(id aluno).

	//

}

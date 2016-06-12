package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Statement;

import model.Mensagem;
import factory.ConnectionFactory;

public class MensagemDAO {
	//mensagens enviadas pelo usuario e nao lidas até o momento pelo destinatário

	public ArrayList<Mensagem> mensagensEnviadasNaoLidas(long id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		ArrayList<Mensagem> arrayMensagem = new ArrayList<Mensagem>();
		boolean resultVazio = true;

		try {
			String query = "select * from mdl_message where useridfrom = ? ";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "" + id);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				resultVazio = false;
				arrayMensagem.add(new Mensagem(resultSet.getLong("useridto"),
						resultSet.getLong("useridfrom"), resultSet
								.getString("smallmessage")));
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

		if (resultVazio) {
			return null;
		}
		return arrayMensagem;
	}
	
	
	//mensagens enviadas pelo usuario e lida pelo destinatário
	public ArrayList<Mensagem> mensagensEnviadasLidas(long id) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		ArrayList<Mensagem> arrayMensagem = new ArrayList<Mensagem>();
		boolean resultVazio = true;

		try {
			String query = "select * from mdl_message_read where useridfrom = ? ";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, "" + id);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				resultVazio = false;
				arrayMensagem.add(new Mensagem(resultSet.getLong("useridto"),
						resultSet.getLong("useridfrom"), resultSet
								.getString("smallmessage")));
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

		if (resultVazio) {
			return null;
		}
		return arrayMensagem;
	}
	
//enviar mensagem
	public Mensagem enviarMensagem(long id, String contatoId, String mensagem)
			throws Exception {
		Connection connection = null;
		int retorno_statement = 0;
		Statement stmt = null;

		Mensagem temp = null;
		try {
			String query = "INSERT INTO mdl_message(id, useridfrom, useridto, subject,"+ 
					"fullmessage, fullmessageformat, fullmessagehtml, smallmessage, notification,"
					+"contexturl, contexturlname, timecreated)"+ 
					"VALUES ("+id+","+contatoId+",NULL,"+mensagem+",0,"+"NULL,"+mensagem+",0,NULL,NULL,now()"+")";
			
			connection = ConnectionFactory.getInstance().getConnection();

			stmt = (Statement) connection.createStatement();

			retorno_statement = stmt.executeUpdate(query);

			if (retorno_statement != 0) {// se der tudo certo 

				temp = new Mensagem(1,1,"mensagem enviada com sucesso!");

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
	

}




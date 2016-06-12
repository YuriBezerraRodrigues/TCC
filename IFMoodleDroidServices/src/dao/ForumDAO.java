package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Forum;
import model.MensagemTopico;
import model.Topicos;
import factory.ConnectionFactory;

public class ForumDAO {
	
	public ArrayList<Forum> retornaForumsCurso(long cursoID) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Forum forumTemp = null;
		ArrayList<Forum> listForums = new ArrayList<Forum>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT id , name from mdl_forum WHERE course = ? ";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, cursoID);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				forumTemp = new Forum();
				forumTemp.setId(resultSet.getInt("id"));
				forumTemp.setNome(resultSet.getString("name"));
				
				listForums.add(forumTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listForums;
	}
	
	public ArrayList<Topicos> retornaTopicosForum(long idForum) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Topicos topicosTemp = null;
		ArrayList<Topicos> listTopicos = new ArrayList<Topicos>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT id ,course, forum, name from mdl_forum_discussions WHERE forum = ? ";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, idForum);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				topicosTemp = new Topicos();
				topicosTemp.setIdTopico(resultSet.getInt("id"));
				topicosTemp.setIdCurso(resultSet.getInt("course"));
				topicosTemp.setIdForum(resultSet.getInt("forum"));
				topicosTemp.setNomeTopico(resultSet.getString("name"));
				
				listTopicos.add(topicosTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listTopicos;
	}
	
	
	public ArrayList<MensagemTopico> retornaMensagensTopico(long idTopico) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		MensagemTopico mensagemTemp = null;
		ArrayList<MensagemTopico> listMensagens = new ArrayList<MensagemTopico>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT id ,discussion, userid, message from mdl_forum_posts WHERE discussion = ? ";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, idTopico);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				mensagemTemp = new MensagemTopico();
				mensagemTemp.setIdMensagem(resultSet.getInt("id"));
				mensagemTemp.setIdTopico(resultSet.getInt("discussion"));
				mensagemTemp.setIdDeQuemPostou(resultSet.getInt("userid"));
				mensagemTemp.setMensagem(resultSet.getString("message"));
				
				listMensagens.add(mensagemTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listMensagens;
	}

	public ArrayList<Forum> retornaForunsSemanas(long semanaId) throws Exception{

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Forum forumTemp = null;
		ArrayList<Forum> listForunsSemanas = new ArrayList<Forum>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT id, course, name, intro FROM mdl_forum where id = (SELECT instance FROM mdl_course_modules WHERE module = 9 AND section = ?)";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, semanaId);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				forumTemp = new Forum();
				forumTemp.setId(resultSet.getInt("id"));
				forumTemp.setNome(resultSet.getString("name"));
				forumTemp.setCourse(resultSet.getString("course"));
				forumTemp.setIntro(resultSet.getString("intro"));
				
				listForunsSemanas.add(forumTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(PostagemDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listForunsSemanas;

	}


}

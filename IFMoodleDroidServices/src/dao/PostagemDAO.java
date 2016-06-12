package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Postagem;
import factory.ConnectionFactory;

/**
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */
public class PostagemDAO implements PostagemDAOInterface {

	@Override
	public Postagem verifyPostagem(Postagem postagem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Postagem> retornaUltimasNoticias() throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Postagem postagemTemp = null;
		ArrayList<Postagem> listPostagens = new ArrayList<Postagem>();
		boolean resultVazio = true;
		
		try {
			String query = "SELECT * FROM mdl_forum_posts PO INNER JOIN mdl_forum_discussions DI ON DI.ID = PO.discussion" +
					" INNER JOIN mdl_forum FO ON DI.forum = FO.id INNER JOIN mdl_course CO ON CO.id = FO.course" +
					" INNER JOIN mdl_user MU ON PO.userid = MU.id "+
					" WHERE CO.id = (SELECT MIN(id) FROM mdl_course) AND FO.type = 'news' limit 5";

			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				resultVazio= false;
				postagemTemp = new Postagem(resultSet.getInt("id"),
											resultSet.getInt("discussion"),
											resultSet.getInt("forum"),
											resultSet.getInt("course"),
											resultSet.getString("subject"),
											resultSet.getString("firstname") + " " + resultSet.getString("lastname"),
											resultSet.getString("message"),
											resultSet.getLong("modified")
											);
				listPostagens.add(postagemTemp);
			}
			
		} catch (SQLException ex) {
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
		
		return listPostagens;

	}
}

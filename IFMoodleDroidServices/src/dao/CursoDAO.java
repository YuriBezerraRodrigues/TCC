package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import factory.ConnectionFactory;
import model.Curso;
import model.Link;
import model.Semanas;

public class CursoDAO implements CursoDAOInterface{

	@Override
	public ArrayList<Curso> retornaRelacaoCursos(long idUsuario) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Curso cursoTemp = null;
		ArrayList<Curso> listCursos = new ArrayList<>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT c.id,c.fullname FROM mdl_role_assignments rs INNER "+
							" JOIN mdl_context e ON rs.contextid=e.id  INNER JOIN  mdl_course c "+
					" ON c.id = e.instanceid WHERE e.contextlevel=50 AND rs.roleid=5 "+
							" AND rs.userid=? ";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, idUsuario);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				cursoTemp = new Curso();
				cursoTemp.setId(resultSet.getInt("id"));
				cursoTemp.setNome(resultSet.getString("fullname"));
				
				listCursos.add(cursoTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listCursos;
	}

	public ArrayList<Semanas> retornaRelacaoSemanas(long idCurso) throws Exception {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Semanas semanaTemp = null;
		ArrayList<Semanas> listSemanas = new ArrayList<>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT * FROM mdl_course_sections WHERE course = ?";
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, idCurso);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				resultVazio = false;
				semanaTemp = new Semanas();
				semanaTemp.setCourse(resultSet.getLong("course"));
				semanaTemp.setNameSection(resultSet.getString("name"));
				semanaTemp.setSummary(resultSet.getString("summary"));
				semanaTemp.setSection(resultSet.getLong("section"));
				semanaTemp.setId(resultSet.getLong("id"));

				listSemanas.add(semanaTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listSemanas;
	}

	public ArrayList<Link> retornaRelacaoLinksSemana(long idSection) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Link linkTemp = null;
		ArrayList<Link> listLink = new ArrayList<>();
		boolean resultVazio = true;
		
		try{
			String query ="SELECT name, externalurl FROM mdl_url where id = (SELECT instance FROM mdl_course_modules WHERE module = 20 AND section = ?)";
			
			connection = ConnectionFactory.getInstance().getConnection();

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, idSection);
			
			resultSet = preparedStatement.executeQuery();
			
			
			
			while (resultSet.next()) {
				resultVazio = false;
				linkTemp = new Link();
				linkTemp.setName(resultSet.getString("name"));
				linkTemp.setExternalUrl(resultSet.getString("externalurl"));

				listLink.add(linkTemp);
			}
			
		}catch (SQLException ex) {
			Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
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
				Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
		
		if(resultVazio){
			return null;
		}
		
		return listLink;
	}

}

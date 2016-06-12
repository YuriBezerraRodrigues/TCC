package factory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import util.ConstantesSistema;

/**
 * 
 * @author Felipe
 * @date 08/09/2013
 */
public class ConnectionFactory {
	private static ConnectionFactory conectionFactory;
	private Connection connection;
	private Properties properties = new Properties();
	private String urlProperties = ConstantesSistema.URL_PROPERTIE;

	public static ConnectionFactory getInstance() {
		if (conectionFactory == null) {
			conectionFactory = new ConnectionFactory();
		}
		return conectionFactory;
	}

	public Connection getConnection() throws Exception {
		if (connection == null) {
			try {
				properties.load(this.getClass().getResourceAsStream(
						urlProperties));
				String connection_url = properties.getProperty("url");
				String user = properties.getProperty("user");
				String password = properties.getProperty("password");
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				connection = DriverManager.getConnection(connection_url, user,
						password);
			} catch (SQLException ex) {
				throw new Exception("Problema ao se conectar com a base de dados.");
			} catch (IOException ex) {
				throw new Exception("Problema ao encontrar arquivos de configuracao.");
			}
		}
		return connection;
	}
}

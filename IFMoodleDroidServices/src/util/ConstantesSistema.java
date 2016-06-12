package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Classe com as constantes gerais do Sistema.
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */
public class ConstantesSistema {

	
	public static final String URL_PROPERTIE = "../Configuration/Connection.properties";
	
	/**Codigo vindo do config.php. Deve ser somado a senha do usuario para fazer o login.*/
	private static String CODE_PASSWORD;
	
	/**Codigo vindo do config.php. Deve ser somado a senha do usuario para fazer o login.*/
	public static String getCODEPASSWORD() {
		if (CODE_PASSWORD == null) {
			CODE_PASSWORD = iniciaCodePassWord();
		}
		return CODE_PASSWORD;
	}

	private static String iniciaCodePassWord() {
		String codigo = "";
		Properties properties = new Properties();
		String urlProperties = "../Configuration/moodleUrl.properties";
		String urlMoodle = "";
		try {
			properties.load(ConstantesSistema.class.getResourceAsStream(urlProperties));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		urlMoodle = properties.getProperty("url");
		File diretorio = new File(urlMoodle);
		File[] arquivos = diretorio.listFiles();
		File arquivoConfig = null;
		for (int i = 0; i < arquivos.length; i++) {
			if (arquivos[i].getName().equals("config.php")) {
				arquivoConfig = arquivos[i];
				break;
			}
		}
		try {
			FileReader fr = new FileReader(arquivoConfig);
			BufferedReader br = new BufferedReader(fr);
			String strLinha;
			while (br.ready()) {
				strLinha = br.readLine();
				if (strLinha.contains("passwordsaltmain")) {
					int beginIndex = strLinha.indexOf("'");
					int endIndex = strLinha.lastIndexOf("'");
					codigo = strLinha.substring(beginIndex + 1, endIndex);
					break;
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return codigo;
	}

}

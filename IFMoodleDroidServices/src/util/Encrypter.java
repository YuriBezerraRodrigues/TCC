package util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Classe respons�vel pela criptografia da senha para armazenamento seguro da
 * mesma no aparelho.
 * 
 * @author Felipe
 * @date 08/09/2013
 * 
 */

public class Encrypter {

	private static final String METODO_ENCRIPTACAO = "AES";
	public static final byte[] CHAVE = { 85, 10, 0, -25, 68, 88, 46, 37, 107,
			48, 10, -1, -37, -90, 70, -36 };

	// public static final byte[] CHAVE = Key

	public static String encriptar(byte[] key, String senha)
			throws EncryptorException {
		try {
			SecretKeySpec skeySpec = new SecretKeySpec(key, METODO_ENCRIPTACAO);

			Cipher cipher = Cipher.getInstance(METODO_ENCRIPTACAO);
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
			byte[] encrypted = cipher.doFinal(senha.getBytes());

			String result = new BASE64Encoder().encode(encrypted);
			//System.out.println("Senha encriptada: " + result);
			return result;
		} catch (Exception e) {
			throw new EncryptorException("Erro ao criptografar informacoes "
					+ e.getMessage());
		}
	}

	public static String decriptar(byte[] key, String senhaEncriptada)
			throws EncryptorException {

		byte[] decrypted = null;

		try {
			SecretKeySpec skeySpec = new SecretKeySpec(key, METODO_ENCRIPTACAO);

			byte[] decoded = new BASE64Decoder().decodeBuffer(senhaEncriptada);

			Cipher cipher = Cipher.getInstance(METODO_ENCRIPTACAO);
			cipher.init(Cipher.DECRYPT_MODE, skeySpec);
			decrypted = cipher.doFinal(decoded);
		} catch (Exception e) {
			throw new EncryptorException("Erro ao descriptografar informacoes "
					+ e.getMessage());
		}

		String result = new String(decrypted);
		//System.out.println("Senha decriptada: " + result);
		return result;
	}

}

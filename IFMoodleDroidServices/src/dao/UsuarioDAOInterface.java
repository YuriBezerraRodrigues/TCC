package dao;

import model.Usuario;

/**
 *
 * @author Felipe
 * @date 08/09/2013
 * 
 */
interface UsuarioDAOInterface {
    public Usuario verifyUsuario(Usuario usuario) throws Exception;
    public void updateUsuario(Usuario usuarioSession);
}

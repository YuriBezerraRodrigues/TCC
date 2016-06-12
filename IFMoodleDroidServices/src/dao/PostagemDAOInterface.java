package dao;

import java.util.ArrayList;

import model.Postagem;

/**
 *
 * @author Felipe
 * @date 08/09/2013
 * 
 */
interface PostagemDAOInterface {
    public Postagem verifyPostagem(Postagem postagem);
    
    public ArrayList<Postagem> retornaUltimasNoticias() throws Exception;
  
}

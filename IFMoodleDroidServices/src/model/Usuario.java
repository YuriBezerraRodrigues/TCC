/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felipe
 * @date 08/09/2013
 */
@XmlRootElement
public class Usuario {

    private long id;
    private String login;
    private String senha;
    private String nome;
    private String sobrenome;

    

	public Usuario(long id, String login, String senha, String nome, String sobrenome) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Usuario() {
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public void setId(long id) {
        this.id = id;
    }

        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public long getId() {
		return id;
	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.Date;

/**
 *
 * @author Guilh
 */
public class Usuario {
    private String login;
    private String senha;
    private Date dataRegistro = new Date();
    private String email;
    
    public Usuario(){}

    public Usuario(String login, String senha, Date dataRegistro, String email) {
        this.login = login;
        this.senha = senha;
        this.dataRegistro = dataRegistro;
        this.email = email;
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

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean verificarLogin(){
        return true;
    }
}

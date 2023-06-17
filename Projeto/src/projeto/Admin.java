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
public class Admin extends Usuario{
    private String nomeAdmin;
    Produto produto = new Produto();

    public Admin(){}

    public Admin(String nomeAdmin, String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
        this.nomeAdmin = nomeAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void atualizarProduto(){
        //produto.setNome()=produto.getNome();
    }
}

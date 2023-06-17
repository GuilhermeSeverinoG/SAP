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
public class Cliente extends Usuario{
    private String nomeCliente;
    private String endereco;
    
    Pedido pedido = new Pedido();

    public Cliente(){}

    public Cliente(String nomeCliente, String endereco, String login, String senha, Date dataRegistro, String email) {
        super(login, senha, dataRegistro, email);
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void atualizarPerfil(){
        
    }
    public String imprimirInfo(){
        return "Login: "+ super.getLogin()+
                "\nSenha: "+super.getSenha()+
                "\nEmail: "+super.getEmail()+
                "Nome de usuario: "+nomeCliente+
                "Endereco: "+endereco+
                "Data de registro: "+super.getDataRegistro();
    }
    //public String visualizarPedidos(){}
}

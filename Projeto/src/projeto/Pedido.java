/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Guilh
 */
public class Pedido {
    private int numPedido;
    private Date dataCriacao = new Date();
    private int quantidade;
    //Nova variável forma de pagamento
    private String formaPagamento;
    
    //private ArrayList<Produto> produtos = new ArrayList<Produto>();
    Produto produto = new Produto();
    
    public Pedido(){}

    public Pedido(int numPedido, int quantidade, String formaPagamento) {
        this.numPedido = numPedido;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    

    

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /*public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }*/

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public String imprimirInfo(){
        return  "------------------------------------"+
                "Numero do pedido: "+numPedido+
                "Data emitido: "+dataCriacao+
                "Nome do produto"+ produto.getNome()+
                "Quantidade requerida: "+ quantidade+
                "Forma de pagamento: " + formaPagamento+
                "Valor total: "+calcularPreco();
                
    }
    
    public double calcularPreco(){
       return quantidade*produto.getValor();
    }
}

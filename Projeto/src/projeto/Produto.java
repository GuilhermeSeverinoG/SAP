/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Guilh
 */
public class Produto {
    private String nome;
    private double valor;
    //Variável estoque criada

    public Produto(){}

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    
    public String infoProduto(){
        return "Nome:"+nome+"\nvalor: "+ valor;
    }
    
}

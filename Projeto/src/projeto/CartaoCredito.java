/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Guilh
 */
public class CartaoCredito {
    private String numero;
    private String dtValidade;
    private String ccv;
    //Cliente titular;
    private String titular;
    
    public CartaoCredito(){}

    public CartaoCredito(String numero, String dtValidade, String ccv, String titular) {
        this.numero = numero;
        this.dtValidade = dtValidade;
        this.ccv = ccv;
        this.titular = titular;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(String dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String imprimirInfo(){
        return "Numero: "+ numero+
                "Data de valdiade: "+ dtValidade+
                "Ccv: "+ ccv+
                "Titular"+ titular;
    }
}

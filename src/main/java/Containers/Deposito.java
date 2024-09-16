/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Containers;

/**
 *
 * @author caiov
 */
public class Deposito extends Containers {
    private String nome;
    private String sigla;
    private String tipodeposito;

    public Deposito() {
    }

    public Deposito(String nome, String sigla, String tipodeposito, float Tamanho) {
        super(Tamanho);
        this.nome = nome;
        this.sigla = sigla;
        this.tipodeposito = tipodeposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTipodeposito() {
        return tipodeposito;
    }

    public void setTipodeposito(String tipodeposito) {
        this.tipodeposito = tipodeposito;
    }
    
    
    
    
    
}

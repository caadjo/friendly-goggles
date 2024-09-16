/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Containers;

/**
 *
 * @author caiov
 */
public class Laboratorio extends Containers{
    private String sigla;
    private String finalidade;
    private String nome;

    public Laboratorio() {
    }

    public Laboratorio(String sigla, String finalidade, String nome) {
        this.sigla = sigla;
        this.finalidade = finalidade;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}

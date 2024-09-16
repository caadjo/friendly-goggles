/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipamentos;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Equipamentos extends Entity{
    private String utilidade; // 25
    private float QuantidadeEnergia;  // 2 casas decimais
    private String nome; //25 

    public Equipamentos() {
    }

    public Equipamentos(String utilidade, float QuantidadeEnergia, String nome) {
        this.utilidade = utilidade;
        this.QuantidadeEnergia = QuantidadeEnergia;
        this.nome = nome;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public void setUtilidade(String utilidade) {
        this.utilidade = utilidade;
    }

    public float getQuantidadeEnergia() {
        return QuantidadeEnergia;
    }

    public void setQuantidadeEnergia(float QuantidadeEnergia) {
        this.QuantidadeEnergia = QuantidadeEnergia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}

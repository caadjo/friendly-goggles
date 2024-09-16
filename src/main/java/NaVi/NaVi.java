/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaVi;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class NaVi extends Entity { 

  
    private String nome;                  
    private float altura;                
    private float bioluminescencia;       
   
    public NaVi() {
    }

 
    public NaVi(String nome, float altura, float bioluminescencia) {
        this.nome = nome;
        this.altura = altura;
        this.bioluminescencia = bioluminescencia;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        if (!Character.isDigit(nome.charAt(0)) && nome.length() <= 25) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome deve ter até 25 caracteres e não pode iniciar com um número.");
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBioluminescencia() {
        return bioluminescencia;
    }

    public void setBioluminescencia(float bioluminescencia) {
        this.bioluminescencia = bioluminescencia;
    }

   
    @Override
    public String toString() {
        return "NaVi{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", bioluminescencia=" + bioluminescencia +
                '}';
    }
}

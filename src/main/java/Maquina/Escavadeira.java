/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquina;

/**
 *
 * @author caiov
 */
public class Escavadeira extends Maquinas{
    private float pesosuportado;
    private float potencia;
    private float capacidadepa;

    public Escavadeira() {
    }

    public Escavadeira(float pesosuportado, float potencia, float capacidadepa) {
        this.pesosuportado = pesosuportado;
        this.potencia = potencia;
        this.capacidadepa = capacidadepa;
    }

    public float getPesosuportado() {
        return pesosuportado;
    }

    public void setPesosuportado(float pesosuportado) {
        this.pesosuportado = pesosuportado;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getCapacidadepa() {
        return capacidadepa;
    }

    public void setCapacidadepa(float capacidadepa) {
        this.capacidadepa = capacidadepa;
    }
    
    
    
    
}

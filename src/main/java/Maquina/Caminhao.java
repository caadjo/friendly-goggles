/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquina;

/**
 *
 * @author caiov
 */
public class Caminhao extends Maquinas{
    private float pesosuportado;
    private float potencia;
    private float capacidadecacamba;

    public Caminhao() {
    }

    public Caminhao(float pesosuportado, float potencia, float capacidadecacamba) {
        this.pesosuportado = pesosuportado;
        this.potencia = potencia;
        this.capacidadecacamba = capacidadecacamba;
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

    public float getCapacidadecacamba() {
        return capacidadecacamba;
    }

    public void setCapacidadecacamba(float capacidadecacamba) {
        this.capacidadecacamba = capacidadecacamba;
    }
    
    
}

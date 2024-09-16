/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Containers;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Containers extends Entity{
    private float Tamanho;  //2 casas decimais

    public Containers() {
    }

    public Containers(float Tamanho) {
        this.Tamanho = Tamanho;
    }
    

    public float getTamanho() {
        return Tamanho;
    }

    public void setTamanho(float Tamanho) {
        this.Tamanho = Tamanho;
    }
    
    
}

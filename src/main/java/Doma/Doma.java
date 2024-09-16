/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doma;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Doma extends Entity{
    private String id_habitantes;
    private String posicaonocla;

    public Doma() {
    }

    public Doma(String id_habitantes, String posicaonocla) {
        this.id_habitantes = id_habitantes;
        this.posicaonocla = posicaonocla;
    }

    public String getPosicaonocla() {
        return posicaonocla;
    }

    public void setPosicaonocla(String posicaonocla) {
        this.posicaonocla = posicaonocla;
    }
    
    
    
}

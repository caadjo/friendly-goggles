/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Habitacao;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Habitacao extends Entity{
    private int mascara;
    // id humano , id_colonia

    public Habitacao() {
    }

    public Habitacao(int mascara) {
        this.mascara = mascara;
    }

    public int getMascara() {
        return mascara;
    }

    public void setMascara(int mascara) {
        this.mascara = mascara;
    }
    
    
}

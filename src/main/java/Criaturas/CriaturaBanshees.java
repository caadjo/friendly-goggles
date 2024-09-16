/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criaturas;

/**
 *
 * @author caiov
 */
public class CriaturaBanshees extends Criaturas{
    private float alturadevoo;
    private String cor;

    public CriaturaBanshees() {
    }

    public CriaturaBanshees(float alturadevoo, String cor) {
        this.alturadevoo = alturadevoo;
        this.cor = cor;
    }

    public float getAlturadevoo() {
        return alturadevoo;
    }

    public void setAlturadevoo(float alturadevoo) {
        this.alturadevoo = alturadevoo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}

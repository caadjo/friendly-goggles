/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regioes;

/**
 *
 * @author caiov
 */
public class RegMontanhas extends Regioes{
    
    private float altura;
    private boolean semovimenta;

    public RegMontanhas() {
    }

    public RegMontanhas(float altura, boolean semovimenta) {
        this.altura = altura;
        this.semovimenta = semovimenta;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isSemovimenta() {
        return semovimenta;
    }

    public void setSemovimenta(boolean semovimenta) {
        this.semovimenta = semovimenta;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criaturas;

/**
 *
 * @author caiov
 */
public class CriaturaThanators extends Criaturas{
    private float velocidademaxima;
    private float niveldeforca;

    public CriaturaThanators() {
    }

    public CriaturaThanators(float velocidademaxima, float niveldeforca) {
        this.velocidademaxima = velocidademaxima;
        this.niveldeforca = niveldeforca;
    }

    public float getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(float velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public float getNiveldeforca() {
        return niveldeforca;
    }

    public void setNiveldeforca(float niveldeforca) {
        this.niveldeforca = niveldeforca;
    }
    
    
}

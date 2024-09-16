/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regioes;

/**
 *
 * @author caiov
 */
public class RegPlanicies extends Regioes{
    
    private int quantrios;
    private int quantlagos;

    public RegPlanicies() {
    }

    public RegPlanicies(int quantrios, int quantlagos) {
        this.quantrios = quantrios;
        this.quantlagos = quantlagos;
    }

    public int getQuantrios() {
        return quantrios;
    }

    public void setQuantrios(int quantrios) {
        this.quantrios = quantrios;
    }

    public int getQuantlagos() {
        return quantlagos;
    }

    public void setQuantlagos(int quantlagos) {
        this.quantlagos = quantlagos;
    }
    
    
    
}

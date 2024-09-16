/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regioes;

/**
 *
 * @author caiov
 */
public class RegVales extends Regioes{
    
    private boolean possueagua;
    private float profundidade;

    public RegVales() {
    }

    public RegVales(boolean possueagua, float profundidade) {
        this.possueagua = possueagua;
        this.profundidade = profundidade;
    }

    public boolean isPossueagua() {
        return possueagua;
    }

    public void setPossueagua(boolean possueagua) {
        this.possueagua = possueagua;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoNeural;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class ConexaoNeural extends Entity{
    //id humano, idavatar
    
    private int quantidadematerial;

    public ConexaoNeural() {
    }

    public ConexaoNeural(int quantidadematerial) {
        this.quantidadematerial = quantidadematerial;
    }

    public int getQuantidadematerial() {
        return quantidadematerial;
    }

    public void setQuantidadematerial(int quantidadematerial) {
        this.quantidadematerial = quantidadematerial;
    }
    
    
}

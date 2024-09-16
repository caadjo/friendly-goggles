/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criaturas;

/**
 *
 * @author caiov
 */
public class CriaturaDirehorses extends Criaturas{
    private int quantantenas;
    private int quantpatas;

    public CriaturaDirehorses() {
    }

    public CriaturaDirehorses(int quantantenas, int quantpatas) {
        this.quantantenas = quantantenas;
        this.quantpatas = quantpatas;
    }

    public int getQuantantenas() {
        return quantantenas;
    }

    public void setQuantantenas(int quantantenas) {
        this.quantantenas = quantantenas;
    }

    public int getQuantpatas() {
        return quantpatas;
    }

    public void setQuantpatas(int quantpatas) {
        this.quantpatas = quantpatas;
    }
    
    
}

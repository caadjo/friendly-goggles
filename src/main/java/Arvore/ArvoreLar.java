/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author caiov
 */
public class ArvoreLar extends Arvore {
    //id
    
    private int capacidadehabitantes;

    public ArvoreLar() {
    }

    public ArvoreLar(int capacidadehabitantes, String local) {
        super(local);
        this.capacidadehabitantes = capacidadehabitantes;
    }

    public ArvoreLar(int capacidadehabitantes) {
        this.capacidadehabitantes = capacidadehabitantes;
    }

    public int getCapacidadehabitantes() {
        return capacidadehabitantes;
    }

    public void setCapacidadehabitantes(int capacidadehabitantes) {
        this.capacidadehabitantes = capacidadehabitantes;
    }
    
    
}

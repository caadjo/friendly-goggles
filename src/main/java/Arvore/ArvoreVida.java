/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author caiov
 */
public class ArvoreVida extends Arvore{
    private int sementesgeradas;

    public ArvoreVida() {
    }

    public ArvoreVida(int sementesgeradas, String local) {
        super(local);
        this.sementesgeradas = sementesgeradas;
    }

    public int getSementesgeradas() {
        return sementesgeradas;
    }

    public void setSementesgeradas(int sementesgeradas) {
        this.sementesgeradas = sementesgeradas;
    }
    
    
    
    
}

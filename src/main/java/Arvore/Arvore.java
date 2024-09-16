/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Arvore extends Entity{
   private String local;

    public Arvore(String local) {
        this.local = local;
    }

    public Arvore() {
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
   
   
}

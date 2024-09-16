/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resultado;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class Resultado extends Entity{
    private String id_cientista;
    private String id_container;
    private String id_pesquisa;
    private String id_avatar;

    public Resultado() {
    }

    public Resultado(String id_cientista, String id_container, String id_pesquisa, String id_avatar) {
        this.id_cientista = id_cientista;
        this.id_container = id_container;
        this.id_pesquisa = id_pesquisa;
        this.id_avatar = id_avatar;
    }
    
    
}

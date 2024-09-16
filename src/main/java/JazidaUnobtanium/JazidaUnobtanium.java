/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JazidaUnobtanium;

import Entity.Entity;

/**
 *
 * @author caiov
 */
public class JazidaUnobtanium extends Entity {  

    // Atributos da classe Jazida
    private float longitude;
    private float latitude;
    private float altura;
    private float base;

    // Construtor vazio
    public JazidaUnobtanium() {
    }

    // Construtor com todos os atributos
    public JazidaUnobtanium(float longitude, float latitude, float altura, float base) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.altura = altura;
        this.base = base;
    }

    // Getters e Setters
    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Containers;

/**
 *
 * @author caiov
 */
public class Residencia extends Containers {
    private String nome;
    private String banheiro;
    private String sigla;
    private boolean cama;

    public Residencia() {
    }

    public Residencia(String nome, String banheiro, String sigla, boolean cama) {
        this.nome = nome;
        this.banheiro = banheiro;
        this.sigla = sigla;
        this.cama = cama;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(String banheiro) {
        this.banheiro = banheiro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public boolean isCama() {
        return cama;
    }

    public void setCama(boolean cama) {
        this.cama = cama;
    }
    
    
}

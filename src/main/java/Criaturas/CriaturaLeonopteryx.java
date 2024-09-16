/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Criaturas;

/**
 *
 * @author caiov
 */
import java.util.ArrayList;
import java.util.List;

public class CriaturaLeonopteryx extends Criaturas {  // Supondo que o ID é herdado de Entity

    // Atributo 'cores' que é multivalorado (lista de strings)
    private List<String> cores;

    // Construtor vazio
    public CriaturaLeonopteryx() {
        this.cores = new ArrayList<>();  // Inicializa a lista de cores vazia
    }

    // Construtor com a lista de cores
    public CriaturaLeonopteryx(List<String> cores) {
        this.cores = new ArrayList<>();
        for (String cor : cores) {
            adicionarCor(cor);  // Valida e adiciona cada cor
        }
    }

    // Getters e Setters
    public List<String> getCores() {
        return cores;
    }

    public void setCores(List<String> cores) {
        this.cores = new ArrayList<>();
        for (String cor : cores) {
            adicionarCor(cor);  // Valida e adiciona cada cor
        }
    }

    // Método para adicionar uma cor validada
    public void adicionarCor(String cor) {
        // Validação para garantir que a cor não inicie com números e tenha no máximo 20 caracteres
        if (!Character.isDigit(cor.charAt(0)) && cor.length() <= 20) {
            this.cores.add(cor);
        } else {
            throw new IllegalArgumentException("A cor deve ter até 20 caracteres e não pode iniciar com um número.");
        }
    }

}  
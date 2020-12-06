/*
 * Classname             (Pet)
 *
 * Date                  (28/11/2020 - 17:08)
 *
 * author                (Bruno Rodrigues Souza - 20192101063 / Lucas Vitiello - 20181105255)
 *
 * Copyright notice      (2° Avaliação - Atividade Individual Avaliativa)
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pet {
    
    private String nome;
    private LocalDate dataNasc;
    private double altura;
    private int peso;
    
    public Pet() {
        
    }
    
    public Pet(String nome, LocalDate dataNasc, double altura, int peso) {
        this.setNome(nome);
        this.setDataNasc(dataNasc);
        this.setAltura(altura);
        this.setPeso(peso);
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "nome:" + this.getNome() + "+" +
                "dataNasc:" + this.getDataNasc().format(formatter) + "+" +
                "altura:" + this.getAltura() + "+" +
                "peso:" + this.getPeso();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNasc
     */
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}

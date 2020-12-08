/*
 * Classname             (Pet)
 *
 * Date                  (08/12/2020 - 02:08)
 *
 * author                (Bruno Rodrigues Souza - 20192101063 / Lucas Vitiello - 20181105255)
 *
 * Copyright notice      (2° Avaliação - Atividade Individual Avaliativa)
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Pet {
    
    private String nome;
    private LocalDate anoNasc;
    private double altura;
    private int peso;
    
    public Pet() {
        
    }
    
    public Pet(String nome, LocalDate anoNasc, double altura, int peso) {
        this.setNome(nome);
        this.setDataNasc(anoNasc);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        if (this.peso != other.peso) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.anoNasc, other.anoNasc)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Nome:" + this.getNome() + "+" +
                "AnoNasc:" + this.getAnoNasc().getYear() + "+" +
                "Altura:" + this.getAltura() + "+" +
                "Peso:" + this.getPeso();
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
    public LocalDate getAnoNasc() {
        return anoNasc;
    }

    /**
     * @param anoNasc the dataNasc to set
     */
    public void setDataNasc(LocalDate anoNasc) {
        this.anoNasc = anoNasc;
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

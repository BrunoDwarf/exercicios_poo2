/*
 * Classname             (Gerente)
 *
 * Date                  (22/09/2020 - 19:31)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 4)
 */
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class Gerente extends Empregado {
    private Empregado secretaria;
    private String automovel;


    public Gerente() {
        super();
    }
    public Gerente(String nome, String funcao, double salario, LocalDate data_admissao, Empregado secretaria, String automovel) {
        super(nome, funcao, salario, data_admissao);
        this.secretaria = secretaria;
        this.automovel = automovel;
    }

    public void setSecretaria(Empregado secretaria) {
        this.secretaria = secretaria;
    }
    public Empregado getSecretaria() {
        return secretaria;
    }
    
    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }
    public String getAutomovel() {
        return automovel;
    }

    public void aumentaSalario(double porcentagem) {
        double bonus;
        LocalDate dataAuxiliar = LocalDate.now();
        Period periodo = Period.between(dataAuxiliar, getDataAdmissao());

        bonus = 0.5 * periodo.getYears();

        //super. chama aumentaSalario() de Empregado para não repetir código.
        super.aumentaSalario(porcentagem + bonus);
    }

    public String toString() {
        return super.toString() + "\nNome da Secretária: " + secretaria.getNome() + "\nAutomóvel: " + automovel;
    }
}
/*
* Questão 4 - Faça um programa em Java para estender a classe Empregado para Gerente. A classe Gerente deverá
* conter as propriedades secretária (do tipo Empregados) e Automóvel (String), com seus respectivos métodos de
* acesso. Criar também um método para aumentar o salário do Gerente onde o percentual incidirá sobre o salário + 0,5 * cada ano na empresa.
* Criar um construtor para a classe Gerente que acrescente as novas propriedades recebidas como parâmetro.
* Ainda deverá permanecer o construtor default. Criar também um método toString para esta classe que retorne uma
* String com todos os dados.
*/

/*
 * Classname             (Empregado)
 *
 * Date                  (22/09/2020 - 19:18)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 3)
 */
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empregado {
    public static int matricula_auxiliar = 0;
    private int matricula;
    private String nome, funcao;
    private double salario;
    private LocalDate data_admissao;

    DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Empregado() {
        super();
        matricula = matricula_auxiliar + 1;
    }

    public Empregado(String nome, String funcao, double salario, LocalDate data_admissao) {
        this();
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return nome;
    }

    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }
    public String getFuncao()
    {
        return funcao;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public double getSalario()
    {
        return salario;
    }

    public void setDataAdmissao(LocalDate data_admissao) {
        this.data_admissao = data_admissao;
    }
    public LocalDate getDataAdmissao() {
        return data_admissao;
    }

    public void aumentaSalario(double porcentagem) {
        salario = salario + (salario * porcentagem / 100);
    }

    public String toString() {
        return "\nMatrícula: " + matricula + "\nNome: " + nome + "\nFunção: " + funcao + "\nSalário: "+ String.format("%,.2f", salario) + "\nData de Admissão: " + data_admissao.format(formataData);
    }
}
/*
* Questão 3 - Crie uma classe em Java para representar Empregado com as propriedades mat, nome, função, salario
* e data_adm. Todas as propriedades devem estar encapsuladas. Nenhum objeto desta classe poderá ser criado
* sem matrícula. A matrícula será fornecida seqüencialmente a cada empregado criado a partir de um. Deverão
* constar também métodos de acesso para cada uma das propriedades definidas. Crie um método para aumentar 
* salário a partir de um valor percentual recebido e um método chamado toString que retorne uma String com 
* todas as propriedades existentes na classe e seus respectivos valores.
*/

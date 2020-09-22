/*
 * Classname             (Funcionario)
 *
 * Date                  (22/09/2020 - 17:35)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 1)
 */
import java.util.*;

public class Funcionario {
    private static int matricula_auxiliar = 0;
    private int matricula;
    private String nome, funcao;
    private double salario;

    public Funcionario()
    {
        matricula = ++ matricula_auxiliar;
    }
    public Funcionario(String nome, String funcao, double salario)
    {
        this();
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
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
}

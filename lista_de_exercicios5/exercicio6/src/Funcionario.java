/*
 * Classname             (Funcionario)
 *
 * Date                  (17/09/2020 - 18:44)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 1)
 */
public class Funcionario {

    private static int matricula_auxiliar = 0;
    private int matricula;
    private String nome, funcao;
    private double salario;
    
    public Funcionario()
    {
        matricula = ++ matricula_auxiliar;    
    }
    public Funcionario(String nome_auxiliar, String funcao_auxiliar, double salario_auxiliar)
    {
        this();
        nome = nome_auxiliar;
        funcao = funcao_auxiliar;
        salario = salario_auxiliar;
    }
    public Funcionario(String nome_auxiliar, String funcao_auxiliar)
    {
        this(nome_auxiliar, funcao_auxiliar, CargosSalarios.buscaSalario(funcao_auxiliar));
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
/*
 *
 */
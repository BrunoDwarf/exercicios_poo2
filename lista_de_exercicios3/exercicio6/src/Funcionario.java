/*
 * Classname             (Funcionario)
 *
 * Date                  (08/09/2020 - 18:37)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 6)
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
 * Questão 6 - Crie uma classe em java com as seguintes caracteristicas: Classe Funcionario com
 * mat, nome, função e salário. Todas as propriedades, com exceção de mat, devem ser de instância.
 *
 * Questão 8 - Altere a classe Funcionário para que esteja de acordo com as definições da Orientação
 * a Objeto com relação ao encapsulamento, ou seja, torne as propriedades rpivate e recompile a classe.
 * Tente executar o programa do Exercício 7.
 *
 * Questão 9 - Altere a classe Funcionário adicionando métodos de acesso á classe de modo que somente
 * será possivel ter acesso as variáveis mediante os métodos criados.
 *
 * Questões 11 - Altere as classes Funcionário e a classe criada no exercício 10 para que a propriedade
 * mat seja auto-incrementada, ou seja, a matrícula do funcionário seja automaticamente fornecida a partir
 * do valor 1 a cada funcionário criado. Sendo assim, a matricula não será mais solicitada na criação de um
 * funcionário e sim gerada na construção do objeto da classe.
 *
 * Questão 12 - Crie um novo método construtor para a classe Funcionário de modo que os valores das propriedades
 * sejam fornecidos na criação de um funcionário.
 *
 * Questão 14 - Crie um novo método construtor para que a classe Funcionário que permita a construção de um
 * Funcionário apenas com o nome e a função. Este construtor deverá chamar o outro construtor já existente
 * passando o salário igual a zero como parte dos argumentos.
 */
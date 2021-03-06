/*
 * Classname             (Vendedor)
 *
 * Date                  (17/10/2020 - 16:12)
 *
 * Author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Atividade Individual Avaliativa)
 */
package template;

public abstract class Vendedor {
    private static int matricula_auxiliar = 0;
    private int matricula;
    private String nome;
    private double vendas, comissao;

    public Vendedor()
    {
        super();
        matricula = ++ matricula_auxiliar;
    }

    public Vendedor(String nome, double vendas, double comissao)
    {
        this();
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
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

    public void setVendas(double vendas)
    {
        this.vendas = vendas;
    }
    public double getVendas()
    {
        return vendas;
    }

    public void setComissao(double comissao)
    {
        this.comissao = comissao;
    }
    public double getComissao()
    {
        return comissao;
    }

    public abstract double calcularPagamento();

    public String toString() {
        return "\nMatrícula: " + matricula + "\nNome: " + nome + "\nQuantidade de Vendas: " + vendas + "\nPorcentagem da Comissão: " + comissao;
    }

}
/*
 * 1° Questão (1,0) - Deseja-se uma representação em Java de um modelo de classes onde existe, em um pacote denominado
 * template, uma interface Pagamento com um método calcularPagamento() e uma classe abstrata Vendedor que implementa
 * Pagamento, com as propriedades nome, vendas e comissão. Em um outro pacote, denominado vendedores, existem as classes
 * VendedorExterno e VendedorLoja que são subclasses de Vendedor. VendedorExterno possui o atributo ajuda de custo e seu
 * pagamento é calculado pela formula: vendas * comissão + ajudaCusto. Já o VendedorLoja tem como atributos adicionais
 * salário e horaExtra, e efetua o cálculo do pagamento pela formula: vendas * comissão + salário + horaExtra. Adicionar
 * para cada classe um método construtor que receba como parâmetro todos os atributos da classe. Manter ainda o
 * construtor default de cada classe.
 */
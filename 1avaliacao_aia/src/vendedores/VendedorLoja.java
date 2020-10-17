/*
 * Classname             (VendedorLoja)
 *
 * Date                  (17/10/2020 - 16:12)
 *
 * author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Atividade Individual Avaliativa)
 */
package vendedores;

public class VendedorLoja extends template.Vendedor {
    private double salario, hora_extra;

    public VendedorLoja()
    {
        super();
    }

    public VendedorLoja(String nome, double vendas, double comissao, double salario, double hora_extra)
    {
        super(nome, vendas, comissao);
        this.salario = salario;
        this.hora_extra = hora_extra;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public double getSalario()
    {
        return salario;
    }

    public void setHoraExtra(double hora_extra)
    {
        this.hora_extra = hora_extra;
    }
    public double getHoraExtra()
    {
        return hora_extra;
    }

    public double calcularPagamento(double pagamento)
    {
        pagamento = (getVendas() * getComissao()) + salario + hora_extra;

        return pagamento;
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

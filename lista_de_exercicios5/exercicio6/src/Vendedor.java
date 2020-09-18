/*
 * Classname             (Vendedor)
 *
 * Date                  (17/09/2020 - 18:44)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 1)
 */
public class Vendedor extends Funcionario {
    private int totalVenda;
    private double comissao;

    public Vendedor (int totalVenda_auxiliar, double comissao_auxiliar) {
        totalVenda = totalVenda_auxiliar;
        comissao = comissao_auxiliar;
    }

    public void setTotalVenda(int totalVenda) {
        this.totalVenda;
    }

    public int getTotalVenda() {
        return totalVenda;
    }

    public void setComissao(double comissao) {
        this.comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
/*
 * Questão 1 - A partir da classe final Funcionário_4, criada no exercício Usando Classes,
 * crie uma classe Vendedor que estenda de Funcionário_4 com as propriedades totalVendas e comissão.
 * Crie também um método para calcular o salário de um Vendedor sendo salario = salário + totalVendas * comissão.
 */

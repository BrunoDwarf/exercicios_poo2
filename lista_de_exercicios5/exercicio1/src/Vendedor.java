/*
 * Classname             (Vendedor)
 *
 * Date                  (22/09/2020 - 17:35)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 1)
 */
import java.util.*;

public class Vendedor extends Funcionario {
    private double total_venda;
    private double comissao;

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String funcao, double salario, double total_venda, double comissao)
    {
        super(nome, funcao, salario);
        this.total_venda = total_venda;
        this.comissao = comissao;
    }

    public void setTotalVenda(double total_venda)
    {
        this.total_venda = total_venda;
    }
    public double getTotalVenda()
    {
        return total_venda;
    }

    public void setComissao(double comissao)
    {
        this.comissao = comissao;
    }
    public double getComissao()
    {
        return comissao;
    }

    public double calcularSalario() {
        double salario_vendedor;

        salario_vendedor = getSalario() + (total_venda * comissao);
        return salario_vendedor;
    }
}
/*
* Questão 1 - A partir da classe final Funcionário_4, criada no exercício Usando Classes, crie uma
* classe Vendedor que estenda de Funcionário_4 com as propriedades totalVendas e comissão. Crie também um
* método para calcular o salário de um Vendedor sendo salario = salário + totalVendas * comissão.
*/

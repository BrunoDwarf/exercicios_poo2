/*
 * Classname             (Main)
 *
 * Date                  (22/09/2020 - 17:52)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 2)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String nome, funcao;
        double salario, total_vendas, comissao, salario_atualizado;
        int matricula, i, s;

        Vendedor vetorVendedor[] = new Vendedor[3];

        try
        {
            System.out.println("Preenchendo Vendedor");
            for (i = 0; i < 2; i++)
            {
                s = i + 1;
                System.out.println("##Vendedor " + s + "##");
                System.out.println("Nome: ");
                nome = ler.nextLine();
                System.out.println("Função: ");
                funcao = ler.nextLine();
                System.out.println("Salário: ");
                salario = ler.nextDouble();
                System.out.println("Total de Vendas: ");
                total_vendas = ler.nextDouble();
                System.out.println("Comissão: ");
                comissao = ler.nextDouble();
                vetorVendedor[i] = new Vendedor(nome, funcao, salario, total_vendas, comissao);
                System.out.println("\n");
                ler.nextLine();
            }
            System.out.println("\n");

            System.out.println("Listando Vendedores Cadastrados");
            for (i = 0; i < 2; i++)
            {
                s = i + 1;

                matricula = vetorVendedor[i].getMatricula();
                nome = vetorVendedor[i].getNome();
                funcao = vetorVendedor[i].getFuncao();
                salario = vetorVendedor[i].getSalario();
                total_vendas = vetorVendedor[i].getTotalVenda();
                comissao = vetorVendedor[i].getComissao();
                salario_atualizado = vetorVendedor[i].calcularSalario();

                System.out.println("##Vendedor " + s + "##");
                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome: " + nome);
                System.out.println("Função: " + funcao);
                System.out.println("Salário Anterior: " + salario);
                System.out.println("Total de Vendas: " + total_vendas);
                System.out.println("Comissão: " + comissao);
                System.out.println("Salário Atualizado: " + salario_atualizado);

                System.out.println("\n");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }


    }
}
/*
* Questão 2 - Faça um programa que crie 3 Vendedores com todas as propriedades e exiba matrícula,
* nome, função e salário a receber. As funções de um Vendedor podem ser Externo ou Tele-vendas.
*/
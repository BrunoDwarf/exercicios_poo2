/*
 * Classname             (ManipulaFuncionario)
 *
 * Date                  (18/09/2020 - 14:59)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício Extra)
 */

import java.util.*;

public class ManipulaFuncionario {
    public void preencheFuncionario(Funcionario[] vetorFuncionario) {
        String nome, funcao;
        double salario;
        int i, s;
        try
        {
            for (i = 0; i < 10; i++)
            {
                s = i + 1;
                System.out.println("##Funcionário " + s + "##");
                System.out.println("Nome: ");
                nome = Main.ler.nextLine();
                System.out.println("Função: ");
                funcao = Main.ler.nextLine();
                System.out.println("Salário: ");
                salario = Main.ler.nextDouble();
                vetorFuncionario[i] = new Funcionario(nome, funcao, salario);
                System.out.println("\n");
                Main.ler.nextLine();
            }
            System.out.println("\n");
        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }
    }

    public void pesquisaFuncionario(Funcionario[] vetorFuncionario) {
        Funcionario funcionario_pesquisa;

        String nome, funcao;
        double salario;
        int i, s = 0, codigo = 0;

        try
        {
            System.out.println("##Dados do Funcionário para Pesquisar##");
            System.out.println("Nome: ");
            nome = Main.ler.nextLine();
            System.out.println("Função: ");
            funcao = Main.ler.nextLine();
            System.out.println("Salário: ");
            salario = Main.ler.nextDouble();
            funcionario_pesquisa = new Funcionario(nome, funcao, salario);

            for (i = 0; i < 10; i++)
            {
                s = i + 1;
                if(vetorFuncionario[i].getNome().equals(funcionario_pesquisa.getNome()))
                {
                    codigo = 1;
                    break;
                }
            }

            if (codigo == 1)
            {
                System.out.println("--O funcionário informado existe e é o " + s + "° funcionário.\n");
            }
            else
            {
                System.out.println("--O funcionário informado não existe.\n");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }
    }

    public void bonificaFuncionario(Funcionario[] vetorFuncionario) {
        double salario, salario_bonificado;
        int i, s = 0;

        for (i = 0; i < 10; i++)
        {
            s = i + 1;

            salario = vetorFuncionario[i].getSalario();
            if (salario < 1000)
            {
                salario_bonificado = salario + ((salario * 10) / 100);

                vetorFuncionario[i].setSalario(salario_bonificado);

                System.out.println("##Funcionário " + s + "##");
                System.out.println("Matrícula: " + vetorFuncionario[i].getMatricula());
                System.out.println("Nome: " + vetorFuncionario[i].getNome());
                System.out.println("Função: " + vetorFuncionario[i].getFuncao());
                System.out.println("Salário antes da Bonificação: " + salario);
                System.out.println("Salário depois da Bonificação: " + salario_bonificado);
                System.out.println("\n");
            }
        }
    }

    public void imprimiFuncionario(Funcionario[] vetorFuncionario)
    {
        int i, s;

        for (i = 0; i < 10; i++)
        {
            s = i + 1;
            System.out.println("##Funcionário " + s + "##");
            System.out.println("Matrícula: " + vetorFuncionario[i].getMatricula());
            System.out.println("Nome: " + vetorFuncionario[i].getNome());
            System.out.println("Função: " + vetorFuncionario[i].getFuncao());
            System.out.println("Salário: " + vetorFuncionario[i].getSalario());
            System.out.println("\n");
        }
    }
}

/*
 * Classname             (Main)
 *
 * Date                  (18/09/2020 - 14:59)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício Extra)
 */
import java.util.*;

public class Main {
    static Scanner ler = new Scanner(System.in);

    public static void main(String args[]) {
        Funcionario vetorFuncionario[] = new Funcionario[10];
        ManipulaFuncionario manifun = new ManipulaFuncionario();

        int opcao_menu, controle = 1;

        try
        {
            do
            {
                System.out.println("##Menu de Ações##");
                System.out.println("1 - Preenchendo Funcionário");
                System.out.println("2 - Pesquisando Funcionário pelo Nome");
                System.out.println("3 - Bonificação de 5% no Salário dos Funcionários que recebem menos de 1.000,00");
                System.out.println("4 - Imprimindo todos os Funcionários cadastrados");
                System.out.println("5 - Sair");

                System.out.println("\nInforme o número da opção escolhida: ");
                opcao_menu = ler.nextInt();
                ler.nextLine();

                switch (opcao_menu)
                {
                    case 1:
                        System.out.println("\nPreenchendo Funcionário");
                        manifun.preencheFuncionario(vetorFuncionario);
                        break;

                    case 2:
                        if (vetorFuncionario[0] == null)
                        {
                            System.out.println("--É necessário preencher Funcionário primeiro.\n");
                            break;
                        }
                        else
                        {
                            System.out.println("\nPesquisando Funcionário pelo Nome");
                            manifun.pesquisaFuncionario(vetorFuncionario);
                            break;
                        }

                    case 3:
                        if (vetorFuncionario[0] == null)
                        {
                            System.out.println("--É necessário preencher Funcionário primeiro.\n");
                            break;
                        }
                        else
                        {
                            System.out.println("\nBonificando Salário dos Funcionários com 10% para os que recebem menos de 1.000,00");
                            manifun.bonificaFuncionario(vetorFuncionario);
                            break;
                        }

                    case 4:
                        if (vetorFuncionario[0] == null)
                        {
                            System.out.println("--É necessário preencher Funcionário primeiro.\n");
                            break;
                        }
                        else
                        {
                            System.out.println("\nListando todos os Funcionários Cadastrados");
                            manifun.imprimiFuncionario(vetorFuncionario);
                            break;
                        }

                    case 5:
                        System.out.println("\nMuito Obrigado por Utilizar nosso Programa! :)");
                        System.out.println("Desenvolvido por: Bruno Rodrigues Souza - Matrícula 20192101063");
                        controle = 0;
                        break;

                    default:
                        System.out.println("--O valor informado não estão presente no menu!\n");
                }
            }
            while (controle == 1);

        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }
    }
}
/*
* Questão Extra - Fazer um programa que exiba um pequeno menu com opções de chamada para cada um dos métodos
* contidos na classe criada como solução dos exercícios 5 ao 8. Em resumo, uma opção para chamar o método
* criaVetFuncionario_4(), uma opção para chamar o método compararFuncionario(), uma opção para chamar o método aumenarSalario(),
* uma opção para chamar o método listarVetor() e uma opção para finalizar.
 */
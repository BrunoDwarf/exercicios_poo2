/*
 * Classname             (Main)
 *
 * Date                  (22/09/2020 - 20:03)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 6)
 */
import java.util.*;

public class Main {
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String args[]) throws vetorEmpregadoVazioException {
        ManipulaEmpregado manifun = new ManipulaEmpregado();

        int opcao_menu, controle = 1, matricula;
        double porcentagem = 0;
        
        try
        {
            do
            {
                System.out.println("##Menu de Ações##");
                System.out.println("1 - Criar Empregados");
                System.out.println("2 - Bonificar Salário dos Empregados");
                System.out.println("3 - Localizar Empregado Cadastrado");
                System.out.println("4 - Listar todos os Empregados Cadastrados");
                System.out.println("5 - Sair");

                System.out.println("\nInforme o número da opção escolhida: ");
                opcao_menu = ler.nextInt();
                ler.nextLine();

                switch (opcao_menu)
                {
                    case 1:
                        System.out.println("\nCriando Empregados");
                        manifun.criaEmpregado();
                        break;

                    case 2:
                        System.out.println("\nBonificando Salário dos Empregados");
                        System.out.println("\nInforme o valor, em porcentagem, da bonificação: ");
                        porcentagem = ler.nextInt();

                        manifun.aumentaSalarioEmpregado(porcentagem);
                        break;


                    case 3:
                        System.out.println("\nLocalizando Empregado Cadastrado");
                        System.out.println("\nCódigo da Matrícula do Empregado Cadastrado: ");
                        matricula = ler.nextInt();

                        manifun.localizaEmpregado(matricula);
                        break;

                    case 4:
                        System.out.println("\nListando os Empregados Cadastrados");
                        manifun.listaEmpregado();
                        break;

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
        catch (vetorEmpregadoVazioException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
/*
* Questão 6 - Faça um programa que exiba um menu com as seguintes opções:
* 1 – Criar Vetor de Empregados
* 2 – Aumentar Empregados
* 3 – Listar Empregados
* 4 – Localizar Empregado
* 5 - Sair
 */

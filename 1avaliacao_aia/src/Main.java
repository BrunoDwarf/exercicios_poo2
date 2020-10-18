/*
 * Classname             (Main)
 *
 * Date                  (17/10/2020 - 16:12)
 *
 * Author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Atividade Individual Avaliativa)
 */
import java.util.*;
import template.*;
import vendedores.*;

public class Main {
    public static void main(String args[]) throws vetorVendedorVazioException {
        Scanner ler = new Scanner(System.in);

        String nome;
        int opcao_menu, controle = 1, matricula, i, s, opcao;
        double vendas, comissao, ajuda_custo, salario, hora_extra, pagamento;

        Vendedor vetorVendedores[] = null;
        Vendedor vendedorLocalizar = null;

        System.out.println("Bem Vindo a Atividade Individual Avaliativa");

        try
        {
            do {
                System.out.println("\n##Menu de Ações##");
                System.out.println("1 - Criar e Cadastrar Vendedores");
                System.out.println("2 - Listar Todos os Vendedores Cadastrados");
                System.out.println("3 - Localizar Vendedor Cadastrado");
                System.out.println("4 - Sair");

                System.out.println("\nInforme o número da opção escolhida: ");
                opcao_menu = ler.nextInt();
                ler.nextLine();

                switch (opcao_menu) {
                    case 1:
                        System.out.println("\nCriando e Cadastrando os Vendedores");
                        vetorVendedores = new Vendedor[10];

                        for (i = 0; i < 10; i++)
                        {
                            s = i + 1;

                            if (i < 5)
                            {
                                vetorVendedores[i] = new VendedorExterno();

                                System.out.println("##Vendedor " + s + "##");
                                System.out.println("Nome: ");
                                nome = ler.nextLine();
                                vetorVendedores[i].setNome(nome);
                                System.out.println("Quantidade de Vendas: ");
                                vendas = ler.nextDouble();
                                vetorVendedores[i].setVendas(vendas);
                                System.out.println("Porcentagem da Comissão: ");
                                comissao = ler.nextDouble();
                                vetorVendedores[i].setComissao(comissao);
                                System.out.println("Tipo de Vendedor: Externo");
                                System.out.println("Valor da Ajuda de Custo: ");
                                ajuda_custo = ler.nextDouble();
                                ((VendedorExterno) vetorVendedores[i]).setAjudaCusto(ajuda_custo);
                                ler.nextLine();

                                System.out.println("\n");
                            }
                            else if ((i > 4) && (i < 10))
                            {
                                vetorVendedores[i] = new VendedorLoja();

                                System.out.println("##Vendedor " + s + "##");
                                System.out.println("Nome: ");
                                nome = ler.nextLine();
                                vetorVendedores[i].setNome(nome);
                                System.out.println("Quantidade de Vendas: ");
                                vendas = ler.nextDouble();
                                vetorVendedores[i].setVendas(vendas);
                                System.out.println("Porcentagem da Comissão: ");
                                comissao = ler.nextDouble();
                                vetorVendedores[i].setComissao(comissao);
                                System.out.println("Tipo de Vendedor: Lojista");
                                System.out.println("Salário: ");
                                salario = ler.nextDouble();
                                ((VendedorLoja) vetorVendedores[i]).setSalario(salario);
                                System.out.println("Quantidade de Horas Extra: ");
                                hora_extra = ler.nextDouble();
                                ((VendedorLoja) vetorVendedores[i]).setHoraExtra(hora_extra);
                                ler.nextLine();

                                System.out.println("\n");
                            }
                        }

                        System.out.println("Vendedores cadastrados com sucesso!");
                        break;

                    case 2:
                        if (vetorVendedores == null)
                        {
                            throw new vetorVendedorVazioException("--Antes de listar todos os vendedores cadastrados, é preciso criar e cadastrar os vendedores na opção 1 do Menu de Ações!");
                        }
                        else
                        {
                            System.out.println("\nListando todos os Vendedores Cadastrados");

                            ManipulaVendedor maniVen = new ManipulaVendedor();
                            maniVen.listarVendedores(vetorVendedores);
                        }
                        break;

                    case 3:
                        if (vetorVendedores == null)
                        {
                            throw new vetorVendedorVazioException("--Antes de localizar um vendedor cadastrado, é preciso criar e cadastrar os vendedores na opção 1 do Menu de Ações!");
                        }
                        else
                        {
                            System.out.println("\nLocalizando Vendedor Cadastrado");
                            System.out.println("Para localizar um vendedor, primeiro é preciso definir seu tipo e suas informações.");
                            System.out.println("\n##Menu de Ações##");
                            System.out.println("1 - Vendedor Externo");
                            System.out.println("2 - Vendedor Lojista");

                            System.out.println("\nInforme o número da opção escolhida: ");
                            opcao = ler.nextInt();
                            ler.nextLine();

                            ManipulaVendedor maniVen = new ManipulaVendedor();

                            switch (opcao)
                            {
                                case 1:
                                    vendedorLocalizar = new VendedorExterno();

                                    System.out.println("\n##Vendedor Externo##");
                                    System.out.println("Nome: ");
                                    nome = ler.nextLine();
                                    vendedorLocalizar.setNome(nome);
                                    System.out.println("Quantidade de Vendas: ");
                                    vendas = ler.nextDouble();
                                    vendedorLocalizar.setVendas(vendas);
                                    System.out.println("Porcentagem da Comissão: ");
                                    comissao = ler.nextDouble();
                                    vendedorLocalizar.setComissao(comissao);
                                    System.out.println("Tipo de Vendedor: Externo");
                                    System.out.println("Valor da Ajuda de Custo: ");
                                    ajuda_custo = ler.nextDouble();
                                    ((VendedorExterno) vendedorLocalizar).setAjudaCusto(ajuda_custo);

                                    maniVen.localizarVendedor(vetorVendedores, vendedorLocalizar);

                                    break;

                                case 2:
                                    vendedorLocalizar = new VendedorLoja();

                                    System.out.println("\n##Vendedor Lojista##");
                                    System.out.println("Nome: ");
                                    nome = ler.nextLine();
                                    vendedorLocalizar.setNome(nome);
                                    System.out.println("Quantidade de Vendas: ");
                                    vendas = ler.nextDouble();
                                    vendedorLocalizar.setVendas(vendas);
                                    System.out.println("Porcentagem da Comissão: ");
                                    comissao = ler.nextDouble();
                                    vendedorLocalizar.setComissao(comissao);
                                    System.out.println("Tipo de Vendedor: Lojista");
                                    System.out.println("Salário: ");
                                    salario = ler.nextDouble();
                                    ((VendedorLoja) vendedorLocalizar).setSalario(salario);
                                    System.out.println("Quantidade de Horas Extra: ");
                                    hora_extra = ler.nextDouble();
                                    ((VendedorLoja) vendedorLocalizar).setHoraExtra(hora_extra);

                                    maniVen.localizarVendedor(vetorVendedores, vendedorLocalizar);

                                    break;

                                default:
                                    System.out.println("--O valor informado não está presente no menu!\n");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\nMuito Obrigado por Utilizar meu Programa! :)");
                        System.out.println("O Sistema utilizado é referente a Atividade Individual Avaliativa da 1° Avaliação de Programação Orientada a Objetos II");
                        System.out.println("Desenvolvido por: Bruno Rodrigues Souza - Matrícula 20192101063");
                        controle = 0;
                        break;

                    default:
                        System.out.println("--O valor informado não está presente no menu!\n");
                }
            }
            while (controle == 1);
        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }
        catch (vetorVendedorVazioException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/*
 * 2° Questão (4,0) - Faça as tarefas abaixo:
 * [a (1,0)] - Crie uma classe que contenha um método listarVendedores que receba um array com objetos do tipo
 * VendedorExterno e VendedorLoja e liste todas as propriedades dos objetos do array, incluindo o pagamento, ordenados
 * pelo valor do pagamento.
 *
 * [b (1,0)] - Crie um método localizarVendedor, que receba um Vendedor e verifique se este se encontra no array,
 * indicando a posição caso encontre ou imprimindo uma mensagem caso ele não esteja no array.
 *
 * [c (1,0)] - Crie um método main para criar dez vendedores sendo a metade VendedorExterno e metade VendedorLoja e
 * execute o método para listar todos os vendedores em ordem de pagamento.
 *
 * [d (1,0)] - Crie também nesse método main um Vendedor, podendo ser VendedorLoja ou VendedorExterno de acordo com o
 * usuário, e verifique se este se encontra no array chamando o método localizarVendedor. O critério de igualdade é o
 * pagamento.
 */
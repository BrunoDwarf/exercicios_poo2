/*
 * Classname             (ManipulaEmpregado)
 *
 * Date                  (22/09/2020 - 19:56)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 5 - Exercício 5)
 */
import java.util.*;
import java.time.LocalDate;

public class ManipulaEmpregado {
    private Empregado vetorEmpregado[] = null;

    public void criaEmpregado() {
        int i, s;
        vetorEmpregado = new Empregado[6];
        try
        {
            for (i = 0; i < 6; i++)
            {
                if (i < 3)
                {
                    s = i + 1;
                    vetorEmpregado[i] = new Empregado();

                    System.out.println("##Empregado " + s + "##");
                    System.out.println("Nome: ");
                    vetorEmpregado[i].setNome(Main.ler.nextLine());
                    System.out.println("Função: ");
                    vetorEmpregado[i].setFuncao(Main.ler.nextLine());
                    System.out.println("Salário: ");
                    vetorEmpregado[i].setSalario(Main.ler.nextDouble());
                    vetorEmpregado[i].setDataAdmissao(LocalDate.now());
                    System.out.println("Data de Admissão: " + LocalDate.now());
                    Main.ler.nextLine();
                    System.out.println("\n");
                }
                else
                {
                    s = i + 1;
                    vetorEmpregado[i] = new Gerente();

                    System.out.println("##Empregado Gerente" + s + "##");
                    System.out.println("Nome: ");
                    vetorEmpregado[i].setNome(Main.ler.nextLine());
                    System.out.println("Função: ");
                    vetorEmpregado[i].setFuncao(Main.ler.nextLine());
                    System.out.println("Salário: ");
                    vetorEmpregado[i].setSalario(Main.ler.nextDouble());
                    Main.ler.nextLine();
                    vetorEmpregado[i].setDataAdmissao(LocalDate.now());
                    System.out.println("Data de Admissão: " + LocalDate.now());
                    Main.ler.nextLine();

                    System.out.println("\n");
                    Empregado empregadoSecretaria = new Empregado();
                    System.out.println("##Empregado Secretária referente ao Gerente" + s + "##");
                    System.out.println("Nome: ");
                    empregadoSecretaria.setNome(Main.ler.nextLine());
                    System.out.println("Função: ");
                    empregadoSecretaria.setFuncao(Main.ler.nextLine());
                    System.out.println("Salário: ");
                    empregadoSecretaria.setSalario(Main.ler.nextDouble());
                    Main.ler.nextLine();
                    empregadoSecretaria.setDataAdmissao(LocalDate.now());
                    System.out.println("Data de Admissão: " + LocalDate.now());
                    Main.ler.nextLine();

                    System.out.println("\n");
                    System.out.println("##Complementando criação do Gerente##");
                    ((Gerente) vetorEmpregado[i]).setSecretaria(empregadoSecretaria);
                    System.out.print("\nAutomóvel: ");
                    ((Gerente) vetorEmpregado[i]).setAutomovel(Main.ler.nextLine());
                    Main.ler.nextLine();

                    System.out.println("\n");
                    Main.ler.nextLine();
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("--O valor informado não corresponde ao solicitado!\n");
        }
    }

    public void listaEmpregado() {
        int i;

        try
        {
            if(vetorEmpregado == null)
            {
                throw new vetorEmpregadoVazioException("--Antes de listar os empregados cadastrados, é preciso cadastrar empregados!");
            }
            else
            {
                for(i = 0; i < 6; i++)
                {
                    System.out.println(vetorEmpregado[i].toString());
                }
            }
        }
        catch (vetorEmpregadoVazioException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void aumentaSalarioEmpregado(double porcentagem) throws vetorEmpregadoVazioException {
        int i;

        if(vetorEmpregado == null)
        {
            throw new vetorEmpregadoVazioException("--Antes de aumentar o salário dos empregados cadastrados, é preciso cadastrar empregados!");
        }
        else
        {
            for(i = 0; i < 6; i++)
            {
                vetorEmpregado[i].aumentaSalario(porcentagem);
            }
        }
    }

    public void localizaEmpregado(int matricula) throws vetorEmpregadoVazioException {
        int i, s = 0, controle = 0;

        if(vetorEmpregado == null)
        {
            throw new vetorEmpregadoVazioException("--Antes de pesquisar um empregado, é preciso cadastrar empregados!");
        }
        else
        {
            for(i = 0; i < 6; i++)
            {
                s = i + 1;
                if(vetorEmpregado[i].getMatricula() == matricula)
                {
                    controle = 1;
                    break;
                }
            }

            if(controle == 0)
            {
                System.out.println("--O funcionário informado não existe.\n");
            }
            else
            {
                System.out.println("--O funcionário informado existe e é o " + s + "° funcionário.\n");
            }
        }
    }
}
/*
* Questão 5 - Crie uma classe chamada ManipulaEmpregado que tenha os seguintes métodos:
* 1) criarEmpregados que cria um vetor com 6 Empregados, sendo 3 deles Gerentes, com seus
* respectivos atributos a partir de dados fornecidos por usuários;
* 2) listarEmpregados que liste os Empregados no array com seus dados;
* 3) aumentarEmpregados que receba um valor percentual e aumente o salário de todos os empregados;
* 4) localizarEmpregado que receba a matricula de um empregado como argumento e localize-o retornando
* o nome caso encontre ou a string “Empregado não localizado” caso contrário.
*/

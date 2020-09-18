/*
 * Classname             (Main)
 *
 * Date                  (17/09/2020 - 21:49)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício 5, 6, 7, 8)
 */
import java.util.*;

public class Main {
    static Scanner ler = new Scanner(System.in);

    public static void main(String args[]) {
        Funcionario vetorFuncionario[] = new Funcionario[10];

        System.out.println("Preenchendo Funcionário");
        preencheFuncionario(vetorFuncionario);

        System.out.println("Pesquisando Funcionário");
        pesquisaFuncionario(vetorFuncionario);

        System.out.println("Bonificação de 5% no Salário dos Funcionários que recebem menos de 1.000,00");
        bonificaFuncionario(vetorFuncionario);

        System.out.println("Imprimindo todos os Funcionários cadastrados");
        imprimiFuncionario(vetorFuncionario);
    }

    public static void preencheFuncionario(Funcionario[] vetorFuncionario) {
        String nome, funcao;
        double salario;
        int i, s;
        try
        {
            for (i = 0; i < 10; i++)
            {
                s = i + 1;
                System.out.println("--Funcionário " + s);
                System.out.println("Nome: ");
                nome = ler.nextLine();
                System.out.println("Função: ");
                funcao = ler.nextLine();
                System.out.println("Salário: ");
                salario = ler.nextDouble();
                vetorFuncionario[i] = new Funcionario(nome, funcao, salario);
                System.out.println("\n");
                ler.nextLine();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("O valor informado não corresponde ao solicitado!");
        }
    }

    public static void pesquisaFuncionario(Funcionario[] vetorFuncionario) {
        Funcionario funcionario_pesquisa;

        String nome, funcao;
        double salario;
        int i;

        try
        {
            System.out.println("Dados do Funcionário para Pesquisar");
            System.out.println("Nome: ");
            nome = ler.nextLine();
            System.out.println("Função: ");
            funcao = ler.nextLine();
            System.out.println("Salário: ");
            salario = ler.nextDouble();
            funcionario_pesquisa = new Funcionario(nome, funcao, salario);

            for (i = 0; i < 10; i++)
            {
                if(vetorFuncionario[i].getNome().equals(funcionario_pesquisa.getNome()))
                {
                    System.out.println("O funcionário informado já existe no vetor e se encontra na posição " + i);
                }
                else
                {
                    System.out.println("O funcionário informado não existe. --Código -1");
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("O valor informado não corresponde ao solicitado!");
        }
    }

    public static void bonificaFuncionario(Funcionario[] vetorFuncionario) {
        double salario, salario_bonificado;
        int i;

        for (i = 0; i < 10; i++)
        {
            salario = vetorFuncionario[i].getSalario();
            if (salario < 1000)
            {
                salario_bonificado = salario + ((salario * 10) / 100);

                vetorFuncionario[i].setSalario(salario_bonificado);
            }
        }
    }

    public static void imprimiFuncionario(Funcionario[] vetorFuncionario)
    {
        int i, s;

        for (i = 0; i < 10; i++)
        {
            s = i + 1;
            System.out.println("--Funcionário " + s);
            System.out.println("Matrícula: " + vetorFuncionario[i].getMatricula());
            System.out.println("Nome: " + vetorFuncionario[i].getNome());
            System.out.println("Função: " + vetorFuncionario[i].getFuncao());
            System.out.println("Salário: " + vetorFuncionario[i].getSalario());
            System.out.println("\n");
        }
    }
}
/*
* Questão 5 - Crie uma classe que defina um vetor de 10 posições do tipo Funcionário
* (use a classe final Funcionário4 do Exercício 3 Usando Classes) e construa um método para
* carregar este vetor com dados para 10 Funcionários;
*
* Questão 6 - Crie um método na classe do exercício 5 acima que receba um Funcionário e
* verifique se o nome deste Funcionário fornecido se encontra entre os Funcionários do vetor,
* caso positivo informar a posição, caso contrário retornar -1.
*
* Questão 7 - Crie um método na classe do exercício 5 que adicione 10% aos salários de todos
* os funcionários com salário inferior a 1.000,00.
*
* Questão 8 - Crie um método na classe do exercício 5 para varrer o vetor e imprimir as propriedades
* mat, nome, função e salários de todos os Funcionários.
*/
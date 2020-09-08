/*
 * Classname             (Main)
 *
 * Date                  (08/09/2020 - 18:55)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 7)
 */
import java.util.*;

public class main {
    public static void main (String args[]) {
        String nome_auxiliar, funcao_auxiliar;
        double salario_auxiliar;
        Scanner ler = new Scanner(System.in);

        Funcionario fun1, fun2, fun3;

        try {
            System.out.println("Funcionário 1");
            System.out.println("Nome: ");
            nome_auxiliar = ler.nextLine();
            System.out.println("Função: ");
            funcao_auxiliar = ler.nextLine();
            System.out.println("Salário: ");
            salario_auxiliar = ler.nextDouble();
            fun1 = new Funcionario(nome_auxiliar, funcao_auxiliar, salario_auxiliar);

            ler.nextLine(); //fixar bug do readLine();
            System.out.println("Funcionário 2");
            System.out.println("Nome: ");
            nome_auxiliar = ler.nextLine();
            System.out.println("Função: ");
            funcao_auxiliar = ler.nextLine();
            System.out.println("Salário: ");
            salario_auxiliar = ler.nextDouble();
            fun2 = new Funcionario(nome_auxiliar, funcao_auxiliar, salario_auxiliar);

            ler.nextLine(); //fixar bug do readLine();
            System.out.println("Funcionário 3");
            System.out.println("Nome: ");
            nome_auxiliar = ler.nextLine();
            System.out.println("Função: ");
            funcao_auxiliar = ler.nextLine();
            System.out.println("Salário: ");
            salario_auxiliar = ler.nextDouble();
            fun3 = new Funcionario(nome_auxiliar, funcao_auxiliar, salario_auxiliar);

            System.out.println("Imprimindo Informações");
            System.out.println("Funcionário 1:");
            System.out.println("Matrícula: " + fun1.getMatricula() + "/ Nome: " + fun1.getNome() + "/ Função: " + fun1.getFuncao() + "/ Salário: " + fun1.getSalario());
            System.out.println("Funcionário 2:");
            System.out.println("Matrícula: " + fun2.getMatricula() + "/ Nome: " + fun2.getNome() + "/ Função: " + fun2.getFuncao() + "/ Salário: " + fun2.getSalario());
            System.out.println("Funcionário 3:");
            System.out.println("Matrícula: " + fun3.getMatricula() + "/ Nome: " + fun3.getNome() + "/ Função: " + fun3.getFuncao() + "/ Salário: " + fun3.getSalario());
        }
        catch(InputMismatchException e) {
            System.out.println("O valor informado não corresponde ao esperado pelo software!!");
        }
    }
}
/*
 * Questão 7 - Faça um programa para criar 3 objetos do tipo Funcionário e solicitar ao usuário que entre
 * com dados para os três funcionários criados. Ao final imprima os valores fornecidos para estes funcionários.
 *
 * Questão 10 - Altere o exercício 7 para que utilize os métodos criados para acesso as propriedades ao invés
 * de acessá-las diretamente.
 *
 * Questão 13 - Altere a classe criada no exercício 11 para que utilize este novo método construtor.
 */
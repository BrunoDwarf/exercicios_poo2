/*
 * Classname             (Main)
 *
 * Date                  (18/09/2020 - 01:33)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício 1)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int quantidade_aluno, i, s,auxiliar;
        double soma_notas = 0, media_turma;

        System.out.println("Informe a quantidade de alunos: ");
        quantidade_aluno = ler.nextInt();

        double vetor_nota[] = new double[quantidade_aluno];

        try
        {
            auxiliar = quantidade_aluno - 1;

            System.out.println("Preenchendo Notas");
            for (i = 0; i < auxiliar; i++)
            {
                s = i + 1;
                System.out.println("--Nota " + s + ":");
                vetor_nota[i] = ler.nextDouble();
                System.out.println("\n");
            }

            for (i = 0; i <auxiliar; i++)
            {
                soma_notas = soma_notas + vetor_nota[i];
            }

            media_turma = soma_notas / quantidade_aluno;

            System.out.println("Listando Notas e Média da Turma");
            for (i = 0; i < auxiliar; i++)
            {
                s = i + 1;
                System.out.println("-- Nota" + s + ": " + vetor_nota[i] + "/ Media da Turma: " + media_turma);
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("O valor informado não corresponde ao solicitado!");
        }

    }
}
/*
* Questão 1 - Faça um programa em java para ler N notas e ao final mostrar cada nota seguida da média da turma;
*/

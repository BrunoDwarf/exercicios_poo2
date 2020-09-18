/*
 * Classname             (Main)
 *
 * Date                  (11/09/2020 - 15:35)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício 4)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int quantidade_numero, i, z, auxiliar_vetor, auxiliar_ordena, ordena_numero;

        try
        {
            System.out.println("Qual a quantidade de números inteiros que será informado: ");
            quantidade_numero = ler.nextInt();

            //criando vetor com a quantidade de posições que o usuário deseja
            int vetorNumero[] = new int[quantidade_numero];

            //preenchendo vetor
            System.out.println("\nInformando números inteiros:");
            for (i = 0; i < quantidade_numero; i++) {
                z = i + 1;

                System.out.println("Digite o " + z + "° número: ");
                vetorNumero[i] = ler.nextInt();
            }

            //ordenando números do vetor
            auxiliar_ordena = quantidade_numero - 1;
            while (auxiliar_ordena > 0)
            {
                ordena_numero = 0;
                for (i = 0; i < auxiliar_ordena; i++) {
                    if (vetorNumero[i] > vetorNumero[i+1])
                    {
                        auxiliar_vetor = vetorNumero[i];
                        vetorNumero[i] = vetorNumero[i+1];
                        vetorNumero[i+1] = auxiliar_vetor;

                        ordena_numero = i;
                    }
                }
                auxiliar_ordena = ordena_numero;
            }

            System.out.println("Listando números informados ordenados: ");
            for (i = 0; i < quantidade_numero; i++) {
                System.out.println(vetorNumero[i]);
            }

        }
        catch(InputMismatchException e)
        {
            System.out.println("Valor digitado não corresponde ao solicitado!");
        }
    }
}
/*
* Questão 4 - Faça um programa que ordene um conjunto de números inteiros fornecidos pelo usuário por
* linha de comando e os exiba de modo ordenado um por linha.
*/

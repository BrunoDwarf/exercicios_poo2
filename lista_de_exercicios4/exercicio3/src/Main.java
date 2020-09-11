/*
 * Classname             (Main)
 *
 * Date                  (11/09/2020 - 15:35)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício 3)
 */
import java.util.*;

public class Main {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);

        int MatrizNumero[][] = new int[5][5];
        int i, j, s, v;

        try
        {
            for (i = 0; i < 5; i++) {
                s = i + 1;

                for (j = 0; j < 5; j++) {
                    v = j + 1;

                    System.out.println("Digite o valor do número [" + s + "][" + v + "]: ");
                    MatrizNumero[i][j] = ler.nextInt();
                }
            }

            System.out.println("\nLista dos Números da Diagonal da Matriz");
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    if (i == j) {
                        System.out.println(MatrizNumero[i][j]);
                    }
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor informado não corresponde ao solicitado!");
        }
    }
}

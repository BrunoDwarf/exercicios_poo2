/*
 * Classname             (Main)
 *
 * Date                  (11/09/2020 - 14:56)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 4 - Exercício 2)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int VetorNumero[] = new int[20];
        int i, s, maior1, maior2;

        try
        {
            System.out.println("Digite o valor do 1° número: ");
            VetorNumero[0] = ler.nextInt();

            System.out.println("Digite o valor do 2° número: ");
            VetorNumero[1] = ler.nextInt();

            if (VetorNumero[0] > VetorNumero[1]) {
                maior1 = VetorNumero[0];
                maior2 = VetorNumero[1];
            }
            else {
                maior1 = VetorNumero[1];
                maior2 = VetorNumero[0];
            }

            for (i = 2; i < 20; i++) {
                s = i + 1;
                System.out.println("Digite o valor do " + s + "° numero: ");
                VetorNumero[i] = ler.nextInt();

                if (VetorNumero[i] > maior1) {
                    maior2 = maior1;
                    maior1 = VetorNumero[i];
                }
                else {
                    if (VetorNumero[i] > maior2) {
                        maior2 = VetorNumero[i];
                    }
                }
            }

            System.out.println("\nLista dos Números:");
            for (i = 0; i < 20; i++) {
                System.out.println(VetorNumero[i]);
            }

            System.out.println("\nLista dos Inversa dos Números:");
            for (i = 19; i>= 0; i--) {
                System.out.println(VetorNumero[i]);
            }

            System.out.println("\nMaior Número Informado: " + maior1);
            System.out.println("2° Maior Número Informado: " + maior2);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor digitado não corresponde ao solicitado!");
        }

    }
}

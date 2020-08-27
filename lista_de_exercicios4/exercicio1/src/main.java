/*
 * Classname             (Main)
 *
 * Date                  (27/08/2020 - 16:11)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Lista de Exercícios 4 - Exercício 1)
 */

import java.util.*;

public class main {
    public static void main(String[] args) {
        int quantidadeNota, controle = 0, i;
        Double valorNota;
        double mediaNota;

        Nota umNota = null;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas a serem lidas: ");
        quantidadeNota = in.nextInt();

        ArrayList<Nota> lista_de_notas = new ArrayList(quantidadeNota);

        while (controle <= quantidadeNota) {
            System.out.println("\nDigite o valor da nota: ");
            valorNota = in.nextDouble();

            if ((valorNota >= 0) & (valorNota <= 10)) {
                umNota = new Nota(valorNota);
                lista_de_notas.add(umNota);

                System.out.println("\nNota cadastrada com sucesso.");

                controle ++;
            }
            else {
                System.out.println("Nota inválida. Tente um valor entre 0 e 10.");
                break;
            }
        }

        System.out.println("\nListagem de Notas");

        for(i = 0; i <= quantidadeNota; i++) {
            System.out.println("Nota " + (i + 1) + ":" + lista_de_notas.get(i));
            mediaNota = umNota.calcularMedia(umNota.getNota());
        }

        System.out.println("\n Média das Notas");
        mediaNota = mediaNota / quantidadeNota;
        System.out.println("Média das Notas: " + mediaNota);

    }
}

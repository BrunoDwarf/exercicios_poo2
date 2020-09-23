/*
 * Classname             (Main)
 *
 * Date                  (23/09/2020 - 17:08)
 *
 * author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Fórum Temático Avaliativo)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        CargosSalarios cargo_salario = new CargosSalarios();
        String funcao = "Diretor"; //String funcao = new String("");
        String salario = null;

        System.out.println("Bem-Vindo ao Programa Teste da 1° Avaliação - Fórum Temático Avaliativo");
        //System.out.println("\nInforme sua Função: ");
        //funcao = ler.nextLine();

        salario = cargo_salario.buscaSalario(funcao);

        System.out.println("De acordo com sua Função, o valor referente ao seu Salário é: " + salario);
    }
}


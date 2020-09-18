/*
 * Classname             (Main)
 *
 * Date                  (18/09/2020 - 17:24)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Exercícios de Exception)
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int dividendo = 0, divisor = 0, quociente = 0;

        try
        {
            System.out.println("##Preenchendo Dados##");
            System.out.println("--Qual o valor do Dividendo: ");
            dividendo = ler.nextInt();

            System.out.println("--Qual o valor do Divisor: ");
            divisor = ler.nextInt();

            quociente = LancaException.retornaQuociente(dividendo, divisor);

            System.out.println("##Retornando Dados##");
            System.out.println("O valor do Quociente é: " + quociente);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Valor digitado não numérico!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
* Questão sobre Exception -  Trata-se de uma aplicação simples que vai pedir para que entrem com o dividendo
* e o divisor, como inteiros, e então irá chamar um método estático denominado retornaQuociente que pertence a
* uma classe chamada LancaException.  O retorno da chamada a este método deve ser atribuído a uma variável
* quociente que deverá ser exibida em seguida. O método retornaQuociente da classe LancaException recebe os
* dois argumentos (dividendo e divisor) e testa se o divisor é igual a zero, caso positivo  lança uma exceção
* do tipo Exception com a mensagem "O divisor não pode ser igual a zero!" e não trata a exceção gerada no método.
* Caso negativo retorna o valor do quociente. Na classe principal devem ser tratadas as possíveis falhas de
* entrada de dados com o método nextInt(). Este gera uma exception do tipo InputMismatchException que deve
* ser capturada, caso ocorra, exibindo uma mensagem "Valor digitado não Numérico!".
*/
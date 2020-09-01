/*
 * Classname             (StaticTeste)
 *
 * Date                  (01/09/2020 - 16:27)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 2)
 */

public class StaticTeste {
    private static int x = 100;
    private int y = 101;

    public static void main (String args[]) {
        StaticTeste st1 = new StaticTeste();
        st1.x++;
        st1.y++;

        StaticTeste st2 = new StaticTeste();
        st2.x++;
        st2.y++;

        StaticTeste.x++;

        System.out.println("st1.x = " + st1.x + "st1.y = " + st1.y);
    }
}

/*
* Questão 2 - Quais os valores finais de st1.x e st1.y no programa abaixo?
* Resposta 2 - Os valores finais de st1.x e st1.y, respectivamente, são: st1.x = 103 e 102.
* Pois, por mais que st2 seja um novo objeto, ele modifica diretamente as variaveis ja modificadas
* por st1, visto que interagem com a mesma classe.
*/

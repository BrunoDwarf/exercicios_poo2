/*
 * Classname             (StaticTeste)
 *
 * Date                  (01/09/2020 - 17:27)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 4)
 */
public class Q6 {
    public static void main(String args[]) {
        Holder h = new Holder();
        h.held = 100;
        h.bump(h);

        System.out.println(h.held);
    }
}
    
class Holder {
    public int held;
    public void bump(Holder theHolder) {
        theHolder.held++;
    }
}

/*
* Questão 3 - Qual o valor que será printado na linha 7?
* Resposta - O valor printado será 101.
*
*/

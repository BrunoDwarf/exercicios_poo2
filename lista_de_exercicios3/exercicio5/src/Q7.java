/*
 * Classname             (Q7)
 *
 * Date                  (08/09/2020 - 18:25)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 5)
 */

public class Q7 {
    public static void main(String args[]) {
        double d = 12.3;

        Decrementer dec = new Decrementer();
        dec.decrement(d);

        System.out.println(d);
    }
}

class Decrementer {
    public void decrement(double decMe)
    {
        decMe = decMe - 1.0;
    }
}

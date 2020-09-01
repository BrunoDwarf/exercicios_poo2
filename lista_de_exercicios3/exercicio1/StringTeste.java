/*
 * Classname             (StringTeste)
 *
 * Date                  (01/09/2020 - 15:48)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Lista de Exercícios 3 - Exercício 1)
 */

public class StringTeste {
    public static void main(String args[])
    {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        String s5 = s1.intern();
        String s6 = s2.intern();
        if (s1 == s2) System.out.println("linha 1");
        if (s3 == s4) System.out.println("linha 2");
        if (s5 == s6) System.out.println("linha 3");
        if (s5 == s4) System.out.println("linha 4");
        if (s5 == s2) System.out.println("linha 5");
    }
}

/*
* Questão 1 - Quais linhas seriam produzidas na saída do programa. (O método intern() é um método
* que devolve o string contido em um String.)
* Resposta - As linhas que são produzidas na saída desse programa são: linha 2/linha3/linha 4
* Pois new String cria um novo objeto, logo s1 e s2 não são iguais, mesmo que seus valores armazenados
* sejam. Ja s3 e s4 são iguais pois não são criados novos objetos. s5 e s2 não são iguais pois s5 referencia
* o valor interno de s1 objeto diferente de s2.
* */
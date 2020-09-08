/*
 * Classname             (CargosSalarios)
 *
 * Date                  (08/09/2020 - 20:04)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Lista de Exercícios 3 - Exercício 15)
 */
public class CargosSalarios {
    public static double buscaSalario(String funcao)
    {
        if (funcao.equals("diretor"))
        {
            return 5000.00;
        }
        else if (funcao.equals("vendedor"))
        {
            return 3000.00;
        }
        else
        {
            return 1000.00;
        }
    }
}
/*
 * Questão 15 - Crie uma classe chamada CargosSalarios que possua um método de classe chamado buscaSalario
 * que receba como parâmetro a função do funcionário e retorne o salário correspondente. Este método deverá
 * ser chamado pelo construtor do exercício 14 ao invés de se passar o salário igual a zero. Utilize a tabela
 * de funções a seguir como exemplo.
 * Função: diretor / Salário: 5000.00
 * Função: vendedor / Salário: 3000.00
 * Função: secretária / Salário: 1000.00
 *
 */

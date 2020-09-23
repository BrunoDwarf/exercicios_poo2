/*
 * Classname             (CargosSalarios)
 *
 * Date                  (23/09/2020 - 17:08)
 *
 * author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Fórum Temático Avaliativo)
 */

public class CargosSalarios {
    public static String buscaSalario(String funcao) {
        String salario = "";
        //T1 String cargoDiretor = new String("Diretor");
        if(funcao == "Diretor") //T2 if(funcao == cargoDiretor) {
        {
            salario = "5.000,00";
        }
        else
        {
            if(funcao == "Vendedor")
            {
                salario = "3.000,00";
            }
            else
            {
                if(funcao == "Secretaria")
                {
                    salario = "1.000,00";
                }
            }
        }
        return salario;
    }
}
/*
 * Questão Proposta para a Discussão - Avaliar o código abaixo enviado e responder as seguintes questões:
 * a) Funciona?
 * b) Essa comparação de Strings funciona? Em caso afirmativo diga qual o porquê?
 * c) Qual seria a alternativa para a comparação de Strings?
 * d) Caso fossem substituídos os trechos de código comentados como T1 e T2, pelos seguintes códigos respectivamente:
 * String cargoDiretor = new String("Diretor");  // T1
 * if (funcao == cargoDiretor) {  // T2
 * O que seria retornado caso a chamada fosse buscaSalario("Diretor");
 */
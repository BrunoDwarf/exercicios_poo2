/*
 * Classname             (ManipulaVendedor)
 *
 * Date                  (17/10/2020 - 17:51)
 *
 * author                (Bruno Rodrigues Souza - 20192101063)
 *
 * Copyright notice      (1° Avaliação - Atividade Individual Avaliativa)
 */
import java.util.*;
import template.*;
import vendedores.*;

public class ManipulaVendedor {

    public void listarVendedores(Vendedor vetorVendedores[])
    {
        int i, controle = 8, ordena = 0;
        Vendedor vendedorAuxiliar = null;

        while (controle > 0)
        {
            for (i = 0; i < controle; i++)
            {
                if (i < 5)
                {
                    vendedorAuxiliar = new VendedorExterno();

                    if (vetorVendedores[i].calcularPagamento() > vetorVendedores[i + 1].calcularPagamento()) {
                        vendedorAuxiliar = vetorVendedores[i];
                        vetorVendedores[i] = vetorVendedores[i + 1];
                        vetorVendedores[i + 1] = vendedorAuxiliar;
                    }

                    ordena = i;
                }
                else
                {
                    vendedorAuxiliar = new VendedorLoja();

                    if (vetorVendedores[i].calcularPagamento() > vetorVendedores[i + 1].calcularPagamento()) {
                        vendedorAuxiliar = vetorVendedores[i];
                        vetorVendedores[i] = vetorVendedores[i + 1];
                        vetorVendedores[i + 1] = vendedorAuxiliar;
                    }

                    ordena = i;
                }
            }

            controle = ordena;
        }

        for (i = 0; i < 10; i++)
        {
            if (i < 5)
            {
                System.out.println(vetorVendedores[i].toString());
            }
            else if (i > 4)
            {
                System.out.println(vetorVendedores[i].toString());
            }
        }
    }

    public void localizarVendedor(Vendedor vetorVendedores[], Vendedor vendedorLocalizar)
    {
        int i, cod = 0;

        if (vendedorLocalizar instanceof VendedorExterno)
        {
            for (i = 0; i < 5; i++)
            {
                if (vetorVendedores[i].equals(vendedorLocalizar))
                {
                    cod = 2;
                }
            }

            if (cod == 2)
            {
                System.out.println("--O Vendedor pesquisado foi localizado e se encontra na posição " + i + "do vetor.");
            }
            else
            {
                System.out.println("--O Vendedor pesquisado não foi localizado.");
            }

        }
        else if (vendedorLocalizar instanceof VendedorLoja)
        {
            for (i = 4; i < 10; i++)
            {
                if (vetorVendedores[i].equals(vendedorLocalizar))
                {
                    cod = 2;
                }
            }

            if (cod == 2)
            {
                System.out.println("--O Vendedor pesquisado foi localizado e se encontra na posição " + i + "do vetor.");
            }
            else
            {
                System.out.println("--O Vendedor pesquisado não foi localizado.");
            }
        }
    }

}
/*
 * 2° Questão (4,0) - Faça as tarefas abaixo:
 * [a (1,0)] - Crie uma classe que contenha um método listarVendedores que receba um array com objetos do tipo
 * VendedorExterno e VendedorLoja e liste todas as propriedades dos objetos do array, incluindo o pagamento, ordenados
 * pelo valor do pagamento.
 *
 * [b (1,0)] - Crie um método localizarVendedor, que receba um Vendedor e verifique se este se encontra no array,
 * indicando a posição caso encontre ou imprimindo uma mensagem caso ele não esteja no array.
 *
 * [c (1,0)] - Crie um método main para criar dez vendedores sendo a metade VendedorExterno e metade VendedorLoja e
 * execute o método para listar todos os vendedores em ordem de pagamento.
 *
 * [d (1,0)] - Crie também nesse método main um Vendedor, podendo ser VendedorLoja ou VendedorExterno de acordo com o
 * usuário, e verifique se este se encontra no array chamando o método localizarVendedor. O critério de igualdade é o
 * pagamento.
 */
/*
 * Classname             (Main)
 *
 * Date                  (18/09/2020 - 18:02)
 *
 * author                (Bruno Rodrigues Souza)
 *
 * Copyright notice      (Exercícios de Exception)
 */
import java.util.*;

public class LancaException {
    public static int retornaQuociente(int dividendo, int divisor) throws Exception {
        int quociente;

        if (divisor == 0)
        {
            throw new Exception("--O divisor não pode ser igual a zero!");
        }
        else
        {
            quociente = dividendo / divisor;
            return quociente;
        }
    }
}

/*
 * Classname             (PetController)
 *
 * Date                  (28/11/2020 - 17:08)
 *
 * author                (Bruno Rodrigues Souza - 20192101063 / Lucas Vitiello - 20181105255)
 *
 * Copyright notice      (2° Avaliação - Atividade Individual Avaliativa)
 */
package controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PetController {
    
    private static String origem = System.getProperty("user.dir") + "\\src\\controller\\BD.bin";
    
    public void preencherArquivoBinario(String content) {
        try {
            System.out.println(content);
            File fileOrigin = new File(this.origem);
            FileOutputStream stream = new FileOutputStream(this.origem);
            stream.write(content.getBytes());
            stream.close();
        } catch (Exception e) {
            System.out.println("Erro = " +  e);
        }
    }
    
    public String lerArquivoBinario() {
        try {
            File fileOrigin = new File(this.origem);
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileOrigin));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int x = 0;
            while ((x = in.read()) != -1) {
                baos.write(x);
            }
            String fileContent = new String(baos.toByteArray());
            baos.flush();
            baos.close();
            System.out.println("File Content: " + fileContent);
            return fileContent;
        } catch (Exception e) {
            return "Erro = " +  e;
        }
    }
}

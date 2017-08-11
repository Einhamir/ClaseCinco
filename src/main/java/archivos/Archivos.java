/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Java
 */
public class Archivos {
    
    public static void main(String[] args) throws IOException {
        File file = new File ("C:\\Users\\Java\\Documents\\Registro2.txt");
        
        if(!file.exists())
        {
            try{
                if( file.createNewFile())
                {
                    System.out.println("CONTINUA...");
                    
                      FileWriter fw = new FileWriter(file);
                      fw.write("Venta de articulos\nPrecio:500.00");
                      fw.flush(); //MANDAR EL STREAM DE DATOS HACIA EL ARCHIVOS
                      fw.close();//SE CIERRA EL WRITTER
                }
                else
                {
                    System.out.println("NO SE CREO EL ARCHIVO");
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("EL ARCHIVO YA EXISTE");
        }
      /*
        char[] in = null;
        FileReader fr = new FileReader(file);
        int size = fr.read(file.length());
        in = new char[size];
*/
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Java
 */
public class Archivo2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Java\\Documents\\archivo2.txt");
        try{
            FileWriter fw = new FileWriter(file);
            
            PrintWriter pw = new PrintWriter(file);
            pw.println("Esto es una linea");
            pw.println("Esto es otra linea");
            
            
        }catch(Exception ex)
        {
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Java
 */
public class Folders {
    public static void main(String[] args) throws IOException {
        // PARA CARPETAR ES COMO UN FILE PERO SIN LA EXTENSION
        File directorio = new File("C:\\Users\\Java\\Documents\\LineaBlanca");
        directorio.mkdir();
        
        File electronica = new File("C:\\Users\\Java\\Documents\\LineaBlanca", "Muchas lavadoras.txt");
        
        electronica.createNewFile();
    }
}

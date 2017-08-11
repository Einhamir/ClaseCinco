/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Java
 */
public class TestGato {
    public static void main(String[] args) throws IOException {
        Gato benito = new Gato();
        benito.nombre = "Benito";
        benito.raza = "Angora";
        
        try{
            FileOutputStream fa = new FileOutputStream("C:\\Users\\Java\\Documents\\testser.ser");
            
             ObjectOutputStream oos = new ObjectOutputStream(fa);
            oos.writeObject(benito);
            oos.close();
            
            FileInputStream fi = new FileInputStream("C:\\Users\\Java\\Documents\\testser.ser");
            ObjectInputStream ois = new ObjectInputStream(fi);
            
            Gato nuevocat = (Gato)ois.readObject();
            ois.close();
            System.out.println("GATO NUEVO:"+ nuevocat.toString());
            
        }catch(Exception e)
        {
           e.printStackTrace();
        }
    }
    
}

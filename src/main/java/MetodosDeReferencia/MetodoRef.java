/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosDeReferencia;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Java
 */
public class MetodoRef {
    
    public void referenciaMetodosObjetos(){
        String[] nombres = {"Armando","Zaori","Gerardo" };
        
        //SIN LAMBDA
        
        Arrays.sort(nombres, 0, 0, new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        }
        );
        
        //CON LAMBDA
        // Arrays.sort(nombres, (t,  t1) -> t.compareTo(t1));
         
         //
         Arrays.sort(nombres, String::compareTo);
    }
    public void referenciaMetodoParticular(){
        
    }
    
    public void referenciarConstructor(){
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class StreamApp {
    
    private List<String> lista;
    private List<String> numeros;

    public StreamApp() {
        
        lista = new ArrayList<>();
        lista.add("Marco");
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Sofia");
        
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        
    }
    // LAMDAS
    //STREAM
    //METODO REFERENCIADO
    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }
    
    public void ordenar(){
        lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        StreamApp sa = new StreamApp();
        sa.filtrar();
            
    }
    
}

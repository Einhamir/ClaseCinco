/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Java
 */
public class OperacionLambda {
    public static void main(String[] args) {
        OperacionLambda test = new OperacionLambda();
        test.calcular();
    }
    
    public void calcular()
    {
        //SE DICE A LA INTERFAZ QUE TIPO Y CUANTOS PARAMETROS VA A RECIBIR ( DE ACUERDO AL UNICO METODO QUE TIENE)
        //LAS INTERFACES DEBEN TENER UNICAMENTE UN METODO
        //CON LA LAMBDA SE LE INDICA QUE QUEREMOS QUE REALICE CON ESOS PARAMETROS ("IMPLEMENTACION DEL METODO")
        IOperacion oper = (double a, double b) -> (a+b)/2;
        
        //FINALMENTE YA CON LAS INSTRUCCIONES DADAS A LA INTERFACE, LE INDICAMOS LOS VALORES
        //ASI COMO EL METODO DE LA MISMA PARA TRABAJAR POR MEDIO DE LA EJECUCION DEL METODO%
        System.out.println("Resultado:"+ oper.CalcularPromedio(3, 5));
    }
}

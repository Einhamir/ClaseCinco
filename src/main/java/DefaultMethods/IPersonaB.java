/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethods;

/**
 *
 * @author Java
 */
public interface IPersonaB {
     default public void hablar()
    {
        System.out.println("Persona Hablando - B");
    }
}

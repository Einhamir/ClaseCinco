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
public class TestPersonaDM implements IPersona, IPersonaB{
    public static void main(String[] args) {
        
        TestPersonaDM test = new TestPersonaDM();
        
        test.hablar();
        
        
    }

    @Override
    public void hablar() {
        IPersona.super.hablar(); //To change body of generated methods, choose Tools | Templates.
    }
/*
    @Override
    public void hablar() {
        IPersonaB.super.hablar(); //To change body of generated methods, choose Tools | Templates.
    }
   */
}

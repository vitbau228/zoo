/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Hello VIỆT
 */
public class Tiger extends Animal{

   

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger(String name, int age) {
        super(name, age);
    }

    public Tiger(String name, int age, String description) {
        super(name, age, description);
    }

    
     @Override
    public void sound() {
        System.out.println(" TIger : sound");
    }
    
    
}

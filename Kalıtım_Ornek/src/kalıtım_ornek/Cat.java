/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalıtım_ornek;

public abstract class Cat {
    public void greet(){
        System.out.println("Meow");
    }   
    

}

 class Tomcat extends Cat{
    public void greet(Cat c){
        System.out.println("What up fool?");
        c.greet();
    }
}

class Siamese extends Cat{
    public void greet() {
        System.out.println("Meowwww");
    }
    public void greet(Cat c){
        System.out.println("Hello");
    }
}

/*(new Tomcat()).greet();
(new Tomcat()).greet(new Siamese());
c. Cat c = new Tomcat();
    Tomcat t = c;
    t.greet(c);
d. Cat c = new Siamese();
        ((Tomcat) c).greet(c);
*/
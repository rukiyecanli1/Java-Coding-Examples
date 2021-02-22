/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneorneksorular;

class A {
  public void f(Object o){
      System.out.println("A");   
}
}

class B{
   public void f(String s){
      System.out.println("B");
  }
}

class C extends A{
    public void f(String s){
        System.out.println("C");
    }
}

class D extends B{
     public void f(Object o){
         System.out.println("D");
     }
}
  

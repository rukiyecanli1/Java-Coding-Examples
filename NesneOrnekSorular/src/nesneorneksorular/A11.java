
package nesneorneksorular;

public class A11 {
    
    A11(/*int x*/){
        System.out.println(1);     
    }
}
    
    class B11 extends A11{
        B11(){
            System.out.println(2);
        }
    }

    class C11 extends B11{
   C11(){
            System.out.println(3);
        }
    }
    
    
  class Baby{
      int servings=4;
      void feed(){
          servings=servings+servings;
          System.out.println("servings:"+servings);
      }
      void poop(){
          System.out.println("all better!");
          servings=0;
      }
  }

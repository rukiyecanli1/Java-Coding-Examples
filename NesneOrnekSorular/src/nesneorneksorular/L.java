
package nesneorneksorular;
class P extends S{
    public void method1(){
        System.out.println("p1  ");   
    }
}

public class L {
    public void method1(){
        System.out.println("11");   
    }
    public void method2(){
        System.out.println("12");
    }
    public String toString(){
    return "1" ;       
    }
}
   class BBB extends S{
  
    public void method2(){
        System.out.println("b2");
        super.method2();
    }
    
}

class S extends L{
    @Override
    public void method1(){
        System.out.println("s1");
        method2();
    }
    public String toString(){
     return "s";
    }
}



    
     

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

        
        
        
        
        
        
    


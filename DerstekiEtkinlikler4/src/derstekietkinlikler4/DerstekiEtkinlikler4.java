package derstekietkinlikler4;
public class DerstekiEtkinlikler4 {
    
        public class Baby{
            int servings;
            void feed(int servings){
                servings=servings+servings;
            }
            void poop(){
                System.out.println("All better!");
                servings=0;
        }
        }
       static double tryMe(double x){
        System.out.println("B");
        return x+0.375;
       }
        static double tryMe(double x, int y){
        System.out.println("C");
        return x+y;
    }
    public static void main(String[] args) {
      System.out.println(tryMe(1));
        tryMe(1.0,2);
        tryMe(1.0);
        
        /*int i=5
        for(int i=1;i<10;i++){
            hatalı!*/
        
        /* for(int j=1;j<10;j++){
            int j=5;
           hatalı*/
      
        araba a1= new araba();
        araba a2= new araba("bmw",15);
        a1.depoHacmi=12; 
        
        
        
        }
        
        
        
        
        
        
        
        
        
    
    static double tryMe(int x){
         return x+5;
}
    
}

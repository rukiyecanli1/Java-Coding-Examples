package automobiles;
public class Automobiles{
    
       private double fuel;
        private double speed;
        private String license;
        private static int numAutomobile;
        
        Automobiles(){
            numAutomobile++;
            this.fuel=0;
            this.speed=0;
            this.license="";
        }
            
       Automobiles(double f,double s,String l){
        }
            
        Automobiles(String l){
        }
        
       //GETTER
        public double getFuel(){  
        return 0;
        }
        
        public double getSpeed(){
        return 0;
        }
        
        public String getLicense(){
            return "";
        }
        
        //SETTER
        public  void setFuel(double fuel){  
        this.fuel=fuel;
        }
        
        public double setSpeed(double speed){
        return 0;
        }
        
        public String setLicense(String license){
            return "";
        }
        
             
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
}

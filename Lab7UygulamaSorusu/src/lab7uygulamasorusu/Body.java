package lab7uygulamasorusu;
public abstract class Body {
    public abstract double getDensity();
    public abstract double getVolume();
    public abstract double getMass();
}
class CubeBody extends Body{
    public double density=1.0;
    public double edge=1.0;
    CubeBody(double edge){
        this.edge=edge;
    }
    
     
   public double getDensity(){
        return density;
    }
    public double getVolume(){
        return edge*edge*edge;
    }
    public double getMass(){
        return density*edge*edge*edge;
    }
    
    
    
    class SphereBody extends Body{
        public double density=1.0; //yoğunluk
    public double radius=1.0;  //yarı çap
    public double getDensity(){
        return density;
    }
    public double getVolume(){  //hacim
        return (3.14*radius*radius*radius)/3;
    }
    public double getMass(){  // kütle    m=d.V
        return density*(3.14*radius*radius*radius)/3;    
    }
    }
    
    
    
    
}

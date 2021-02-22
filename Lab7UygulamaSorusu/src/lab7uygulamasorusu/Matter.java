package lab7uygulamasorusu;
public interface Matter {
    public double getDensity();
    public double getVolume();
    public double getMass();
}
class CubeMatter implements Matter{
    public double density=1.0;
    public double edge=1.0;
    public double getDensity(){
        return density;
    }
    public double getVolume(){
        return edge*edge*edge;
    }
    public double getMass(){
        return density*edge*edge*edge;
    }
    
    
class SphereBody implements Matter{
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

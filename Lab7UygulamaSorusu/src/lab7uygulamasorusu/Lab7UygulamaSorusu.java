package lab7uygulamasorusu;
public class Lab7UygulamaSorusu {
    public static void main(String[] args) {
        CubeBody b=new CubeBody(3.0);
        
        //double Density=2.0;
        b.edge=b.edge+3;
        b.edge=b.edge+3;
        System.out.println("Kürenin hacmi :" +b.getVolume());
        System.out.println("Kürenin kütlesi:" +b.getMass());
       
    }
    
}

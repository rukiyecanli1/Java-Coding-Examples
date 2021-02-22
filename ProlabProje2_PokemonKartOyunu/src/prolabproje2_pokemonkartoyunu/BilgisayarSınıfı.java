package prolabproje2_pokemonkartoyunu;
import java.util.Scanner;
import java.util.Random;
public class BilgisayarSınıfı extends OyuncuSınıfı{
    public BilgisayarSınıfı(){
    }
    
    public BilgisayarSınıfı(String oyuncuID,String oyuncuAdi,int Skor){
    super(oyuncuID,oyuncuAdi,Skor);  
    }
    //kartSec kod parcacıgını bu linkten aldım. https://youtu.be/cwY09ezhpUo
    @Override
    public int kartSec(){
    int s1;
    Random sayı=new Random();
    s1=sayı.nextInt(9);
   return s1;
    /*Scanner oku=new Scanner(System.in);
        System.out.println(s1+" "+s2+" "+s3+" "+"arasından bir kart seçiniz:");
        int sec=oku.nextInt();*/
     }
    
  
  
  
 
    
  
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}








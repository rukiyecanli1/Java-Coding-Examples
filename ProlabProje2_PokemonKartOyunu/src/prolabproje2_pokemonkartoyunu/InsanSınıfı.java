package prolabproje2_pokemonkartoyunu;

import java.util.Random;
import java.util.Scanner;

public class InsanSınıfı extends OyuncuSınıfı{
    public InsanSınıfı(){
    }
    
    public InsanSınıfı(String oyuncuID,String oyuncuAdi,int Skor){
    super(oyuncuID,oyuncuAdi,Skor);  
    }
    //kartSec kod parcacıgını bu linkten aldım. https://youtu.be/cwY09ezhpUo
    @Override
    public int kartSec(){
    int s1,s2,s3;
    Random sayı=new Random();
    s1=sayı.nextInt(10);
    s2=sayı.nextInt(10);
    s3=sayı.nextInt(10);
    Scanner oku=new Scanner(System.in);
        System.out.println(s1+" "+s2+" "+s3+" "+"arasından bir kart seçiniz:");
        int sec=oku.nextInt();
    return s1; }
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    


package lab5uygulamasorusudeneme;
import java.util.Scanner;
public class Lab5UygulamaSorusuDeneme {
    public static void main(String[] args) {
        Scanner okut=new Scanner (System.in);
        /*NYP	Lab	Uygulamasi	– 21/10/2019 
        Bu	uygulamada	kullanicidan	icinde	karakter	ve	rakam	iceren	bir	
        String	okunacak	ve	 girdide	 gecen	 her	 karakter	 ve	 rakamin
        kac	 kere	   tekrarlandigi	 ekrana yazilacaktir.
        Rakamlarin	 ve	 karakterlerin	 frekanslari	 (kacar	 kez	 tekrarlandiklari) bir	 
        dizi	yardimi	ile tutulacaktir.*/
        
        String cumle;
        System.out.println("Alfanumerik bir cumle giriniz:");
        cumle=okut.nextLine();
        String yazdir="0";
        String yazdir2="0";
        int ekle=0;
        char dizi[]=new char[50];
          
          for(int i=0;i<cumle.length();i++){
              
              if(Character.isDigit(cumle.charAt(i)))
              {
               
                yazdir+=cumle.charAt(i);
                if((dizi[i]==dizi[i+1]))
                {
                     ekle++;
                }
              }
                else
                {
                  yazdir2+=cumle.charAt(i);
                }
          
              System.out.println(dizi[i] +"'den"+ekle+"tane var");
          }
          
          
          System.out.println(yazdir2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    }
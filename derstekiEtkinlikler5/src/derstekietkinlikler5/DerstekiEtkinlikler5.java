package derstekietkinlikler5;
import java.util.Scanner;
public class DerstekiEtkinlikler5 {
    public static void main(String[] args) {
      Scanner okut=new Scanner(System.in);
      String yazi;
        System.out.println("Bir yazi giriniz:");
        yazi=okut.next();
         
        int i;
        for(i=0;i<yazi.length();i+=2){
               System.out.print(yazi.charAt(i)+" ");
               System.out.print("\n");
                System.out.print(" "+yazi.charAt(i));
            
        }
      int j;
        for(j=1;i<yazi.length();i+=2){
               System.out.print(yazi.charAt(j)+" ");
      
      
    }
    
}}

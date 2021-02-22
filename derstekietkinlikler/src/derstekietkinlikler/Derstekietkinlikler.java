/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derstekietkinlikler;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Derstekietkinlikler {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
    
    
    
 double x=3/2+1;
    System.out.println(x);
        System.out.println("x:"+x);
    
    
    double y=3/(2+1);
    System.out.println("y:"+y);
    
    int k=0,c=0,t;
    /* k+++c ne demek istediğimizi anlamıyor, k++ +y mi yoksa k+ ++y mi*/
         Scanner okut = new Scanner (System.in);
        int A,B,toplam=0;
        System.out.print("Bir sayı giriniz:");
        A=okut.nextInt();
        System.out.print("Bir sayi daha giriniz:");
        B=okut.nextInt();
        if(A>B)
        {
            System.out.println("2 sayi arasındaki 3'e ve 7'ye bölünen sayilar");
            for(int i=B;i<=A;i++)
                if(i%3==0 && i%7==0)
                { toplam+=i;
                    System.out.print(i+" ");}
                    System.out.println("Toplam:"+toplam);
        }
         else
             for(int i=A;i<=B;i++)
                if(i%3==0 && i%7==0)
                {
                    toplam+=i;
                 System.out.print(i+" ");
                }
                System.out.println("Toplam:"+toplam);
    /** HOCANIN YAPTIĞI:
     * int max, min,t=0;
     * if(a<b) 
     *max=b;
     * min=a;
     *  else
     * max=a;
     * min=b;
     *   for(int i=min;i<=max;i++)
     *    if(
     * t=t+i;
     * sout("toplam"+t);
     *         
     */
       
            
  
}

 }
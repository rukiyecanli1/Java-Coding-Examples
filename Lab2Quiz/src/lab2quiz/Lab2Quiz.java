package lab2quiz;
import java.util.Scanner;
public class Lab2Quiz {
Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        
      /**NYP Lab–2 Uygulama Sorulari
1) Kullanicidan	bir n sayisi ve	bir s sayisi okuyan,	
a. s=1 ise 1’den n’e kadar olan sayilarin toplamini
b. s=2 ise 1’den n’e kadar olan	sayilarin carpimini	
c. s=3 ise 1 ile n arasinda olan ve 3’un tam kati	
olan sayilari ekrana basan bir Java kodu yaziniz.
2) Kullanicidan	bir n sayi okuyan ve bu	sayinin	asal carpanlarini bulan	bir Java kodu yaziniz.
 */
        /**cozum1*/
        System.out.println(" ");
        int s,n;
        System.out.print("Bir sayi giriniz:");
        s=input.nextInt();
        System.out.print("Kaç sayi saydirmak istediğinizi giriniz:");
        n=input.nextInt();
        if(s==1)
          {
            int toplam=0;
            for(int i=1;i<=n;i++)
            { toplam+=i;}
            System.out.println("Sayilarin toplami:"+toplam);
          }
        else if(s==2)
          {
              int carpim=1;
              for(int j=1;j<=n;j++)
                  carpim*=j;
                  System.out.println("Sayiarin çarpimi:"+carpim);
            
          }
        else if(s==3)
          {
            System.out.println("3'ten "+n+"'a kadar olan sayilardan 3'e bölünenler:");
              for(int k=1;k<=n;k++)
                  if(k%3==0)
                   System.out.print(k+" ");
          }
 
        /**cozum2*/
   
          System.out.print("Bir sayi giriniz:");
          n=input.nextInt();
          System.out.print("Girdiğiniz sayinin asal çapanlari:");
         
           int bölen=2,i=0;
             while(i<n)
             {
              if(n%bölen==0)
               { 
                  System.out.print(bölen+" ");
                  n=n/bölen;
               }
                else 
                bölen++;
             }
              
               
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
        
        
        
        
        
        
        
        
    }
    
}

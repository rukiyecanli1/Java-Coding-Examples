package lab4uygulamasorusudeneme;
import java.util.Scanner;
public class Lab4UygulamaSorusuDeneme {
    public static void main(String[] args) {
        Scanner okut=new Scanner(System.in);
        /*NYP Lab 4 Uygulaması
Kullanicidan bir String	deger okuyan ve	bu String içindeki
a) Kucuk harflerin sayisini
b) Buyuk harflerin sayisini
c) Rakamlarin sayisini
bulup ekrana yazan bir Java uygulamasi yaziniz.*/
        String str;
        int [] freq=new int[100];
        int count=0;
        str=okut.nextLine();
        int i,j;
        char characters[]=str.toCharArray();
        for(i=0;i<str.length();i++){
            count++;
            freq[i]=1;
            for(j=i+1;j<str.length();j++){
                if(characters[i]==characters[j]){
                    freq[i]++;
                    characters[j]=' ';
                   
                }
            }
        }
           System.out.println("Karakterler ve frekansları:");
           for(i=0;i<count-1;i++){
               if(characters[i]!=' '&& characters[i]!='\0')
                   System.out.println(characters[i]+"-"+freq[i]);
                int enk=freq[0];
                    int enb=freq[0];
                    if(enk>freq[i]){
                        enk=freq[i];
                      if(enb<freq[i]){
                          enb=freq[i];
                   
           }
              
                   
                }
                   

       
                   
                   System.out.println("Frekans farkı:"+(enb-enk));

             
                   System.out.println("Frekans farkı:"+(enb-enk));




    }}
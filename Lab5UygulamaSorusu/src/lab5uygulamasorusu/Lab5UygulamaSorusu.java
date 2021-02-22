package lab5uygulamasorusu;
import java.util.Scanner;
public class Lab5UygulamaSorusu {
    public static void main(String[] args) {
        Scanner okut=new Scanner(System.in);
        System.out.println("String bir ifade girin:");
        String ifade=okut.nextLine();
        char dizi[]=new char [100];
        int sayac=0;
       
        
        for(int i=0;i<ifade.length();i++){
            dizi[i]=ifade.charAt(i);
             int enk=dizi[i];
             int enb=0;
        }
            for(int i=0;i<ifade.length();i++){
                for(int j=0;j<ifade.length();i++){
                    if(dizi[i]==dizi[j]){
                        for(int k=0;k<i;k++){
                            if(dizi[k]==dizi[j]){
                                sayac--;
                            }
                        }
                        sayac++;
                    }            
              }
                if(sayac!=0){
                    System.out.println(dizi[i]+"ifadesinden"+sayac+"tane var.");
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

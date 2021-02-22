
package derstekietkinlikler3;
import java.util.ArrayList;
import java.util.Scanner;
public class Derstekietkinlikler3 {
    public static void main(String[] args) {
        Scanner okut=new Scanner(System.in);
        // TODO code application logic here
       
        int[] ar1={1,2,3};
        int[] ar2={4,5,6};
        ar2=ar1;        
        ar1[1]=9;
        System.out.println(ar2[1]); /*  9   */
        
        
        /*sorting*/
        int ak[]={11,9,0,8,34,12,1,55,99,13};
        int min_i=0;
        int t;
        for(int k=0;k<ak.length;k++)
        { min_i=k;
        for(int l=k+1;l<ak.length;l++)
        {
            if(ak[l]<ak[min_i])
                min_i=l;
        }
        t=ak[k];
        ak[k]=ak[min_i];
        ak[min_i]=t;
        }
        for(int i=0;i<ak.length;i++){
            System.out.println(ak[i]+" ");
            {     
    }
         
        }
    
  /*   ArrayList<String> =new ArrayList<String>();*/
    
        
        System.out.println("");
        for(int i=0;i<100;i++){
            if(i==50){
                break;
                     }
            System.out.print(i+" ");
        }
     System.out.println("       ");
        
    for(int i=0;i<100;i++){
        if(i==50){
            continue;
        }
        System.out.print(i+" ");
    }
    
        System.out.println("       ");
    
    
    /*NYP lAB UYGULAMASI
    SORU:1
     A VE B TAM SAYİ DEGER SAKLAYAN İKİ ARRAYLİST YAPISI OLSUN. A LİSTESİNDE OLUP B LİSTESİNDE OLMAYAN 
    DEĞERLERİ C ARRAYLİSTESİNE  AKTARAN KOD?
    */
    
        ArrayList A= new ArrayList();
        A.add(1);
        A.add(2);
        A.add(4);
        A.add(6);
        A.add(8);
        
        ArrayList B=new ArrayList();
        B.add(2);
        B.add(7);
        B.add(8);
        
        ArrayList C=new ArrayList();
           for(int i=0;i<A.size();i++)
            if(!B.contains(A.get(i)))
              C.add(A.get(i));
           System.out.println(C);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }}
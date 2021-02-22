/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derstekietkinlikler2;

/**
 *
 * @author User
 */
public class Derstekietkinlikler2 {

    
    public static void main(String[] args) {
        
    String solution;
    solution= "the temperature is "+ 72;
    System.out.println(solution);
        System.out.println(solution.length());
        
        double a=2,b=3;
        System.out.println("a="+a+b);
        /**
     * 2.03.0
     * 5.0(alttaki)
     */
        System.out.println("a="+(a+b));
        
       /* String five=Integer.toString(5);
        String five=Double.toString(5);
        String five=""+5;
        
        int foo="18";
        int foo=Integer.parselnt("18");
        double d=Double.parseDouble("18");
        */
        
        String a1=new String("alev");
        String a2=new String ("alev");
        if(a1==a2)
            System.out.println("ayni");
        else
            System.out.println("farkli");
        /*ikisi farkli yer tutuyor o yüzden fakli
        "==", nesnelerin yerini belirliyor*/
        
        if(a1.equals(a2))
            System.out.println("ayni");
        else
            System.out.println("farkli");
        /*equals string e özeldir
        nesleleri karşılaştırıyor*/
        
        int k=0,  byk=0;
       String a3=new String("alevMUTLU");
       char[] ca=a3.toCharArray();
        System.out.println(a1);
        
        for(int i=0;i<a3.length();i++)
            if((ca[i]<='z')&& (ca[i]>='a'))
                ca[i]=(char)(ca[i]-32);
            else
               ca[i]=(char)(ca[i]+32);
               String s2=""+ca[0];
               for(int i=1;i<a3.length();i++)
                   s2=s2+ca[i];
               System.out.println(s2);
         
        for(int i=0;i<a3.length();i++)
            System.out.println(ca[i]);
        /*1)kaç tane küçük hrf var?
        2)mkaç tane büyük
        3)küçükleri büyüğe
        4)büyükleri küçüğe çevvir
        */
        
        
       
        String S=new String("alievegelalikosalitopatalkos");
        String P=new String ("ali");
        int kere=0;
        int i=S.indexOf(P);
        while(i!=-1){
            kere++;
            S=S.substring(i+P.length());
            i=S.indexOf(P);
        }
        System.out.println(kere);
            
        /*kelime palindrom mu değil mi*/
        
        
        
        
        
        
        
        
        
               
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }   
    
    
}

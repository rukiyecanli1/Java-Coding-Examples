package nesneorneksorular;

import java.util.Scanner;

public class NesneOrnekSorular {
     
     public static void g(int x,int y){
          if(x>y){
              x=x-5;
              y=y+5;
          } 
          if(x<y){
              x++;
              y--;
          }else{
              x=y*2;
          }
          System.out.println(x+" "+y);
          }
   
    public static void main(String[] args) {
       
        //////////  1-Kodun çıktısı ne  olur? 
        ///: kodda olan fakat hatalı olduğu için görünmez yaptığım satır
        
        int[] iArr=new int [10];
        //iArr.length=15;
        System.out.println(iArr.length);
        
       /* ÇIKTI:   Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - cannot assign a 
        value to final variable length at nesneorneksorular.NesneOrnekSorular.main(NesneOrnekSorular.java:11) 
        Java Result: 1*/
        
        
        //////////  2-Kodun çıktısı?
        //class X tanımladım.
        
     //  int i=0;
     //  int j=f(i++)+i+f(++i);
       /// int x=f(i++); //x:f(0)=1
       // int y=i;      //y:1
        ///int z=f(++i); //z:f(2)=3
       /// System.out.println("x,y,z:"+x+","+y+","+z );
       /// int j=x+y+z; //
       
  //     System.out.println("i:"+i); 
   //     System.out.println("j:"+j);  
// tahminim:  f(0)=2,i=2;f(3)=4;   i:4, j=8........ yanlışmış.......
 // hoca kodda static demiş ben onu yazmadım. eğer yazsaydım şöyle bir hata verirdi:
   /*Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous sym type: 
   nesneorneksorular.NesneOrnekSorular.f at nesneorneksorular.NesneOrnekSorular.main(NesneOrnekSorular.java:25)
   Java Result: 1*/
        
        /////////  3-Javada miras alan bir sınıfın ana sınıftaki bir metodu yeniden tanımlamasına ne denir?
        //         cevap: method ovverride
        
        ////////   4-Kodun çıktısı ne olur? A.java classı oluşturduk.
          A a=new C();        
          a.f("foo");          // ÇIKTI: A
          C c=new C();        
          c.f("foo");          // ÇIKTI: C
          B b=new D();
          b.f("foo");          // ÇIKTI: B
          D d=new D();
          d.f("foo");          // ÇIKTI: B. Neden DE değil de BEEEEE???????
          // TAHMİNİM: Alt alta A C A C  B D B D      
          
        
       /*Calısan x= new Muhendis();
         Bu şu demektir, fabrikada çalışan bir Mühendis’i al ona bir çalışan gibi davran.
          x.f(); */
        
        
        ////////  5- yandaki tanımlara(I,C2) göre kod geliştirici M sınıfında hangi metotları tanımlamak zorundadır?
          ////////  cevap: interface lerdeki metodlar tanımlanmalıdır. J I'dan extends edildiği için I'daki metodlar
          ///////// da tanımlanmalıdır!!!
          
           
        ////////  6-AA sınıfı BB interface ini implement etmektedir ancak BB interface indeki tüm metotları 
          ///////  Bu koşullarda AA sınıfı için ne söylenebilir?
          
          //// CEVAP: AA SINIFI ABSTRACT BİR SINIFTIR.
        
         
        
       /////// 7 Hangileri doğrudur?
          //(A1 sınıfı bu soru için açtım)
          A1 a1;
          B1 b1=new B1();
          C1 c1=new C1();
          D1 d1=new D1();
          System.out.println("\n");
       ////// 8) kodun çıktısı ne olur? L classını bunun için açtım.
         L[]el={new BBB(),new P(),new L(),new S()};
           for(int i=0;i<1/*el.length*/;i++){
               System.out.println(el[i]);// ekran çıktısı el(0) için: s
               el[i].method1();
               System.out.println();
               el[i].method2();
               //System.out.println();
               //System.out.println();
               
           }
           
           
           String x="kalem";
          System.out.println( x.length());
         
           
           
           
           
           
           
       
          
        System.out.println("\n");
      ///// 9-kodun çıktısı ne olur?
          //yukarıda g fonksiyonunu tanımladım.
         // int x=10,y=2;
       //   g(x,y);
          //cevap: 6 6
          
    //// 10)Girdi olarak bir string alan ve çıktı olarak o stringin kelime olduğunu yazan bir metod tanımla.
          String ifade="kalem";
        //  char [] cc=new char[ifade.length()];
          // for(int i=0;i<ifade.length();i++){
        //    cc[i]=ifade.charAt(i);
        //   System.out.print(cc[i]+" ");
          // }
           if(ifade.length()>1){
               System.out.println("\nYzdığınız ifade kelimedir\n");
           }
        
          
          
       ////// 16)
           C11 c11=new C11();
           ///// 17de 16nın içinde
       //////18)o da 16 sınnıfın içinde (A11)
           
           Baby baby=new Baby();
           baby.feed();
          
           
           
           ///// consturtor, get-set metodları kavrama. Kisi diye bir class oluşturdum. Polymorphisim slaytından aldım.
          Kisi kisi =new Kisi("elif");
          System.out.println( kisi.getIsim());
          kisi.setIsim("Ali");
          System.out.println(kisi.getIsim());
          kisi.setIsim("Rukiyeee");
          System.out.println(kisi.getIsim());
         
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ///// 18-aşşağıdaki yorum satırındaki if'li yapıyı switch case şeklinde yaz.
        
        Scanner okut=new Scanner(System.in);
        System.out.println("Sınıfını giriniz:");
        int grade;
        String school = null;
        grade=okut.nextInt();
       /* if(grade<=5)
            school="Elemantry school";
        else if(grade<=8)
            school="Junior High";
        else if(grade<=12)
            school="High School";
        
     System.out.println("School:"+school);  
          
     */
        
       /* switch(grade){
            case 1: case 2: case 3: case 4: case 5:
            school="Elemantry school"; 
              break;
            case 6: case 7: case 8:
            school="Junior High";
              break;
            case 9: case 10: case 11: case 12:
            school="High School";
              break;
            default:
              school="College";
                break;
         }
        
         System.out.println("School:"+school);
         
 
     */    
    //    
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        }
      
        
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
    }
    


package derstekietkinlikler5.pkg2.metod_örnek;
class araba {
    private String model;
       private int yil;
       private int hiz;
       private int numS;
       private int numB;
       static private int numA=0;
       public boolean tekcift;
      
            araba(String model,int yil,int hiz){
            //model=model; de diyebiliriz. illa this olacak değil.
            this.model=model; //bu nesneye ait  model. yanındaki model hemen yukardaki string model
            this.yil=yil;
            this.hiz=hiz;
            this.numS=0;
            this.numB=0;
            numA++;
           
        }
          void bilgi(){
              System.out.println("Araba modeli:"+this.model);
              System.out.println("Araba yili:"+this.yil);
              System.out.println("Araba hizi:"+this.hiz);
              System.out.println("Hızlanma sayisi:"+this.numS);
              System.out.println("Yavaslama sayisi"+this.numB);
          }
           
          public boolean hizlan(){
              System.out.println(this.model+" "+this.yil+"-");
             if(this.hiz*2 <=210){
                 this.hiz*=2;
                 this.numS++;
                 System.out.println("Araba hizlandi");
                 System.out.println("Simdiki hiz:"+this.hiz);
                 System.out.println("Hızlanma sayisi:"+this.numS);
                 return true;
             }
             else{
                 System.out.println("Araba hizlanmadi");
                 System.out.println("Simdiki hiz:"+this.hiz);
                 System.out.println("Hızlanma sayisi:"+this.numS);
                 return false;
             }
           }
            static void adet(){
                System.out.println("Simdiye dek "+ numA + " adet arac uretildi.");
          }
            public boolean yavasla(){
              System.out.println(this.model+" "+this.yil+"-");
             if(this.hiz/2<=210){
                 this.hiz/=2;
                 this.numS++;
                 System.out.println("Araba hizlandi");
                 System.out.println("Simdiki hiz:"+this.hiz);
                 System.out.println("Hızlanma sayisi:"+this.numS);
                 return true;
             }
             else{
                 System.out.println("Araba hizlanmadi");
                 System.out.println("Simdiki hiz:"+this.hiz);
                 System.out.println("Hızlanma sayisi:"+this.numS);
                 return false;
            
}
            }
           void kontrol(){
               if(this.tekcift==false){
                 
                     hizlan();
                     hizlan();
                      
                 }
                 else{
                    yavasla();
                    yavasla();
                    
                 }}}
                     
                 










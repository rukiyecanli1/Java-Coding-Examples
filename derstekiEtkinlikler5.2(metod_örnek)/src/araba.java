public class araba {
   
       private String model;
       private int yil;
       private int hiz;
       private int numS;
       private int numB;
       static private int numA=0;
      
         araba(String model,int yil){
            //model=model; de diyebiliriz. illa this olacak değil.
            this.model=model; //bu nesneye ait  model. yanındaki model hemen yukardaki string model
            this.yil=yil;
            this.hiz=0;
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
           
        
      
}

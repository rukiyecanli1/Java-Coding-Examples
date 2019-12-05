import java.util.Scanner;
public class RukiyeCanli_180209100_Odev12 {
	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev -12 - Karþýlaþtýrma - Not Hesabý ve Menü Uygulamasý
	 */
	public static void main(String[] args) {
      Scanner okut=new Scanner(System.in);
      double r,h,secim;
      System.out.println("1-Silindirin Hacim Hesabý");
      System.out.println("2-Silindirin Yüzey Alan Hesabý");
      System.out.print("Seçiminiz:");
      secim=okut.nextDouble();
      if(secim==1)
     {System.out.print("Yarýçap giriniz:");
      r=okut.nextDouble();
      System.out.print("Yükseklik giriniz:");
      h=okut.nextDouble();
      System.out.print("Silindirin hacim hesabý:"+Math.PI*r*r*h);}
      else if(secim==2)
      {System.out.print("Yarýçap giriniz:");
      r=okut.nextDouble();
      System.out.print("Yükseklik giriniz:");
      h=okut.nextDouble();
      System.out.print("Silindirin yüzey alaný:"+2*Math.PI*r*(r+h));}
      else
    	  System.out.println("HATALI GÝRÝÞ");
      
    	  
      

	}

}

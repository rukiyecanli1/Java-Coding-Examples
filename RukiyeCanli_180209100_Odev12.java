import java.util.Scanner;
public class RukiyeCanli_180209100_Odev12 {
	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev -12 - Kar��la�t�rma - Not Hesab� ve Men� Uygulamas�
	 */
	public static void main(String[] args) {
      Scanner okut=new Scanner(System.in);
      double r,h,secim;
      System.out.println("1-Silindirin Hacim Hesab�");
      System.out.println("2-Silindirin Y�zey Alan Hesab�");
      System.out.print("Se�iminiz:");
      secim=okut.nextDouble();
      if(secim==1)
     {System.out.print("Yar��ap giriniz:");
      r=okut.nextDouble();
      System.out.print("Y�kseklik giriniz:");
      h=okut.nextDouble();
      System.out.print("Silindirin hacim hesab�:"+Math.PI*r*r*h);}
      else if(secim==2)
      {System.out.print("Yar��ap giriniz:");
      r=okut.nextDouble();
      System.out.print("Y�kseklik giriniz:");
      h=okut.nextDouble();
      System.out.print("Silindirin y�zey alan�:"+2*Math.PI*r*(r+h));}
      else
    	  System.out.println("HATALI G�R��");
      
    	  
      

	}

}

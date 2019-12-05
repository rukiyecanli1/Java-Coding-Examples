import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev14 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev - 14 - Döngüler Faktoriyel Hesabi
	 */
	public static void main(String[] args) {
	  Scanner okut=new Scanner(System.in);
	  int N,x,sonuc=1,toplam=0;
	  System.out.print("Bir sayý giriniz...");
	  N=okut.nextInt();
		  for(x=1;x<=N;x++)
		  { sonuc=sonuc*x;
			  System.out.println(x+"!="+sonuc);
			  toplam=toplam+sonuc;
		  }
		  System.out.println("Faktöriyel Toplamý:"+toplam); 
		  
		  
		  
		  
	  
	}
	}




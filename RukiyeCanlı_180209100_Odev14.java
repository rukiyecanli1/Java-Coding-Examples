import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev14 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev - 14 - D�ng�ler Faktoriyel Hesabi
	 */
	public static void main(String[] args) {
	  Scanner okut=new Scanner(System.in);
	  int N,x,sonuc=1,toplam=0;
	  System.out.print("Bir say� giriniz...");
	  N=okut.nextInt();
		  for(x=1;x<=N;x++)
		  { sonuc=sonuc*x;
			  System.out.println(x+"!="+sonuc);
			  toplam=toplam+sonuc;
		  }
		  System.out.println("Fakt�riyel Toplam�:"+toplam); 
		  
		  
		  
		  
	  
	}
	}




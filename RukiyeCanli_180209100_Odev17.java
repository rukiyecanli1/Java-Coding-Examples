import java.util.Scanner;
public class RukiyeCanli_180209100_Odev17 {
	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev - 17 - Zar atma oyunu (Döngü ve Sayý Tutma)
Hangisi daha büyükse o kiþinin skorunu 1 arttýrsýn. Ve 5'e ulaþan kiþi oyunu kazandý diye mesaj versin.  

	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner (System.in);
		String x1,x2;
		int a1,a2,skor1=0,skor2=0,y=1,i;
		
			System.out.print("1.Kullanýcý klavyeden bir tuþa basýnýz:");
		    x1=okut.next();
		a1=(int)(Math.random()*6+1);
		System.out.println("Sayýnýz:"+a1);
		System.out.print("2.Kullanýcý klavyeden bir tuþa basýnýz:");
		x2=okut.next();
		a2=(int)(Math.random()*6+1);
		System.out.println("Sayýnýz:"+a2);
		  if(a1>a2)
		  { skor1=a1+1;
			  System.out.println("Skor1:"+skor1);}
		  System.out.println();
			  else if(a2>a1)
			  {  skor2=a2+1;
		          System.out.println("Skor2:"+skor2);}
	}
	      
		
		
		
		
	}
		
		
	}
import java.util.Scanner;
public class RukiyeCanli_180209100_Odev17 {
	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev - 17 - Zar atma oyunu (D�ng� ve Say� Tutma)
Hangisi daha b�y�kse o ki�inin skorunu 1 artt�rs�n. Ve 5'e ula�an ki�i oyunu kazand� diye mesaj versin.  

	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner (System.in);
		String x1,x2;
		int a1,a2,skor1=0,skor2=0,y=1,i;
		
			System.out.print("1.Kullan�c� klavyeden bir tu�a bas�n�z:");
		    x1=okut.next();
		a1=(int)(Math.random()*6+1);
		System.out.println("Say�n�z:"+a1);
		System.out.print("2.Kullan�c� klavyeden bir tu�a bas�n�z:");
		x2=okut.next();
		a2=(int)(Math.random()*6+1);
		System.out.println("Say�n�z:"+a2);
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
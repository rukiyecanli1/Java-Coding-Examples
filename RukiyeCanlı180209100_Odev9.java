import java.util.Scanner;
public class RukiyeCanl�180209100_Odev9 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev: ax2 + bx + c = 0 gibi 2 dereceden bir 
 denklemin k�klerini bulan JAVA program�n� yazma
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int denklem,delta,a,b,c;
		System.out.println("a?:");
		a=okut.nextInt();
		System.out.println("b=?");
		b=okut.nextInt();
		System.out.println("c=?");
		c=okut.nextInt();
		delta=b*b-4*a*c;
		if(delta>0)
		{
		System.out.println("�ki tane k�k vard�r;");
		System.out.println("x1:"+(-b+(double)Math.sqrt(delta))/(2*a));
		System.out.println("x2:"+(-b-(double)Math.sqrt(delta))/(2*a));
		}
		else if(delta==0)
		System.out.println("x1=x2="+(-b/(2*a)));
		else
			System.out.println("K�K YOKTUR");
		}
	{
		
		
			
	
		
		
			
			
			
		
	

	}

}

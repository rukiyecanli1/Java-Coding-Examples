import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev18 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev - 18/  15 adet 11'e b�l�nen say� tutma - (D�ng�ler)
       Not:
       Bilgisayara 1-100 aras�nda say� tutturmak i�in;
       int a=(int)(Math.random()*100+1);
	 */
	public static void main(String[] args) {
	 Scanner okut=new Scanner(System.in);
	int sayi,i,y=15,toplam=0;
	 for(i=1;i<=y;i++)
	 {
	 sayi=(int)(Math.random()*400+100);
	 if(sayi%11==0)
	{
	 System.out.print(sayi);
	 toplam+=sayi;
	}
	 else
		 y++;
	 }
	 System.out.println("Toplam:"+toplam);
	 
    	
	
	
	int f=2,tom=5;
	tom=++tom;
	System.out.println(tom);
	 

	}}
	
	
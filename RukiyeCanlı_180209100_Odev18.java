import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev18 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev - 18/  15 adet 11'e bölünen sayý tutma - (Döngüler)
       Not:
       Bilgisayara 1-100 arasýnda sayý tutturmak için;
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
	
	
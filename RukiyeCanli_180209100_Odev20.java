import java.util.Scanner;
public class RukiyeCanli_180209100_Odev20 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * ODEV 20-Kullan�c� taraf�ndan elemanlar� girilen 10 elemanl� tamsay� dizinin ortalamas�n� 
	 bulan bilgisayar program�n� yaz�n�z.
	 */
	public static void main(String[] args) {
     Scanner okut=new Scanner(System.in);
     int x,i;double toplam=0.0,ortalama=0.0;
     int N[]=new int [10];
     for(x=1;x<=10;x++)
     {
    	 System.out.print(x+". eleman� giriniz:");
    	 i=okut.nextInt();
    	 toplam=toplam+i;
     }
     ortalama=toplam/10;
     System.out.println("Say�lar�n ortalamas�:"+ortalama);
     
     
	}}
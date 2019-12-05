import java.util.Scanner;
public class RukiyeCanli_180209100_Odev20 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * ODEV 20-Kullanýcý tarafýndan elemanlarý girilen 10 elemanlý tamsayý dizinin ortalamasýný 
	 bulan bilgisayar programýný yazýnýz.
	 */
	public static void main(String[] args) {
     Scanner okut=new Scanner(System.in);
     int x,i;double toplam=0.0,ortalama=0.0;
     int N[]=new int [10];
     for(x=1;x<=10;x++)
     {
    	 System.out.print(x+". elemaný giriniz:");
    	 i=okut.nextInt();
    	 toplam=toplam+i;
     }
     ortalama=toplam/10;
     System.out.println("Sayýlarýn ortalamasý:"+ortalama);
     
     
	}}
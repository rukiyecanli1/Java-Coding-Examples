import java.util.Scanner;
public class RukiyeCanli_180209100_Odev13 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev - 13 - Ekrana Mesaj Yazdýrma (Döngüler)
	 */
	public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);
     int n,x; String mesaj;  
     System.out.print("Bir mesaj giriniz:");
     mesaj=oku.next();
     System.out.print("Bir sayý giriniz:");
     n=oku.nextInt();
     for(x=1;x<=n;x=x+1)
    	 System.out.println(mesaj);
     }}

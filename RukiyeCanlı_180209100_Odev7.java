import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev7 {

	/**RUK�YE CANLI
	 * 180209100 1.��retim
	 * �dev: Yelkovan ve akrep aras�ndanki a��y� bulma
	 */
	public static void main(String[] args) {
	 Scanner rukiye=new Scanner(System.in) ;
	 int dakika, saat, a��;
	 System.out.print("Saati giriniz:");
	 saat=rukiye.nextInt();
	 System.out.print("Dakikay� giriniz:");
	 dakika=rukiye.nextInt();
	 a��=(saat*30+dakika/2)-(dakika*6);
	 System.out.println("Akrep ile yelkovan aras�ndaki a��:"+a��);
	 
	 

	}

}

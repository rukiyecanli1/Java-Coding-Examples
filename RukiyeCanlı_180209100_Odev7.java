import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev7 {

	/**RUKÝYE CANLI
	 * 180209100 1.Öðretim
	 * Ödev: Yelkovan ve akrep arasýndanki açýyý bulma
	 */
	public static void main(String[] args) {
	 Scanner rukiye=new Scanner(System.in) ;
	 int dakika, saat, açý;
	 System.out.print("Saati giriniz:");
	 saat=rukiye.nextInt();
	 System.out.print("Dakikayý giriniz:");
	 dakika=rukiye.nextInt();
	 açý=(saat*30+dakika/2)-(dakika*6);
	 System.out.println("Akrep ile yelkovan arasýndaki açý:"+açý);
	 
	 

	}

}

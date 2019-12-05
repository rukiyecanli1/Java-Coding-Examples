import java.util.Scanner;
public class RukiyeCanlý180209100_Odev10 {

	public static void main  (String args[]){

	/**RUKÝYE CANLI 
	 * 180209100 1.ÖÐRETÝM
	 * Ödev: Ýdeal kilo hesaplama
	 */
	public static void main(String[] args) {
		Scanner klasik=new Scanner(System.in);
		int kilo,boy,idealKilo = 0;
		String cinsiyet;
		System.out.print("Boyunuzu giriniz:");
		boy=klasik.nextInt();
		System.out.print("Kilonuzu giriniz:");
		kilo=klasik.nextInt();
		System.out.print("Cinsiyet giriniz[K/E]:");
		cinsiyet=klasik.next();
		if(cinsiyet==E)
			{idealKilo=boy-108;
			System.out.println("Ýdeal kilonuz:"+idealKilo);
switch(cinsiyet)
{
case "E":System.out.print("Ýdeal Kilonuz:"+(boy-108));
if(idealKilo>kilo)
    System.out.println((idealKilo-kilo)+"kilo almalýsýnýz.");
 	else if(idealKilo<kilo)
 	System.out.println((kilo-idealKilo)+"kilo vermelisiniz...");
		else
		System.out.println("Tebrikler! Ýdeal kilodasýnýz.");
break;
case "K":
	System.out.print("Ýdeal Kilonuz:" +(boy-110));

break;
}
	
			
		
		
		
		
		
		
		

	



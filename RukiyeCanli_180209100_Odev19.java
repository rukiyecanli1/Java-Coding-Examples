import java.util.Scanner;
public class RukiyeCanli_180209100_Odev19 {

	/**RUKÝYE CANLI 
	 * 180209100 1.ÖÐRETÝM
	 * ODEV19/ Bilgisayar tarafýndan 1-100 arasýnda tutulan sayýyý 10 defada
	  bilmeye çalýþan programý yazýnýz.
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int tahmin,x,y=10,bts;
		bts=(int)(Math.random()*100+1);
		for(x=1;x<=y;x++)
		{
		System.out.print(x+". tahmininizi giriniz:");
		tahmin=okut.nextInt();
		if(tahmin==bts)
		System.out.println("TEBRÝKLER!"+x+".TAHMÝNDE BÝLDÝNÝZ.");
		
		else if(bts>tahmin)
	    System.out.println("BÝLEMEDÝNÝZ... "+tahmin+" ile 100 arasýnda yeni tahmininizi giriniz:");
		
		else if(bts<tahmin)
			System.out.println("BÝLEMEDÝNÝZ..."+tahmin+" ile 1 arasýnda yeni tahmininizi giriniz:");
		
		else	
		  System.out.println("Doðru Cevap:"+bts);
	    	
		 
		}
}
}
import java.util.Scanner;
public class RukiyeCanli_180209100_Odev19 {

	/**RUK�YE CANLI 
	 * 180209100 1.��RET�M
	 * ODEV19/ Bilgisayar taraf�ndan 1-100 aras�nda tutulan say�y� 10 defada
	  bilmeye �al��an program� yaz�n�z.
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
		System.out.println("TEBR�KLER!"+x+".TAHM�NDE B�LD�N�Z.");
		
		else if(bts>tahmin)
	    System.out.println("B�LEMED�N�Z... "+tahmin+" ile 100 aras�nda yeni tahmininizi giriniz:");
		
		else if(bts<tahmin)
			System.out.println("B�LEMED�N�Z..."+tahmin+" ile 1 aras�nda yeni tahmininizi giriniz:");
		
		else	
		  System.out.println("Do�ru Cevap:"+bts);
	    	
		 
		}
}
}
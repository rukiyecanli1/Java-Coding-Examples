import java.util.Scanner ;
public class RukiyeCanli180209100_Odev8 {

	/**RUK�YE CANLI 180209100
	 * END�STR� M�H. 1.��RET�M
	 * �dev: ATM'den para �ektirme
	 */
	public static void main(String[] args) {
		Scanner xxx=new Scanner (System.in);
		int para,x,y,z,t;
		System.out.println("�ekmek istedi�iniz para miktar�n� giriniz...");
		para=xxx.nextInt();
		if(para%10==0)
		{
		x=para/100;
	    y=(para%100)/50;
		z=(para%100-50*y)/20;
		t=(para-(x*100+y*50+z*20))/10;
		System.out.println(x+ " adet 100 TL");
		System.out.println(y+ " adet 50 TL");
        System.out.println(z+ " adet 20 TL");
		System.out.println(t+ " adet 10 TL");
		}
		else
			System.out.println("HATA:L�tfen 10'un kat� �eklinde giri� yap�n�z...");
 para=xxx.nextInt();
 if(para%10==0)
 {
		x=para/100;
	    y=(para%100)/50;
		z=(para%100-50*y)/20;
		t=(para-(x*100+y*50+z*20))/10;
		System.out.println(x+ " adet 100 TL");
		System.out.println(y+ " adet 50 TL");
     System.out.println(z+ " adet 20 TL");
		System.out.println(t+ " adet 10 TL");
		}

			

	}

}

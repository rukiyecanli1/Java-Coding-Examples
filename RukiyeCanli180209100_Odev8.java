import java.util.Scanner ;
public class RukiyeCanli180209100_Odev8 {

	/**RUKÝYE CANLI 180209100
	 * ENDÜSTRÝ MÜH. 1.ÖÐRETÝM
	 * Ödev: ATM'den para çektirme
	 */
	public static void main(String[] args) {
		Scanner xxx=new Scanner (System.in);
		int para,x,y,z,t;
		System.out.println("Çekmek istediðiniz para miktarýný giriniz...");
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
			System.out.println("HATA:Lütfen 10'un katý þeklinde giriþ yapýnýz...");
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

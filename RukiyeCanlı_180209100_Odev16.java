import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev16 {
	/**RUK�YE CANLI 
	 * 180209100 1.��RET�M
	 * �dev16-RANDOM SAYILAR
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int x,N,a,ortalama=0,toplam=0;
		System.out.print("Bir say� giriniz:");
		N=okut.nextInt();
		for(x=1;x<=N;x++)
			{
			a=(int)(Math.random()*6250+1250);
			System.out.println(a);
			toplam=toplam+a;
		    ortalama=toplam/N;
			}
			System.out.println("Tutulan Say�lar�n Ortalamas�:"+ortalama);	
		
		

	}

}

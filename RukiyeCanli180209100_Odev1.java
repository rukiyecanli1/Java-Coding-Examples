import java.util.Scanner;
public class RukiyeCanli180209100_Odev1 {
		/** RUKÝYE CANLI 
		 * 180209100
		 * ENDÜSTRÝ MÜH. 1.ÖÐRETÝM
		 * Ödev1: Ýki Nokta Arasý Mesafe Hesaplamasý
		 */
		public static void main(String[] args) {
		int sayia,sayib,x1,y1,x2,y2;
		Scanner okut=new Scanner(System.in);
		System.out.println("A noktasýnýn koordinatlarýný giriniz:");
		x1=okut.nextInt();
		y1=okut.nextInt();
		System.out.println("A noktasýnýn koordinatý("+x1+","+y1+")");
		System.out.println("B noktasýnýn koordinatýlarýný giriniz:");
		x2=okut.nextInt();
		y2=okut.nextInt();
		System.out.println("B noktasýnýn koordinatý("+x2+","+y2+")");
		System.out.print("2 nokta arasý uzaklýk:"+Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		
		
		
		
		
		}

	}

}

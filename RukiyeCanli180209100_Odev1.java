import java.util.Scanner;
public class RukiyeCanli180209100_Odev1 {
		/** RUK�YE CANLI 
		 * 180209100
		 * END�STR� M�H. 1.��RET�M
		 * �dev1: �ki Nokta Aras� Mesafe Hesaplamas�
		 */
		public static void main(String[] args) {
		int sayia,sayib,x1,y1,x2,y2;
		Scanner okut=new Scanner(System.in);
		System.out.println("A noktas�n�n koordinatlar�n� giriniz:");
		x1=okut.nextInt();
		y1=okut.nextInt();
		System.out.println("A noktas�n�n koordinat�("+x1+","+y1+")");
		System.out.println("B noktas�n�n koordinat�lar�n� giriniz:");
		x2=okut.nextInt();
		y2=okut.nextInt();
		System.out.println("B noktas�n�n koordinat�("+x2+","+y2+")");
		System.out.print("2 nokta aras� uzakl�k:"+Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		
		
		
		
		
		}

	}

}

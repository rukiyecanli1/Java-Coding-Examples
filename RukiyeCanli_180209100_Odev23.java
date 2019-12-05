import java.util.Scanner;
public class RukiyeCanli_180209100_Odev23 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * M*N Elemnal� Matrisin M ve N sat�r ve s�tun de�erleridir.M ve N de�erleri, elemanlar� kullan�c� 
	 * taraf�ndan girilen matrisin elemanlar�n� sat�r sat�r toplay�p, tek boyutlu farkl� bir diziye aktaran
	 *  bilgisayar program�n� yaz�n�z.
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int satir,sutun,N,M;
		System.out.print("Sat�r say�s�n� giriniz:");
		N=okut.nextInt();
		System.out.print("S�tun say�s�n� giriniz:");
		M=okut.nextInt();
		int matris[][]=new int[N][M];
		System.out.println(N+"X"+M+" BOYUTLARINDA MATR�S");
		
		int dizi[]=new int[N];
		int toplam=0;
		for(satir=0;satir<N;satir++)
		{ 
			toplam=0;
			for(sutun=0;sutun<M;sutun++)
			{
				System.out.print("matris["+satir+"]["+sutun+"]=");
				matris[satir][sutun]=okut.nextInt();
				toplam=toplam+matris[satir][sutun];	
			}
			dizi[satir]=toplam;
		}
		
		System.out.println("TEK BOYUTLU D�Z�");
		for(satir=0;satir<N;satir++)
			System.out.print(dizi[satir]+"  ");
		
	}
}
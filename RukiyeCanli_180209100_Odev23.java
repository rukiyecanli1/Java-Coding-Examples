import java.util.Scanner;
public class RukiyeCanli_180209100_Odev23 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * M*N Elemnalý Matrisin M ve N satýr ve sütun deðerleridir.M ve N deðerleri, elemanlarý kullanýcý 
	 * tarafýndan girilen matrisin elemanlarýný satýr satýr toplayýp, tek boyutlu farklý bir diziye aktaran
	 *  bilgisayar programýný yazýnýz.
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int satir,sutun,N,M;
		System.out.print("Satýr sayýsýný giriniz:");
		N=okut.nextInt();
		System.out.print("Sütun sayýsýný giriniz:");
		M=okut.nextInt();
		int matris[][]=new int[N][M];
		System.out.println(N+"X"+M+" BOYUTLARINDA MATRÝS");
		
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
		
		System.out.println("TEK BOYUTLU DÝZÝ");
		for(satir=0;satir<N;satir++)
			System.out.print(dizi[satir]+"  ");
		
	}
}
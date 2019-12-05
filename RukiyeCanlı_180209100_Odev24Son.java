import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev24Son {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Odev 24- Kullanýcý tarafýndan elemanlarý girilen kare matrisin yedek köþegeninde bulunan elemanlarý tek
	 boyutlu farklý bir diziye aktaran bilgisayar programýný yazýnýz.
	 */
	public static void main(String[] args) {
     Scanner okut=new Scanner(System.in);
     int N,i,j;
     System.out.print("Matrisin eleman sayýsýný giriniz:");
     N=okut.nextInt();
     int matris[][]=new int[N][N];
     for(i=0;i<N;i++) 
    	 for(j=0;j<N;j++) 
    	 {
    	 System.out.print("Matris["+i+"]["+j+"]=");
    	 matris[i][j]=okut.nextInt();
         }
     System.out.println();
     
     System.out.println("Yedek Köþegen Dizisi:");
     int j1=N-1;
     int yedek[]=new int[N];
     for(i=0;i<N;i++)
     {
    	 yedek[i]=matris[i][j1];
    	 System.out.print("yedek["+i+"]="+yedek[i]+"  ");
    	 j1=j1-1;
     }
     
     
	}
}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    
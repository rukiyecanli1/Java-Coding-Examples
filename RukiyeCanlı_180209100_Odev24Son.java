import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev24Son {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * Odev 24- Kullan�c� taraf�ndan elemanlar� girilen kare matrisin yedek k��egeninde bulunan elemanlar� tek
	 boyutlu farkl� bir diziye aktaran bilgisayar program�n� yaz�n�z.
	 */
	public static void main(String[] args) {
     Scanner okut=new Scanner(System.in);
     int N,i,j;
     System.out.print("Matrisin eleman say�s�n� giriniz:");
     N=okut.nextInt();
     int matris[][]=new int[N][N];
     for(i=0;i<N;i++) 
    	 for(j=0;j<N;j++) 
    	 {
    	 System.out.print("Matris["+i+"]["+j+"]=");
    	 matris[i][j]=okut.nextInt();
         }
     System.out.println();
     
     System.out.println("Yedek K��egen Dizisi:");
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
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    
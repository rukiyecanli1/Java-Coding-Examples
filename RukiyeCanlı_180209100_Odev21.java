import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev21 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Odev 21-Ýki boyutlu N*N elemanlý bir dizinin 3'e bölünen elemanlarý tek boyutlu farklý bir diziye 
	  aktararak ekranda gösteren programý yazýnýz.Not:N kullanýcý tarafýndan girilecektir. 
	  Dizinin elemanlarý 1-500 arasýnda bilgisayar tarafýndan rasgele atanacaktýr.
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int N,x,y,üçebölünenler=0;
		System.out.print("Matrisin boyutlarýný yazýnýz:");
		N=okut.nextInt();
	int matris[][]=new int [N][N];
	int dizi[]=new int[N];
	for(x=0;x<N;x++)
	
	{
		for(y=0;y<N;y++)
		    {
			matris[x][y]=(int)(Math.random()*500)+1;
			System.out.print(matris[x][y]+"  ");
	    		if(matris[x][y]%3==0)
	    			dizi[x]=matris[x][y];
	    
	         }
	System.out.println(" ");
	}
	System.out.println();
	
	System.out.println("YENÝ DÝZÝ...");
	    			for(x=0;x<N;x++)
	    				System.out.print(dizi[x]+"  ");
	    			
	    		
	    			
	}}
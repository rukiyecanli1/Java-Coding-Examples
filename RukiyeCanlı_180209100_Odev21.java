import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev21 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * Odev 21-�ki boyutlu N*N elemanl� bir dizinin 3'e b�l�nen elemanlar� tek boyutlu farkl� bir diziye 
	  aktararak ekranda g�steren program� yaz�n�z.Not:N kullan�c� taraf�ndan girilecektir. 
	  Dizinin elemanlar� 1-500 aras�nda bilgisayar taraf�ndan rasgele atanacakt�r.
	 */
	public static void main(String[] args) {
		Scanner okut=new Scanner(System.in);
		int N,x,y,��eb�l�nenler=0;
		System.out.print("Matrisin boyutlar�n� yaz�n�z:");
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
	
	System.out.println("YEN� D�Z�...");
	    			for(x=0;x<N;x++)
	    				System.out.print(dizi[x]+"  ");
	    			
	    		
	    			
	}}
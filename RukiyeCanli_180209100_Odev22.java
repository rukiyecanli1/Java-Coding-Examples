import java.util.Scanner;
public class RukiyeCanli_180209100_Odev22 {

	/**RUK�YE CANLI
	 *180209100 1.��RET�M
	 *�ki tane tek boyutlu diziyi eleman eleman toplay�p farkl� bir diziye aktaran bilgisayar program�n� yaz�n�z. 
	 *Dizi elemanlar� bilgisayar taraf�ndan rasgele tutulan say�lard�r.(1-100 aras�nda, elemansay�s�n� 
	 *kullan�c� girmelidir.)
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,i,N1,N2;
		System.out.print("Eleman say�s� giriniz:");
		x=input.nextInt();
		int A[]=new int[x];
		int B[]=new int[x];
		int C[]=new int[x];
		for(i=0;i<x;i++)
		{
			N1=(int)(Math.random()*100+1);
			A[i]=N1;
			N2=(int)(Math.random()*100+1);
			B[i]=N2;
			C[i]=A[i]+B[i];
		}
	System.out.println("A Dizisi");
		for(i=0;i<x;i++)
			System.out.print("A[" + i + "]="+A[i]+ "   ");
		    System.out.println("");
		    
		    System.out.println("B Dizisi");
	    for(i=0;i<x;i++)
			System.out.print("B[" + i + "]="+B[i]+ "   ");
			System.out.println("");
			
			System.out.println("C Dizisi");
		for(i=0;i<x;i++)
		    System.out.print("C[" + i + "]="+C[i]+ "   ");
		
		

	}

}

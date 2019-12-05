import java.util.Scanner;
public class RukiyeCanli_180209100_Odev22 {

	/**RUKÝYE CANLI
	 *180209100 1.ÖÐRETÝM
	 *Ýki tane tek boyutlu diziyi eleman eleman toplayýp farklý bir diziye aktaran bilgisayar programýný yazýnýz. 
	 *Dizi elemanlarý bilgisayar tarafýndan rasgele tutulan sayýlardýr.(1-100 arasýnda, elemansayýsýný 
	 *kullanýcý girmelidir.)
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,i,N1,N2;
		System.out.print("Eleman sayýsý giriniz:");
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

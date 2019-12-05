import java.util.Scanner;
public class RukiyeCanli180209100_Odev5 {
	/**Rukiye CANLI 180209100
	 * Endustri Muh. 1.Öðretim
	 */
	public static void main(String[] args) {
	double P,V,n,R=22.4/273,T,K;
	Scanner okut=new Scanner(System.in);
	System.out.print("Basýnç giriniz:");
	P=okut.nextDouble();
	System.out.print("Mol sayýsý giriniz:");
	n=okut.nextDouble();
	System.out.print("Hacim giriniz:");
    V=okut.nextDouble();			
   K=P*V/n*R;
System.out.println("Selsius cinsinden sýcaklýk:"+(K-273)+ " C olarak hesaplanmýþtýr.");


	}

}

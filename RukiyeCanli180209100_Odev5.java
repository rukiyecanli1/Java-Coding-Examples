import java.util.Scanner;
public class RukiyeCanli180209100_Odev5 {
	/**Rukiye CANLI 180209100
	 * Endustri Muh. 1.��retim
	 */
	public static void main(String[] args) {
	double P,V,n,R=22.4/273,T,K;
	Scanner okut=new Scanner(System.in);
	System.out.print("Bas�n� giriniz:");
	P=okut.nextDouble();
	System.out.print("Mol say�s� giriniz:");
	n=okut.nextDouble();
	System.out.print("Hacim giriniz:");
    V=okut.nextDouble();			
   K=P*V/n*R;
System.out.println("Selsius cinsinden s�cakl�k:"+(K-273)+ " C olarak hesaplanm��t�r.");


	}

}

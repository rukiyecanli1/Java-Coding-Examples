import java.util.Scanner;
public class RukiyeCanl�180209100_Odev6 {

	/**Rukiye Canl� 180209100
	 *Endustri Muh. 1.��retim
	 */
	public static void main(String[] args) {
	double P,Ma,d,R,xDerece,K=xDerece+273 ;
	R=22.4/273 ;
	Scanner okut=new Scanner(System.in);
	System.out.print("Bas�n� giriniz:");
	P=okut.nextDouble();
	System.out.print("d giriniz:");
	d=okut.nextDouble();
	System.out.print("x (derece) giriniz:");
	xDerece=okut.nextDouble();
	;
	System.out.print("Ma:"+(Ma=d*R*K/P));
	

	}

}

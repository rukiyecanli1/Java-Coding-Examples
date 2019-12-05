import java.util.Scanner;
public class RukiyeCanlý180209100_Odev6 {

	/**Rukiye Canlý 180209100
	 *Endustri Muh. 1.Öðretim
	 */
	public static void main(String[] args) {
	double P,Ma,d,R,xDerece,K=xDerece+273 ;
	R=22.4/273 ;
	Scanner okut=new Scanner(System.in);
	System.out.print("Basýnç giriniz:");
	P=okut.nextDouble();
	System.out.print("d giriniz:");
	d=okut.nextDouble();
	System.out.print("x (derece) giriniz:");
	xDerece=okut.nextDouble();
	;
	System.out.print("Ma:"+(Ma=d*R*K/P));
	

	}

}

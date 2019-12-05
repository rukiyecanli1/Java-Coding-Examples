import java.util.Scanner;
public class RukiyeCanli180209100_Odev2 {

	/**Rukiye Canlý 180209100
	 * Endüstri Mühendisliði 1.Öðretim
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner okut=new Scanner(System.in);
int l,v,f; double ort;
System.out.println("Laboratuvar notunu giriniz:");
l=okut.nextInt();
System.out.println("Vize notunu giriniz:");
v=okut.nextInt();
System.out.println("Final notunu giriniz:");
f=okut.nextInt();
System.out.print("Not Ortalamanýz:"+(l*0.3+v*0.3+f*0.4));

	}

}

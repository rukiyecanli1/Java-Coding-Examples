import java.util.Scanner;
public class RukiyeCanli180209100_Odev2 {

	/**Rukiye Canl� 180209100
	 * End�stri M�hendisli�i 1.��retim
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
System.out.print("Not Ortalaman�z:"+(l*0.3+v*0.3+f*0.4));

	}

}

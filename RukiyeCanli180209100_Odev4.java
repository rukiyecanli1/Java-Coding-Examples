import java.util.Scanner;
public class RukiyeCanli180209100_Odev4 {
	/**Rukiye Canlý 180209100
	 * Endustri Muh. 1.Öðretim 
	 * @param args
	 */
	public static void main(String args[]) {
	double r,alan,cevre;
		Scanner okut=new Scanner(System.in);
		System.out.println("Dairenin yarýçapýný giriniz:");
	r=okut.nextDouble();
	alan=Math.PI*r*r;
			System.out.print("Dairenin Alaný:");
	System.out.println(alan);
	cevre=2*Math.PI*r;
	System.out.println("Dairenin Çevresi:"+cevre);

	

	}

}

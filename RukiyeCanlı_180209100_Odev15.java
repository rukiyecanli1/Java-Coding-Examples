import java.util.Scanner;
public class RukiyeCanl�_180209100_Odev15 {

	/**RUK�YE CANLI
	 * 180209100 1.��RET�M
	 * �dev - 15 - D�ng�ler Say�lar� toplama
	 */
	public static void main(String[] args) {
		 Scanner oku=new Scanner(System.in);
		int A,C,B,x,toplam=0,sayac=0;
		System.out.print("A say�s�n� giriniz...");
		A=oku.nextInt();
        System.out.print("B say�s�n� giriniz...");
    	B=oku.nextInt();
        System.out.print("C say�s�n� giriniz...");
    	C=oku.nextInt();
    	for(x=A;x<=B;x=x+1)
    	{
        	if(x%C==0)
    		{System.out.println(x);
    		toplam=toplam+x;}
    	}
    		System.out.println("Say�lar�n toplam�:"+toplam);
    	
    		
    	}

	}

    
  

	



import java.util.Scanner;
public class RukiyeCanlý_180209100_Odev15 {

	/**RUKÝYE CANLI
	 * 180209100 1.ÖÐRETÝM
	 * Ödev - 15 - Döngüler Sayýlarý toplama
	 */
	public static void main(String[] args) {
		 Scanner oku=new Scanner(System.in);
		int A,C,B,x,toplam=0,sayac=0;
		System.out.print("A sayýsýný giriniz...");
		A=oku.nextInt();
        System.out.print("B sayýsýný giriniz...");
    	B=oku.nextInt();
        System.out.print("C sayýsýný giriniz...");
    	C=oku.nextInt();
    	for(x=A;x<=B;x=x+1)
    	{
        	if(x%C==0)
    		{System.out.println(x);
    		toplam=toplam+x;}
    	}
    		System.out.println("Sayýlarýn toplamý:"+toplam);
    	
    		
    	}

	}

    
  

	



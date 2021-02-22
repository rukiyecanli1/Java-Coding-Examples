/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derstekietkinlikler4;

/**
 *
 * @author User
 */
public class araba {
    
    private String marka;
    public int depoHacmi;
    static int kacTane=0;
    
    static void adet(){
        System.out.println(kacTane+"arac oluştu.");
    }
    void setMarka(String m) {
        marka=m;
    }
    araba(){
        System.out.println("Parametresiz");
        marka="X";
        depoHacmi=0;
        kacTane++;
    }
    
    araba(String m, int depoHacmi){
        System.out.println("Parametreli");
        marka=m;
        this.depoHacmi=depoHacmi;
        kacTane++;
    }
}

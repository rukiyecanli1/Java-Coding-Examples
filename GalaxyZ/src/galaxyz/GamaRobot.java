/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxyz;

import java.util.Scanner;

public class GamaRobot implements Alfa,Beta{
    private final int boy = 200;
   // private int yapılanBina;
    
    
    public void calis(){
        agac_dik();
    }
    
    public void gorevDegistir(){
        System.out.println("Ağaç dikmek için 1, bina yapmak için 2 giriniz");
        int secim;
        Scanner a=new Scanner(System.in);
        secim=a.nextInt();
        switch(secim){
            case 1:
                agac_dik();
                break;
            case 2:
                bina_yap();
                break;
            default:
                System.out.println("1 ya da 2 giriniz...");
                break;
        }
        
        
        
      
    }
    @Override
    public void bina_yap(){
        System.out.println("bina yapıldı");
    }

    @Override
    public void agac_dik() {
        System.out.println("Agac dikildi");
    }

}

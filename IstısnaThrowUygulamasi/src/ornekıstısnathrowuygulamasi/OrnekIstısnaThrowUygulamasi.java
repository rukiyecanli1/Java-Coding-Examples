/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekıstısnathrowuygulamasi;

public class OrnekIstısnaThrowUygulamasi {

    public static void main(String[] args) {
        try {
            throw new ArithmeticException("0'a bolme");
        } 
        catch (ArithmeticException e) {
            System.out.println("istisnai durum:" + e);
        }
        System.out.println("throw işlemi sonrası mesaj");
     }
  }

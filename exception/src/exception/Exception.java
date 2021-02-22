/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author User
 */
public class Exception {
     static void finalornegi() throws ArithmeticException{
        System.out.println("firlatilan istina: ");
        throw new ArithmeticException("deneme");
    }
public static void main(String args[]) {
        try{
            finalornegi();
        }
        catch (Exception e){
            System.out.println("heloooooo");
       }
        finally{
            System.out.println("finally mutlaka calisir ");
        }
    }
   
}

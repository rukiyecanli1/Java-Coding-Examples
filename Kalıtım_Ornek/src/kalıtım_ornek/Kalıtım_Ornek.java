package kalıtım_ornek;

import kalıtım_ornek.Kalıtım_Ornek.A.B;

public class Kalıtım_Ornek {

    static class A {

        int i, j;

        void ijGoster() {
            System.out.println("i ve j:" + i + " " + j);
        }

        static class B extends A {

            int k;

            void kGoster() {
                System.out.println("k:" + k);
            }

            void topla() {
                System.out.println("i+j+k:" + (i + j + k));
            }
        }

    }

    public static void main(String[] args) {
        A ustNesne = new A();
        B altNesne = new B();
        ustNesne.i = 10;
        ustNesne.j = 20;
        System.out.println("Ustnesne icerigi:");
        ustNesne.ijGoster();
        System.out.println();
        altNesne.i = 7;
        altNesne.j = 8;
        altNesne.k = 9;
        System.out.println("Alt nesne icerigi:");
        altNesne.ijGoster();
        altNesne.kGoster();
        System.out.println();
        System.out.println("altNesne'de i,j ve k toplamı:");
        altNesne.topla();
    }
}

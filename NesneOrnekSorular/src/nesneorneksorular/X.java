
package nesneorneksorular;

import static nesneorneksorular.X.f;

class X {
     static int f(int i){
       return ++i;} 
}

public class void main (String args[]) {
    int i=0;
    int j=f(i++)+i+f(++i);
            System.out.println(i);
            System.out.println(j);
}

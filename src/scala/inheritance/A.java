package scala.inheritance;

/**
 * Created on 30.04.16.
 *
 * @author evgen
 */
public class A {

    int[] a;

    public A() {
        a = new int[getSize()];
    }

    public int getSize(){
        return 10;
    }
}

class B extends A {

    @Override
    public int getSize() {
        return 2;
    }
}

package scala.traits;

/**
 * Created on 01.05.16.
 * @author evgen
 */
public interface Left {

    int a = 1;
}

interface Right {

    int a = 2;
}

class Center implements Left, Right {

    Center(){
        System.out.println("Center");
    }
}
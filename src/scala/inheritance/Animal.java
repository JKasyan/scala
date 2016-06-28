package scala.inheritance;

/**
 * Created on 25.04.16.
 * @author evgen
 */
public class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}

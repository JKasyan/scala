package scala.serializable;

import java.io.Serializable;

/**
 * Created on 26.05.16.
 *
 * @author evgen
 */
public class Person implements Serializable {

    private long id;
    private String firstName;

    public Person(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }
}

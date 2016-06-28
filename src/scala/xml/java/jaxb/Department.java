package scala.xml.java.jaxb;

import scala.inheritance.List;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created on 29.05.16.
 *
 * @author evgen
 */
@XmlRootElement(name = "persons")
public class Department {

    private ArrayList<Person> persons;

    @XmlElement(name="person")
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}

package scala.classess

import java.util.Date

/**
 * Created on 16.04.16.
 * @author evgen
 */
class Person {

  private var age = 0
  val time = new Date

}

object Person {

  def main(args: Array[String]) {
    val person:Person = new Person
    println(person)
    println(person.age)
    person.age = 29
    println(person.age)
  }
}

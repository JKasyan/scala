package scala._import

/**
 * Created on 24.04.16.
 * @author evgen
 */
object Main {

  def main(args: Array[String]): Unit = {
    val person:Person = new Person("Evgen", 29)
    println(person.description)
  }

}

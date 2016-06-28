package scala._import

import scala.objects.Color._
/**
 * Created on 24.04.16.
 * @author evgen
 */
class Person(val name:String, val age:Int) {

  for(color <- values) println(color.id + " " + color)

  private[_import] def description = "Person{name" + name + ", age: " + age + "}"

  class Manager {
    import scala.collection.mutable._
    val m = new ArrayBuffer[Person]()
  }
}

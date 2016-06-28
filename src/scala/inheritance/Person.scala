package scala.inheritance

/**
 * Created on 26.04.16.
 * @author evgen
 */
class Person(private val name:String) {

  override def toString = "Person"

}

class Manager(private val name:String, private val age:Int) extends Person(name){

  final override def toString = super.toString
}

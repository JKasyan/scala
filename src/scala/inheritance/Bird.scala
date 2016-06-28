package scala.inheritance

/**
 * Created on 28.04.16.
 * @author evgen
 */
class Bird(private val name:String) extends Animal(name) {

  override def toString = getClass.getSimpleName +  "{" + name + "}"
}

package scala.traits

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait AbstractVal {

  val variable:Int

}

class ConcreteClass extends AbstractVal {
  override val variable: Int = 1001
}

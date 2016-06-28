package scala.inheritance

/**
 * Created on 30.04.16.
 * @author evgen
 */
abstract class AbstractClass {

  val abstractVal:Int
  var abstractVar:Int

  def abstractMethod:Int

}

class ConcreteClass extends AbstractClass {

  override val abstractVal:Int = 100
  override var abstractVar:Int = 200

  override def abstractMethod: Int = 100

}

package scala.inheritance

/**
 * Created on 29.04.16.
 * @author evgen
 */
abstract class Gadget {

  val title:String = "Gadget"
  //var number:String = "12345"

  /**
   * Overriding abstract def
   * @return
   */
  def id:Int

  def description:String = "Some gadget..."

}

class Phone(override val id:Int) extends Gadget {

  /**
   * Overriding val variable
   */
  override val title:String = "Phone"

  /**
   * Overriding var variable
   */
  //override var number = "67890"

  /**
   * Overriding def by val
   */
  override val description = "Phone"

}

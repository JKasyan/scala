package scala.inheritance

/**
 * Created on 29.04.16.
 * @author evgen
 */
class Drink(val title:String) {

  override def toString = "Drink{" + title + "}"

  def canEquals(a:Any) = a.isInstanceOf[Drink]

  override def equals(that:Any):Boolean = {
    that match {
      case that: Drink => that.canEquals(this) && this.title == that.title
      case _ => false
    }
  }

  override def hashCode:Int = title.hashCode

}

class Beer(override val title:String) extends Drink(title) {

  override val toString = "Beer"
}

package scala.inheritance

/**
 * Created on 30.04.16.
 * @author evgen
 */
class Item(val description:String, val price:Double) {

  private def canEquals(that:Any):Boolean = {
    that.isInstanceOf[Item]
  }

  final override def equals(that: Any): Boolean = {
    that match {
      case that: Item =>
        that.canEquals(this) && this.description == that.description && this.price == that.price
      case _ => false
    }
  }

}

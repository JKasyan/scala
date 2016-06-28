package scala.classess

/**
 * Created on 17.04.16.
 * @author evgen
 */
class Address {

  private[this] val id = 0
  val street = ""
  var number:Int = 20

  override def toString: String = "Address{id=" + id + "}"

  def change(address: Address): Unit = {
    //address.id = 20
  }
}

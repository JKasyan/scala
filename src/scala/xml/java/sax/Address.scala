package scala.xml.java.sax

import scala.beans.BeanProperty

/**
 * Created on 29.05.16.
 * @author evgen
 */
class Address {

  @BeanProperty var street:String = _
  @BeanProperty var city:String = _
  @BeanProperty var country:String = _

  override def toString = "Address{street=" + street + ", city=" + city + ", country=" + country + "}"
}

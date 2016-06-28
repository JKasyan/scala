package scala.xml.java

import java.net.URL

import scala.beans.BeanProperty
import scala.xml.java.sax.Address

/**
 * Created on 28.05.16.
 * @author evgen
 */
class Note {

  @BeanProperty var login:String = _
  @BeanProperty var name:String = _
  @BeanProperty var telephone:String = _
  @BeanProperty var url:URL = _
  @BeanProperty var address:Address = new Address

  override def toString = {
    "Note{login=" + login + ", name=" + name + ", telephone: " + telephone + ", address=" + address + ", url=" + url + "}"
  }
}

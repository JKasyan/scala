package scala.xml.java

import scala.xml.{XML, MetaData, Elem}

/**
 * Created on 29.05.16.
 * @author evgen
 */
object Main extends App {

  private val elem: Elem = <person id ="100"><name>Evgen</name></person>
  private val attributes: MetaData = elem.attributes
  println(attributes)
  /**
   *
   */
  val root = XML.loadFile("resources/notepad/notepad.xml")
  println(root)

}

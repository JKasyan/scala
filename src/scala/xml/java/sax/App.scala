package scala.xml.java.sax

import java.io._
import javax.xml.parsers.{SAXParser, SAXParserFactory}

import org.xml.sax.InputSource

/**
 * Created on 28.05.16.
 * @author evgen
 */
object App extends scala.App {
  val parser:SAXParser  = SAXParserFactory.newInstance().newSAXParser()
  val mySaxHandler:MySaxHandler = new MySaxHandler
  val inputStream = new FileInputStream(new File("resources/notepad.xml"))
  val reader = new InputStreamReader(inputStream, "UTF-8")
  val is:InputSource = new InputSource(reader)
  parser.parse(is, mySaxHandler)
  val list = mySaxHandler.getNotes
  println(list)
}

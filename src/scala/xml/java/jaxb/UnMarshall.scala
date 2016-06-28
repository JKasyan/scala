package scala.xml.java.jaxb

import java.io.File
import javax.xml.bind.JAXBContext

/**
 * Created on 29.05.16.
 * @author evgen
 */
object UnMarshall extends App {

  val context:JAXBContext = JAXBContext.newInstance(classOf[Department])
  val unMarshall = context.createUnmarshaller()
  val file:File = new File("resources/notepad/persons.xml")
  val d = unMarshall.unmarshal(file).asInstanceOf[Department]
  println(d.getPersons.size())
}

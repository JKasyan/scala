package scala.xml.java.jaxb

import java.io.File
import java.util
import javax.xml.bind.{Marshaller, JAXBContext}

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
 * Created on 29.05.16.
 * @author evgen
 */
object Main extends App {

  val letters = "abcdefghijklmnopqrstuvwxyz"

  val context:JAXBContext = JAXBContext.newInstance(classOf[Department])
  val m:Marshaller = context.createMarshaller()
  m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
  val random:Random = Random
  val department:Department = new Department
  val list:util.ArrayList[Person] = new util.ArrayList[Person]()
  for(el <- 1 to 1000000) {
    val p:Person = new Person
    p.setId(el)
    p.setFirstName(randomString(10))
    p.setSecondName(randomString(5))
    list.add(p)
  }
  department.setPersons(list)
  val file:File = new File("resources/notepad/persons.xml")
  m.marshal(department, file)

  def randomString(n:Int): String = {
    val builder:StringBuilder = new StringBuilder
    for(el <- 1 to n) {
      builder.append(letters.charAt(random.nextInt(letters.length)))
    }
    builder.toString()
  }
}

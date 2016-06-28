package scala.files

import scala.io.{BufferedSource, Source}

/**
 * Created on 01.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val fileReader: FileReader = FileReader("/home/evgen/Desktop/servers.xml")
    val lines: Iterator[String] = fileReader.read
    for (el <- lines) println(el)
    /**
     *
     */
    val l: BufferedSource = Source.fromURL("http://localhost:8585/api/authors", "UTF-8")
    for(el <- l) println(el)
  }

}

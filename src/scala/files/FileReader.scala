package scala.files

import scala.io.Source

/**
 * Created on 01.05.16.
 * @author evgen
 */
class FileReader private (private val path:String) {

  private var encoding:String = _

  private def this(path:String, encoding:String) {
    this(path)
    this.encoding = encoding
  }

  def read = {
    val source:Source = Source.fromFile(path)
    source.getLines()
  }
}

object FileReader {

  private final val defaultEncoding:String = "UTF-8"

  def apply(path:String, encoding:String): FileReader = {
    new FileReader(path, encoding)
  }

  def apply(path:String):FileReader = {
    apply(path, defaultEncoding)
  }
}

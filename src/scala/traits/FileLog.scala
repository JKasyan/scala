package scala.traits

import java.io.PrintWriter

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait FileLog extends Logged {

  val fileName:String
  val out = new PrintWriter(fileName)

  override def log(msg:String): Unit ={
    out.println(msg); out.flush()
  }
}

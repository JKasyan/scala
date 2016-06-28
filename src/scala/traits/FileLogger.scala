package scala.traits

import java.io.{PrintStream, PrintWriter}
import java.util.Date

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait FileLogger extends Logged {

  private val out: PrintWriter = new PrintWriter("")
  out.println("# " + new Date())

  override def log(msg:String):Unit = {
    out.println(msg)
    out.flush()
  }

}

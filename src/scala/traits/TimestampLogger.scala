package scala.traits

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait TimestampLogger extends Logged {

  override def log(msg:String): Unit = {
    super.log(new java.util.Date + " " + msg)
  }

}

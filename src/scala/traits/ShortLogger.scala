package scala.traits

/**
 * Created on 02.05.16.
 * @author evgen
 */
trait ShortLogger extends Logged {

  val maxLength:Int = 15

  override def log(msg:String): Unit = {
    super.log(if(msg.length.<=(maxLength)) msg else msg.substring(0, maxLength - 3) + "...")
  }

}

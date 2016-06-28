package scala.traits

/**
 * Created on 01.05.16.
 * @author evgen
 */
trait Logged {

  def log(msg:String) = {}

}

trait ConsoleLogged extends Logged {

  override def log(msg:String) = println(msg)

}

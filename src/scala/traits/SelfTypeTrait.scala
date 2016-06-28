package scala.traits

/**
 * Created on 04.05.16.
 * @author evgen
 */
trait SelfTypeTrait extends Logged {

  this: Exception =>

  def log(): Unit = {
    log(getMessage)
  }
}

trait StructureSelfTypeTrait extends Logged {

  this: {def getMsg:String} =>

  def log(): Unit = {
    log(getMsg)
  }
}

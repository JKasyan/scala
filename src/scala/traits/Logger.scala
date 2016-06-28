package scala.traits

/**
 * Created on 01.05.16.
 * @author evgen
 */
trait Logger{

  def log(msg:String)

  def defaultLog(msg:String):Unit= {
    println(msg)
  }

}
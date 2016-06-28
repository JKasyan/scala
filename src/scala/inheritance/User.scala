package scala.inheritance

/**
 * Created on 30.04.16.
 * @author evgen
 */
class User(val firstName:String, val id:Int) {

  def getTuple: (String, Int) = {
    (firstName, id)
  }

  def getAnyRef:AnyRef = this

  def getAnyVal:AnyVal = true
}



package scala.classess

import scala.beans.BeanProperty

/**
 * Created on 17.04.16.
 * @author evgen
 */
class User(private[User] val age:Int) {

  println("Creating new new user")

  @BeanProperty var firstName:String = _
  @BeanProperty var secondName:String = _

  def this() {
    this(25)
  }

  def this(age:Int, firstName: String) {
    this(age)
    this firstName = firstName
  }

  def this(age:Int,firstName:String, secondName: String) {
    this(age, firstName)
    this secondName = secondName
  }

  override def toString:String = "User{firstName: " + firstName + ", secondName: " + secondName + "}"
}

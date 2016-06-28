package scala.objects

/**
 * Created on 21.04.16.
 * @author evgen
 */
class Account private {

  val id = Account newUniqueNumber()

  private var balance:Double = 0

  def deposit(amount:Double):Unit= {
    balance += amount
  }

  override def toString:String = "Account(" + id + ")"

  def lustNumber:Int = Account.lastNumber
}

object Account {

  private var lastNumber:Int = 0
  val name:String = "Account"

  private def newUniqueNumber():Int = {
    lastNumber += 1
    lastNumber
  }

  def apply():Account = {
    new Account
  }
}

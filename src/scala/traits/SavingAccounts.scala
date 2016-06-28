package scala.traits

/**
 * Created on 01.05.16.
 * @author evgen
 */
class SavingAccounts extends Logged {

  private var balance:Double = 1000

  def withdraw(amount:Double):Unit = {
    if(amount.>(balance)) log("Insufficient funds")
    else balance -= amount
  }
}

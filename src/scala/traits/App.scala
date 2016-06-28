package scala.traits

/**
 * Created on 01.05.16.
 * @author Kasyan Evgen
 */
object App {

  def main(args: Array[String]) {
    val list:List[Int] = new ListImpl[Int]()
    for (n <- 1.to(20)) {
      list.add(n)
    }
    println(list toString)
    new Center
    /**
     *
     */
    val account:SavingAccounts = new SavingAccounts with ConsoleLogged
    account.log("Trait")
    /**
     *
     */
    val accountOne:SavingAccounts = new SavingAccounts
      with ConsoleLogged
      with TimestampLogger
      with ShortLogger
    accountOne.withdraw(1100.0)
    /**
     *
     */
    val acc:SavingAccounts = new {val fileName:String = "a"} with SavingAccounts with FileLog
  }

}

package scala.conditions

/**
 * Created by evgen on 07.03.16.
 */
object Functions {

  def main(args: Array[String]): Unit = {
    println(abs(-5))
    println("Factorial: " + factorial(5))
    println("Factorial: " + fact(5))
    println("Default parameter: " + decorate("Decorate"))
    println(decorate(left = "<<<", str = "Hello", right = ">>>"))
    println("Sum: " + sum(5, 2))
    println("Sum: " + sum(1 to 1000: _*))
    println("Recursive sum: " + recursiveSum(1, 2, 3, 4))
    println("{} return: " + voidFunction().getClass.getName)
    /**
     * Procedures
     */
    println(box("Hello"))
    println("2^6: " + power(2, 6))
    println("2^0: " + power(2, 0))
    println("2^ -1: " + power(2, -1))
  }

  def abs(d:Double) :Double = if(d > 0) d else -d

  def factorial(n:Int) = {
    var res:Int = 1
    for(i <- 1 to n)
      res *= i
    res
  }

  def fact(n:Int) :Int = if (n <= 0) 1 else n * fact(n - 1)

  def decorate(str:String, left:String = "[", right: String = "]") = left + str + right

  def sum(d:Int*): Int = {
    var result = 0
    for(i <- d)
      result += i
    result
  }

  def recursiveSum(n:Int*) :Int = {
    if(n.length == 0)
      0
    else
    n.head + recursiveSum(n.tail: _*)
  }

  def box(str:String): Unit = {
    val border = "_" * str.length + "__\n"
    println(border + "|" + str + "|\n" + border)
  }

  def voidFunction() = {}

  def power(digit:Int, power:Int): Double = {
    var result:Double = 1
    if(power == 0){
      return result
    } else if (power > 0){
      for(i <- 1 to power) {
        result *= digit
      }
    } else {
      for(i <- power to -1) {
        result /= digit
      }
    }
    result
  }

}

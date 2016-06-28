package scala.identifiers

import scala.collection.immutable.Range.Inclusive
import scala.collection.mutable

/**
 * Created on 05.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val to: Inclusive = 1.to(5)
    for(el <- to) println(el)
    println(factorial(5))
    /**
     *
     */
    val p1:Point = Point(1, 1)
    val p2:Point = Point(2, 3)
    val p3:Point = p1 + p2
    val p4:Point = p1 + p2 * p3
    val p5:Point = Point(1, 1) + Point(2, 2) * Point(3, 3)
    println(p3)
    println(p4)
    println(p5)
    /**
     *
     */
    val a = 1::2::Nil
    println(a)
    println(a.getClass)
    /**
     *
     */
    val b = new mutable.HashMap[String, Int]
    b("1") = 1
    b.update("2", 2)
    println(b)
    /**
     *
     */
    val Point(x, y) = Point(1, 1) + Point(2, 2)
    println("x: " + x + ", y: " + y)
  }

  def factorial(n:Int) : Int = {
    if(n.<=(1)) 1 else n * factorial(n - 1)
  }

  def sum(n:Int) : Int = {
    if(n < 0) throw new RuntimeException("Digit less zero: " + n)
    var res:Int = 0
    for(el <- 1 to n) res += el
    res
  }
}

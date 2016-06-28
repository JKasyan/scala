package scala.functions

import java.util.Date

import scala.math._

/**
 * Created on 07.05.16.
 * @author evgen
 */
object App {

  def main(args: Array[String]) {
    val fun = sqrt _
    println(fun(4))
    val array:Array[Double] = Array(4, 9, 16)
    val map: Array[Double] = array.map(fun)
    println(map.toList)
    /**
     *
     *
     */
    val triple = Array(1.0, 2.0, 3).map(x => 3 * x)
    println(triple.toList)
    val twoTimes = Array(2.2 , 3.3) map {(x:Double)=> 2 * x}
    println(twoTimes.toList)
    /**
     *
     *
     */
    println("################ High order functions ################")
    val functions = Array(sqrt _, ceil _, floor _)
    for(el <- functions) println(functionOfDigit(el, 2.25))
    println("sqrt ,ceil , floor of 0.25: )")
    for(fun <- functions) println(valueAtOneQuarter(fun))
    /**
     *
     */
    println("################################")
    println("2^x")
    for(el <- 1 to 10) println(twoPowX(el)(2))
    /**
     *
     */
    val digit1: Double = functionOfDigit((x)=> 3 * x, 2)
    println(digit1)
    val digit2: Double = functionOfDigit(x => Math.pow(2, x), 5)
    println(digit2)
    val digit3: Double = valueAtOneQuarter(3 * _)
    println(digit3)
    /**
     *
     */
    println("Use of high order functions")
    val map1 = (1 to 10).map(0.1 * _)
    println(map1)
    //
    (1 to 5).map("*" * _).foreach[Unit](println)
    val filtered = Array(1, "2", new Date(), true, 100L).filter(_.isInstanceOf[String])
    filtered.foreach(println)
    /**
     *
     */
    val list:List[Int] = Array(-2 , 17, 0, 5, -30, 27, 82).toList
    println("Start")
    val filteredList = filterList(list, isGreaterThanZero)
    println("Only greater 0: " + filteredList)
    println(list.filter(_ < 0))
    //
    val evenNumbers = 1.to(9).filter(_ % 2 == 0)
    println("Even number: " + evenNumbers)
    //
    val sum:Int = (1 to 9).sum
    println("Sum 1 to 9: " + sum)
    //
    val sortedArray:Array[Int] = Array(1, 7, 45, 32, -45, 56).sortWith(_ < _)
    println(sortedArray.toList)
    //
    val sortWith: Array[String] = "Mary had a little lamp".split(" ").sortWith(_.length > _.length)
    println(sortWith.toList)
    /**
     *
     */
    println("Currying")
    val mul = mulOneAtTime(6)(7)
    println(mul)
    //
    val func = mulOneAtTime(5)(_)
    println(func(2))
    //
    val ar = Array(23, -4, -5, 8, 14, -7).toList
    val arFunc = filterListCurry(ar)(_)
    println(arFunc(_ > 0))
    println(arFunc(_ < 0))
    println(arFunc(_ % 2 == 0))
    /**
     *
     */
    println("Manager constructions")
    var x = 10
    until (x == 0) {
      x -= 1
      println(x)
    }
    //
    until(x >= 10)({
      x += 2
      print(x + " ")
    })
  }
}

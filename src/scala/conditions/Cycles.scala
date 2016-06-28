package scala.conditions

import java.util

import scala.collection.immutable.IndexedSeq

/**
 * Created by evgen on 06.03.16.
 */
class Cycles {

}

object Cycles {

  def main(args: Array[String]) {
    var r:BigInt = 1
    var n:Int = 20
    while (n > 0) {
      r = r * n
      n -= 1
    }
    println(cycleOne(5))
    cycleTwo(5)
    val array:Array[Char] = cycleThree("Hello")
    print(util.Arrays.toString(array) + "\n")
    /**
     *
     */
    genOne()
    genTwo()
    println()
    val v = collectionFromCycle(10)
    println(v)
    genString("Hello", 2)
  }

  def cycleOne(i:Int): BigInt = {
    var k = i
    var result:BigInt = 1
    val f = while (k > 0) {
      result = i * result
      k -= 1
    }
    println("Returned from cycle while: " + f)
    println("Type of returned while " + f.getClass)
    println("void: " + ().getClass)
    result
  }

  /**
   *
   * @param i
   */
  def cycleTwo(i:Int): Unit = {
    var res:BigInt = 1
    for(n <- 1 to i) {
      res *= n
    }
    println("res: " + res)
  }

  /**
   *
   * @param s
   * @return
   */
  def cycleThree(s:String): Array[Char]= {
    val res:Array[Char] = new Array[Char](s.length)
    var i = 0
    for(ch <- s) {
      res(i) = ch
      i += 1
    }
    res
  }

  private def genOne() :Unit = {
    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
  }

  private def genTwo() :Unit = {
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
  }

  private def collectionFromCycle(n:Int) :IndexedSeq[Int] = {
    for(i <- 0 to n) yield i
  }

  private def genString(s:String, d:Int) :Unit = {
    val v = for(i <- s; j <- 0 to d) yield i + j
    println(v)
  }

  protected def void() : Unit = {
    ()
  }

}





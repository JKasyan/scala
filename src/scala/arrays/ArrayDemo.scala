package scala.foundations.arrays

import scala.collection.mutable.ArrayBuffer

/**
 * Created by evgen on 08.03.16.
 */
object ArrayDemo {

  def main(args: Array[String]): Unit = {
    val a = new Array[Int](10)
    a(2) = 5
    a(1) = 3
    for(el <- a if el % 2 != 0) println(el + " ")
    /**
     *
     */
    val b = Array("Hello", "World")
    b.apply(1)
    println("Array b: ")
    for(el <- b)
      println(el)

    /**
     *
     */
    var c = ArrayBuffer[Int]()
    c += 1
    printArray(c)
    c += (2, 3, 4)
    printArray(c)
    c ++= Array(5, 6, 7)
    printArray(c)
    c.trimEnd(3)
    printArray(c)
    val d = ArrayBuffer[String]("fff", "ggg")
    printArray(d)
  }

  def printArray[T](array:ArrayBuffer[T]):Unit={
    for(a <- array)
      print(a + " ")
    println()
  }

}

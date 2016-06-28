package scala.arrays

import scala.collection.mutable.ArrayBuffer

/**
 * Created 09.04.16.
 */
object Algorithms {

  def main(array: Array[String]):Unit={
    val sum:Double = Array(1, 2, 3.2).sum
    println(sum)
    val max:String = Array("a", "b", "c").max
    println(max)
    /**
     *
     */
    val array:Array[Int] = Array(1, -5, 2, 33, 45).sorted
    for(el <- array) print(el + " ")
    println()
    val b:ArrayBuffer[Int] = ArrayBuffer(11, -2, 33, 0, -3)
    b.sorted
    /**
     *
     */
    val c = Array(3, 2, 1)
    scala.util.Sorting.quickSort(c)
    printAr(c)
    /**
     *
     */
    val str:String = c.mkString("<", ",", ">")
    println(str)
    /**
     *
     */
    val buffer:ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
    println(buffer.mkString("[", ",", "]"))
  }

  def printAr[T](array: Array[T]):Unit={
    for(el <- array) print(el + " ")
    println()
  }

}
